// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import com.facebook.common.w.m;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.server:
//            x

public class w
{

    public w()
    {
    }

    private String a(EnumSet enumset, int i, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("SELECT uid, ").append(s).append(" FROM user WHERE ").toString());
        if (enumset.contains(x.ALL))
        {
            stringbuilder.append("uid in (SELECT uid2 FROM friend WHERE uid1=me())");
        } else
        {
            enumset = enumset.iterator();
            int j = 0;
            while (enumset.hasNext()) 
            {
                s = (x)enumset.next();
                if (j > 0)
                {
                    stringbuilder.append(" or ");
                }
                if (s.equals(x.TOP_FRIENDS))
                {
                    stringbuilder.append(m.a("uid in (SELECT uid2 FROM  friend WHERE uid1=me() order by communication_rank desc LIMIT %d)", new Object[] {
                        Integer.valueOf(i)
                    }));
                } else
                if (s.equals(x.FAVORITE_FRIENDS))
                {
                    stringbuilder.append("uid in (SELECT favorite_id FROM messaging_favorite WHERE uid=me())");
                }
                j++;
            }
        }
        return stringbuilder.toString();
    }

    public String a(EnumSet enumset, int i)
    {
        return a(enumset, i, "last_active");
    }

    public String b(EnumSet enumset, int i)
    {
        return a(enumset, i, "chat_context");
    }
}
