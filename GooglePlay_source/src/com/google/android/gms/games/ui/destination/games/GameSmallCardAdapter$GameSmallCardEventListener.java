// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.view.View;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameSmallCardAdapter

public static interface 
{

    public abstract void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view);

    public abstract void onPlayNowClicked(Game game, View view);

    public abstract void onShareGameClicked(String s, String s1, View view);

    public abstract void onViewInPlayStoreClicked(GameFirstParty gamefirstparty, View view);
}
