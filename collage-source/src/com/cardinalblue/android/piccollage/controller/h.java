// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import bolts.j;
import com.cardinalblue.gifencoder.Giffle;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            c, g

public class h extends c
{

    protected AtomicBoolean b;

    public h(g g1)
    {
        super(g1);
        b = new AtomicBoolean(false);
    }

    private int[] a(g.a a1, int i, int k, int l, float f)
        throws InterruptedException
    {
        int i1 = i / 2;
        k /= 2;
        int j1 = i1 * k;
        int ai[] = new int[j1];
        int ai1[] = new int[j1 * l];
        for (i = 0; i < l; i++)
        {
            j.a(new Callable(a1, (float)i * f) {

                final g.a a;
                final float b;
                final h c;

                public Object call()
                    throws Exception
                {
                    a.a((long)b);
                    return null;
                }

            
            {
                c = h.this;
                a = a1;
                b = f;
                super();
            }
            }, j.b).g();
            Bitmap bitmap = a1.a(i1, k);
            bitmap.getPixels(ai, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            System.arraycopy(ai, 0, ai1, j1 * i, ai.length);
        }

        return ai1;
    }

    public File a()
        throws c.a, InterruptedException
    {
        Giffle giffle = new Giffle();
        File file = a.a;
        int i = (int)Math.min(a.f, 10F);
        float f = (1.0F / (float)i) * 1000F;
        giffle.Init(file.getAbsolutePath(), a.b, a.c, 256, 100, (int)(f / 10F));
        int l = (int)(a.g * (float)i);
        a.h.e();
        int i1 = (int)Math.floor(Math.sqrt(l));
        i = a.b / i1;
        i1 = a.c / i1;
        int ai[] = a(a.h, i, i1, l, f);
        giffle.GenPalette(ai, ai.length);
        i1 = Math.round(100F / (float)l);
        bolts.h h1 = new bolts.h(Integer.valueOf(0));
        a.h.d();
        int ai1[] = new int[a.b * a.c];
        for (int k = 0; k < l; k++)
        {
            j.a(new Callable((float)k * f) {

                final float a;
                final h b;

                public Object call()
                    throws Exception
                {
                    b.a.h.a((long)a);
                    return null;
                }

            
            {
                b = h.this;
                a = f;
                super();
            }
            }, j.b).g();
            Bitmap bitmap1 = a.h.a(a.b, a.c);
            Bitmap bitmap = bitmap1;
            if (a.i)
            {
                bitmap = a(bitmap1);
            }
            bitmap.getPixels(ai1, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            giffle.AddFrame(ai1);
            j.a(new Callable(h1, i1) {

                final bolts.h a;
                final int b;
                final h c;

                public Void a()
                    throws Exception
                {
                    a.a(Integer.valueOf(((Integer)a.a()).intValue() + b));
                    if (c.a.l != null)
                    {
                        c.a.l.a(((Integer)a.a()).intValue());
                    }
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                c = h.this;
                a = h2;
                b = i;
                super();
            }
            }, j.b);
        }

        a.h.f();
        giffle.Close();
        return file;
    }
}
