// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android_src.b.a;
import android_src.c.c;
import android_src.mms.g.o;
import com.facebook.debug.log.b;

public class w
{

    private static final String d[] = {
        "type", "mmsc", "mmsproxy", "mmsport"
    };
    private String a;
    private String b;
    private int c;

    public w(Context context, String s)
    {
        Cursor cursor;
        c = -1;
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = (new StringBuilder()).append("apn='").append(s.trim()).append("'").toString();
        }
        cursor = o.a(context, context.getContentResolver(), Uri.withAppendedPath(c.a, "current"), d, s, null, null);
        if (com.facebook.debug.log.b.b(2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("TransactionSettings looking for apn: ").append(s).append(" returned: ");
            if (cursor == null)
            {
                context = "null cursor";
            } else
            {
                context = (new StringBuilder()).append(cursor.getCount()).append(" hits").toString();
            }
            com.facebook.debug.log.b.a("fb-mms:TransactionSettings", stringbuilder.append(context).toString());
        }
        if (cursor != null) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.e("fb-mms:TransactionSettings", "Apn is not found in Database!");
_L5:
        return;
_L2:
        boolean flag = false;
_L3:
        do
        {
            if (!cursor.moveToNext() || !TextUtils.isEmpty(a))
            {
                break MISSING_BLOCK_LABEL_317;
            }
        } while (!a(cursor.getString(0), "mms"));
        a = android_src.b.a.a(cursor.getString(1).trim());
        b = android_src.b.a.a(cursor.getString(2));
        if (!d())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        context = cursor.getString(3);
        c = Integer.parseInt(context);
_L4:
        flag = true;
          goto _L3
        NumberFormatException numberformatexception;
        numberformatexception;
        if (!TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_288;
        }
        com.facebook.debug.log.b.d("fb-mms:TransactionSettings", "mms port not set!");
          goto _L4
        context;
        cursor.close();
        throw context;
        com.facebook.debug.log.b.d("fb-mms:TransactionSettings", (new StringBuilder()).append("Bad port number format: ").append(context).toString(), numberformatexception);
          goto _L4
        cursor.close();
        com.facebook.debug.log.b.a("fb-mms:TransactionSettings", (new StringBuilder()).append("APN setting: MMSC: ").append(a).append(" looked for: ").append(s).toString());
        if (flag && TextUtils.isEmpty(a))
        {
            com.facebook.debug.log.b.e("fb-mms:TransactionSettings", "Invalid APN setting: MMSC is empty");
            return;
        }
          goto _L5
        flag = true;
          goto _L3
    }

    public w(String s, String s1, int i)
    {
        c = -1;
        if (s != null)
        {
            s = s.trim();
        } else
        {
            s = null;
        }
        a = s;
        b = s1;
        c = i;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:TransactionSettings", (new StringBuilder()).append("TransactionSettings: ").append(a).append(" proxyAddress: ").append(b).append(" proxyPort: ").append(c).toString());
        }
    }

    private static boolean a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        s = s.split(",");
        int j = s.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                String s2 = s[i];
                if (s2.equals(s1) || s2.equals("*"))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return b != null && b.trim().length() != 0;
    }

}
