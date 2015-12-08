// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.Iterator;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    private uU a;

    public final void a(List list)
    {
        list = list.iterator();
        boolean flag1 = false;
        while (list.hasNext()) 
        {
            ChannelPage channelpage = (ChannelPage)list.next();
            boolean flag = flag1;
            if (channelpage.k().isError())
            {
                Timber.c("PublisherIconMediaLoader", "DISCOVER-MEDIA-BRAND-ICON: Resetting state for filled icon for %s because it was in error state %s", new Object[] {
                    channelpage, channelpage.k().name()
                });
                flag = flag1 | a.c.b(channelpage, MediaState.NOT_STARTED);
            }
            flag1 = flag;
            if (channelpage.l().isError())
            {
                Timber.c("PublisherIconMediaLoader", "DISCOVER-MEDIA-BRAND-ICON: Resetting state for inverted icon for %s because it was in error state %s", new Object[] {
                    channelpage, channelpage.l().name()
                });
                flag1 = flag | a.c.c(channelpage, MediaState.NOT_STARTED);
            }
            if (channelpage.m().isError())
            {
                Timber.a("PublisherIconMediaLoader", "BRAND-ICON: Resetting state for loading icon for %s because it was in error state %s", new Object[] {
                    channelpage, channelpage.m().name()
                });
                flag = a.c.d(channelpage, MediaState.NOT_STARTED) | flag1;
            } else
            {
                flag = flag1;
            }
            flag1 = flag;
        }
        if (flag1)
        {
            a.b.b();
        }
    }

    >(uU uu)
    {
        a = uu;
        super();
    }
}
