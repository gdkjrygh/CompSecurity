// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilterGroup, GPUImageBrightnessFilter, GPUImageContrastFilter, GPUImageSaturationFilter, 
//            GPUImageHueFilter

public class GPUImageColourFilter extends GPUImageFilterGroup
{

    public GPUImageColourFilter()
    {
        super(createFilters());
    }

    private static List createFilters()
    {
        ArrayList arraylist = new ArrayList(4);
        arraylist.add(new GPUImageBrightnessFilter());
        arraylist.add(new GPUImageContrastFilter());
        arraylist.add(new GPUImageSaturationFilter());
        arraylist.add(new GPUImageHueFilter());
        return arraylist;
    }

    public void setBrightness(float f)
    {
        ((GPUImageBrightnessFilter)getFilters().get(0)).setBrightness(f);
    }

    public void setContrast(float f)
    {
        ((GPUImageContrastFilter)getFilters().get(1)).setContrast(f);
    }

    public void setHue(float f)
    {
        ((GPUImageHueFilter)getFilters().get(3)).setHue(f);
    }

    public void setSaturation(float f)
    {
        ((GPUImageSaturationFilter)getFilters().get(2)).setSaturation(f);
    }
}
