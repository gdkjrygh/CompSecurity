// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.a.a;

import android.content.Context;
import android.os.Bundle;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.a.b;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageScreenBlendFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageToneCurveFilter;

public final class a
    implements com.roidapp.imagelib.filter.a.a
{

    private final Context a;
    private final CloudFilterInfo b;
    private bi c;

    public a(bi bi1, Context context, CloudFilterInfo cloudfilterinfo)
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
        b1 = b.f;
        GPUImageScreenBlendFilter gpuimagescreenblendfilter = new GPUImageScreenBlendFilter();
        gpuimagescreenblendfilter.setBitmap(d.a(b.a(a, b1.getString("screen")), i, j));
        c.b(gpuimagescreenblendfilter);
        GPUImageToneCurveFilter gpuimagetonecurvefilter = new GPUImageToneCurveFilter();
        gpuimagetonecurvefilter.setFromCurveFileInputStream(b.a(a, b1.getString("acv")));
        arraylist.add(new GPUImageFilter());
        arraylist.add(gpuimagescreenblendfilter);
        arraylist.add(gpuimagetonecurvefilter);
        return arraylist;
    }
}
