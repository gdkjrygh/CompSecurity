// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            AsyncMediaViewAdapter, CallNotificationViewAdapter, MediaMessageViewAdapter, MessageViewAdapter, 
//            MojiMediaMessageViewAdapter, TextMessageViewAdapter, XmmMessageViewAdapter, a, 
//            b, g, k, l, 
//            m

public interface MessageViewAdapterComponent
{

    public abstract void inject(AsyncMediaViewAdapter asyncmediaviewadapter);

    public abstract void inject(CallNotificationViewAdapter callnotificationviewadapter);

    public abstract void inject(MediaMessageViewAdapter mediamessageviewadapter);

    public abstract void inject(MessageViewAdapter messageviewadapter);

    public abstract void inject(MojiMediaMessageViewAdapter mojimediamessageviewadapter);

    public abstract void inject(TextMessageViewAdapter textmessageviewadapter);

    public abstract void inject(XmmMessageViewAdapter xmmmessageviewadapter);

    public abstract void inject(a a);

    public abstract void inject(b b);

    public abstract void inject(g g);

    public abstract void inject(k k);

    public abstract void inject(l l);

    public abstract void inject(m m);
}
