// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
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
            String s = Integer.toString(channelpage.a().hashCode());
            boolean flag = flag1;
            if (channelpage.k() == MediaState.SUCCESS)
            {
                flag = flag1;
                if (!a.a.g(s))
                {
                    Timber.d("PublisherIconMediaLoader", "DISCOVER-MEDIA-BRAND-ICON: Resetting filled icon media state for %s because it is not in the cache %s", new Object[] {
                        channelpage
                    });
                    flag = flag1 | a.c.b(channelpage, MediaState.NOT_STARTED);
                }
            }
            s = Integer.toString(channelpage.b().hashCode());
            flag1 = flag;
            if (channelpage.l() == MediaState.SUCCESS)
            {
                flag1 = flag;
                if (!a.a.g(s))
                {
                    Timber.d("PublisherIconMediaLoader", "DISCOVER-MEDIA-BRAND-ICON: Resetting inverted icon media state for %s because it is not in the cache %s", new Object[] {
                        channelpage
                    });
                    flag1 = flag | a.c.c(channelpage, MediaState.NOT_STARTED);
                }
            }
            if (channelpage.m() == MediaState.SUCCESS && !TextUtils.isEmpty(channelpage.c()) && !a.a.g(Integer.toString(channelpage.c().hashCode())))
            {
                Timber.d("PublisherIconMediaLoader", "BRAND-ICON: Resetting loading icon media state for %s because it is not in the cache %s", new Object[] {
                    channelpage
                });
                flag = flag1 | a.c.d(channelpage, MediaState.NOT_STARTED);
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
