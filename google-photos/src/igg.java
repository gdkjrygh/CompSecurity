// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class igg
{

    private final List a;
    private final int b;
    private final int c;

    public igg(Context context, igs igs1)
    {
        context = (eiv)olm.a(context, eiv);
        b = context.a(ejm.a);
        c = context.a(ejm.b);
        a = a(igs1.a);
    }

    private long a(int i)
    {
        Iterator iterator = a.iterator();
        long l = 0L;
        while (iterator.hasNext()) 
        {
            igi igi1 = (igi)iterator.next();
            int j = Math.max(igi1.b, igi1.c);
            double d;
            if (j < i)
            {
                d = 1.0D;
            } else
            {
                d = (double)i / (double)j;
            }
            l = Math.round((double)igi1.a * d) + l;
        }
        return l;
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        fzw fzw1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new igi(b.a(fzw1.i), (int)b.a(fzw1.d), (int)b.a(fzw1.e))))
        {
            fzw1 = ((fzu)((ekp)list.next()).a(fzu)).a;
        }

        return arraylist;
    }

    public final long a(igj igj1)
    {
        long l = 0L;
        switch (igh.a[igj1.ordinal()])
        {
        default:
            igj1 = String.valueOf(igj1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(igj1).length() + 21)).append("Unknown ShareMethod: ").append(igj1).toString());

        case 2: // '\002'
            igj1 = a.iterator();
            for (l = 0L; igj1.hasNext(); l = ((igi)igj1.next()).a + l) { }
            // fall through

        case 1: // '\001'
            return l;

        case 3: // '\003'
            return a(b);

        case 4: // '\004'
            return a(c);
        }
    }
}
