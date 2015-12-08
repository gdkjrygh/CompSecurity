// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.a.a;

import android.content.Context;
import android.os.Bundle;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.a.a;
import com.roidapp.imagelib.filter.a.b;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageNormalBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageOverlayBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageSaturationFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageScreenBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter;

public final class c
    implements a
{

    private final Context a;
    private final CloudFilterInfo b;
    private bi c;

    public c(bi bi1, Context context, CloudFilterInfo cloudfilterinfo)
    {
        a = context;
        b = cloudfilterinfo;
        c = bi1;
    }

    public final List a(b b1)
    {
        ArrayList arraylist = new ArrayList();
        int i = ((Integer)b1.a(0)).intValue();
        int j = ((Integer)b1.a(1)).intValue();
        Object obj1 = b.f;
        GPUImageScreenBlendFilter gpuimagescreenblendfilter = new GPUImageScreenBlendFilter();
        Object obj = b.a(a, ((Bundle) (obj1)).getString("screen"));
        if (obj != null)
        {
            gpuimagescreenblendfilter.setBitmap(d.a(((java.io.InputStream) (obj)), i, j));
            c.b(gpuimagescreenblendfilter);
        }
        GPUImageToneCurveFilter gpuimagetonecurvefilter = new GPUImageToneCurveFilter();
        b1 = ((b) (obj));
        if (obj != null)
        {
            b1 = b.a(a, ((Bundle) (obj1)).getString("acv"));
            gpuimagetonecurvefilter.setFromCurveFileInputStream(b1);
        }
        obj = new GPUImageSaturationFilter();
        ((GPUImageSaturationFilter) (obj)).setSaturation(bi.f(Integer.parseInt(((Bundle) (obj1)).getString("saturation"))));
        GPUImageOverlayBlendFilter gpuimageoverlayblendfilter = new GPUImageOverlayBlendFilter();
        if (b1 != null)
        {
            gpuimageoverlayblendfilter.setBitmap(d.a(b.a(a, ((Bundle) (obj1)).getString("overlay")), i, j));
        }
        b1 = new GPUImageNormalBlendFilter();
        obj1 = b.a(a, ((Bundle) (obj1)).getString("normal"));
        if (obj1 != null)
        {
            b1.setBitmap(d.a(((java.io.InputStream) (obj1)), i, j));
            c.b(b1);
        }
        arraylist.add(new GPUImageFilter());
        arraylist.add(gpuimagescreenblendfilter);
        arraylist.add(new GPUImageFilter());
        arraylist.add(b1);
        arraylist.add(gpuimageoverlayblendfilter);
        arraylist.add(gpuimagetonecurvefilter);
        arraylist.add(obj);
        return arraylist;
    }
}
