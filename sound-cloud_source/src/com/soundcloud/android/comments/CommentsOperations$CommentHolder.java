// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.java.objects.MoreObjects;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentsOperations

public static class comment
{

    final Map comment = new HashMap(2);

    public boolean equals(Object obj)
    {
        while (this == obj || (obj instanceof comment) && MoreObjects.equal(comment, ((comment)obj).comment)) 
        {
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        return comment.hashCode();
    }

    public (String s, long l)
    {
        comment.put("body", s);
        comment.put("timestamp", String.valueOf(l));
    }
}
