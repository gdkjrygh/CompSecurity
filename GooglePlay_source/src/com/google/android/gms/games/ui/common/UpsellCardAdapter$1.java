// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common;

import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.common:
//            UpsellCardAdapter

static final class val.subSource
    implements com.google.android.gms.games.ui.card..GotItEventListener
{

    final GamesFragmentActivity val$parent;
    final int val$source;
    final Integer val$subSource;

    public final void onGotItClicked(String s)
    {
        val$parent.launchPlusUpgradeFlow(val$source, val$subSource);
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    otItEventListener(GamesFragmentActivity gamesfragmentactivity, int i, Integer integer)
    {
        val$parent = gamesfragmentactivity;
        val$source = i;
        val$subSource = integer;
        super();
    }
}
