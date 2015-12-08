// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            MergedListAdapter

static final class <init>
{

    List adapterInfo;
    int count;
    boolean hasDisabledItems;
    boolean isDirty;
    int viewTypeCount;

    private ()
    {
        adapterInfo = Lists.newArrayList();
        count = 0;
        viewTypeCount = 1;
        hasDisabledItems = false;
        isDirty = false;
    }

    isDirty(isDirty isdirty)
    {
        this();
    }
}
