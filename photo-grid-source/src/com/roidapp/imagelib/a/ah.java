// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Activity;
import android.graphics.PointF;
import android.hardware.Camera;
import android.os.Handler;
import android.view.View;
import jp.co.cyberagent.android.gpuimage.GPUImage;

// Referenced classes of package com.roidapp.imagelib.a:
//            aa

public final class ah extends aa
{

    private static boolean s = true;
    private float t;
    private PointF u;
    private int v;
    private boolean w;

    public ah(Activity activity, int i, int j, Handler handler, GPUImage gpuimage)
    {
        super(activity, i, j, gpuimage);
        t = 1.0F;
        u = new PointF();
        v = 0;
        w = false;
        g = handler;
    }

    public final android.hardware.Camera.Size a(View view, int i, int j)
    {
        this.j = i;
        k = j;
        b.getParameters();
        boolean flag = n();
        android.hardware.Camera.Size size = a(flag, i, j);
        android.hardware.Camera.Size size1 = a(size);
        if (s)
        {
            (new StringBuilder("Desired Preview Size - w: ")).append(i).append(", h: ").append(j);
        }
        e = size;
        f = size1;
        a(size, flag, i, j, view);
        b(flag);
        return size;
    }

}
