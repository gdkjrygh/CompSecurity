// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

public static class <init>
{

    private final List ahc;
    private final List ahd;
    private final List ahe;
    private final List ahf;
    private final List ahg;
    private final List ahh;
    private final List ahi;
    private final List ahj;
    private final List ahk;
    private final List ahl;

    public static <init> mv()
    {
        return new <init>(null);
    }

    public List mA()
    {
        return ahg;
    }

    public List mB()
    {
        return ahi;
    }

    public List mC()
    {
        return ahj;
    }

    public List mD()
    {
        return ahk;
    }

    public List mE()
    {
        return ahl;
    }

    public List mF()
    {
        return ahh;
    }

    public List mw()
    {
        return ahc;
    }

    public List mx()
    {
        return ahd;
    }

    public List my()
    {
        return ahe;
    }

    public List mz()
    {
        return ahf;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(mw()).append("  Negative predicates: ").append(mx()).append("  Add tags: ").append(my()).append("  Remove tags: ").append(mz()).append("  Add macros: ").append(mA()).append("  Remove macros: ").append(mF()).toString();
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        ahc = Collections.unmodifiableList(list);
        ahd = Collections.unmodifiableList(list1);
        ahe = Collections.unmodifiableList(list2);
        ahf = Collections.unmodifiableList(list3);
        ahg = Collections.unmodifiableList(list4);
        ahh = Collections.unmodifiableList(list5);
        ahi = Collections.unmodifiableList(list6);
        ahj = Collections.unmodifiableList(list7);
        ahk = Collections.unmodifiableList(list8);
        ahl = Collections.unmodifiableList(list9);
    }

    ahl(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, ahl ahl1)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
