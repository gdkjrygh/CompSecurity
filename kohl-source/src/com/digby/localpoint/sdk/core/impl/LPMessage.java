// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.mm.android.library.messages.impl.Message;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LPMessage
    implements ILPMessage
{
    private class LPMessageID
        implements ILPID
    {

        private final long messageId;
        final LPMessage this$0;

        public String getValue()
        {
            return String.format(Locale.US, "%d", new Object[] {
                Long.valueOf(messageId)
            });
        }

        public LPMessageID(long l)
        {
            this$0 = LPMessage.this;
            super();
            messageId = l;
        }
    }


    private String asString;
    private Integer hashCode;
    protected Message msg;

    public LPMessage(Message message)
    {
        msg = message;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof LPMessage))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            obj = (LPMessage)obj;
            return (new EqualsBuilder()).append(getID().getValue(), ((LPMessage) (obj)).getID().getValue()).append(getTitle(), ((LPMessage) (obj)).getTitle()).append(getBody(), ((LPMessage) (obj)).getBody()).append(getExpirationDate(), ((LPMessage) (obj)).getExpirationDate()).isEquals();
        }
    }

    public String getBody()
    {
        return msg.getMessage();
    }

    public Date getExpirationDate()
    {
        return msg.getExpirationDate();
    }

    public ILPID getID()
    {
        return new LPMessageID(msg.getCampaignID());
    }

    public Map getMetadata()
    {
        return msg.getMetadata();
    }

    public String getMetadataValue(String s)
    {
        return (String)getMetadata().get(s);
    }

    public String getTitle()
    {
        return msg.getTitle();
    }

    public int hashCode()
    {
        if (hashCode == null)
        {
            hashCode = Integer.valueOf((new HashCodeBuilder()).append(getID().getValue()).append(getTitle()).append(getBody()).append(getExpirationDate()).toHashCode());
        }
        return hashCode.intValue();
    }

    public boolean isRead()
    {
        return msg.isRead();
    }

    public String toString()
    {
        if (asString == null)
        {
            asString = (new ToStringBuilder(this)).append(getID().getValue()).append(getTitle()).append(getBody()).append(getExpirationDate()).toString();
        }
        return asString;
    }
}
