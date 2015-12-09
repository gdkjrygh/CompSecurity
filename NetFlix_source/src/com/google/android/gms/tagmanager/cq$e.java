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

    private final List ZA;
    private final List ZB;
    private final List ZC;
    private final List ZD;
    private final List Zu;
    private final List Zv;
    private final List Zw;
    private final List Zx;
    private final List Zy;
    private final List Zz;

    public static <init> ll()
    {
        return new <init>(null);
    }

    public List lm()
    {
        return Zu;
    }

    public List ln()
    {
        return Zv;
    }

    public List lo()
    {
        return Zw;
    }

    public List lp()
    {
        return Zx;
    }

    public List lq()
    {
        return Zy;
    }

    public List lr()
    {
        return ZA;
    }

    public List ls()
    {
        return ZB;
    }

    public List lt()
    {
        return ZC;
    }

    public List lu()
    {
        return ZD;
    }

    public List lv()
    {
        return Zz;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(lm()).append("  Negative predicates: ").append(ln()).append("  Add tags: ").append(lo()).append("  Remove tags: ").append(lp()).append("  Add macros: ").append(lq()).append("  Remove macros: ").append(lv()).toString();
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        Zu = Collections.unmodifiableList(list);
        Zv = Collections.unmodifiableList(list1);
        Zw = Collections.unmodifiableList(list2);
        Zx = Collections.unmodifiableList(list3);
        Zy = Collections.unmodifiableList(list4);
        Zz = Collections.unmodifiableList(list5);
        ZA = Collections.unmodifiableList(list6);
        ZB = Collections.unmodifiableList(list7);
        ZC = Collections.unmodifiableList(list8);
        ZD = Collections.unmodifiableList(list9);
    }

    ZD(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, ZD zd)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
