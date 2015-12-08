// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

final class nbt
    implements android.os.MessageQueue.IdleHandler
{

    final nbz a;
    volatile boolean b;
    private final List c = new ArrayList(3);
    private int d;

    public nbt(ncm ncm1, nbz nbz1, int i, int j)
    {
        b = true;
        d = 0;
        a = nbz1;
        nbz1 = a(ncm1, i, (int)((float)i * 1.3F));
        if (nbz1 != null)
        {
            c.add(nbz1);
        }
        ncm1 = a(ncm1, (int)((float)i * 1.3F), i);
        if (ncm1 != null)
        {
            c.add(ncm1);
        }
        c.add(new nbu(j, j, 12));
    }

    private static nbu a(ncm ncm1, int i, int j)
    {
        int k = ncm1.c / ((i * j << 2) * 3);
        ncm1 = null;
        if (k > 0)
        {
            ncm1 = new nbu(i, j, k);
        }
        return ncm1;
    }

    public final boolean queueIdle()
    {
        if (b && a.d() < 0.85F)
        {
            Object obj;
            if (d >= c.size())
            {
                obj = null;
            } else
            {
                obj = (nbu)c.get(d);
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    int i = ((nbu) (obj)).c - 1;
                    obj.c = i;
                    if (i == 0)
                    {
                        d = d + 1;
                    }
                    obj = Bitmap.createBitmap(((nbu) (obj)).a, ((nbu) (obj)).b, android.graphics.Bitmap.Config.ARGB_8888);
                }
            }
            if (obj != null)
            {
                a.a(((Bitmap) (obj)));
            }
        }
        return b;
    }
}
