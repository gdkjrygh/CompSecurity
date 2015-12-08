// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            WhatsNewCardAdapter

protected static final class a extends com.google.android.gms.games.ui.card.r
{

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
    {
        super.populateViews(gamesrecycleradapter, i, extendedappcontentcard);
        gamesrecycleradapter = mContext.getResources();
        AppContentUtils.annotateTitleAndSubtitle(gamesrecycleradapter.getString(0x7f10031d), gamesrecycleradapter.getString(0x7f10031c), this);
    }

    public a(View view)
    {
        super(view);
    }
}
