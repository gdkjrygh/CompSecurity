// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.servicemgr.BasicLoMo;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BaseProgressivePagerAdapter, BasePaginatedAdapter

static class adapterMemento
{

    final adapterMemento adapterMemento;
    final int currDataIndex;
    final boolean hasMoreData;
    final BasicLoMo lomo;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("lomo: ");
        String s;
        if (lomo == null)
        {
            s = "no lomo";
        } else
        {
            s = lomo.getTitle();
        }
        return stringbuilder.append(s).append(", hasMoreData: ").append(hasMoreData).append(", currDataIndex: ").append(currDataIndex).append(", adapter: ").append(adapterMemento).toString();
    }

    protected I(BasicLoMo basiclomo, boolean flag, int i, BasePaginatedAdapter basepaginatedadapter)
    {
        lomo = basiclomo;
        hasMoreData = flag;
        currDataIndex = i;
        adapterMemento = basepaginatedadapter.saveToMemento();
    }
}
