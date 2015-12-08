// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.k;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.b.c;
import com.nuance.dragon.toolkit.d.e;
import java.util.LinkedList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            c, j

public final class i extends com.nuance.dragon.toolkit.audio.a.c
{

    private final k a;
    private final LinkedList b = new LinkedList();
    private final Handler c = new Handler();
    private boolean d;

    public i(k k)
    {
        com.nuance.dragon.toolkit.d.b.c.a("AudioEnergyListener", k);
        a = k;
    }

    static LinkedList a(i k)
    {
        return k.b;
    }

    static k b(i k)
    {
        return k.a;
    }

    static boolean c(i k)
    {
        return k.d;
    }

    static boolean d(i k)
    {
        k.d = false;
        return false;
    }

    static Handler e(i k)
    {
        return k.c;
    }

    protected final void a(h h)
    {
        h = (g)h;
        d = true;
        if (h != null)
        {
            if (((g) (h)).d > 20)
            {
                int l = ((g) (h)).d / 20;
                if (((g) (h)).d % 20 != 0)
                {
                    com.nuance.dragon.toolkit.d.e.c(this, "the given big Chunk's duration is not the multipler of 20ms we may miss some audio in the end for calculating the audio energy level.");
                }
                g ag[] = new g[l];
                int i1 = ((g) (h)).c.length / l;
                int k = 0;
                while (k < l) 
                {
                    short aword0[] = new short[i1];
                    System.arraycopy(((g) (h)).c, k * i1, aword0, 0, i1);
                    g g1;
                    long l1;
                    if (((g) (h)).e > 0L)
                    {
                        l1 = ((g) (h)).e + (long)((g) (h)).d / (long)l;
                    } else
                    {
                        l1 = 0L;
                    }
                    ag[k] = new g(((g) (h)).a, aword0, l1);
                    k++;
                }
                for (k = 0; k < l; k++)
                {
                    g1 = ag[k];
                    b.add(g1);
                }

            } else
            {
                b.add(h);
            }
        }
        if (b.size() > 0)
        {
            c.post(new j(this));
        }
        super.a(h);
    }

    protected final void b(b b1, l l)
    {
        b.clear();
        super.b(b1, l);
    }
}
