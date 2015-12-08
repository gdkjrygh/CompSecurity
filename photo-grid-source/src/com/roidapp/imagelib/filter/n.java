// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.roidapp.baselib.b.i;
import com.roidapp.imagelib.c.b;
import com.roidapp.imagelib.c.e;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageRenderer;
import jp.co.cyberagent.android.gpuimage.PixelBuffer;

// Referenced classes of package com.roidapp.imagelib.filter:
//            q, o, p

public class n extends Fragment
{

    protected String a;
    protected b b;
    protected GPUImageRenderer c;
    protected PixelBuffer d;
    protected final e e = new q(this);

    public n()
    {
        c = new GPUImageRenderer(new GPUImageFilter());
    }

    public final void a()
    {
        if (!isAdded())
        {
            return;
        } else
        {
            b = new b(new i(Math.round(0.15F * (float)Runtime.getRuntime().maxMemory())));
            b.a(new o(this));
            return;
        }
    }

    protected void a(int j)
    {
    }

    protected final void b()
    {
        if (b != null)
        {
            b.a(new p(this));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
