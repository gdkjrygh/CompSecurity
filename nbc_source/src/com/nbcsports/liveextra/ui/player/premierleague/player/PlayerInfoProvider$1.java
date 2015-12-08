// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo;
import java.util.ArrayList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerInfoProvider

class val.key
    implements Func1
{

    final PlayerInfoProvider this$0;
    final String val$key;

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
            playerinfo = new ArrayList(playerinfo.getPlayers());
            CollectionUtils.filter(playerinfo, new Predicate() {

                final PlayerInfoProvider._cls1 this$1;

                public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
                {
                    return player.getHa().equals(key);
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player)obj);
                }

            
            {
                this$1 = PlayerInfoProvider._cls1.this;
                super();
            }
            });
            return Observable.just(playerinfo);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_playerinfoprovider;
        val$key = String.this;
        super();
    }
}
