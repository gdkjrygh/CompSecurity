// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ad;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.push:
//            PushMessageListener, ConciergePushMessage, DisplayResult, PushMessage

public class ConciergePushMessageListener
    implements PushMessageListener
{

    private static final int NOTIFICATION_ID = 64;
    private Context context;
    private ad manager;

    public ConciergePushMessageListener(Application application)
    {
        context = application.getApplicationContext();
        manager = ad.a(application);
    }

    private PendingIntent getPendingIntent()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("skype:?recents"));
        intent.setFlags(0x10000000);
        return PendingIntent.getActivity(context, 0, intent, 0x8000000);
    }

    private void handlePushMessage(ConciergePushMessage conciergepushmessage)
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.a(conciergepushmessage.getTitle());
        d.b(conciergepushmessage.getMessage());
        d.a(0x7f0201c1);
        d.a(getPendingIntent());
        d.c(true);
        manager.a();
        manager.a(d.e());
        conciergepushmessage.onMessageConsumed(DisplayResult.SUCCESS);
    }

    public EnumSet getSupportedEventTypes()
    {
        return PushMessageFactory.a.CONCIERGE.supportedTypes;
    }

    public void onPushMessage(PushMessage pushmessage)
    {
        handlePushMessage((ConciergePushMessage)pushmessage);
    }
}
