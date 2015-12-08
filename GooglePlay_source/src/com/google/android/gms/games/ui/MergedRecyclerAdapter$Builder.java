// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui:
//            MergedRecyclerAdapter, GamesRecyclerAdapter

public static final class 
{

    private final ArrayList mAdapterList = new ArrayList();

    public final  addAdapter(GamesRecyclerAdapter gamesrecycleradapter)
    {
        mAdapterList.add(gamesrecycleradapter);
        return this;
    }

    public final MergedRecyclerAdapter build()
    {
        return new MergedRecyclerAdapter(mAdapterList, (byte)0);
    }

    public ()
    {
    }
}
