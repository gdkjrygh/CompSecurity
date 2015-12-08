// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.Standings;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            LiveTableProvider

class this._cls0
    implements Func1
{

    final LiveTableProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((Standings)obj);
    }

    public Observable call(Standings standings)
    {
        if (standings == null || CollectionUtils.isEmpty(standings.getWeeks()))
        {
            Timber.d("GetStandings returned no data", new Object[0]);
            return null;
        } else
        {
            Timber.d("Returning current week standings", new Object[0]);
            return Observable.just((com.nbcsports.liveextra.content.models.overlay.premierleague.l)standings.getWeeks().get(0));
        }
    }

    ()
    {
        this$0 = LiveTableProvider.this;
        super();
    }
}
