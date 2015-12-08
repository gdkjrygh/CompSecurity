// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.urbanairship.Logger;
import com.urbanairship.util.UAStringUtil;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushMessageJavaScriptInterface, RichPushManager, RichPushUser, RichPushInbox, 
//            RichPushMessage

public class RichPushMessageJavaScript
    implements RichPushMessageJavaScriptInterface
{

    private static SimpleDateFormat dateFormatter;
    static final String deviceModel;
    String messageId;
    View view;

    public RichPushMessageJavaScript(View view1, String s)
    {
        messageId = s;
        view = view1;
    }

    private RichPushMessage getMessage()
    {
        return RichPushManager.shared().getRichPushUser().getInbox().getMessage(messageId);
    }

    public String getDeviceModel()
    {
        return deviceModel;
    }

    public String getDeviceOrientation()
    {
        switch (view.getResources().getConfiguration().orientation)
        {
        default:
            return "undefined";

        case 2: // '\002'
            return "landscape";

        case 1: // '\001'
            return "portrait";
        }
    }

    public String getMessageId()
    {
        return messageId;
    }

    public String getMessageSentDate()
    {
        if (dateFormatter == null)
        {
            dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
            dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return dateFormatter.format(getMessage().getSentDate());
    }

    public long getMessageSentDateMS()
    {
        return getMessage().getSentDateMS();
    }

    public String getMessageTitle()
    {
        return getMessage().getTitle();
    }

    public String getUserId()
    {
        return RichPushManager.shared().getRichPushUser().getId();
    }

    public int getViewHeight()
    {
        return view.getHeight();
    }

    public int getViewWidth()
    {
        return view.getWidth();
    }

    public boolean isMessageRead()
    {
        return getMessage().isRead();
    }

    public void markMessageRead()
    {
        getMessage().markRead();
    }

    public void markMessageUnread()
    {
        getMessage().markUnread();
    }

    public void navigateTo(String s)
    {
        if (!UAStringUtil.isEmpty(s))
        {
            Intent intent;
            try
            {
                intent = new Intent(view.getContext(), Class.forName(s));
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                Logger.error((new StringBuilder()).append("No class found for name ").append(s).toString());
                return;
            }
            intent.addFlags(0x4000000);
            view.getContext().startActivity(intent);
        }
    }

    static 
    {
        deviceModel = Build.MODEL;
    }
}
