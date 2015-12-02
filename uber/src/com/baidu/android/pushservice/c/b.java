// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.android.pushservice.d.g;
import com.baidu.frontia.a.e.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.baidu.android.pushservice.c:
//            h

public final class b
{

    private static volatile b c;
    public ArrayList a;
    public ArrayList b;
    private final Context d;
    private final HashMap e;

    private b(Context context)
    {
        SharedPreferences sharedpreferences;
        Object obj;
        a = new ArrayList();
        b = new ArrayList();
        e = new HashMap();
        d = context.getApplicationContext();
        sharedpreferences = d.getSharedPreferences((new StringBuilder()).append(d.getPackageName()).append(".push_sync").toString(), 5);
        obj = sharedpreferences.getString("r", "");
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        obj = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "1234567890123456", com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes())));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("ClientManager init strApps : ")).append(((String) (obj))).toString());
        }
        obj = d(((String) (obj)));
        if (obj != null)
        {
            try
            {
                h h1;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.add(h1))
                {
                    h1 = (h)((Iterator) (obj)).next();
                }

            }
            catch (Exception exception)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder(" initException: ")).append(exception).toString());
                }
            }
        }
_L3:
        exception = sharedpreferences.getString("r_v2", "");
        if (TextUtils.isEmpty(exception))
        {
            break MISSING_BLOCK_LABEL_489;
        }
        exception = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "1234567890123456", com.baidu.frontia.a.e.b.a(exception.getBytes())));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("ClientManager init strAppsV2 : ")).append(exception).toString());
        }
        exception = d(exception);
        if (exception != null)
        {
            try
            {
                h h2;
                for (exception = exception.iterator(); exception.hasNext(); b.add(h2))
                {
                    h2 = (h)exception.next();
                }

            }
            catch (Exception exception1)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder(" v2 initException: ")).append(exception1).toString());
                }
            }
        }
_L4:
        int j = sharedpreferences.getInt("com.baidu.push.sync.vn", -1);
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            i = 0;
        }
        Log.d("ClientManager", (new StringBuilder("client older: ")).append(j).append(" cur: ").append(i).toString());
        if (j < i)
        {
            b(d);
            c(d);
            context = sharedpreferences.edit();
            context.putInt("com.baidu.push.sync.vn", i);
            context.commit();
        }
        return;
_L2:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", "ClientManager init strApps empty.");
        }
          goto _L3
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", "ClientManager init strAppsV2 empty.");
        }
          goto _L4
    }

    public static b a(Context context)
    {
        com/baidu/android/pushservice/c/b;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new b(context);
        }
        context = c;
        com/baidu/android/pushservice/c/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++)
        {
            h h1 = (h)list.get(i);
            stringbuffer.append(h1.c);
            stringbuffer.append(",");
            stringbuffer.append(h1.a);
            stringbuffer.append(",");
            stringbuffer.append(h1.e);
            if (i != list.size() - 1)
            {
                stringbuffer.append(";");
            }
        }

        return stringbuffer.toString();
    }

    private void a(Context context, String s, ArrayList arraylist)
    {
        SharedPreferences sharedpreferences;
        Iterator iterator;
        sharedpreferences = context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5);
        iterator = context.getPackageManager().queryBroadcastReceivers(new Intent("com.baidu.android.pushservice.action.BIND_SYNC"), 0).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (ResolveInfo)iterator.next();
        boolean flag1;
        obj = context.createPackageContext(((ResolveInfo) (obj)).activityInfo.packageName, 2).getSharedPreferences((new StringBuilder()).append(((ResolveInfo) (obj)).activityInfo.packageName).append(".push_sync").toString(), 1).getString(s, "nodata");
        flag1 = "nodata".equals(obj);
        if (flag1) goto _L4; else goto _L3
_L3:
        byte abyte0[] = com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes());
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        Object obj1 = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "1234567890123456", abyte0));
        obj = obj1;
_L13:
        obj = d(((String) (obj)));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = ((ArrayList) (obj)).iterator();
_L12:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L6
_L6:
        Iterator iterator1;
        obj1 = (h)((Iterator) (obj)).next();
        iterator1 = arraylist.iterator();
_L10:
        if (!iterator1.hasNext()) goto _L8; else goto _L7
_L7:
        h h1 = (h)iterator1.next();
        if (!TextUtils.equals(((h) (obj1)).c, h1.c) && !TextUtils.equals(((h) (obj1)).a, h1.a)) goto _L10; else goto _L9
_L9:
        break MISSING_BLOCK_LABEL_457;
_L16:
        boolean flag;
        if (flag) goto _L12; else goto _L11
_L11:
        arraylist.add(obj1);
          goto _L12
        Exception exception;
        exception;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("ClientManager", (new StringBuilder("syncRegisterDataImpl Exception: ")).append(exception.getMessage()).toString());
        }
          goto _L4
        Exception exception1;
        exception1;
        com.baidu.frontia.a.b.a.a.d("ClientManager", (new StringBuilder("GetClients:")).append(exception1.getMessage()).toString());
          goto _L13
_L2:
        if (arraylist.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        context = sharedpreferences.edit();
        arraylist = a(((List) (arraylist)));
        context.putString(s, com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "1234567890123456", arraylist.getBytes()), "utf-8"));
        context.commit();
_L15:
        return;
        context;
        if (!com.baidu.android.pushservice.a.b()) goto _L15; else goto _L14
_L14:
        com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("encrypt error: ")).append(context).toString());
        return;
_L8:
        flag = false;
          goto _L16
        flag = true;
          goto _L16
    }

    private void b(Context context)
    {
        a(context, "r", a);
    }

    private void c(Context context)
    {
        a(context, "r_v2", b);
    }

    static ArrayList d(String s)
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
            s = as[i].trim().split(",");
            if (s.length >= 3)
            {
                h h1 = new h();
                h1.c = s[0].trim();
                h1.a = s[1].trim();
                h1.e = s[2].trim();
                arraylist.add(h1);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final h a(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.c.equals(s))
            {
                return h1;
            }
        }

        for (Iterator iterator1 = a.iterator(); iterator1.hasNext();)
        {
            h h2 = (h)iterator1.next();
            if (h2.c.equals(s))
            {
                return h2;
            }
        }

        return null;
    }

    public final String a(h h1, boolean flag)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("ClientManager", (new StringBuilder("syncV1 addOrRemove:")).append(flag).append(", ").append(h1).toString());
            com.baidu.frontia.a.b.a.a.b("ClientManager", (new StringBuilder("client.packageName=")).append(h1.c).append(" client.appId=").append(h1.a).append(" client.userId=").append(h1.e).toString());
        }
        return a(h1, flag, a, "r");
    }

    public final String a(h h1, boolean flag, ArrayList arraylist, String s)
    {
        arraylist;
        JVM INSTR monitorenter ;
        Object obj = arraylist.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        h h2 = (h)((Iterator) (obj)).next();
        if (!h2.c.equals(h1.c) && !h2.a.equals(h1.a)) goto _L4; else goto _L3
_L3:
        arraylist.remove(h2);
        if (!flag) goto _L6; else goto _L5
_L5:
        arraylist.add(h1);
          goto _L6
_L8:
        boolean flag1;
        if (flag1 || !flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        arraylist.add(h1);
        h1 = d.getSharedPreferences((new StringBuilder()).append(d.getPackageName()).append(".push_sync").toString(), 5);
        obj = a(((List) (arraylist)));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("sync  strApps: ")).append(((String) (obj))).toString());
        }
        obj = com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "1234567890123456", ((String) (obj)).getBytes()), "utf-8");
        h1 = h1.edit();
        h1.putString(s, ((String) (obj)));
        h1.commit();
        arraylist;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        h1;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("encrypt error: ")).append(h1).toString());
        }
        arraylist;
        JVM INSTR monitorexit ;
        return "";
        h1;
        arraylist;
        JVM INSTR monitorexit ;
        throw h1;
_L2:
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(Context context, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s1);
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj;
        s1 = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "1234567890123456", com.baidu.frontia.a.e.b.a(s1.getBytes())));
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", (new StringBuilder("ClientManager init strApps : ")).append(s1).toString());
        }
        obj = d(s1);
        if (c == null || obj == null) goto _L4; else goto _L3
_L3:
        if (!s.equals("r")) goto _L6; else goto _L5
_L5:
        c.a.clear();
        for (s1 = ((ArrayList) (obj)).iterator(); s1.hasNext(); c.a.add(obj))
        {
            obj = (h)s1.next();
        }

          goto _L7
        context;
        throw context;
        context;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("ClientManager", "ClientManager init strApps exception.");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L8
_L8:
        com.baidu.frontia.a.b.a.a.a("ClientManager", "ClientManager init strApps empty.");
          goto _L4
_L7:
        s1 = a(((List) (c.a)));
_L10:
        obj = context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5);
        context = com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "1234567890123456", s1.getBytes()), "utf-8");
_L11:
        s1 = ((SharedPreferences) (obj)).edit();
        s1.putString(s, context);
        s1.commit();
          goto _L4
_L6:
        if (!s.equals("r_v2")) goto _L10; else goto _L9
_L9:
        s1 = new ArrayList();
        for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); s1.add(((h)iterator.next()).c)) { }
        break MISSING_BLOCK_LABEL_419;
_L12:
        int i;
        for (; i >= c.b.size(); i++)
        {
            break MISSING_BLOCK_LABEL_375;
        }

        if (!s1.contains(((h)c.b.get(i)).c))
        {
            break MISSING_BLOCK_LABEL_425;
        }
        c.b.remove(i);
        i--;
        break MISSING_BLOCK_LABEL_425;
        c.b.addAll(((java.util.Collection) (obj)));
        s1 = a(((List) (c.b)));
          goto _L10
        context;
        if (com.baidu.android.pushservice.a.b())
        {
            context.printStackTrace();
        }
        context = s1;
          goto _L11
        i = 0;
          goto _L12
    }

    public final void a(String s, g g1)
    {
        e.put(s, g1);
    }

    public final boolean a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        }
        return e.containsKey(s) && s1.equals(((g)e.get(s)).a());
    }

    public final h b(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.a != null && h1.a.equals(s))
            {
                return h1;
            }
        }

        for (Iterator iterator1 = a.iterator(); iterator1.hasNext();)
        {
            h h2 = (h)iterator1.next();
            if (h2.a != null && h2.a.equals(s))
            {
                return h2;
            }
        }

        return null;
    }

    public final String b(h h1, boolean flag)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("ClientManager", (new StringBuilder("syncV2 addOrRemove:")).append(flag).append(", ").append(h1).toString());
            com.baidu.frontia.a.b.a.a.b("ClientManager", (new StringBuilder("client.packageName=")).append(h1.c).append(" client.appId=").append(h1.a).append(" client.userId=").append(h1.e).toString());
        }
        return a(h1, flag, b, "r_v2");
    }

    public final boolean c(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((h)iterator.next()).a.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public final String e(String s)
    {
        if (e.get(s) != null)
        {
            return ((g)e.get(s)).b();
        } else
        {
            return "";
        }
    }

    public final void f(String s)
    {
        if (e.containsKey(s))
        {
            e.remove(s);
        }
    }
}
