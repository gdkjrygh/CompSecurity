// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BasePaginatedAdapter

static class currTitle
{

    final String currTitle;
    final List data;
    final int listViewPos;

    public String toString()
    {
        return (new StringBuilder()).append("title: ").append(currTitle).append(", data size: ").append(data.size()).append(", listViewPos: ").append(listViewPos).toString();
    }

    protected (List list, int i, String s)
    {
        data = list;
        listViewPos = i;
        currTitle = s;
    }
}
