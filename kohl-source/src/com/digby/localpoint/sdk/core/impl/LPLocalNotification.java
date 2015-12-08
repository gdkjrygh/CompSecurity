// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocalNotification;
import com.digby.mm.android.library.messages.impl.Message;
import java.util.Date;
import java.util.Map;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPMessage

public class LPLocalNotification extends LPMessage
    implements ILPLocalNotification
{

    private String campaignMessage;
    private String campaignTitle;
    private String campaignType;
    private String notificationMessage;
    private String notificationTitle;

    public LPLocalNotification(Message message, String s)
    {
        super(message);
        campaignType = s;
    }

    public String getBody()
    {
        if (msg == null)
        {
            return campaignMessage;
        } else
        {
            return msg.getMessageWithoutImpression();
        }
    }

    public String getCampaignType()
    {
        return campaignType;
    }

    public Date getExpirationDate()
    {
        if (msg == null)
        {
            return null;
        } else
        {
            return super.getExpirationDate();
        }
    }

    public ILPID getID()
    {
        if (msg == null)
        {
            return null;
        } else
        {
            return super.getID();
        }
    }

    public Map getMetadata()
    {
        if (msg == null)
        {
            return null;
        } else
        {
            return super.getMetadata();
        }
    }

    public String getMetadataValue(String s)
    {
        if (msg == null)
        {
            return null;
        } else
        {
            return super.getMetadataValue(s);
        }
    }

    public String getNotificationMessage()
    {
        return notificationMessage;
    }

    public String getNotificationTitle()
    {
        return notificationTitle;
    }

    public String getTitle()
    {
        if (msg == null)
        {
            return campaignTitle;
        } else
        {
            return super.getTitle();
        }
    }

    public boolean isRead()
    {
        if (msg == null)
        {
            return false;
        } else
        {
            return super.isRead();
        }
    }

    public void setCampaignBody(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException("campaignBody can't be empty");
        }
        if (msg == null)
        {
            campaignMessage = s;
            return;
        } else
        {
            msg.setMessage(s);
            return;
        }
    }

    public void setCampaignTitle(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException("campaignTitle can't be empty");
        }
        if (msg == null)
        {
            campaignTitle = s;
            return;
        } else
        {
            msg.setTitle(s);
            return;
        }
    }

    public void setNotificationMessage(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException("message can't be empty");
        } else
        {
            notificationMessage = s;
            return;
        }
    }

    public void setNotificationTitle(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            throw new IllegalArgumentException("title can't be empty");
        } else
        {
            notificationTitle = s;
            return;
        }
    }
}
