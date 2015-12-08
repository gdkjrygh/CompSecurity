// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq

public static class <init>
{

    private final List zzaHo;
    private final List zzaHp;
    private final List zzaHq;
    private final List zzaHr;
    private final List zzaHs;
    private final List zzaHt;
    private final List zzaHu;
    private final List zzaHv;
    private final List zzaHw;
    private final List zzaHx;

    public static <init> zzyz()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(zzyA()).append("  Negative predicates: ").append(zzyB()).append("  Add tags: ").append(zzyC()).append("  Remove tags: ").append(zzyD()).append("  Add macros: ").append(zzyE()).append("  Remove macros: ").append(zzyJ()).toString();
    }

    public List zzyA()
    {
        return zzaHo;
    }

    public List zzyB()
    {
        return zzaHp;
    }

    public List zzyC()
    {
        return zzaHq;
    }

    public List zzyD()
    {
        return zzaHr;
    }

    public List zzyE()
    {
        return zzaHs;
    }

    public List zzyF()
    {
        return zzaHu;
    }

    public List zzyG()
    {
        return zzaHv;
    }

    public List zzyH()
    {
        return zzaHw;
    }

    public List zzyI()
    {
        return zzaHx;
    }

    public List zzyJ()
    {
        return zzaHt;
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        zzaHo = Collections.unmodifiableList(list);
        zzaHp = Collections.unmodifiableList(list1);
        zzaHq = Collections.unmodifiableList(list2);
        zzaHr = Collections.unmodifiableList(list3);
        zzaHs = Collections.unmodifiableList(list4);
        zzaHt = Collections.unmodifiableList(list5);
        zzaHu = Collections.unmodifiableList(list6);
        zzaHv = Collections.unmodifiableList(list7);
        zzaHw = Collections.unmodifiableList(list8);
        zzaHx = Collections.unmodifiableList(list9);
    }

    zzaHx(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, zzaHx zzahx)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
