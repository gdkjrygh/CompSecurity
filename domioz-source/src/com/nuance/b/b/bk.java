// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import java.util.Arrays;

// Referenced classes of package com.nuance.b.b:
//            gg, bc, fr

final class bk
{

    final bc a;
    private final Handler b = new Handler();
    private final AudioRecord c;
    private final short d[];
    private final int e;
    private final int f = 50;
    private boolean g;
    private int h;
    private long i;
    private int j;
    private final Runnable k = new gg(this);

    bk(bc bc1)
    {
        a = bc1;
        super();
        j = 1;
        g = false;
        h = 0;
        int j1 = bc.k(bc1).l;
        int l = (j1 * 2 * 400) / 1000;
        int i1 = AudioRecord.getMinBufferSize(j1, 16, 2);
        if (i1 != -2 && i1 != -1 && i1 > l)
        {
            l = i1;
        }
        e = (j1 * 100) / 1000;
        d = new short[e];
        c = new AudioRecord(6, j1, 16, 2, l);
        if (c.getState() != 1)
        {
            c();
            bc.a(bc1, false);
            return;
        } else
        {
            bc.l(bc1);
            return;
        }
    }

    static boolean a(bk bk1)
    {
        return bk1.g;
    }

    static g b(bk bk1)
    {
        return bk1.d();
    }

    static int c(bk bk1)
    {
        return bk1.f;
    }

    private void c()
    {
        g = true;
        if (c.getRecordingState() == 3)
        {
            c.stop();
        }
        c.release();
        b.removeCallbacksAndMessages(null);
    }

    static Handler d(bk bk1)
    {
        return bk1.b;
    }

    private g d()
    {
        if (g)
        {
            return null;
        }
        int i1 = e;
        int l = 0;
        int j1;
        int k1;
        do
        {
            k1 = c.read(d, l, i1);
            j1 = l;
            if (k1 < 0)
            {
                break;
            }
            j1 = l + k1;
            k1 = i1 - k1;
            i1 = k1;
            l = j1;
        } while (k1 > 0);
        if (j1 <= 0)
        {
            fr.a("Nina raw recorder didn't read any audio");
            c();
            bc.a(a, false);
            return null;
        }
        short aword0[];
        if (j1 < e)
        {
            fr.b((new StringBuilder("Nina raw recorder didn't read expected len -- expected: ")).append(e).append(", actual: ").append(j1).toString());
            aword0 = new short[j1];
            System.arraycopy(d, 0, aword0, 0, j1);
        } else
        {
            aword0 = d;
        }
        if (bc.m(a))
        {
            return null;
        }
        if (h == 0)
        {
            i = SystemClock.uptimeMillis() - (long)bc.k(a).a(j1);
        }
        long l1 = i;
        long l2 = bc.k(a).a(h);
        h = j1 + h;
        if (j > 0)
        {
            j = j - 1;
            Arrays.fill(aword0, (short)0);
        }
        return new g(bc.k(a), aword0, l1 + l2);
    }

    final void a()
    {
        b.postDelayed(k, f);
        c.startRecording();
    }

    final void b()
    {
        if (g)
        {
            return;
        }
        g g1 = d();
        if (g1 != null)
        {
            bc.a(a, g1);
        }
        c();
        bc.a(a, true);
    }
}
