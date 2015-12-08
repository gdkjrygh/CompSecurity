// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAgent

private final class cess._cls000 extends CheckedBroadcastReceiver
{

    final ContactAgent this$0;

    public final void onReceiveFiltered(Context context, Intent intent, int i)
    {
        if (!intent.hasExtra("com.skype.objId")) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            intent = (Contact)map.a(intent.getIntExtra("com.skype.objId", 0), com/skype/Contact);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            sendHandledObjectNotFoundTelemetry("onReceiveFiltered");
            return;
        }
        notificationManager.cancel(intent.getObjectID());
        obj = new ConversationImpl();
        lib.getConversationByIdentity(intent.getIdentity(), ((Conversation) (obj)), false);
        ((Conversation) (obj)).setConsumedHorizon((int)TimeUtil.a(), true);
        i;
        JVM INSTR tableswitch 0 2: default 120
    //                   0 132
    //                   1 181
    //                   2 197;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        obj = contactUtil;
        ContactUtil.o(intent);
        obj = new Intent();
        ((Intent) (obj)).setAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        context.sendBroadcast(((Intent) (obj)));
        context.startActivity(getContentIntent(intent));
        return;
_L4:
        intent.ignoreAuthRequest();
        ((Conversation) (obj)).removeFromInbox();
        return;
_L5:
        ((Conversation) (obj)).removeFromInbox();
        return;
    }

    ndException()
    {
        this$0 = ContactAgent.this;
        super(ContactAgent.access$000());
    }
}
