// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.Agent;
import com.skype.android.app.AgentComponent;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.ObjectInterfaceNotFoundException;
import com.skype.android.sync.ContactOperationUtils;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.wakeup.ForegroundState;

public class ContactAgent extends Agent
{
    private final class a extends CheckedBroadcastReceiver
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
        //                       0 132
        //                       1 181
        //                       2 197;
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

        a()
        {
            this$0 = ContactAgent.this;
            super(ContactAgent.NOTIFICATION_ACTIONS);
        }
    }


    private static final int ACTION_ACCEPT_POSITION = 0;
    private static final String ACTION_ACCEPT_REQUEST = "accept";
    private static final String ACTION_DELETE_NOTIF = "delete";
    private static final int ACTION_DELETE_POSITION = 2;
    private static final int ACTION_REJECT_POSITION = 1;
    private static final String ACTION_REJECT_REQUEST = "reject";
    private static final String NOTIFICATION_ACTIONS[] = {
        "accept", "reject", "delete"
    };
    private Analytics analytics;
    ContactUtil contactUtil;
    ForegroundState foregroundState;
    ImageCache imageCache;
    SkyLib lib;
    ObjectIdMap map;
    private a notificationActionReceiver;
    NotificationManager notificationManager;
    TimeUtil timeUtil;

    public ContactAgent(Application application, Analytics analytics1)
    {
        super(application);
        analytics = analytics1;
        getComponent().inject(this);
    }

    private void buildNotification(final Contact contact)
    {
        final Context context = getContext();
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.b(true);
        d.c(true);
        d.a(Long.valueOf(contact.getAuthreqTimestampProp()).longValue() * 1000L);
        Object obj;
        int i;
        if (getUserPreferences().isNotificationLightEnabled())
        {
            i = 500;
        } else
        {
            i = 0;
        }
        d.b(i, i);
        i = contact.getObjectID();
        d.a(PendingIntent.getActivity(context, i, getContentIntent(contact), 0));
        obj = new Intent("accept");
        ((Intent) (obj)).putExtra("com.skype.objId", i);
        obj = PendingIntent.getBroadcast(context, i, ((Intent) (obj)), 0);
        d.a(0x7f020240, context.getString(0x7f08012d), ((PendingIntent) (obj)));
        obj = new Intent("reject");
        ((Intent) (obj)).putExtra("com.skype.objId", i);
        obj = PendingIntent.getBroadcast(context, i, ((Intent) (obj)), 0);
        d.a(0x7f02023f, context.getString(0x7f08012f), ((PendingIntent) (obj)));
        obj = new Intent("delete");
        ((Intent) (obj)).putExtra("com.skype.objId", i);
        d.b(PendingIntent.getBroadcast(context, i, ((Intent) (obj)), 0));
        d.a(0x7f0201b1);
        d.b(context.getResources().getColor(0x7f0f00d3));
        d.a(contact.getDisplaynameProp());
        obj = ViewUtil.a(contact.getDisplaynameProp(), context.getString(0x7f0803b4));
        ((SpannableStringBuilder) (obj)).setSpan(new StyleSpan(1), 0, contact.getDisplaynameProp().length(), 0);
        d.c(((CharSequence) (obj))).b(context.getString(0x7f0803b4));
        context = new AsyncCallback() {

            final ContactAgent this$0;
            final Contact val$contact;
            final Context val$context;

            public final void done(AsyncResult asyncresult)
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                android.support.v4.app.x.d d1 = (android.support.v4.app.x.d)asyncresult.b();
                if (bitmap == null)
                {
                    asyncresult = imageCache.a();
                } else
                {
                    asyncresult = Bitmap.createScaledBitmap(bitmap, context.getResources().getDimensionPixelSize(0x1050005), context.getResources().getDimensionPixelSize(0x1050006), true);
                }
                d1.g = asyncresult;
                notificationManager.notify(contact.getObjectID(), d1.e());
            }

            
            {
                this$0 = ContactAgent.this;
                context = context1;
                contact = contact1;
                super();
            }
        };
        imageCache.a(contact, d, context);
    }

    private void onConversationEvent(Conversation conversation)
    {
        if (conversation.getInboxTimestampProp() > 0 && !ConversationUtil.e(conversation) && conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            ContactImpl contactimpl = new ContactImpl();
            if (lib.getContact(conversation.getIdentityProp(), contactimpl) && contactimpl.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION) && !foregroundState.c())
            {
                buildNotification(contactimpl);
            }
        }
    }

    Intent getContentIntent(Contact contact)
    {
        Intent intent = new Intent(getContext(), com/skype/android/app/main/SplashActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("com.skype.identitiy", contact.getIdentity());
        intent.addFlags(0x10000000);
        return intent;
    }

    public void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        ContactImpl contactimpl = new ContactImpl();
        lib.getContact(onchange.getContactObjectID(), contactimpl);
        if (!contactimpl.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION))
        {
            notificationManager.cancel(onchange.getContactObjectID());
        }
    }

    public void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        Object obj;
        if (onpropertychange.getPropKey() != PROPKEY.CONTACT_GIVEN_AUTHLEVEL)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = (Contact)onpropertychange.getSender();
        if (((Contact) (obj)).getGivenAuthlevelProp() == com.skype.Contact.AUTHLEVEL.AUTHORIZED_BY_ME)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        onpropertychange = getContext();
        obj = (new ContactOperationUtils(onpropertychange, timeUtil)).deleteContact(((Contact) (obj)));
        onpropertychange.getContentResolver().applyBatch("com.android.contacts", ((java.util.ArrayList) (obj)));
        return;
        onpropertychange;
        onpropertychange.printStackTrace();
        return;
        onpropertychange;
        onpropertychange.printStackTrace();
        return;
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnMessage onmessage)
    {
        onConversationEvent(onmessage.getSender());
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnConversationListChange onconversationlistchange)
    {
        if (onconversationlistchange.getType() != com.skype.Conversation.LIST_TYPE.INBOX_CONVERSATIONS)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        onConversationEvent((Conversation)map.a(onconversationlistchange.getConversationObjectID(), com/skype/Conversation));
        return;
        onconversationlistchange;
        sendHandledObjectNotFoundTelemetry("onEventForOnConversationListChange");
        return;
    }

    public void onLogin()
    {
        super.onLogin();
        if (notificationActionReceiver == null)
        {
            notificationActionReceiver = new a();
            notificationActionReceiver.register(getContext());
        }
    }

    public void onLogout()
    {
        super.onLogout();
        try
        {
            getContext().unregisterReceiver(notificationActionReceiver);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    protected void sendHandledObjectNotFoundTelemetry(String s)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        s = (new StringBuilder()).append(getClass().getSimpleName()).append("-").append(s).toString();
        analyticsparametercontainer.a(AnalyticsParameter.T, s);
        analytics.a(AnalyticsEvent.df, analyticsparametercontainer);
    }


}
