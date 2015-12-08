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

    final MediaRouteProviderService this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            MediaRouteProviderService.access$500(MediaRouteProviderService.this, (Messenger)message.obj);
            break;
        }
    }

    private ()
    {
        this$0 = MediaRouteProviderService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
