// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            bn, bm, bt, bs, 
//            br, bq, bp, bo, 
//            be, bb, bh, ce, 
//            bk, bg, bl, bc, 
//            bu

public final class bd
{

    private static final bl a;

    static bl a()
    {
        return a;
    }

    static void a(bb bb1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); bb1.a((be)arraylist.next())) { }
    }

    static void a(bc bc, bu bu)
    {
        if (bu != null)
        {
            if (bu instanceof bh)
            {
                bu = (bh)bu;
                ce.a(bc, ((bh) (bu)).e, ((bh) (bu)).g, ((bh) (bu)).f, ((bh) (bu)).a);
            } else
            {
                if (bu instanceof bk)
                {
                    bu = (bk)bu;
                    ce.a(bc, ((bk) (bu)).e, ((bk) (bu)).g, ((bk) (bu)).f, ((bk) (bu)).a);
                    return;
                }
                if (bu instanceof bg)
                {
                    bu = (bg)bu;
                    ce.a(bc, ((bg) (bu)).e, ((bg) (bu)).g, ((bg) (bu)).f, ((bg) (bu)).a, ((bg) (bu)).b, ((bg) (bu)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new bn();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new bm();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new bt();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new bs();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new br();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new bq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new bp();
        } else
        {
            a = new bo();
        }
    }
}
