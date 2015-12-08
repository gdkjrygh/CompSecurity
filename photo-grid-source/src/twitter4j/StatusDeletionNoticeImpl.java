// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import twitter4j.internal.json.z_T4JInternalParseUtil;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j:
//            StatusDeletionNotice

class StatusDeletionNoticeImpl
    implements Serializable, StatusDeletionNotice
{

    private static final long serialVersionUID = 0x17ea8725e4ab20deL;
    private long statusId;
    private long userId;

    StatusDeletionNoticeImpl(JSONObject jsonobject)
    {
        statusId = z_T4JInternalParseUtil.getLong("id", jsonobject);
        userId = z_T4JInternalParseUtil.getLong("user_id", jsonobject);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((StatusDeletionNotice)obj);
    }

    public int compareTo(StatusDeletionNotice statusdeletionnotice)
    {
        long l = statusId - statusdeletionnotice.getStatusId();
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (StatusDeletionNoticeImpl)obj;
            if (statusId != ((StatusDeletionNoticeImpl) (obj)).statusId)
            {
                return false;
            }
            if (userId != ((StatusDeletionNoticeImpl) (obj)).userId)
            {
                return false;
            }
        }
        return true;
    }

    public long getStatusId()
    {
        return statusId;
    }

    public long getUserId()
    {
        return userId;
    }

    public int hashCode()
    {
        return (int)(statusId ^ statusId >>> 32) * 31 + (int)(userId ^ userId >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder("StatusDeletionNoticeImpl{statusId=")).append(statusId).append(", userId=").append(userId).append('}').toString();
    }
}
