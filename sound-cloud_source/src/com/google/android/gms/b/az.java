// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class az
{
    public static final class a
    {

        public final Map a;
        public final b.a b;

        public final String toString()
        {
            return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
        }
    }

    public static final class b
    {

        public final List a;
        public final List b;
        public final List c;
        public final List d;
        private final List e;
        private final List f;

        public final String toString()
        {
            return (new StringBuilder("Positive predicates: ")).append(a).append("  Negative predicates: ").append(b).append("  Add tags: ").append(c).append("  Remove tags: ").append(d).append("  Add macros: ").append(e).append("  Remove macros: ").append(f).toString();
        }
    }


    public static b.a a(b.a a1)
    {
        b.a a2 = new b.a();
        a2.a = a1.a;
        a2.k = (int[])a1.k.clone();
        if (a1.l)
        {
            a2.l = a1.l;
        }
        return a2;
    }
}
