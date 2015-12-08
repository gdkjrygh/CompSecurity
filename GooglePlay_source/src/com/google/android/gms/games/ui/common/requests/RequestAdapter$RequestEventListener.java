// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.request.GameRequest;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestAdapter

public static interface Y
{

    public abstract void onRequestDismissed(GameRequest gamerequest);

    public abstract void onRequestMuteAppClicked(Game game);

    public transient abstract void onRequestsClicked(GameRequest agamerequest[]);
}
