// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;

public abstract class ExpirableModel
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private long updateTime;

    public ExpirableModel()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ExpirableModel)obj;
            if (updateTime != ((ExpirableModel) (obj)).updateTime)
            {
                return false;
            }
        }
        return true;
    }

    protected abstract int getExpirationTimeInMinutes();

    public final long getUpdateTime()
    {
        return updateTime;
    }

    public int hashCode()
    {
        return (int)(updateTime ^ updateTime >>> 32) + 31;
    }

    public final boolean isExpired(IClock iclock)
    {
        return DateUtils.isExpired(iclock, getUpdateTime(), getExpirationTimeInMinutes());
    }

    public final void setUpdateTime(long l)
    {
        updateTime = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ExpirableModel [updateTime=").append(updateTime).append("]").toString();
    }
}
