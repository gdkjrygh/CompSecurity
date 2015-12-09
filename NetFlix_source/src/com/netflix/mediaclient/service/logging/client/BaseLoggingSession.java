// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionKey;

// Referenced classes of package com.netflix.mediaclient.service.logging.client:
//            LoggingSession

public abstract class BaseLoggingSession
    implements LoggingSession
{

    protected DeviceUniqueId mId;
    protected SessionKey mKey;
    protected long mStarted;

    public BaseLoggingSession()
    {
        mStarted = System.currentTimeMillis();
        mId = new DeviceUniqueId();
        mKey = new SessionKey(mId, getCategory(), getName());
    }

    public abstract String getCategory();

    public DeviceUniqueId getId()
    {
        return mId;
    }

    public SessionKey getKey()
    {
        return mKey;
    }

    public long getStarted()
    {
        return mStarted;
    }

    public void setId(long l)
    {
        mId = new DeviceUniqueId(l);
        mKey = new SessionKey(mId, getCategory(), getName());
    }

    public void setStarted(long l)
    {
        mStarted = l;
    }
}
