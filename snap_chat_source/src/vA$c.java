// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public static final class a
{
    public static final class a
    {

        public String a;
        public String b;
        public boolean c;
        public int d;
        public int e;
        public Set f;

        public final a a(vA.c c1)
        {
            if (c1 != null)
            {
                a = c1.a;
                b = c1.b;
                c = c1.c;
                d = c1.d;
                e = c1.e;
                f = c1.f;
            }
            return this;
        }

        public final vA.c a()
        {
            if (a == null)
            {
                throw new IllegalArgumentException("Cannot build EditionViewState with null ID.");
            } else
            {
                return new vA.c(this, (byte)0);
            }
        }

        public a()
        {
            d = 0;
            e = 0;
            f = new HashSet();
        }
    }


    public final String a;
    public final String b;
    public final boolean c;
    final int d;
    final int e;
    public final Set f;

    private >(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
        e = a1.e;
        f = a1.f;
    }

    >(a a1, byte byte0)
    {
        this(a1);
    }
}
