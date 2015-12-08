// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.k;
import java.util.Arrays;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, i, ab

public class an extends r
{

    private r.a a;
    int b[];

    public an(r.a a1)
    {
        b = new int[i.i + 1];
        a = a1;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        int j = b[ab1.a.h];
        if (ab1.b > 0 || j == 0)
        {
            return;
        } else
        {
            b1 = d1.a;
            b1.glPushMatrix();
            b1.glLoadIdentity();
            b1.glTranslatef(0.0F, 0.0F, -1F);
            b1.glBlendFunc(770, 771);
            c.a(b1, j);
            d1.t.d(d1);
            b1.glDrawArrays(5, 0, 4);
            b1.glPopMatrix();
            return;
        }
    }

    public void b(int j)
    {
        Arrays.fill(b, j);
    }

    public final r.a d()
    {
        return a;
    }
}
