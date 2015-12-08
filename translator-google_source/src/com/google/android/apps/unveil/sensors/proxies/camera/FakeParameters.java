// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            ParametersProxy

public class FakeParameters
    implements ParametersProxy
{

    private static final String DEFAULT_PICTURE_SIZES = "2592x1944,2048x1536,1600x1200,1024x768,512x384";
    private static final String DEFAULT_PREVIEW_SIZES = "1280x720,800x480,720x480,640x480,576x432,480x320,384x288,352x288,320x240,240x160,176x144";
    private final af logger;
    private final HashMap parameterMap;

    protected FakeParameters()
    {
        logger = new af();
        parameterMap = new HashMap();
        parameterMap.put("antibanding", "auto");
        parameterMap.put("antibanding-values", "off,50hz,60hz,auto");
        parameterMap.put("effect", "none");
        parameterMap.put("effect-values", "none,mono,negative,solarize,sepia,posterize,whiteboard,blackboard,aqua");
        parameterMap.put("flash-mode", "off");
        parameterMap.put("flash-mode-values", "off,auto,on");
        parameterMap.put("focus-mode", "auto");
        parameterMap.put("focus-mode-values", "auto,infinity");
        parameterMap.put("jpeg-quality", "100");
        parameterMap.put("jpeg-thumbnail-height", "384");
        parameterMap.put("jpeg-thumbnail-quality", "90");
        parameterMap.put("jpeg-thumbnail-width", "512");
        parameterMap.put("max-zoom", "5");
        parameterMap.put("picture-format", "jpeg");
        parameterMap.put("picture-format-values", "jpeg");
        parameterMap.put("picture-size", "2048x1536");
        parameterMap.put("picture-size-values", "2592x1944,2048x1536,1600x1200,1024x768,512x384");
        parameterMap.put("preview-format", "yuv420sp");
        parameterMap.put("preview-format-values", "yuv420sp");
        parameterMap.put("preview-frame-rate", "15");
        parameterMap.put("preview-size", "720x480");
        parameterMap.put("preview-size-values", "1280x720,800x480,720x480,640x480,576x432,480x320,384x288,352x288,320x240,240x160,176x144");
        parameterMap.put("whitebalance", "auto");
        parameterMap.put("whitebalance-values", "auto,incandescent,fluorescent,daylight,cloudy-daylight");
        parameterMap.put("zoom", "0");
        parameterMap.put("zoom-supported", "true");
    }

    protected FakeParameters(FakeParameters fakeparameters)
    {
        logger = new af();
        parameterMap = new HashMap();
        parameterMap.putAll(fakeparameters.parameterMap);
    }

    public String flatten()
    {
        logger.e("flatten() is unimplemented!", new Object[0]);
        return null;
    }

    public String get(String s)
    {
        return (String)parameterMap.get(s);
    }

    public android.hardware.Camera.Parameters getActualParameters()
    {
        logger.e("getActualParameters() is unimplemented!", new Object[0]);
        return null;
    }

    public int getInt(String s)
    {
        return Integer.parseInt((String)parameterMap.get(s));
    }

    public int getMaxZoom()
    {
        logger.e("getMaxZoom() is unimplemented!", new Object[0]);
        return 0;
    }

    public int getPictureFormat()
    {
        logger.e("getPictureFormat() is unimplemented!", new Object[0]);
        return 0;
    }

    public Size getPictureSize()
    {
        return Size.parseFromString((String)parameterMap.get("picture-size"));
    }

    public int getPreviewFormat()
    {
        logger.e("getPreviewFormat() is unimplemented!", new Object[0]);
        return 0;
    }

    public int getPreviewFrameRate()
    {
        return Integer.parseInt((String)parameterMap.get("preview-frame-rate"));
    }

    public Size getPreviewSize()
    {
        return Size.parseFromString((String)parameterMap.get("preview-size"));
    }

    public List getSupportedPictureSizes()
    {
        return Size.sizeStringToList((String)parameterMap.get("picture-size-values"));
    }

    public List getSupportedPreviewSizes()
    {
        return Size.sizeStringToList((String)parameterMap.get("preview-size-values"));
    }

    public boolean isSmoothZoomSupported()
    {
        return false;
    }

    public void remove(String s)
    {
        parameterMap.remove(s);
    }

    public void set(String s, int i)
    {
        parameterMap.put(s, (new StringBuilder(11)).append(i).toString());
    }

    public void set(String s, String s1)
    {
        parameterMap.put(s, s1);
    }

    public void setPictureFormat(int i)
    {
        logger.e("setPictureFormat() is unimplemented!", new Object[0]);
    }

    public void setPictureSize(int i, int j)
    {
        parameterMap.put("picture-size", (new Size(i, j)).toString());
    }

    public void setPreviewFormat(int i)
    {
        logger.e("setPreviewFormat() is unimplemented!", new Object[0]);
    }

    public void setPreviewFrameRate(int i)
    {
        parameterMap.put("preview-frame-rate", (new StringBuilder(11)).append(i).toString());
    }

    public void setPreviewSize(int i, int j)
    {
        parameterMap.put("preview-size", (new StringBuilder(23)).append(i).append("x").append(j).toString());
    }

    public void setRecordingHint(boolean flag)
    {
        logger.e("setRecordingHint() is unimplemented!", new Object[0]);
    }

    public void unflatten(String s)
    {
        logger.e("unflatten() is unimplemented!", new Object[0]);
    }
}
