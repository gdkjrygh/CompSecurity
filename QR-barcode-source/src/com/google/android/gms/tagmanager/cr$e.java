// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cr

public static class <init>
{

    private final List aqI;
    private final List aqJ;
    private final List aqK;
    private final List aqL;
    private final List aqM;
    private final List aqN;
    private final List aqO;
    private final List aqP;
    private final List aqQ;
    private final List aqR;

    public static <init> pb()
    {
        return new <init>(null);
    }

    public List pc()
    {
        return aqI;
    }

    public List pd()
    {
        return aqJ;
    }

    public List pe()
    {
        return aqK;
    }

    public List pf()
    {
        return aqL;
    }

    public List pg()
    {
        return aqM;
    }

    public List ph()
    {
        return aqO;
    }

    public List pi()
    {
        return aqP;
    }

    public List pj()
    {
        return aqQ;
    }

    public List pk()
    {
        return aqR;
    }

    public List pl()
    {
        return aqN;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(pc()).append("  Negative predicates: ").append(pd()).append("  Add tags: ").append(pe()).append("  Remove tags: ").append(pf()).append("  Add macros: ").append(pg()).append("  Remove macros: ").append(pl()).toString();
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        aqI = Collections.unmodifiableList(list);
        aqJ = Collections.unmodifiableList(list1);
        aqK = Collections.unmodifiableList(list2);
        aqL = Collections.unmodifiableList(list3);
        aqM = Collections.unmodifiableList(list4);
        aqN = Collections.unmodifiableList(list5);
        aqO = Collections.unmodifiableList(list6);
        aqP = Collections.unmodifiableList(list7);
        aqQ = Collections.unmodifiableList(list8);
        aqR = Collections.unmodifiableList(list9);
    }

    aqR(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, aqR aqr)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
