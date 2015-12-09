// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService

private final class <init> extends Handler
{

    final MediaRouteProviderService a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            MediaRouteProviderService.b(a, (Messenger)message.obj);
            break;
        }
    }

    private (MediaRouteProviderService mediarouteproviderservice)
    {
        a = mediarouteproviderservice;
        super();
    }

    a(MediaRouteProviderService mediarouteproviderservice, a a1)
    {
        this(mediarouteproviderservice);
    }
}
