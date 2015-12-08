// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.tinder.views:
//            MatchListLayout, RelativeLayoutInterceptor

private class <init> extends android.support.v7.widget.unt
{

    private boolean onScreen;
    private int scrollAmount;
    final MatchListLayout this$0;

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        int k;
        int l;
        super.nScrolled(recyclerview, i, j);
        k = MatchListLayout.access$000(MatchListLayout.this);
        l = ((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        if (l >= -1 && l <= 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (!onScreen && j < 0)
        {
            scrollAmount = k;
        }
        (new StringBuilder("On Screen! Position = ")).append(l).append(", scrollAmount = ").append(scrollAmount);
        onScreen = true;
        scrollAmount = scrollAmount + j;
_L10:
        if (scrollAmount < 0)
        {
            scrollAmount = 0;
        }
        if ((!onScreen || l != 1) && l != -1) goto _L4; else goto _L3
_L3:
        if (scrollAmount < 0) goto _L6; else goto _L5
_L5:
        MatchListLayout.access$100(MatchListLayout.this).setTranslationY(-scrollAmount);
_L8:
        return;
_L2:
        if (onScreen)
        {
            (new StringBuilder("Off Screen! Position = ")).append(l).append(", scrollAmount = ").append(scrollAmount);
            onScreen = false;
            MatchListLayout.access$100(MatchListLayout.this).setTranslationY(-k);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        scrollAmount = 0;
        MatchListLayout.access$100(MatchListLayout.this).setTranslationY(0.0F);
        return;
_L4:
        if (l != 0) goto _L8; else goto _L7
_L7:
        scrollAmount = 0;
        MatchListLayout.access$100(MatchListLayout.this).setTranslationY(0.0F);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setScrollAmount(int i)
    {
        scrollAmount = i;
        MatchListLayout.access$100(MatchListLayout.this).setTranslationY(-scrollAmount);
    }

    private istener()
    {
        this$0 = MatchListLayout.this;
        super();
        onScreen = true;
        scrollAmount = 0;
    }

    scrollAmount(scrollAmount scrollamount)
    {
        this();
    }
}
