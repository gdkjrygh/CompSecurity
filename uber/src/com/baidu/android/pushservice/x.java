// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.text.TextUtils;
import com.baidu.android.pushservice.e.b;
import com.baidu.android.pushservice.e.e;
import com.baidu.frontia.a.b.a.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.baidu.android.pushservice:
//            a, PushService

class x extends com.baidu.android.pushservice.b.a.a
{

    final PushService a;

    x(PushService pushservice)
    {
        a = pushservice;
        super();
    }

    public int a(String s, int i)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("getUnreadMsgNumber from PushService, appid=")).append(s).append(" type=").append(i).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).a(i, s, null);
    }

    public String a()
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", "getSubcribedApps from PushService");
        }
        return com.baidu.android.pushservice.e.e.a(a).a(null);
    }

    public String a(String s)
    {
        Object obj;
        ArrayList arraylist;
        obj = null;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("getSubscribedAppinfos from PushService, appids=")).append(s).toString());
        }
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new JSONArray(s);
        int i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add((new StringBuilder()).append(s.getInt(i)).toString());
        i++;
        if (true) goto _L3; else goto _L2
        s;
        com.baidu.frontia.a.b.a.a.d("PushService", (new StringBuilder("error ")).append(s.getMessage()).toString());
_L2:
        s = obj;
        if (arraylist.size() > 0)
        {
            s = com.baidu.android.pushservice.e.e.a(a).a(arraylist, null);
        }
        return s;
    }

    public String a(String s, int i, boolean flag, int j, int k)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("getMsgs from PushService, appid=")).append(s).append(" type=").append(i).append(" unreadOnly=").append(flag).append(" start=").append(j).append(" limit=").append(k).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).a(s, i, flag, j, k, null);
    }

    public void a(String s, String s1, com.baidu.android.pushservice.b.b b1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("unsubscribeLight from PushService, appid=")).append(s).append(" channel=").append(s1).toString());
        }
        b1 = new b(b1);
        com.baidu.android.pushservice.e.e.a(a).a(s, s1, b1);
    }

    public void a(String s, String s1, boolean flag, com.baidu.android.pushservice.b.b b1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("subscribeLight from PushService, appid=")).append(s).append(" channel=").append(s1).toString());
        }
        b1 = new b(b1);
        com.baidu.android.pushservice.e.e.a(a).a(s, s1, flag, b1);
    }

    public void a(String s, String s1, boolean flag, String s2, com.baidu.android.pushservice.b.b b1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("subscribeLight from PushService, appidOrApikey=")).append(s).append(" channel=").append(s1).toString());
        }
        b1 = new b(b1);
        com.baidu.android.pushservice.e.e.a(a).a(s, s1, flag, s2, b1);
    }

    public boolean a(String s, String s1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("register from PushService, channel=")).append(s).append(" packageName=").append(s1).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).b(s, s1);
    }

    public boolean a(String s, String s1, int i)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("updateBlacklist from PushService, packageName=")).append(s).append(" appid=").append(s1).append(" type").append(i).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).a(s, s1, i);
    }

    public boolean a(String s, String s1, String s2, String s3)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("register from PushService, channel=")).append(s).append(" packageName=").append(s1).append(" hostName= ").append(s2).append(" hostVersion= ").append(s3).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).b(s, s1, s2, s3);
    }

    public boolean a(String s, boolean flag)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("setNotifySwitch from PushService, pkgName=")).append(s).append(" on=").append(flag).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).a(s, flag);
    }

    public int b(String s)
    {
        ArrayList arraylist;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("setMsgRead from PushService, msgids=")).append(s).toString());
        }
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new JSONArray(s);
        int i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(s.getString(i));
        i++;
        if (true) goto _L3; else goto _L2
        s;
        com.baidu.frontia.a.b.a.a.d("PushService", (new StringBuilder("error ")).append(s.getMessage()).toString());
_L2:
        if (arraylist.size() > 0)
        {
            return com.baidu.android.pushservice.e.e.a(a).b(arraylist, null);
        } else
        {
            return -1;
        }
    }

    public int b(String s, int i)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("setMsgRead from PushService, appid=")).append(s).append(" type=").append(i).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).b(i, s, null);
    }

    public String b()
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", "getSubscribedAppids from PushService");
        }
        return com.baidu.android.pushservice.e.e.a(a).b(null);
    }

    public void b(String s, String s1, com.baidu.android.pushservice.b.b b1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("unbindlight from PushService, appid=")).append(s).append(" channel=").append(s1).toString());
        }
        b1 = new b(b1);
        com.baidu.android.pushservice.e.e.a(a).b(s, s1, b1);
    }

    public boolean b(String s, String s1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("removeBlacklist from PushService, packageName=")).append(s).append(" appid=").append(s1).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).c(s, s1);
    }

    public int c()
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("getPushVersion ")).append(com.baidu.android.pushservice.a.a()).toString());
        }
        return com.baidu.android.pushservice.a.a();
    }

    public int c(String s)
    {
        ArrayList arraylist;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("deleteMsg from PushService, msgids=")).append(s).toString());
        }
        arraylist = new ArrayList();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new JSONArray(s);
        int i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(s.getString(i));
        i++;
        if (true) goto _L3; else goto _L2
        s;
        com.baidu.frontia.a.b.a.a.d("PushService", (new StringBuilder("error ")).append(s.getMessage()).toString());
_L2:
        if (arraylist.size() > 0)
        {
            return com.baidu.android.pushservice.e.e.a(a).c(arraylist, null);
        } else
        {
            return -1;
        }
    }

    public int c(String s, int i)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("deleteAllMsg from PushService, appid=")).append(s).append(" type=").append(i).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).c(i, s, null);
    }

    public int d(String s)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("getNewMsgNum from PushService, packageName=")).append(s).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).c(s);
    }

    public boolean e(String s)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("PushService", (new StringBuilder("clearNewMsgNum from PushService, packageName=")).append(s).toString());
        }
        return com.baidu.android.pushservice.e.e.a(a).d(s);
    }

    public String f(String s)
    {
        return com.baidu.android.pushservice.e.e.a(a).i(s);
    }
}
