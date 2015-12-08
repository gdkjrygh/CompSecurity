// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.joda.time.DateTime;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayViewModel

class this._cls0
    implements Transformer
{

    final  this$0;

    public PlayViewModel transform(com.nbcsports.liveextra.content.models.overlay.premierleague.is._cls0 _pcls0)
    {
        int i = _pcls0.etMinute();
        String s = TimeUtils.getGameTime(_pcls0.etPeriod(), i);
        String s1 = _pcls0.etEid();
        DateTime datetime;
        if (_pcls0.etTimeStamp() == null)
        {
            datetime = null;
        } else
        {
            datetime = DateTime.parse(TimeUtils.normalizeTimestamp(_pcls0.etTimeStamp()));
        }
        return new PlayViewModel(s1, datetime, s, _pcls0.etPlayDesc());
    }

    public volatile Object transform(Object obj)
    {
        return transform((com.nbcsports.liveextra.content.models.overlay.premierleague.ansform)obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/playbyplay/PlayViewModel$1

/* anonymous class */
    static final class PlayViewModel._cls1
        implements Func1
    {

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public List call(List list)
        {
            if (CollectionUtils.isEmpty(list))
            {
                return null;
            } else
            {
                return new ArrayList(CollectionUtils.collect(list, new PlayViewModel._cls1._cls1()));
            }
        }

    }

}
