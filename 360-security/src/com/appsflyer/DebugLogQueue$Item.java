// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import java.util.Date;

// Referenced classes of package com.appsflyer:
//            DebugLogQueue

public static class timestamp
{

    private String msg;
    private long timestamp;

    public String getMsg()
    {
        return msg;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public (String s)
    {
        msg = s;
        timestamp = (new Date()).getTime();
    }
}
