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

class this._cls1
    implements Predicate
{

    final  this$1;

    public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague. )
    {
        return .().equals(key);
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.te)obj);
    }

    l.key()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/player/PlayerInfoProvider$1

/* anonymous class */
    class PlayerInfoProvider._cls1
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
                CollectionUtils.filter(playerinfo, new PlayerInfoProvider._cls1._cls1());
                return Observable.just(playerinfo);
            }
        }

            
            {
                this$0 = final_playerinfoprovider;
                key = String.this;
                super();
            }
    }

}
