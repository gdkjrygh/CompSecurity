// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Contact;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.chat:
//            MessageHolder, SyntheticTypes

public class SynthAuthReqMessageHolder
    implements MessageHolder
{

    private static final String KEY_PREFIX = "auth_";
    private Contact contact;
    private ContactUtil contactUtil;

    public SynthAuthReqMessageHolder(Contact contact1, ContactUtil contactutil)
    {
        contact = contact1;
        contactUtil = contactutil;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof MessageHolder)
        {
            obj = (MessageHolder)obj;
            return getConversationIdentity().equals(((MessageHolder) (obj)).getConversationIdentity());
        } else
        {
            return false;
        }
    }

    public String getAuthorDisplayName()
    {
        return getConversationDisplayName();
    }

    public String getAuthorIdentity()
    {
        return contact.getIdentity();
    }

    public String getConversationDisplayName()
    {
        return contactUtil.l(contact);
    }

    public String getConversationIdentity()
    {
        return contact.getIdentity();
    }

    public long getEditTimestamp()
    {
        return 0L;
    }

    public CharSequence getFormattableContent()
    {
        return contact.getReceivedAuthrequestProp();
    }

    public String getMessageId()
    {
        return (new StringBuilder("auth_")).append(contact.getObjectID()).toString();
    }

    public Object getMessageObject()
    {
        return contact;
    }

    public String getTextContent()
    {
        return contact.getReceivedAuthrequestProp();
    }

    public long getTimestamp()
    {
        return (long)contact.getAuthreqTimestampProp();
    }

    public int getTypeOrdinal()
    {
        return SyntheticTypes.CONTACT_REQUEST.getType();
    }

    public int hashCode()
    {
        return getConversationIdentity().hashCode();
    }

    public boolean isConference()
    {
        return false;
    }

    public boolean isConsumed()
    {
        return false;
    }

    public boolean isDeleted()
    {
        return false;
    }
}
