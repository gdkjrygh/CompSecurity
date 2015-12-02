// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.share;

import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.threads.Message;
import com.google.common.a.es;
import java.util.Iterator;

public class a
{

    public a()
    {
    }

    public Share a(Message message)
    {
        if (!message.q().isEmpty())
        {
            return (Share)message.q().get(0);
        }
        if (!message.D().isEmpty())
        {
            return (Share)message.D().get(0);
        } else
        {
            return null;
        }
    }

    public ShareMedia a(Share share)
    {
        for (share = share.d().iterator(); share.hasNext();)
        {
            ShareMedia sharemedia;
            for (sharemedia = (ShareMedia)share.next(); "link".equals(sharemedia.c()) || "photo".equals(sharemedia.c());)
            {
                return sharemedia;
            }

            if ("video".equals(sharemedia.c()))
            {
                return sharemedia;
            }
        }

        return null;
    }
}
