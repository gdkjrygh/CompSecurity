// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.tile.Tile;

public final class SharedPreferenceDismissController
    implements com.google.android.apps.wallet.tile.Tile.TileDismissedListener
{

    private SharedPreference preference;
    private SharedPreferences sharedPreferences;

    public SharedPreferenceDismissController(SharedPreferences sharedpreferences, SharedPreference sharedpreference)
    {
        sharedPreferences = sharedpreferences;
        preference = sharedpreference;
    }

    public final boolean isDismissed()
    {
        return ((Boolean)preference.get(sharedPreferences)).booleanValue();
    }

    public final void onTileDismissed(Tile tile)
    {
        preference.put(sharedPreferences, Boolean.valueOf(true));
    }
}
