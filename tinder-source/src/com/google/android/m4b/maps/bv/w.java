// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            p

public final class w
{
    static final class a
    {

        public final p a;
        private float b;
        private float c;
        private float d;
        private int e[];

        public a(p p, float f1, float f2, float f3, int i1, int j1, int k1, 
                int l1)
        {
            a = p;
            b = f1;
            c = f2;
            d = f3;
            e = (new int[] {
                i1, j1, k1, l1
            });
        }
    }


    int a;
    int b;
    final boolean c;
    Bitmap d;
    Canvas e;
    int f;
    float g;
    float h;
    int i;
    int j;
    int k;
    final ArrayList l;
    final boolean m;
    private int n;

    public w()
    {
        this(512, 128, true);
    }

    public w(int i1, int j1, boolean flag)
    {
        l = new ArrayList();
        a = i1;
        b = j1;
        g = 1.0F / (float)a;
        h = 1.0F / (float)b;
        c = true;
        m = flag;
        n = 0;
    }

    final void a(int i1, int j1)
    {
        if (n != i1)
        {
            throw new IllegalArgumentException("Can't call this method now.");
        } else
        {
            n = j1;
            return;
        }
    }

    public final void a(GL10 gl10)
    {
        n = 1;
        int ai[] = new int[1];
        gl10.glGenTextures(1, ai, 0);
        f = ai[0];
        gl10.glBindTexture(3553, f);
        gl10.glTexParameterf(3553, 10241, 9728F);
        gl10.glTexParameterf(3553, 10240, 9728F);
        gl10.glTexParameterf(3553, 10242, 33071F);
        gl10.glTexParameterf(3553, 10243, 33071F);
        gl10.glTexEnvf(8960, 8704, 7681F);
    }

    public final void b(GL10 gl10)
    {
        if (gl10 != null && n > 0)
        {
            gl10.glDeleteTextures(1, new int[] {
                f
            }, 0);
        }
    }
}
