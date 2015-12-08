// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;

import java.util.Comparator;
import java.util.regex.MatchResult;

// Referenced classes of package com.pinterest.activity.notifications.view.style:
//            BaseNotificationCell

class this._cls0
    implements Comparator
{

    final BaseNotificationCell this$0;

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((MatchResult)obj, (MatchResult)obj1);
    }

    public int compare(MatchResult matchresult, MatchResult matchresult1)
    {
        if (matchresult.start() > matchresult1.start())
        {
            return -1;
        }
        return matchresult.start() >= matchresult1.start() ? 0 : 1;
    }

    ()
    {
        this$0 = BaseNotificationCell.this;
        super();
    }
}
