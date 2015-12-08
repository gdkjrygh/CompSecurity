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

public class PlayViewModel
{

    String detail;
    String eventId;
    String gameTime;
    DateTime timestamp;

    public PlayViewModel(String s, DateTime datetime, String s1, String s2)
    {
        eventId = s;
        gameTime = s1;
        detail = s2;
        timestamp = datetime;
    }

    public static Func1 fromPlayByPlay()
    {
        return new Func1() {

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

                        final _cls1 this$0;

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
                this$0 = _cls1.this;
                super();
            }
                    }));
                }
            }

        };
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof PlayViewModel;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof PlayViewModel))
            {
                return false;
            }
            obj = (PlayViewModel)obj;
            if (!((PlayViewModel) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getEventId();
            Object obj2 = ((PlayViewModel) (obj)).getEventId();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getTimestamp();
            obj2 = ((PlayViewModel) (obj)).getTimestamp();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getGameTime();
            obj2 = ((PlayViewModel) (obj)).getGameTime();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getDetail();
            obj = ((PlayViewModel) (obj)).getDetail();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public String getDetail()
    {
        return detail;
    }

    public String getEventId()
    {
        return eventId;
    }

    public String getGameTime()
    {
        return gameTime;
    }

    public DateTime getTimestamp()
    {
        return timestamp;
    }

    public int hashCode()
    {
        int l = 0;
        Object obj = getEventId();
        int i;
        int j;
        int k;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getTimestamp();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getGameTime();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getDetail();
        if (obj != null)
        {
            l = obj.hashCode();
        }
        return (((i + 59) * 59 + j) * 59 + k) * 59 + l;
    }
}
