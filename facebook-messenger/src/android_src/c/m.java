// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android_src.a.a.a;
import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android_src.c:
//            n, j, d

public final class m
    implements n
{

    public static final Uri a;
    public static final Uri b;
    private static final String c[] = {
        "_id"
    };
    private static final Uri d = Uri.parse("content://mms-sms/threadID");

    private m()
    {
    }

    public static long a(Context context, Set set)
    {
        android.net.Uri.Builder builder = d.buildUpon();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); builder.appendQueryParameter("recipient", set))
        {
            String s = (String)iterator.next();
            set = s;
            if (android_src.c.d.b(s))
            {
                set = android_src.c.d.a(s);
            }
        }

        set = builder.build();
        context = android_src.a.a.a.a(context, context.getContentResolver(), set, c, null, null, null);
        com.facebook.debug.log.b.a("Telephony", (new StringBuilder()).append("getOrCreateThreadId cursor cnt: ").append(context.getCount()).toString());
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        long l;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        l = context.getLong(0);
        context.close();
        return l;
        com.facebook.debug.log.b.e("Telephony", "getOrCreateThreadId returned no rows!");
        context.close();
        com.facebook.debug.log.b.e("Telephony", (new StringBuilder()).append("getOrCreateThreadId failed with uri ").append(set.toString()).toString());
        throw new IllegalArgumentException("Unable to find or allocate a thread ID.");
        set;
        context.close();
        throw set;
    }

    static 
    {
        a = Uri.withAppendedPath(android_src.c.j.a, "conversations");
        b = Uri.withAppendedPath(a, "obsolete");
    }
}
