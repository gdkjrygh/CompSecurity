// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemRecyclerAdapter, GamesRecyclerAdapter

public static class nit> extends nit>
{

    public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        super.pulateViews(gamesrecycleradapter, i);
    }

    public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
    {
        super.pulateViews(gamesrecycleradapter, i);
    }

    public final void repopulateViews()
    {
        SingleItemRecyclerAdapter singleitemrecycleradapter = (SingleItemRecyclerAdapter)mAdapter;
        if (singleitemrecycleradapter.mCard == null)
        {
            populateViews(singleitemrecycleradapter, getLocalPosition());
            return;
        } else
        {
            populateViews(singleitemrecycleradapter, getLocalPosition(), singleitemrecycleradapter.mCard);
            return;
        }
    }

    public (View view)
    {
        super(view);
    }
}
