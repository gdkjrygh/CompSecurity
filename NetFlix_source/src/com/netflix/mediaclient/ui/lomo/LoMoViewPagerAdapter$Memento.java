// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.servicemgr.BasicLoMo;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter, RowAdapter

static class emento
{

    final emento adapterMemento;
    final BasicLoMo lomo;
    final emento preErrorState;
    final emento state;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("lomo: ");
        String s;
        if (lomo == null)
        {
            s = "n/a";
        } else
        {
            s = lomo.getTitle();
        }
        return stringbuilder.append(s).append(", state: ").append(state).append(", adapter: ").append(adapterMemento).toString();
    }

    protected emento(emento emento, emento emento1, BasicLoMo basiclomo, RowAdapter rowadapter)
    {
        state = emento;
        preErrorState = emento1;
        lomo = basiclomo;
        adapterMemento = (emento)rowadapter.saveToMemento();
    }
}
