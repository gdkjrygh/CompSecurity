// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ga extends kl
{

    private final String eventName = "APP_SESSION_START";
    public Long sessionSeqNum;
    public Long sinceLastSessionSec;

    public ga()
    {
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event_name", "APP_SESSION_START");
        if (sessionSeqNum != null)
        {
            hashmap.put("session_seq_num", sessionSeqNum);
        }
        if (sinceLastSessionSec != null)
        {
            hashmap.put("since_last_session_sec", sinceLastSessionSec);
        }
        hashmap.putAll(super.a());
        return hashmap;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (ga)obj;
            if (sessionSeqNum == null ? ((ga) (obj)).sessionSeqNum != null : !sessionSeqNum.equals(((ga) (obj)).sessionSeqNum))
            {
                return false;
            }
            if (sinceLastSessionSec == null ? ((ga) (obj)).sinceLastSessionSec != null : !sinceLastSessionSec.equals(((ga) (obj)).sinceLastSessionSec))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (sessionSeqNum != null)
        {
            i = sessionSeqNum.hashCode();
        } else
        {
            i = 0;
        }
        if (sinceLastSessionSec != null)
        {
            j = sinceLastSessionSec.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }
}
