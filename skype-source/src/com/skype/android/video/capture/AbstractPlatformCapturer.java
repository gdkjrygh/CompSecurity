// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import android.hardware.Camera;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.util.Log;
import com.skype.android.video.hw.format.Resolution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;

// Referenced classes of package com.skype.android.video.capture:
//            PlatformCapturer, CameraParamsHolder, ResolutionMatcher

abstract class AbstractPlatformCapturer
    implements PlatformCapturer
{

    protected static final String TAG = "Capture";
    protected final int cameraFacing;
    private final CameraCapabilities cameraParams;
    protected final Resolution maxResolution;
    protected final float maxResolutionZoom;
    protected final long nativeObj;
    private final Map resolutionMappings = new HashMap();
    private final ResolutionMatcher resolutionMatcher;

    protected AbstractPlatformCapturer(long l, int i, Resolution resolution, float f, float f1)
    {
        nativeObj = l;
        cameraFacing = i;
        maxResolution = resolution;
        maxResolutionZoom = f1;
        resolution = CameraParamsHolder.getInstance();
        if (resolution != null)
        {
            cameraParams = resolution.getParameters(i);
        } else
        {
            cameraParams = null;
        }
        if (cameraParams != null)
        {
            resolutionMatcher = new ResolutionMatcher(cameraParams, f);
            return;
        } else
        {
            Log.e("Capture", "cameraParams object is null! Probably cannt create camera!");
            resolutionMatcher = null;
            return;
        }
    }

    protected static native long getNativeTimestamp();

    protected static native void onCapturingFailed(long l);

    protected static native void onFrameCaptured(long l, int i, int j, byte abyte0[], long l1);

    protected static native void onFrameProcessingFinished(long l, long l1);

    public boolean banResolution(int i, int j)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (resolutionMatcher == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        resolutionMatcher.banResolution(new Resolution(i, j));
        flag = true;
_L2:
        return flag;
        RuntimeException runtimeexception;
        runtimeexception;
        flag = flag1;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", runtimeexception);
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected FpsRange findFpsRange(float f)
    {
label0:
        {
            if (cameraParams == null)
            {
                break label0;
            }
            Object obj = new ArrayList(cameraParams.d());
            Collections.sort(((List) (obj)), new Comparator() {

                final AbstractPlatformCapturer this$0;

                public int compare(FpsRange fpsrange1, FpsRange fpsrange2)
                {
                    int i = fpsrange1.b() - fpsrange1.a() - (fpsrange2.b() - fpsrange2.a());
                    if (i > 0)
                    {
                        return -1;
                    }
                    return i >= 0 ? 0 : 1;
                }

                public volatile int compare(Object obj1, Object obj2)
                {
                    return compare((FpsRange)obj1, (FpsRange)obj2);
                }

            
            {
                this$0 = AbstractPlatformCapturer.this;
                super();
            }
            });
            obj = ((List) (obj)).iterator();
            FpsRange fpsrange;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                fpsrange = (FpsRange)((Iterator) (obj)).next();
            } while ((int)(f * 1000F) < fpsrange.a() || (int)(f * 1000F) > fpsrange.b());
            if (Log.isLoggable("Capture", 3))
            {
                Log.d("Capture", (new StringBuilder("Framerate range for ")).append(f).append(" fps found ").append(fpsrange).toString());
            }
            return fpsrange;
        }
        throw new IllegalArgumentException((new StringBuilder("No framerate range was found ")).append(f).append(" fps").toString());
    }

    protected Resolution findMaxNativeResolution()
    {
        Resolution resolution = findResolutionMatching(maxResolution.getWidth(), maxResolution.getHeight(), 1.0F);
        if (resolution != null)
        {
            return resolution;
        } else
        {
            return (Resolution)Collections.max(cameraParams.c(), new Comparator() {

                final AbstractPlatformCapturer this$0;

                public int compare(Resolution resolution1, Resolution resolution2)
                {
                    return Long.signum(resolution1.getWidth() * resolution1.getHeight() - resolution2.getWidth() * resolution2.getHeight());
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((Resolution)obj, (Resolution)obj1);
                }

            
            {
                this$0 = AbstractPlatformCapturer.this;
                super();
            }
            });
        }
    }

    protected Resolution findResolutionMatching(int i, int j, float f)
    {
        if (resolutionMatcher != null)
        {
            return resolutionMatcher.findBestMatch(i, j, f);
        } else
        {
            return null;
        }
    }

    protected int getCameraId()
    {
        if (cameraParams != null)
        {
            return cameraParams.a();
        } else
        {
            return -1;
        }
    }

    public int getImageOrientation(int i)
    {
        int j;
        try
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(getCameraId(), camerainfo);
            if (camerainfo.facing == 1)
            {
                return 360 - (camerainfo.orientation + i) % 360;
            }
            j = camerainfo.orientation;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return i;
        }
        return 360 - (j - i) % 360;
    }

    public float getMaxFramerate()
    {
        int i;
        int j;
        i = -1;
        j = i;
        Iterator iterator;
        if (cameraParams == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        iterator = cameraParams.d().iterator();
        do
        {
            j = i;
            try
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FpsRange fpsrange = (FpsRange)iterator.next();
                if (fpsrange.b() > i)
                {
                    i = fpsrange.b();
                }
            }
            catch (RuntimeException runtimeexception)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", "Exception caught", runtimeexception);
                }
                return 0.0F;
            }
        } while (true);
        return (float)j / 1000F;
    }

    protected Resolution getNativeResolution(int i, int j)
    {
        return (Resolution)resolutionMappings.get(new Resolution(i, j));
    }

    public boolean registerResolution(int i, int j)
    {
        if (i <= maxResolution.getWidth() && j <= maxResolution.getHeight()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj = resolutionMatcher.findBestMatch(i, j, 1.0F);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (!Log.isLoggable("Capture", 5)) goto _L1; else goto _L3
_L3:
        Log.w("Capture", (new StringBuilder("No native camera resolution matching ")).append(i).append("x").append(j).append(" found").toString());
        return false;
        obj;
        if (!Log.isLoggable("Capture", 6)) goto _L1; else goto _L4
_L4:
        Log.e("Capture", "Exception caught", ((Throwable) (obj)));
        return false;
        resolutionMappings.put(new Resolution(i, j), obj);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Resolution ")).append(i).append("x").append(j).append(" mapped to native ").append(obj).toString());
        }
        return true;
    }
}
