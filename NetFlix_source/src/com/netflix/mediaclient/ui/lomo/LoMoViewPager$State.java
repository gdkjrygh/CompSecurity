// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;


// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPager

public static class .Memento
{

    .Memento adapterMemento;
    int currPage;

    public String toString()
    {
        return (new StringBuilder()).append("Page: ").append(currPage).append(", adapter: ").append(adapterMemento.toString()).toString();
    }

    public .Memento()
    {
    }
}
