// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventItemView

public class isSeekEnabled extends BaseObservable
{

    public ObservableField firstName;
    public ObservableBoolean isSeekEnabled;
    public ObservableBoolean isStart;
    public ObservableField lastName;
    public ObservableField position;
    public ObservableField teamAbbr;
    public ObservableField teamIcon;
    final EventItemView this$0;
    public ObservableField time;

    public Q()
    {
        this$0 = EventItemView.this;
        super();
        teamAbbr = new ObservableField();
        teamIcon = new ObservableField();
        time = new ObservableField();
        firstName = new ObservableField();
        lastName = new ObservableField();
        position = new ObservableField();
        isStart = new ObservableBoolean();
        isSeekEnabled = new ObservableBoolean();
    }
}
