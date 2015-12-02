// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.qihoo.antivirus.update:
//            af, UpdateService

public class b
{

    public static int a(Context context, int i, String s, HashMap hashmap)
    {
        if (i != 3 && i != 1 && i != 2)
        {
            return -3;
        }
        if (s == null)
        {
            return -3;
        }
        if (hashmap == null)
        {
            return -3;
        }
        if (i != 3 && !af.b(context))
        {
            return -1;
        }
        Intent intent = new Intent(context, com/qihoo/antivirus/update/UpdateService);
        intent.setAction("com.qihoo.action.BEGIN_UPDATE");
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE", i);
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_LOCAL_VERSION", s);
        StringBuilder stringbuilder = new StringBuilder(32);
        Iterator iterator = hashmap.entrySet().iterator();
        i = 0;
        boolean flag = false;
        String s1 = null;
        hashmap = null;
        String s2 = null;
        do
        {
            if (!iterator.hasNext())
            {
                if (!flag)
                {
                    return -3;
                }
                break;
            }
            s = (java.util.Map.Entry)iterator.next();
            String s3 = (String)s.getKey();
            s = (String)s.getValue();
            if ("server".equals(s3))
            {
                hashmap = s;
            } else
            if ("permission".equals(s3))
            {
                i = 1;
                s2 = s;
            } else
            {
                if ("product".equals(s3))
                {
                    flag = true;
                    s1 = s;
                }
                stringbuilder.append(s3);
                stringbuilder.append("=");
                stringbuilder.append(s);
                stringbuilder.append("\r\n");
            }
        } while (true);
        if (i == 0)
        {
            return -3;
        }
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_REQ_PARAM", stringbuilder.toString());
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_PRODUCT", s1);
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_PERMISSION", s2);
        if (hashmap != null)
        {
            intent.putExtra("com.qihoo.action.INTENT_EXTRA_SERVER", hashmap);
        }
        context.startService(intent);
        return 0;
    }

    public static int a(Context context, String s, int i)
    {
        while (s == null || i != 0 && i != 1) 
        {
            return -3;
        }
        Intent intent = new Intent("com.qihoo.broadcast.UPDATE_STOP");
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_PRODUCT", s);
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_STOP_TYPE", i);
        context.sendBroadcast(intent);
        return 0;
    }

    public static void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/qihoo/antivirus/update/UpdateService);
        intent.setAction("com.qihoo.action.BEGIN_UPGRADE_APP");
        intent.putExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE", 3);
        intent.putExtra("extra_apk_merge", flag);
        context.startService(intent);
    }
}
