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

    private final List agZ;
    private final List aha;
    private final List ahb;
    private final List ahc;
    private final List ahd;
    private final List ahe;
    private final List ahf;
    private final List ahg;
    private final List ahh;
    private final List ahi;

    public static <init> mq()
    {
        return new <init>(null);
    }

    public List mA()
    {
        return ahe;
    }

    public List mr()
    {
        return agZ;
    }

    public List ms()
    {
        return aha;
    }

    public List mt()
    {
        return ahb;
    }

    public List mu()
    {
        return ahc;
    }

    public List mv()
    {
        return ahd;
    }

    public List mw()
    {
        return ahf;
    }

    public List mx()
    {
        return ahg;
    }

    public List my()
    {
        return ahh;
    }

    public List mz()
    {
        return ahi;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(mr()).append("  Negative predicates: ").append(ms()).append("  Add tags: ").append(mt()).append("  Remove tags: ").append(mu()).append("  Add macros: ").append(mv()).append("  Remove macros: ").append(mA()).toString();
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        agZ = Collections.unmodifiableList(list);
        aha = Collections.unmodifiableList(list1);
        ahb = Collections.unmodifiableList(list2);
        ahc = Collections.unmodifiableList(list3);
        ahd = Collections.unmodifiableList(list4);
        ahe = Collections.unmodifiableList(list5);
        ahf = Collections.unmodifiableList(list6);
        ahg = Collections.unmodifiableList(list7);
        ahh = Collections.unmodifiableList(list8);
        ahi = Collections.unmodifiableList(list9);
    }

    ahi(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, ahi ahi1)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
