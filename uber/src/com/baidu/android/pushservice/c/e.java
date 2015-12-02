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
//            a, c

public abstract class e
{

    protected ArrayList a;
    protected Context b;
    protected c c;

    public e(Context context, c c1)
    {
        a = new ArrayList();
        b = context.getApplicationContext();
        c = c1;
        a();
    }

    public String a(com.baidu.android.pushservice.c.a a1, boolean flag)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("IClientManager", (new StringBuilder("client sync addOrRemove:")).append(flag).append(", ").append(a1).toString());
        }
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(a1.a())) goto _L2; else goto _L1
_L1:
        Object obj = a.iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        com.baidu.android.pushservice.c.a a2 = (com.baidu.android.pushservice.c.a)((Iterator) (obj)).next();
        if ((TextUtils.isEmpty(a1.b()) || !TextUtils.equals(a2.b(), a1.b())) && !a1.a().equals(a2.a())) goto _L6; else goto _L5
_L5:
        a.remove(a2);
        if (!flag) goto _L8; else goto _L7
_L7:
        a.add(a1);
          goto _L8
_L17:
        int i;
        if (i != 0 || !flag)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        a.add(a1);
        obj = a(((List) (a)));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("IClientManager", (new StringBuilder("sync  strApps: ")).append(((String) (obj))).toString());
        }
        i = com.baidu.android.pushservice.c._cls1.a[c.ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 248
    //                   1 400
    //                   2 406
    //                   3 412;
           goto _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_412;
_L9:
        a1 = "";
_L18:
        obj = com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "1234567890123456", ((String) (obj)).getBytes()), "utf-8");
        android.provider.Settings.System.putString(b.getContentResolver(), a1, ((String) (obj)));
        arraylist;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = a.iterator();
_L16:
        if (!((Iterator) (obj)).hasNext()) goto _L14; else goto _L13
_L13:
        a2 = (com.baidu.android.pushservice.c.a)((Iterator) (obj)).next();
        if ((TextUtils.isEmpty(a1.b()) || !TextUtils.equals(a2.b(), a1.b())) && !TextUtils.isEmpty(a2.a())) goto _L16; else goto _L15
        a1;
        com.baidu.frontia.a.b.a.a.a("IClientManager", a1);
        arraylist;
        JVM INSTR monitorexit ;
        return "";
        a1;
        arraylist;
        JVM INSTR monitorexit ;
        throw a1;
_L14:
        i = 0;
          goto _L17
_L8:
        i = 1;
          goto _L17
_L4:
        i = 0;
          goto _L17
_L15:
        i = 1;
          goto _L17
_L10:
        a1 = "com.baidu.push.webr";
          goto _L18
_L11:
        a1 = "com.baidu.push.lappr";
          goto _L18
        a1 = "com.baidu.push.sdkr";
          goto _L18
    }

    protected String a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++)
        {
            com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)list.get(i);
            stringbuffer.append(a1.b());
            stringbuffer.append(",");
            stringbuffer.append(a1.a());
            if (i != list.size() - 1)
            {
                stringbuffer.append(";");
            }
        }

        return stringbuffer.toString();
    }

    protected ArrayList a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        ArrayList arraylist = new ArrayList();
        String as[] = s.trim().split(";");
        int j = as.length;
        int i = 0;
        do
        {
            s = arraylist;
            if (i >= j)
            {
                continue;
            }
            s = as[i].trim().trim().split(",");
            if (s.length == 1 || s.length == 2)
            {
                com.baidu.android.pushservice.c.a a1 = new com.baidu.android.pushservice.c.a(s[0]);
                if (s.length == 2)
                {
                    a1.a(s[1]);
                }
                arraylist.add(a1);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a()
    {
        Object obj = "";
        com.baidu.android.pushservice.c._cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L1 _L2 _L3 _L4
_L1:
        obj = android.provider.Settings.System.getString(b.getContentResolver(), ((String) (obj)));
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L6; else goto _L5
_L5:
        obj = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "1234567890123456", com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes())));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("IClientManager", (new StringBuilder("ClientManager init strApps : ")).append(((String) (obj))).toString());
        }
        obj = a(((String) (obj)));
        if (obj != null)
        {
            try
            {
                com.baidu.android.pushservice.c.a a1;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.add(a1))
                {
                    a1 = (com.baidu.android.pushservice.c.a)((Iterator) (obj)).next();
                }

            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.baidu.frontia.a.b.a.a.a("IClientManager", ((Throwable) (obj)));
            }
        }
_L8:
        return;
_L2:
        obj = "com.baidu.push.webr";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "com.baidu.push.lappr";
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "com.baidu.push.sdkr";
        continue; /* Loop/switch isn't completed */
_L6:
        if (!com.baidu.android.pushservice.a.b()) goto _L8; else goto _L7
_L7:
        com.baidu.frontia.a.b.a.a.a("IClientManager", "ClientManager init strApps empty.");
        return;
        if (true) goto _L1; else goto _L9
_L9:
    }

    public com.baidu.android.pushservice.c.a b(String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)iterator.next();
            if (!TextUtils.isEmpty(a1.a()) && a1.a().equals(s))
            {
                return a1;
            }
        }

        return null;
    }

    public void b()
    {
        a.clear();
        a();
    }

    public com.baidu.android.pushservice.c.a c(String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            com.baidu.android.pushservice.c.a a1 = (com.baidu.android.pushservice.c.a)iterator.next();
            if (!TextUtils.isEmpty(a1.b()) && a1.b().equals(s))
            {
                return a1;
            }
        }

        return null;
    }

    /* member class not found */
    class _cls1 {}

}
