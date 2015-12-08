// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.util.Log;
import com.skype.android.video.hw.format.Resolution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

class ResolutionMatcher
{
    private static class EstimatedResolution
    {

        public Estimates estimates;
        public Resolution resolution;

        public String toString()
        {
            return (new StringBuilder()).append(resolution).append(" (").append(estimates).append(")").toString();
        }

        public EstimatedResolution(Resolution resolution1, Estimates estimates1)
        {
            resolution = resolution1;
            estimates = estimates1;
        }
    }

    private static class Estimates
    {

        public final float crop;
        public final float zoom;

        public String toString()
        {
            return (new StringBuilder("zoom=")).append((int)(zoom * 100F)).append("%, crop=").append((int)(crop * 100F)).append("%").toString();
        }

        public Estimates(float f, float f1)
        {
            zoom = f;
            crop = f1;
        }
    }


    private static final Comparator ESTIMATES_COMPARATOR = new Comparator() {

        private int signum(float f)
        {
            if ((double)Math.abs(f) < 0.01D)
            {
                return 0;
            } else
            {
                return (int)Math.signum(f);
            }
        }

        public final int compare(EstimatedResolution estimatedresolution, EstimatedResolution estimatedresolution1)
        {
            int i = signum(estimatedresolution.estimates.zoom - estimatedresolution1.estimates.zoom);
            if (i != 0)
            {
                return i;
            }
            i = signum(estimatedresolution.estimates.crop - estimatedresolution1.estimates.crop);
            if (i != 0)
            {
                return i;
            } else
            {
                return Integer.signum(estimatedresolution.resolution.getWidth() * estimatedresolution.resolution.getHeight() - estimatedresolution1.resolution.getWidth() * estimatedresolution1.resolution.getHeight());
            }
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((EstimatedResolution)obj, (EstimatedResolution)obj1);
        }

    };
    private static final String TAG = "Capture";
    private final Set bannedResolutions = new HashSet();
    private final CameraCapabilities cameraCapabilities;
    private final float nativeCameraAR;

    public ResolutionMatcher(CameraCapabilities cameracapabilities, float f)
    {
        cameraCapabilities = cameracapabilities;
        if (f <= 0.0F)
        {
            f = cameracapabilities.e();
        }
        nativeCameraAR = f;
    }

    private List estimateCandidates(int i, int j)
    {
        ArrayList arraylist = new ArrayList(cameraCapabilities.c().size());
        Iterator iterator = cameraCapabilities.c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Resolution resolution = (Resolution)iterator.next();
            if (!bannedResolutions.contains(resolution) && resolution.getWidth() >= i && resolution.getHeight() >= j)
            {
                arraylist.add(new EstimatedResolution(resolution, estimateResolution(resolution, i, j, nativeCameraAR)));
            }
        } while (true);
        return arraylist;
    }

    private static Estimates estimateResolution(Resolution resolution, int i, int j, float f)
    {
        float f1 = (float)resolution.getWidth() / (float)resolution.getHeight();
        int k;
        int l;
        if (f1 < f)
        {
            k = (int)((float)resolution.getHeight() * f);
        } else
        {
            k = resolution.getWidth();
        }
        if (f1 > f)
        {
            l = (int)((float)resolution.getWidth() / f);
        } else
        {
            l = resolution.getHeight();
        }
        i = k - i;
        j = l - j;
        if (i > j)
        {
            return new Estimates((float)j / (float)l, (float)(i - j) / (float)k);
        }
        if (i < j)
        {
            return new Estimates((float)i / (float)k, (float)(j - i) / (float)l);
        } else
        {
            return new Estimates(0.0F, 0.0F);
        }
    }

    public void banResolution(Resolution resolution)
    {
        bannedResolutions.add(resolution);
    }

    public Resolution findBestMatch(int i, int j, float f)
    {
        Object obj = estimateCandidates(i, j);
        Collections.sort(((List) (obj)), ESTIMATES_COMPARATOR);
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Resolution preferences for ")).append(i).append("x").append(j).append(": ").append(obj).toString());
        }
        if (!((List) (obj)).isEmpty())
        {
            obj = (EstimatedResolution)((List) (obj)).get(0);
            if (((EstimatedResolution) (obj)).estimates.zoom > f)
            {
                if (Log.isLoggable("Capture", 5))
                {
                    Log.w("Capture", (new StringBuilder("Best matching resolution for ")).append(i).append("x").append(j).append(" is too zoomed ").append(obj).toString());
                    return null;
                }
            } else
            {
                return ((EstimatedResolution) (obj)).resolution;
            }
        }
        return null;
    }

}
