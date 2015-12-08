// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import java.util.Date;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, n

public abstract class LogEntry extends Entity
    implements n, Cloneable
{

    private Date logDate;

    public LogEntry()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Date getLogDate()
    {
        return logDate;
    }

    public void setLogDate(Date date)
    {
        logDate = date;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" logDate: ").append(getLogDate());
        return stringbuilder.toString();
    }
}
