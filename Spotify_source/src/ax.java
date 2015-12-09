// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

public final class ax
{

    private static final be a;

    static be a()
    {
        return a;
    }

    static void a(av av1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); av1.a((ay)arraylist.next())) { }
    }

    static void a(aw aw, bn bn)
    {
        if (bn != null)
        {
            if (bn instanceof ba)
            {
                bw.a(aw, ((ba)bn).a);
            } else
            {
                if (bn instanceof bd)
                {
                    bw.a(aw, ((bd)bn).a);
                    return;
                }
                if (bn instanceof az)
                {
                    bw.a(aw);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new bg();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new bf();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new bm();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new bl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new bk();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new bj();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new bi();
        } else
        {
            a = new bh();
        }
    }
}
