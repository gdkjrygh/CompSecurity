// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class co
{
    public static final class a
    {

        private final Map aPa;
        private final com.google.android.gms.internal.d.a aPb;

        public final void a(String s, com.google.android.gms.internal.d.a a1)
        {
            aPa.put(s, a1);
        }

        public final String toString()
        {
            return (new StringBuilder("Properties: ")).append(tw()).append(" pushAfterEvaluate: ").append(aPb).toString();
        }

        public final Map tw()
        {
            return Collections.unmodifiableMap(aPa);
        }

        public final com.google.android.gms.internal.d.a tx()
        {
            return aPb;
        }
    }

    public static final class e
    {

        private final List aPf;
        private final List aPg;
        private final List aPh;
        private final List aPi;
        private final List aPj;
        private final List aPk;
        private final List aPn;
        private final List aPo;

        private List tI()
        {
            return aPj;
        }

        private List tN()
        {
            return aPk;
        }

        public final List tE()
        {
            return aPf;
        }

        public final List tF()
        {
            return aPg;
        }

        public final List tG()
        {
            return aPh;
        }

        public final List tH()
        {
            return aPi;
        }

        public final List tL()
        {
            return aPn;
        }

        public final List tM()
        {
            return aPo;
        }

        public final String toString()
        {
            return (new StringBuilder("Positive predicates: ")).append(tE()).append("  Negative predicates: ").append(tF()).append("  Add tags: ").append(tG()).append("  Remove tags: ").append(tH()).append("  Add macros: ").append(tI()).append("  Remove macros: ").append(tN()).toString();
        }
    }


    public static com.google.android.gms.internal.d.a g(com.google.android.gms.internal.d.a a1)
    {
        com.google.android.gms.internal.d.a a2 = new com.google.android.gms.internal.d.a();
        a2.type = a1.type;
        a2.gD = (int[])a1.gD.clone();
        if (a1.gE)
        {
            a2.gE = a1.gE;
        }
        return a2;
    }
}
