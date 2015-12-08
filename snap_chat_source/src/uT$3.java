// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class lang.Object
    implements lang.Object
{

    private uT a;

    public final void a(List list)
    {
        uT ut = a;
        Object obj = list.iterator();
        boolean flag = false;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ChannelPage channelpage = (ChannelPage)((Iterator) (obj)).next();
            if (channelpage.n() != MediaState.SUCCESS && channelpage.n() == MediaState.NOT_STARTED)
            {
                if (ut.a.g(channelpage.o()))
                {
                    flag = ut.c.a(channelpage, MediaState.SUCCESS) | flag;
                } else
                if (ut.a.a())
                {
                    boolean flag1;
                    if (!ut.d.contains(channelpage.a))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    flag = ut.a(channelpage, flag1) | flag;
                } else
                {
                    flag |= ut.c.a(channelpage, MediaState.EXTERNAL_STORAGE_UNAVAILABLE);
                }
            }
        } while (true);
        if (flag)
        {
            ut.b.b();
        }
        obj = new HashSet();
        for (list = list.iterator(); list.hasNext(); ((Set) (obj)).add(((ChannelPage)list.next()).o())) { }
        ut.a.a(((Set) (obj)));
    }

    >(uT ut)
    {
        a = ut;
        super();
    }
}
