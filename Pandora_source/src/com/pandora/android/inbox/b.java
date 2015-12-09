// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.net.Uri;
import com.tjeannin.provigen.ProviGenBaseContract;
import java.util.Locale;

public interface com.pandora.android.inbox.b
    extends ProviGenBaseContract
{
    public static interface a
        extends ProviGenBaseContract
    {

        public static final Uri a = Uri.parse("content://com.pandora.android.provider/inbox_seen_messages");

    }

    public static class b
    {

        public static void a(ContentProvider contentprovider, ContentValues contentvalues)
        {
            if (contentvalues.containsKey("isSeen") && contentvalues.getAsInteger("isSeen").intValue() == p.cx.x.d.c.a())
            {
                ContentValues contentvalues1 = new ContentValues();
                contentvalues1.put("_id", contentvalues.getAsLong("_id"));
                contentvalues1.put("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE", contentvalues.getAsBoolean("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE"));
                contentprovider.insert(a.a, contentvalues1);
            }
            contentvalues.remove("isSeen");
        }

        public static String[] a(String as[])
        {
            int i1 = 0;
            if (as != null) goto _L2; else goto _L1
_L1:
            String as1[];
            as1 = new String[2];
            as1[0] = "*";
            as1[1] = com.pandora.android.inbox.b.p;
_L4:
            return as1;
_L2:
            do
            {
                as1 = as;
                if (i1 >= as.length)
                {
                    continue;
                }
                if ("isSeen".equals(as[i1]))
                {
                    as[i1] = com.pandora.android.inbox.b.p;
                }
                i1++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }
    }


    public static final Uri a = Uri.parse("content://com.pandora.android.provider/inbox_messages");
    public static final String b = "createTimestamp";
    public static final String c = "expireTimestamp";
    public static final String d = "sortKey";
    public static final String e = "title";
    public static final String f = "text";
    public static final String g = "action";
    public static final String h = "icon";
    public static final String i = "image";
    public static final String j = "caption";
    public static final String k = "dismissOnClick";
    public static final String l = "neverSetSeen";
    public static final String m = "omitDate";
    public static final String n = "bgColor";
    public static final String o = "showPlay";
    public static final String p = String.format(Locale.US, "(SELECT %1$d FROM %2$s WHERE %2$s.%3$s == %4$s.%5$s) AS %6$s", new Object[] {
        Integer.valueOf(p.cx.x.d.c.a()), "inbox_seen_messages", "_id", "inbox_messages", "_id", "isSeen"
    });
    public static final String q = String.format(Locale.US, "%s > strftime('%%s', 'now') * 1000", new Object[] {
        "expireTimestamp"
    });
    public static final String r = String.format(Locale.US, "%s IS NOT %d", new Object[] {
        "isSeen", Integer.valueOf(p.cx.x.d.c.a())
    });
    public static final String s = String.format(Locale.US, "%s == 1", new Object[] {
        "neverSetSeen"
    });
    public static final String t = String.format(Locale.US, "%s DESC, %s DESC", new Object[] {
        "sortKey", "createTimestamp"
    });

}
