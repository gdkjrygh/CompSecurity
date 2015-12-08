// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.a.a;

import android.content.Context;
import android.os.Bundle;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.a.a;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImageHueFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageNormalBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageOverlayBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageSaturationFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter;
import jp.co.cyberagent.android.gpuimage.Rotation;

public final class b
    implements a
{

    private final Context a;
    private final CloudFilterInfo b;
    private bi c;

    public b(bi bi1, Context context, CloudFilterInfo cloudfilterinfo)
    {
        a = context;
        b = cloudfilterinfo;
        c = bi1;
    }

    public final List a(com.roidapp.imagelib.filter.a.b b1)
    {
        ArrayList arraylist = new ArrayList();
        GPUImageNormalBlendFilter gpuimagenormalblendfilter = new GPUImageNormalBlendFilter();
        int i = ((Integer)b1.a(0)).intValue();
        int j = ((Integer)b1.a(1)).intValue();
        b1 = b.f;
        Object obj = b.a(a, b1.getString("normal"));
        if (obj != null)
        {
            gpuimagenormalblendfilter.setBitmap(d.a(((java.io.InputStream) (obj)), i, j));
            gpuimagenormalblendfilter.setRotation(Rotation.NORMAL, false, true);
            c.b(gpuimagenormalblendfilter);
        }
        obj = new GPUImageOverlayBlendFilter();
        Object obj1 = b.a(a, b1.getString("overlay"));
        if (obj1 != null)
        {
            ((GPUImageOverlayBlendFilter) (obj)).setBitmap(d.a(((java.io.InputStream) (obj1)), i, j));
            c.a(((jp.co.cyberagent.android.gpuimage.GPUImageTwoInputFilter) (obj)));
        }
        obj1 = new GPUImageToneCurveFilter();
        Object obj2 = b.a(a, b1.getString("acv"));
        if (obj2 != null)
        {
            ((GPUImageToneCurveFilter) (obj1)).setFromCurveFileInputStream(((java.io.InputStream) (obj2)));
        }
        arraylist.add(obj1);
        obj2 = new GPUImageHueFilter();
        ((GPUImageHueFilter) (obj2)).setHue(Float.parseFloat(b1.getString("hue")));
        GPUImageSaturationFilter gpuimagesaturationfilter = new GPUImageSaturationFilter();
        gpuimagesaturationfilter.setSaturation(bi.f(Integer.parseInt(b1.getString("saturation"))));
        arraylist.add(gpuimagesaturationfilter);
        arraylist.add(obj2);
        arraylist.add(obj1);
        arraylist.add(obj);
        arraylist.add(gpuimagenormalblendfilter);
        return arraylist;
    }
}
