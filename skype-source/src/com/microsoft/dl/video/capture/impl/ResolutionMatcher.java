// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.Resolution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ResolutionMatcher
{
    private static class EstimatedResolutionTransformation extends ResolutionTransformation
        implements Comparable
    {

        private final Estimates a;

        private static int a(float f)
        {
            if ((double)Math.abs(f) < 0.01D)
            {
                return 0;
            } else
            {
                return (int)Math.signum(f);
            }
        }

        public int compareTo(EstimatedResolutionTransformation estimatedresolutiontransformation)
        {
            int i = a(getEstimates().getZoom() - estimatedresolutiontransformation.getEstimates().getZoom());
            if (i != 0)
            {
                return i;
            }
            i = a(getEstimates().getCrop() - estimatedresolutiontransformation.getEstimates().getCrop());
            if (i != 0)
            {
                return i;
            } else
            {
                return Integer.signum(getFrom().getWidth() * getFrom().getHeight() - estimatedresolutiontransformation.getFrom().getWidth() * estimatedresolutiontransformation.getFrom().getHeight());
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((EstimatedResolutionTransformation)obj);
        }

        public Estimates getEstimates()
        {
            return a;
        }

        public String toString()
        {
            return (new StringBuilder()).append(super.toString()).append(" (").append(a).append(")").toString();
        }

        public EstimatedResolutionTransformation(Resolution resolution, Resolution resolution1, Transformation transformation, Estimates estimates)
        {
            super(resolution, resolution1, transformation);
            a = estimates;
        }
    }

    private static class Estimates
    {

        private final float a;
        private final float b;

        public float getCrop()
        {
            return b;
        }

        public float getZoom()
        {
            return a;
        }

        public boolean isValid()
        {
            return a < 3.402823E+38F && b < 3.402823E+38F;
        }

        public String toString()
        {
            if (isValid())
            {
                return (new StringBuilder("zoom=")).append((int)(a * 100F)).append("%, crop=").append((int)(b * 100F)).append("%").toString();
            } else
            {
                return "invalid";
            }
        }

        public Estimates()
        {
            a = -1F;
            b = -1F;
        }

        public Estimates(float f, float f1)
        {
            if (f < 0.0F || f1 < 0.0F)
            {
                throw new IllegalArgumentException((new StringBuilder("zoom=")).append(f).append(", crop=").append(f1).append(" must not have negative values").toString());
            } else
            {
                a = f;
                b = f1;
                return;
            }
        }
    }

    public static class ResolutionTransformation
    {

        private final Resolution a;
        private final Resolution b;
        private final Transformation c;

        public Resolution getFrom()
        {
            return a;
        }

        public Resolution getTo()
        {
            return b;
        }

        public Transformation getTransformation()
        {
            return c;
        }

        public String toString()
        {
            return (new StringBuilder()).append(a).append("->").append(b).append(" ").append(c).toString();
        }

        public ResolutionTransformation(Resolution resolution, Resolution resolution1, Transformation transformation)
        {
            a = resolution;
            b = resolution1;
            c = transformation;
        }
    }

    public static final class Transformation extends Enum
    {

        public static final Transformation Crop;
        public static final Transformation Match;
        public static final Transformation Scale;
        private static final Transformation a[];

        public static Transformation valueOf(String s)
        {
            return (Transformation)Enum.valueOf(com/microsoft/dl/video/capture/impl/ResolutionMatcher$Transformation, s);
        }

        public static Transformation[] values()
        {
            return (Transformation[])a.clone();
        }

        static 
        {
            Match = new Transformation("Match", 0);
            Crop = new Transformation("Crop", 1);
            Scale = new Transformation("Scale", 2);
            a = (new Transformation[] {
                Match, Crop, Scale
            });
        }

        private Transformation(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TransformationAllowed extends Enum
    {

        public static final TransformationAllowed AllScaling;
        public static final TransformationAllowed Cropping;
        public static final TransformationAllowed MultipleScaling;
        private static final TransformationAllowed a[];

        public static TransformationAllowed valueOf(String s)
        {
            return (TransformationAllowed)Enum.valueOf(com/microsoft/dl/video/capture/impl/ResolutionMatcher$TransformationAllowed, s);
        }

        public static TransformationAllowed[] values()
        {
            return (TransformationAllowed[])a.clone();
        }

        static 
        {
            Cropping = new TransformationAllowed("Cropping", 0);
            MultipleScaling = new TransformationAllowed("MultipleScaling", 1);
            AllScaling = new TransformationAllowed("AllScaling", 2);
            a = (new TransformationAllowed[] {
                Cropping, MultipleScaling, AllScaling
            });
        }

        private TransformationAllowed(String s, int i)
        {
            super(s, i);
        }
    }


    private final Set a;
    private final float b;

    public ResolutionMatcher(Set set, float f)
    {
        a = set;
        b = f;
    }

    private Estimates a(Resolution resolution, Resolution resolution1)
    {
        float f = (float)resolution.getWidth() / (float)resolution.getHeight();
        float f1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (f < b)
        {
            i = (int)((float)resolution.getHeight() * b);
        } else
        {
            i = resolution.getWidth();
        }
        if (f > b)
        {
            j = (int)((float)resolution.getWidth() / b);
        } else
        {
            j = resolution.getHeight();
        }
        i1 = i - (resolution1.getWidth() * j) / resolution1.getHeight();
        j1 = j - (resolution1.getHeight() * i) / resolution1.getWidth();
        k = resolution1.getWidth();
        l = resolution1.getHeight();
        f = 0.0F;
        if (i1 > 0)
        {
            j = (i - i1) * j;
            f = (float)i1 / (float)i;
            i = j;
        } else
        if (j1 > 0)
        {
            i = (j - j1) * i;
            f = (float)j1 / (float)j;
        } else
        if (i1 == 0 && j1 == 0)
        {
            i *= j;
        } else
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", (new StringBuilder("Invariant failed: inputResolution=")).append(resolution).append(", outputResoluton=").append(resolution1).append(", nativeCameraAR=").append(b).append(", cropWidth=").append(i1).append(", cropHeight").append(j1).toString());
            }
            return new Estimates();
        }
        if (i > 0)
        {
            f1 = (float)(i - k * l) / (float)i;
        } else
        {
            f1 = 0.0F;
        }
        return new Estimates(f1, f);
    }

    public ResolutionTransformation findBest(Resolution resolution, float f, float f1, EnumSet enumset)
    {
        ArrayList arraylist = new ArrayList(a.size());
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Resolution resolution1 = (Resolution)iterator.next();
            if (resolution.equals(resolution1))
            {
                Estimates estimates = a(resolution1, resolution);
                arraylist.add(new EstimatedResolutionTransformation(resolution1, resolution, Transformation.Match, estimates));
            } else
            if (resolution1.getWidth() >= resolution.getWidth() && resolution1.getHeight() >= resolution.getHeight())
            {
                if (enumset.contains(TransformationAllowed.Cropping))
                {
                    Estimates estimates1 = a(resolution1, resolution);
                    arraylist.add(new EstimatedResolutionTransformation(resolution1, resolution, Transformation.Crop, estimates1));
                }
                if (enumset.contains(TransformationAllowed.AllScaling) || enumset.contains(TransformationAllowed.MultipleScaling))
                {
                    Estimates estimates2 = new Estimates(3.402823E+38F, 3.402823E+38F);
                    arraylist.add(new EstimatedResolutionTransformation(resolution1, resolution, Transformation.Scale, estimates2));
                }
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            return null;
        }
        Collections.sort(arraylist);
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Resolution preferences for ")).append(resolution).append(": ").append(arraylist).toString());
        }
        for (enumset = arraylist.iterator(); enumset.hasNext();)
        {
            EstimatedResolutionTransformation estimatedresolutiontransformation = (EstimatedResolutionTransformation)enumset.next();
            if (estimatedresolutiontransformation.getEstimates().getZoom() <= f && estimatedresolutiontransformation.getEstimates().getCrop() <= f1)
            {
                return estimatedresolutiontransformation;
            }
        }

        if (Log.isLoggable("Capture", 5))
        {
            Log.w("Capture", (new StringBuilder("No matching found for ")).append(resolution).append(" with max zoom=").append((int)(f * 100F)).append("%, crop=").append((int)(f1 * 100F)).append("%").toString());
        }
        return null;
    }
}
