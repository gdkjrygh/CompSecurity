// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class gsr extends nzc
{

    public boolean a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private final pzl d;
    private final qeo e = null;
    private final qbx r;
    private final boolean s;

    private gsr(Context context, int i, pzl pzl, qeo qeo1, qbx qbx1, boolean flag)
    {
        super(context, new nyg(context, i), "addpendingmediatolibrary", new pad(), new pae());
        d = pzl;
        r = qbx1;
        s = flag;
    }

    public static gsr a(Context context, int i, String s1, boolean flag)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("mediaKey must be non-null");
        } else
        {
            qbx qbx1 = new qbx();
            qbx1.a = s1;
            return new gsr(context, i, null, null, qbx1, flag);
        }
    }

    public static gsr a(Context context, int i, pzl pzl)
    {
        if (pzl == null)
        {
            throw new IllegalArgumentException("assistantAddPendingMediaParams must be non-null");
        } else
        {
            return new gsr(context, i, pzl, null, null, false);
        }
    }

    protected final void a(qlw qlw)
    {
        qlw = (pad)qlw;
        qlw.a = new pzf();
        qlw = ((pad) (qlw)).a;
        if (e != null)
        {
            qlw.a = 3;
            qlw.d = (new qeo[] {
                e
            });
            return;
        }
        if (r != null)
        {
            int i;
            if (s)
            {
                i = 4;
            } else
            {
                i = 2;
            }
            qlw.a = i;
            qlw.c = (new qbx[] {
                r
            });
            return;
        }
        if (d != null)
        {
            qlw.a = 1;
            qlw.b = d;
            return;
        } else
        {
            throw new IllegalArgumentException("AddPendingMediaToLibraryRequest must have at least one non-null value for collectionId, itemId, or assistantAddPendingMediaParams.");
        }
    }

    protected final void b(qlw qlw)
    {
        boolean flag = false;
        qlw = (pae)qlw;
        super.b(qlw);
        if (!l())
        {
            a = true;
            qbx aqbx[] = ((pae) (qlw)).a.a;
            int k = aqbx.length;
            for (int i = 0; i < k; i++)
            {
                qbx qbx1 = aqbx[i];
                if (!TextUtils.isEmpty(qbx1.a))
                {
                    c.add(qbx1.a);
                }
            }

            qlw = ((pae) (qlw)).a.b;
            k = qlw.length;
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                Object obj = qlw[j];
                if (!TextUtils.isEmpty(((qeo) (obj)).a))
                {
                    b.add(((qeo) (obj)).a);
                }
            }

        }
    }
}
