// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            d

public class o
{

    Object a;
    int b;
    int c;
    volatile boolean d;
    boolean e;
    final List f = new ArrayList();
    private int g;
    private int h;
    private float i[];

    public o()
    {
        g = 0;
        h = 0;
        a = new Object();
        b = 0;
        c = 0;
        d = true;
        e = false;
        i = new float[4];
        if (e)
        {
            com.google.android.m4b.maps.cf.d.b();
        }
        i[0] = 0.0F;
        i[1] = 0.0F;
        i[2] = 0.0F;
        i[3] = 1.0F;
    }

    void a()
    {
        if (d)
        {
            synchronized (a)
            {
                g = b;
                h = c;
                d = false;
            }
        }
        GLES20.glClearColor(i[0], i[1], i[2], i[3]);
        GLES20.glClearStencil(0);
        GLES20.glClear(17664);
        GLES20.glEnable(2929);
        GLES20.glEnable(2884);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
