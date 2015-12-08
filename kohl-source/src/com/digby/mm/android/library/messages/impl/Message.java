// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.messages.impl;

import android.content.Context;
import android.database.Cursor;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.MessageDBHelper;
import com.digby.mm.android.library.events.impl.MessageImpressionEvent;
import com.digby.mm.android.library.messages.IMessage;
import com.digby.mm.android.library.utils.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Message
    implements IMessage
{

    private long mCampaignID;
    private Context mContext;
    private Date mExpirationDate;
    private long mID;
    private boolean mIsRead;
    private String mMessage;
    private Map mMetadata;
    private String mTitle;

    public Message(Cursor cursor, Context context)
    {
        boolean flag;
        flag = true;
        super();
        mID = cursor.getLong(0);
        mCampaignID = cursor.getLong(1);
        mTitle = cursor.getString(2);
        mMessage = cursor.getString(3);
        mExpirationDate = (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.US)).parse(cursor.getString(4));
        if (cursor.getInt(5) != 1)
        {
            flag = false;
        }
        mIsRead = flag;
        mContext = context;
        return;
        cursor;
        Logger.Error("Message", cursor);
        return;
    }

    public long getCampaignID()
    {
        return mCampaignID;
    }

    public Date getExpirationDate()
    {
        return mExpirationDate;
    }

    public long getID()
    {
        return mID;
    }

    public String getMessage()
    {
        try
        {
            DigbyController.getInstance(mContext).sendEvent(new MessageImpressionEvent(mContext, this), null);
            (new MessageDBHelper(new DigbyDBHelper(mContext))).markMessageRead(getID());
            mIsRead = true;
        }
        catch (Exception exception)
        {
            Logger.Error("getMessage", exception);
        }
        return mMessage;
    }

    public String getMessageWithoutImpression()
    {
        return mMessage;
    }

    public Map getMetadata()
    {
        if (mMetadata == null)
        {
            mMetadata = new HashMap();
        }
        return mMetadata;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean isExpired()
    {
        boolean flag = false;
        int i = (new Date()).compareTo(mExpirationDate);
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        Logger.Debug((new StringBuilder()).append("IsExpired: ").append(flag).toString(), mContext);
        return flag;
        Exception exception;
        exception;
        Logger.Error("IsExpired", exception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean isRead()
    {
        return mIsRead;
    }

    public void setMessage(String s)
    {
        mMessage = s;
    }

    public void setMetadata(Map map)
    {
        mMetadata = map;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }
}
