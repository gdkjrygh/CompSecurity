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
            if (channelpage.n().isError())
            {
                Timber.c("IntroVideoMediaLoader", "Resetting state for %s because it was in error state %s", new Object[] {
                    channelpage, channelpage.n().name()
                });
                flag = a.c.a(channelpage, MediaState.NOT_STARTED) | flag;
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
