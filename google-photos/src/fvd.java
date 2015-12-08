// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;
import java.util.Set;

final class fvd
    implements elf
{

    private static final ekz a;
    private static final ekz b;
    private final Context c;
    private final neq d;

    public fvd(Context context, neq neq1)
    {
        c = context;
        d = neq1;
    }

    private static int a(Set set)
    {
        int i = 0;
        int j = 0;
        if (!ekw.a.f.equals(set))
        {
            if (!set.contains(euv.c))
            {
                j = 1;
            }
            i = j;
            if (!set.contains(euv.b))
            {
                i = j | 2;
            }
        }
        return i;
    }

    public final long a(ekq ekq, ekw ekw1)
    {
        int i = 0;
        fux fux1 = (fux)ekq;
        int j = a(ekw1.f);
        ekq = d;
        ekw1 = fux1.b;
        long l = System.currentTimeMillis();
        nek anek[] = neh.b(j);
        int k = anek.length;
        j = 0;
        for (; i < k; i++)
        {
            j += anek[i].a(((neq) (ekq)).b, ekw1);
        }

        if (((neq) (ekq)).a.a())
        {
            ekq = String.valueOf(b.c(l));
            (new StringBuilder(String.valueOf(ekq).length() + 45)).append("[getMediaCount] count: ").append(j).append(", duration:").append(ekq);
        }
        return (long)j;
    }

    public final Class a()
    {
        return fux;
    }

    public final List a(ekq ekq, ekw ekw1, ekk ekk)
    {
        ekq = (fux)ekq;
        ekk = new fvp(c, ekq, ekk);
        int i = a(ekw1.f);
        return d.a(((fux) (ekq)).b, i, ekw1.c, ekw1.b, ekk, null, ekq.b());
    }

    public final ekz b()
    {
        return b;
    }

    public final ekz c()
    {
        return a;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.c = true;
        ela1.d = true;
        a = ela1.a();
        ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        ela1.d = true;
        ela1.c = true;
        b = ela1.a();
    }
}
