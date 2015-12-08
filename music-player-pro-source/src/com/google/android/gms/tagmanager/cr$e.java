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

    private final List asR;
    private final List asS;
    private final List asT;
    private final List asU;
    private final List asV;
    private final List asW;
    private final List asX;
    private final List asY;
    private final List asZ;
    private final List ata;

    public static <init> qs()
    {
        return new <init>(null);
    }

    public List qA()
    {
        return asZ;
    }

    public List qB()
    {
        return ata;
    }

    public List qC()
    {
        return asW;
    }

    public List qt()
    {
        return asR;
    }

    public List qu()
    {
        return asS;
    }

    public List qv()
    {
        return asT;
    }

    public List qw()
    {
        return asU;
    }

    public List qx()
    {
        return asV;
    }

    public List qy()
    {
        return asX;
    }

    public List qz()
    {
        return asY;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(qt()).append("  Negative predicates: ").append(qu()).append("  Add tags: ").append(qv()).append("  Remove tags: ").append(qw()).append("  Add macros: ").append(qx()).append("  Remove macros: ").append(qC()).toString();
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        asR = Collections.unmodifiableList(list);
        asS = Collections.unmodifiableList(list1);
        asT = Collections.unmodifiableList(list2);
        asU = Collections.unmodifiableList(list3);
        asV = Collections.unmodifiableList(list4);
        asW = Collections.unmodifiableList(list5);
        asX = Collections.unmodifiableList(list6);
        asY = Collections.unmodifiableList(list7);
        asZ = Collections.unmodifiableList(list8);
        ata = Collections.unmodifiableList(list9);
    }

    ata(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, ata ata1)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
