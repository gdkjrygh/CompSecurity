// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.a;

import android.content.Context;

// Referenced classes of package it.sephiroth.android.library.a:
//            c

public class it.sephiroth.android.library.a.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(it/sephiroth/android/library/a/a$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("GroupA", 0);
            b = new a("GroupB", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static it.sephiroth.android.library.a.a a;
    private final c.a b;
    private final int c;
    private a d;

    it.sephiroth.android.library.a.a(Context context)
    {
        b = b(context);
        c = b.a().hashCode();
    }

    public static it.sephiroth.android.library.a.a a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorenter ;
        if (a != null) goto _L4; else goto _L3
_L3:
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorenter ;
        a = new it.sephiroth.android.library.a.a(context);
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorexit ;
_L4:
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorexit ;
        throw context;
        context;
        it/sephiroth/android/library/a/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    private c.a b(Context context)
    {
        return it.sephiroth.android.library.a.c.a(context);
    }

    private a c()
    {
        if (c % 2 == 0)
        {
            return a.a;
        } else
        {
            return a.b;
        }
    }

    public String a()
    {
        return b.a();
    }

    public a b()
    {
        if (d == null)
        {
            d = c();
        }
        return d;
    }
}
