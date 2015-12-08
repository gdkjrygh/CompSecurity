// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerInfoProvider

class this._cls0
    implements Func1
{

    final PlayerInfoProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((PlayerInfo)obj);
    }

    public Observable call(PlayerInfo playerinfo)
    {
        if (playerinfo == null || CollectionUtils.isEmpty(playerinfo.getPlayers()))
        {
            return Observable.empty();
        } else
        {
            return Observable.from(new ArrayList(playerinfo.getPlayers()));
        }
    }

    Q()
    {
        this$0 = PlayerInfoProvider.this;
        super();
    }
}
