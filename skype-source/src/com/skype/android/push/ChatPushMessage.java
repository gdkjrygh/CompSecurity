// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import android.text.TextUtils;
import com.skype.android.util.Charsets;
import com.skype.msnp.MsnpHeader;
import com.skype.msnp.MsnpIdentity;
import com.skype.msnp.MsnpIdentityType;
import com.skype.msnp.MsnpLayer;
import com.skype.msnp.MsnpMessage;
import java.nio.charset.Charset;
import java.util.Date;

// Referenced classes of package com.skype.android.push:
//            SkyLibPushMessage, PushConstants, PushEventType, PushServiceType

public class ChatPushMessage extends SkyLibPushMessage
    implements PushConstants
{

    private static final String CONVERSATION_ID_PREFIX = "Skype:";
    private static final String EXTRA_DISPLAY_NAME = "displayName";
    private static final String EXTRA_MESSAGE_BODY = "messageBody";
    private static final String EXTRA_RECIPIENT_ID = "recipientId";
    private static final String EXTRA_SENDER_ID = "senderId";
    private static final char SKYPE_EPID_SEPARATOR = 59;
    private static final String SKYPE_IDENTITY_PREFIX = "8:";
    private String authorDisplayName;
    private boolean consumed;
    private String conversationId;
    private boolean displayedToUser;
    private PushEventType eventType;
    private byte genericNotificationPayload[];
    private String identity;
    private boolean isActive;
    private String messageBody;
    private MsnpMessage msnpMessage;
    private byte nodeSpecificNotificationPayload[];
    private long receivedTimestamp;
    private String recipientId;
    private String senderId;

    public ChatPushMessage(Intent intent, PushServiceType pushservicetype, PushEventType pusheventtype)
    {
        super(pushservicetype, pusheventtype, intent);
        eventType = pusheventtype;
        conversationId = intent.getStringExtra("conversationId");
        nodeSpecificNotificationPayload = "".getBytes(Charsets.a);
        pushservicetype = intent.getStringExtra("rawPayload");
        authorDisplayName = intent.getStringExtra("displayName");
        if (pushservicetype == null)
        {
            messageBody = intent.getStringExtra("messageBody");
        } else
        {
            senderId = intent.getStringExtra("senderId");
            recipientId = intent.getStringExtra("recipientId");
            if (!TextUtils.isEmpty(pushservicetype))
            {
                genericNotificationPayload = pushservicetype.getBytes(Charset.forName("UTF-8"));
                msnpMessage = MsnpMessage.a(pushservicetype);
            }
            boolean flag;
            if (msnpMessage != null)
            {
                intent = getBodyFromMsnpMessage(msnpMessage);
            } else
            {
                intent = "";
            }
            messageBody = intent;
            if (TextUtils.isEmpty(conversationId))
            {
                conversationId = getConversationIdentity();
            }
            if (msnpMessage == null || msnpMessage.f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isActive = flag;
        }
        identity = extractIdentity();
        setConsumed(false);
        setDisplayedToUser(false);
        setReceivedTimestamp(System.currentTimeMillis());
    }

    private String extractIdentity()
    {
        if (msnpMessage != null) goto _L2; else goto _L1
_L1:
        if (eventType != PushEventType.MEDIA_MESSAGE_SHARING) goto _L4; else goto _L3
_L3:
        if (!conversationId.startsWith("Skype:")) goto _L6; else goto _L5
_L5:
        String s = conversationId.replace("Skype:", "");
_L8:
        return s;
_L6:
        return conversationId;
_L4:
        return null;
_L2:
        if (msnpMessage.b().a() == MsnpIdentityType.f)
        {
            return msnpMessage.a(MsnpLayer.a, MsnpHeader.c);
        }
        String s2 = msnpMessage.a(MsnpLayer.a, MsnpHeader.d);
        s = s2;
        if (s2 != null)
        {
            String s1 = s2;
            if (s2.startsWith("8:"))
            {
                s1 = s2.substring(2);
            }
            int i = s1.indexOf(';');
            s = s1;
            if (i != -1)
            {
                return s1.substring(0, i);
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String getBodyFromMsnpMessage(MsnpMessage msnpmessage)
    {
        return msnpmessage.a();
    }

    protected int determinePayloadSize(Intent intent)
    {
        intent = intent.getStringExtra("rawPayload");
        if (intent == null)
        {
            return 0;
        } else
        {
            return intent.getBytes(Charsets.a).length;
        }
    }

    public String getAuthorDisplayName()
    {
        return authorDisplayName;
    }

    public String getChatReceiverId()
    {
        String s = msnpMessage.a(MsnpLayer.a, MsnpHeader.c);
        if (s != null)
        {
            return s.substring(s.indexOf(":") + 1, s.length());
        } else
        {
            return null;
        }
    }

    public String getConversationIdentity()
    {
        return identity;
    }

    public int getEventTypeIdForLib()
    {
        return 0;
    }

    public byte[] getGenericNotificationPayload()
    {
        return genericNotificationPayload;
    }

    public String getMessageBody()
    {
        return messageBody;
    }

    public MsnpMessage getMsnpMessage()
    {
        return msnpMessage;
    }

    public byte[] getNodeSpecificNotificationPayload()
    {
        return nodeSpecificNotificationPayload;
    }

    public long getReceivedTimestamp()
    {
        return receivedTimestamp / 1000L;
    }

    public String getRecipientId()
    {
        return recipientId;
    }

    public String getSenderId()
    {
        return senderId;
    }

    public long getSentTimestamp()
    {
        return msnpMessage.c().getTime() / 1000L;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public boolean isConsumed()
    {
        return consumed;
    }

    public boolean isDisplayedToUser()
    {
        return displayedToUser;
    }

    public void setConsumed(boolean flag)
    {
        consumed = flag;
    }

    public void setDisplayedToUser(boolean flag)
    {
        displayedToUser = flag;
    }

    public void setReceivedTimestamp(long l)
    {
        receivedTimestamp = l;
    }
}
