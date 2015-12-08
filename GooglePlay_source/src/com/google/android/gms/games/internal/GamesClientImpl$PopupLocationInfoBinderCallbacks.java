// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesClient, GamesClientImpl, PopupLocationInfoParcelable, PopupManager

private static final class mPopupManager extends AbstractGamesClient
{

    private final PopupManager mPopupManager;

    public final PopupLocationInfoParcelable getPopupLocationInfo()
    {
        return new PopupLocationInfoParcelable(mPopupManager.getPopupLocationInfo());
    }

    public (PopupManager popupmanager)
    {
        mPopupManager = popupmanager;
    }
}
