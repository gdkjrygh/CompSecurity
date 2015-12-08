// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;


// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailQuestFragment, GameDetailActivity

final class this._cls0
    implements com.google.android.gms.games.ui.card.EventListener
{

    final GameDetailQuestFragment this$0;

    public final void onGotItClicked(String s)
    {
        GameDetailQuestFragment.access$000(GameDetailQuestFragment.this).launchPlusUpgradeFlow(5, null);
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    ()
    {
        this$0 = GameDetailQuestFragment.this;
        super();
    }
}
