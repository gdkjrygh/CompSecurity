// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.recents:
//            Recent

final class a
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0x566f41ccb5e3e61L;

    a()
    {
    }

    public final int compare(Recent recent, Recent recent1)
    {
        long l = recent.getTimestamp();
        long l1 = recent1.getTimestamp();
        boolean flag = ConversationUtil.c(recent.getLiveStatus());
        boolean flag1 = ConversationUtil.c(recent1.getLiveStatus());
        if (flag && !flag1)
        {
            return -1;
        }
        if (!flag && flag1)
        {
            return 1;
        }
        if (flag && flag1)
        {
            return (int)(l1 - l);
        }
        long l2 = TimeUtil.b();
        if (l > l2 && l1 > l2)
        {
            return 0;
        } else
        {
            return (int)(l1 - l);
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Recent)obj, (Recent)obj1);
    }
}
