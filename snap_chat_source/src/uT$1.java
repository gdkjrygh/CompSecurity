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

    private uT a;

    public final void a(List list)
    {
        list = list.iterator();
        boolean flag = false;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ChannelPage channelpage = (ChannelPage)list.next();
            if (channelpage.n() == MediaState.SUCCESS && !a.a.g(channelpage.o()))
            {
                Timber.d("IntroVideoMediaLoader", "Resetting intro video media state for %s because it is not in the cache %s", new Object[] {
                    channelpage
                });
                flag |= a.c.a(channelpage, MediaState.NOT_STARTED);
            }
        } while (true);
        if (flag)
        {
            a.b.b();
        }
    }

    >(uT ut)
    {
        a = ut;
        super();
    }
}
