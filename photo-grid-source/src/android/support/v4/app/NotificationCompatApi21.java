// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import android.os.Parcelable;

class NotificationCompatApi21
{

    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    private static final String KEY_AUTHOR = "author";
    private static final String KEY_MESSAGES = "messages";
    private static final String KEY_ON_READ = "on_read";
    private static final String KEY_ON_REPLY = "on_reply";
    private static final String KEY_PARTICIPANTS = "participants";
    private static final String KEY_REMOTE_INPUT = "remote_input";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TIMESTAMP = "timestamp";

    NotificationCompatApi21()
    {
    }

    private static RemoteInput fromCompatRemoteInput(RemoteInputCompatBase.RemoteInput remoteinput)
    {
        return (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
    }

    static Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
    {
        Parcelable aparcelable[] = null;
        int i = 0;
        if (unreadconversation == null)
        {
            return null;
        }
        Bundle bundle = new Bundle();
        Object obj = aparcelable;
        if (unreadconversation.getParticipants() != null)
        {
            obj = aparcelable;
            if (unreadconversation.getParticipants().length > 1)
            {
                obj = unreadconversation.getParticipants()[0];
            }
        }
        for (aparcelable = new Parcelable[unreadconversation.getMessages().length]; i < aparcelable.length; i++)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("text", unreadconversation.getMessages()[i]);
            bundle1.putString("author", ((String) (obj)));
            aparcelable[i] = bundle1;
        }

        bundle.putParcelableArray("messages", aparcelable);
        obj = unreadconversation.getRemoteInput();
        if (obj != null)
        {
            bundle.putParcelable("remote_input", fromCompatRemoteInput(((RemoteInputCompatBase.RemoteInput) (obj))));
        }
        bundle.putParcelable("on_reply", unreadconversation.getReplyPendingIntent());
        bundle.putParcelable("on_read", unreadconversation.getReadPendingIntent());
        bundle.putStringArray("participants", unreadconversation.getParticipants());
        bundle.putLong("timestamp", unreadconversation.getLatestTimestamp());
        return bundle;
    }

    public static String getCategory(Notification notification)
    {
        return notification.category;
    }

    static NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
    {
        boolean flag1 = false;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String as[];
        Object obj;
        int i;
        obj = bundle.getParcelableArray("messages");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        as = new String[obj.length];
        i = 0;
_L10:
        if (i >= as.length) goto _L4; else goto _L3
_L3:
        if (obj[i] instanceof Bundle) goto _L6; else goto _L5
_L5:
        boolean flag = flag1;
_L9:
        if (!flag) goto _L1; else goto _L7
_L7:
        obj = (PendingIntent)bundle.getParcelable("on_read");
        PendingIntent pendingintent = (PendingIntent)bundle.getParcelable("on_reply");
        RemoteInput remoteinput = (RemoteInput)bundle.getParcelable("remote_input");
        String as1[] = bundle.getStringArray("participants");
        if (as1 != null && as1.length == 1)
        {
            if (remoteinput != null)
            {
                factory1 = toCompatRemoteInput(remoteinput, factory1);
            } else
            {
                factory1 = null;
            }
            return factory.build(as, factory1, pendingintent, ((PendingIntent) (obj)), as1, bundle.getLong("timestamp"));
        }
          goto _L1
_L6:
        as[i] = ((Bundle)obj[i]).getString("text");
        flag = flag1;
        if (as[i] == null) goto _L9; else goto _L8
_L8:
        i++;
          goto _L10
_L4:
        flag = true;
          goto _L9
        as = null;
          goto _L7
    }

    private static RemoteInputCompatBase.RemoteInput toCompatRemoteInput(RemoteInput remoteinput, RemoteInputCompatBase.RemoteInput.Factory factory)
    {
        return factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
    }
}
