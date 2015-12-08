// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import java.util.HashMap;

// Referenced classes of package com.skype.android.app.chat:
//            TextMessageViewAdapter, GenericUrlViewBinder, GifUrlViewBinder, CombinedMessageViewBinder, 
//            SimpleMessageViewBinder

static final class init> extends HashMap
{

    ()
    {
        GenericUrlViewBinder genericurlviewbinder = new GenericUrlViewBinder();
        put(com.skype.android.app.media..UrlPreviewType.GENERIC, genericurlviewbinder);
        put(com.skype.android.app.media..UrlPreviewType.GIF, new GifUrlViewBinder());
        put(com.skype.android.app.media..UrlPreviewType.IMAGE, genericurlviewbinder);
        put(com.skype.android.app.media..UrlPreviewType.SHARING, genericurlviewbinder);
        put(com.skype.android.app.media..UrlPreviewType.TWEET, genericurlviewbinder);
        put(com.skype.android.app.media..UrlPreviewType.UNKNOWN, genericurlviewbinder);
        put(com.skype.android.app.media..UrlPreviewType.VIDEO, genericurlviewbinder);
        put(TextMessageViewAdapter.access$000(), new CombinedMessageViewBinder());
        put(TextMessageViewAdapter.access$100(), new SimpleMessageViewBinder());
    }
}
