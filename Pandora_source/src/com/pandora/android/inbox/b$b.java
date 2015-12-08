// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.ContentProvider;
import android.content.ContentValues;

// Referenced classes of package com.pandora.android.inbox:
//            b

public static class r
{

    public static void a(ContentProvider contentprovider, ContentValues contentvalues)
    {
        if (contentvalues.containsKey("isSeen") && contentvalues.getAsInteger("isSeen").intValue() == p.cx.c.a())
        {
            ContentValues contentvalues1 = new ContentValues();
            contentvalues1.put("_id", contentvalues.getAsLong("_id"));
            contentvalues1.put("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE", contentvalues.getAsBoolean("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE"));
            contentprovider.insert(a, contentvalues1);
        }
        contentvalues.remove("isSeen");
    }

    public static String[] a(String as[])
    {
        int i = 0;
        if (as != null) goto _L2; else goto _L1
_L1:
        String as1[];
        as1 = new String[2];
        as1[0] = "*";
        as1[1] = b.p;
_L4:
        return as1;
_L2:
        do
        {
            as1 = as;
            if (i >= as.length)
            {
                continue;
            }
            if ("isSeen".equals(as[i]))
            {
                as[i] = b.p;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
