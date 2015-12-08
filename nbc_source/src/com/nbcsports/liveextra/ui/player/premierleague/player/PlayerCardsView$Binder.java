// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerCardsView

public static class isHomeTeam extends BaseObservable
{

    public final ObservableField awayAbbr = new ObservableField();
    public final ObservableInt awayColor = new ObservableInt();
    public final ObservableField awayFormation = new ObservableField();
    public final ObservableArrayList awayPlayers = new ObservableArrayList();
    public final ObservableField homeAbbr = new ObservableField();
    public final ObservableInt homeColor = new ObservableInt();
    public final ObservableField homeFormation = new ObservableField();
    public final ObservableArrayList homePlayers = new ObservableArrayList();
    public final ObservableBoolean isHomeTeam = new ObservableBoolean();

    public ()
    {
        isHomeTeam.set(true);
    }
}
