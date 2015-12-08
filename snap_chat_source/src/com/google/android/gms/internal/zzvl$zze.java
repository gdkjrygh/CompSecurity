// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzvl

public static class <init>
{

    private final List zzaCn;
    private final List zzaCo;
    private final List zzaCp;
    private final List zzaCq;
    private final List zzaCr;
    private final List zzaCs;
    private final List zzaCt;
    private final List zzaCu;
    private final List zzaCv;
    private final List zzaCw;

    public static <init> zzuB()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder("Positive predicates: ")).append(zzuC()).append("  Negative predicates: ").append(zzuD()).append("  Add tags: ").append(zzuE()).append("  Remove tags: ").append(zzuF()).append("  Add macros: ").append(zzuG()).append("  Remove macros: ").append(zzuL()).toString();
    }

    public List zzuC()
    {
        return zzaCn;
    }

    public List zzuD()
    {
        return zzaCo;
    }

    public List zzuE()
    {
        return zzaCp;
    }

    public List zzuF()
    {
        return zzaCq;
    }

    public List zzuG()
    {
        return zzaCr;
    }

    public List zzuH()
    {
        return zzaCt;
    }

    public List zzuI()
    {
        return zzaCu;
    }

    public List zzuJ()
    {
        return zzaCv;
    }

    public List zzuK()
    {
        return zzaCw;
    }

    public List zzuL()
    {
        return zzaCs;
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        zzaCn = Collections.unmodifiableList(list);
        zzaCo = Collections.unmodifiableList(list1);
        zzaCp = Collections.unmodifiableList(list2);
        zzaCq = Collections.unmodifiableList(list3);
        zzaCr = Collections.unmodifiableList(list4);
        zzaCs = Collections.unmodifiableList(list5);
        zzaCt = Collections.unmodifiableList(list6);
        zzaCu = Collections.unmodifiableList(list7);
        zzaCv = Collections.unmodifiableList(list8);
        zzaCw = Collections.unmodifiableList(list9);
    }

    zzaCw(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, zzaCw zzacw)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
