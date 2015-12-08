// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayItemView

public static class playButtonVisible extends BaseObservable
{

    public ObservableField detail;
    public ObservableBoolean isSeekEnabled;
    public ObservableBoolean playButtonVisible;
    public ObservableField time;

    public ()
    {
        time = new ObservableField();
        detail = new ObservableField();
        isSeekEnabled = new ObservableBoolean();
        playButtonVisible = new ObservableBoolean();
    }
}
