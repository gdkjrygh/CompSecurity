// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.view.View;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            ContinuePlayingAdapter

public static interface 
{

    public abstract void onContinuePlayingClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view);

    public abstract void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view);

    public abstract void onContinuePlayingShareIconClicked(String s, String s1, View view);
}
