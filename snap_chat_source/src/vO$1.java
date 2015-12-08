// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.discover.model.ChannelPage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class lang.Object
    implements lang.Object
{

    private vO a;

    public final void a(List list)
    {
        Object obj = a.a;
        obj;
        JVM INSTR monitorenter ;
        a.d.clear();
        ChannelPage channelpage;
        for (list = list.iterator(); list.hasNext(); a.d.put(channelpage.c, channelpage))
        {
            channelpage = (ChannelPage)list.next();
        }

        break MISSING_BLOCK_LABEL_70;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        a.a();
        obj;
        JVM INSTR monitorexit ;
    }

    >(vO vo)
    {
        a = vo;
        super();
    }
}
