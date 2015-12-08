// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProvider

private final class <init> extends Handler
{

    final MediaRouteProvider this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            MediaRouteProvider.access$100(MediaRouteProvider.this);
            return;

        case 2: // '\002'
            MediaRouteProvider.access$200(MediaRouteProvider.this);
            break;
        }
    }

    private A()
    {
        this$0 = MediaRouteProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
