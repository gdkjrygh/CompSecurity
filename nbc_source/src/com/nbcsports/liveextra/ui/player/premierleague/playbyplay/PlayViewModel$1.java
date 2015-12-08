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

static final class _cls1.this._cls0
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
            return new ArrayList(CollectionUtils.collect(list, new Transformer() {

                final PlayViewModel._cls1 this$0;

                public PlayViewModel transform(com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay playbyplay)
                {
                    int i = playbyplay.getMinute();
                    String s = TimeUtils.getGameTime(playbyplay.getPeriod(), i);
                    String s1 = playbyplay.getEid();
                    DateTime datetime;
                    if (playbyplay.getTimeStamp() == null)
                    {
                        datetime = null;
                    } else
                    {
                        datetime = DateTime.parse(TimeUtils.normalizeTimestamp(playbyplay.getTimeStamp()));
                    }
                    return new PlayViewModel(s1, datetime, s, playbyplay.getPlayDesc());
                }

                public volatile Object transform(Object obj)
                {
                    return transform((com.nbcsports.liveextra.content.models.overlay.premierleague.Plays.PlayByPlay)obj);
                }

            
            {
                this$0 = PlayViewModel._cls1.this;
                super();
            }
            }));
        }
    }

    _cls1.this._cls0()
    {
    }
}
