// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableInt;
import java.util.Arrays;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsView, StatsItemViewModel

public class l.getStats extends BaseObservable
{

    public ObservableInt awayColor;
    public ObservableArrayList ballLocations;
    public ObservableInt homeColor;
    public ObservableArrayList statsList;
    final StatsView this$0;

    public l()
    {
        this$0 = StatsView.this;
        super();
        homeColor = new ObservableInt();
        awayColor = new ObservableInt();
        ballLocations = new ObservableArrayList();
        statsList = new ObservableArrayList();
        ballLocations.addAll(Arrays.asList(new Double[] {
            Double.valueOf(0.0D), Double.valueOf(0.0D), Double.valueOf(0.0D)
        }));
        statsview = Arrays.asList(new com.nbcsports.liveextra.content.models.overlay.premierleague.e[] {
            new com.nbcsports.liveextra.content.models.overlay.premierleague.e("H"), new com.nbcsports.liveextra.content.models.overlay.premierleague.e("A")
        });
        statsList.addAll(StatsItemViewModel.getStats(StatsView.this, null, null));
    }
}
