// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.networkmanager.DownloadPriority;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class lang.Object
    implements lang.Object
{

    private uU a;

    public final void a(List list)
    {
        uU uu = a;
        Object obj = list.iterator();
        ChannelPage channelpage;
        boolean flag;
        boolean flag1;
        boolean flag2;
        for (flag = false; ((Iterator) (obj)).hasNext(); flag = uu.a(channelpage, com.snapchat.android.discover.model.elPage.MediaType.LOADING_ICON, DownloadPriority.MEDIUM) | (flag | flag1 | flag2))
        {
            channelpage = (ChannelPage)((Iterator) (obj)).next();
            flag1 = uu.a(channelpage, com.snapchat.android.discover.model.elPage.MediaType.FILLED_ICON, DownloadPriority.HIGH);
            flag2 = uu.a(channelpage, com.snapchat.android.discover.model.elPage.MediaType.INVERTED_ICON, DownloadPriority.HIGH);
        }

        if (flag)
        {
            uu.b.b();
        }
        obj = new HashSet();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ChannelPage channelpage1 = (ChannelPage)list.next();
            ((Set) (obj)).add(Integer.toString(channelpage1.a().hashCode()));
            ((Set) (obj)).add(Integer.toString(channelpage1.b().hashCode()));
            if (!TextUtils.isEmpty(channelpage1.c()))
            {
                ((Set) (obj)).add(Integer.toString(channelpage1.c().hashCode()));
            }
        } while (true);
        uu.a.a(((Set) (obj)));
    }

    >(uU uu)
    {
        a = uu;
        super();
    }
}
