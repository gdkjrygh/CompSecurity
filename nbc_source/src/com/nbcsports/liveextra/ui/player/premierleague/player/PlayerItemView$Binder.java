// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemView

public static class redCard extends BaseObservable
{

    public ObservableField country;
    public ObservableField dateOfBirth;
    public ObservableField firstName;
    public ObservableInt height;
    public ObservableBoolean isGoalkeeper;
    public ObservableInt jersey;
    public ObservableField lastName;
    public ObservableInt playerId;
    public ObservableField position;
    public ObservableBoolean redCard;
    public ObservableField season;
    public ObservableField stats;
    public ObservableInt teamColor;
    public ObservableInt teamId;
    public ObservableInt weight;
    public ObservableBoolean yellowCard;

    public ()
    {
        playerId = new ObservableInt();
        height = new ObservableInt();
        weight = new ObservableInt();
        jersey = new ObservableInt();
        firstName = new ObservableField();
        lastName = new ObservableField();
        position = new ObservableField();
        country = new ObservableField();
        dateOfBirth = new ObservableField();
        isGoalkeeper = new ObservableBoolean();
        teamId = new ObservableInt();
        teamColor = new ObservableInt();
        stats = new ObservableField();
        season = new ObservableField();
        yellowCard = new ObservableBoolean();
        redCard = new ObservableBoolean();
    }
}
