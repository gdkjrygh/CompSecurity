// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.c;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.android.pushservice.a;
import com.baidu.frontia.a.e.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.baidu.android.pushservice.c:
//            e, c, a, i

public class j extends e
{

    private static volatile j d;
    private static String e = "SDKClientManager";

    private j(Context context)
    {
        super(context, com.baidu.android.pushservice.c.c.b);
    }

    public static j a(Context context)
    {
        com/baidu/android/pushservice/c/j;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        d = new j(context);
_L1:
        context = d;
        com/baidu/android/pushservice/c/j;
        JVM INSTR monitorexit ;
        return context;
        d.b = context.getApplicationContext();
          goto _L1
        context;
        throw context;
    }

    public String a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = 0; k < list.size(); k++)
        {
            com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)list.get(k);
            stringbuffer.append(a1.b());
            stringbuffer.append(",");
            stringbuffer.append(a1.c());
            stringbuffer.append(",");
            stringbuffer.append(a1.d());
            stringbuffer.append(",");
            stringbuffer.append(a1.a());
            if (k != list.size() - 1)
            {
                stringbuffer.append(";");
            }
        }

        return stringbuffer.toString();
    }

    public ArrayList a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((ArrayList) (obj));
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = arraylist;
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        s = s.trim().split(";");
        l = s.length;
        k = 0;
_L10:
        obj = arraylist;
        if (k >= l) goto _L4; else goto _L5
_L5:
        String as[] = s[k].trim().trim().split(",");
        if (as.length < 2) goto _L7; else goto _L6
_L6:
        obj = new i(as[0], as[1]);
        if (as.length != 3) goto _L9; else goto _L8
_L8:
        ((i) (obj)).a(Integer.parseInt(as[2]));
_L12:
        arraylist.add(obj);
_L7:
        k++;
          goto _L10
_L9:
        if (as.length != 4) goto _L12; else goto _L11
_L11:
        ((i) (obj)).a(Integer.parseInt(as[2]));
        ((i) (obj)).a(as[3]);
          goto _L12
        Exception exception;
        exception;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b(e, (new StringBuilder("str2Clients E: ")).append(exception).toString());
        }
          goto _L12
    }

    public void a(i k)
    {
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(k.a())) goto _L2; else goto _L1
_L1:
        Iterator iterator = a.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)iterator.next();
        if (!a1.b().equals(k.b())) goto _L5; else goto _L4
_L4:
        a1.a(k.a());
        boolean flag = true;
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        k = a(((List) (a)));
        k = com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "1234567890123456", k.getBytes()), "utf-8");
        android.provider.Settings.System.putString(b.getContentResolver(), "com.baidu.push.sdkr", k);
_L6:
        arraylist;
        JVM INSTR monitorexit ;
        return;
        k;
        com.baidu.frontia.a.b.a.a.a(e, k);
          goto _L6
        k;
        arraylist;
        JVM INSTR monitorexit ;
        throw k;
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public com.baidu.android.pushservice.c.a b(String s)
    {
        return d(s);
    }

    public i d(String s)
    {
        i k = null;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)iterator.next();
            if (!TextUtils.isEmpty(a1.a()) && (a1.a().equals(s) && (k == null || k.d() < a1.d())))
            {
                k = (i)a1;
            }
        } while (true);
        return k;
    }

}
