// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.os.Build;
import com.google.android.apps.unveil.env.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            ParametersProxy

public class RealParameters
    implements ParametersProxy
{

    private final android.hardware.Camera.Parameters actualParameters;

    public RealParameters(android.hardware.Camera.Parameters parameters)
    {
        actualParameters = parameters;
    }

    private List toSizeList(List list)
    {
        ArrayList arraylist = new ArrayList();
        android.hardware.Camera.Size size;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new Size(size.width, size.height)))
        {
            size = (android.hardware.Camera.Size)list.next();
        }

        return arraylist;
    }

    public String flatten()
    {
        return actualParameters.flatten();
    }

    public String get(String s)
    {
        return actualParameters.get(s);
    }

    public android.hardware.Camera.Parameters getActualParameters()
    {
        return actualParameters;
    }

    public int getInt(String s)
    {
        return actualParameters.getInt(s);
    }

    public int getMaxZoom()
    {
        return actualParameters.getMaxZoom();
    }

    public int getPictureFormat()
    {
        return actualParameters.getPictureFormat();
    }

    public Size getPictureSize()
    {
        return new Size(actualParameters.getPictureSize());
    }

    public int getPreviewFormat()
    {
        return actualParameters.getPreviewFormat();
    }

    public int getPreviewFrameRate()
    {
        return actualParameters.getPreviewFrameRate();
    }

    public Size getPreviewSize()
    {
        return new Size(actualParameters.getPreviewSize());
    }

    public List getSupportedPictureSizes()
    {
        return toSizeList(actualParameters.getSupportedPictureSizes());
    }

    public List getSupportedPreviewSizes()
    {
        return toSizeList(actualParameters.getSupportedPreviewSizes());
    }

    public boolean isSmoothZoomSupported()
    {
        return actualParameters.isSmoothZoomSupported();
    }

    public void remove(String s)
    {
        actualParameters.remove(s);
    }

    public void set(String s, int i)
    {
        actualParameters.set(s, i);
    }

    public void set(String s, String s1)
    {
        actualParameters.set(s, s1);
    }

    public void setPictureFormat(int i)
    {
        actualParameters.setPictureFormat(i);
    }

    public void setPictureSize(int i, int j)
    {
        actualParameters.setPictureSize(i, j);
    }

    public void setPreviewFormat(int i)
    {
        actualParameters.setPreviewFormat(i);
    }

    public void setPreviewFrameRate(int i)
    {
        actualParameters.setPreviewFrameRate(i);
    }

    public void setPreviewSize(int i, int j)
    {
        actualParameters.setPreviewSize(i, j);
    }

    public void setRecordingHint(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && Build.MODEL.equals("Nexus 4"))
        {
            actualParameters.setRecordingHint(flag);
        }
    }

    public void unflatten(String s)
    {
        actualParameters.unflatten(s);
    }
}
