// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushSDK;
import com.baidu.android.pushservice.ac;
import com.baidu.android.pushservice.d.l;
import com.baidu.android.pushservice.d.t;
import com.baidu.android.pushservice.d.u;
import com.baidu.android.pushservice.d.v;
import com.baidu.android.pushservice.d.w;
import com.baidu.android.pushservice.d.x;
import com.baidu.android.pushservice.db.a;
import com.baidu.android.pushservice.f.h;
import com.baidu.android.pushservice.jni.BaiduAppSSOJni;
import com.baidu.android.pushservice.util.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice.e:
//            k, a, l, i, 
//            p, d, h, m, 
//            f, n

public class e
{

    private static e c;
    private ac a;
    private Context b;

    private e(Context context)
    {
        a = PushSDK.getInstance(context).getRegistrationService();
        b = context;
        com.baidu.android.pushservice.db.a.a().a(b);
    }

    static Context a(e e1)
    {
        return e1.b;
    }

    public static e a(Context context)
    {
        if (c == null)
        {
            c = new e(context);
        }
        return c;
    }

    private String a(int j, String s, String s1, String s2, String s3, String s4, int i1)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!TextUtils.isEmpty(s1))
        {
            jsonobject.put("app_id", s1);
        }
        if (!TextUtils.isEmpty(s3))
        {
            jsonobject.put("user_id", s3);
        }
        if (!TextUtils.isEmpty(s))
        {
            jsonobject.put("channel_id", s);
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        jsonobject.put("add_shortcut", true);
_L4:
        if (!TextUtils.isEmpty(s2))
        {
            jsonobject.put("api_key", s2);
        }
_L5:
        return jsonobject.toString();
_L2:
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        jsonobject.put("add_shortcut", false);
          goto _L4
        try
        {
            jsonobject.put("error", j);
            if (!TextUtils.isEmpty(s1))
            {
                jsonobject.put("app_id", s1);
            }
            if (!TextUtils.isEmpty(s2))
            {
                jsonobject.put("api_key", s2);
            }
            jsonobject.put("error_msg", s4);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                Log.e("LightAppManager", (new StringBuilder("generate msg error: ")).append(s).toString());
            }
        }
          goto _L5
    }

    static String a(e e1, int j, String s, String s1, String s2, String s3, String s4, int i1)
    {
        return e1.a(j, s, s1, s2, s3, s4, i1);
    }

    private void a(com.baidu.android.pushservice.d.a a1)
    {
        if (a != null)
        {
            a.a(a1);
        } else
        {
            a = PushSDK.getInstance(b).getRegistrationService();
            com.baidu.android.pushservice.db.a.a().a(b);
            if (a != null)
            {
                a.a(a1);
                return;
            }
            if (com.baidu.android.pushservice.a.b())
            {
                Log.d("LightAppManager", " mRegistrationService null! try restart pushserice, ple");
                return;
            }
        }
    }

    static void a(e e1, com.baidu.android.pushservice.d.a a1)
    {
        e1.a(a1);
    }

    static void a(e e1, String s, String s1)
    {
        e1.e(s, s1);
    }

    static void a(e e1, String s, String s1, String s2, com.baidu.android.pushservice.d.t.a a1)
    {
        e1.a(s, s1, s2, a1);
    }

    static void a(e e1, String s, String s1, String s2, String s3, String s4, String s5, com.baidu.android.pushservice.e.a a1, 
            int j)
    {
        e1.b(s, s1, s2, s3, s4, s5, a1, j);
    }

    private void a(String s, String s1, String s2, com.baidu.android.pushservice.d.t.a a1)
    {
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1))
        {
            s = new t(b, s, s1, a1);
            s.a(0);
            (new Thread(s)).start();
        }
    }

    private void b(String s, String s1, String s2, String s3, com.baidu.android.pushservice.e.a a1, boolean flag)
    {
        l l1 = new l("method_lapp_unbind", s, s2);
        k k1 = new k(this, flag, s, s2, a1);
        if (!TextUtils.isEmpty(s))
        {
            a(new x(l1, 3, s1, null, null, s3, null, k1, b));
        } else
        if (!TextUtils.isEmpty(s2))
        {
            s1 = com.baidu.android.pushservice.db.a.a().j(s3);
            s1 = BaiduAppSSOJni.getPushHash(b, s1, s2, null);
            if (TextUtils.isEmpty(s1))
            {
                if (a1 != null)
                {
                    if (flag)
                    {
                        a1.d(40003, a(40003, null, s2, s, null, "host not resgisted or incorrect channel", -1));
                        return;
                    } else
                    {
                        a1.b(40003, a(40003, null, s2, s, null, "host not resgisted or incorrect channel", -1));
                        return;
                    }
                }
            } else
            {
                a(new x(l1, 3, s3, s1, k1, b));
                return;
            }
        }
    }

    private void b(String s, String s1, String s2, String s3, String s4, String s5, com.baidu.android.pushservice.e.a a1, 
            int j)
    {
        a(new w(new l("method_set_lapp_tags", s, null), s1, s2, s3, s4, s5, new com.baidu.android.pushservice.e.l(this, a1, s, j, s1), b, j));
    }

    private void b(String s, String s1, String s2, String s3, boolean flag, String s4, com.baidu.android.pushservice.e.a a1, 
            int j)
    {
        a(s, s2, s3, new i(this, s3, flag, a1, s2, s, j, s1, s4));
    }

    private void e(String s, String s1)
    {
        s = com.baidu.android.pushservice.db.a.a().g(s, s1);
        if (s != null)
        {
            com.baidu.android.pushservice.e.p.a(b, s[0], s[1], s[2]);
        }
    }

    public int a()
    {
        return com.baidu.android.pushservice.a.a();
    }

    public int a(int j, String s, com.baidu.android.pushservice.e.a a1)
    {
        j = com.baidu.android.pushservice.db.a.a().a(j, s);
        if (a1 != null)
        {
            a1.a(j);
        }
        return j;
    }

    public long a(String s, String s1, String s2, String s3, String s4, int j, int i1)
    {
        return com.baidu.android.pushservice.db.a.a().a(s, s1, s2, s3, s4, j, i1);
    }

    public String a(Context context, String s)
    {
        s = com.baidu.android.pushservice.db.a.a().l(s);
        if (!TextUtils.isEmpty(s) && com.baidu.android.pushservice.util.f.d(context, s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    public String a(com.baidu.android.pushservice.e.a a1)
    {
        String s = com.baidu.android.pushservice.db.a.a().e();
        if (TextUtils.isEmpty(s))
        {
            if (a1 != null)
            {
                a1.g(-1, null);
            }
            return null;
        }
        if (a1 != null)
        {
            a1.g(0, s);
        }
        return s;
    }

    public String a(com.baidu.android.pushservice.e.a a1, int j, int i1)
    {
        String s = com.baidu.android.pushservice.db.a.a().a(j, i1);
        if (TextUtils.isEmpty(s))
        {
            if (a1 != null)
            {
                a1.j(-1, null);
            }
            return null;
        }
        if (a1 != null)
        {
            a1.j(0, s);
        }
        return s;
    }

    public String a(String s, int j, boolean flag, int i1, int j1, com.baidu.android.pushservice.e.a a1)
    {
        HashMap hashmap = com.baidu.android.pushservice.db.a.a().a(s, j, flag, i1, j1);
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        s = (String)hashmap.get("msg");
        j = Integer.valueOf((String)hashmap.get("ismore")).intValue();
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L3:
        if (a1 != null)
        {
            a1.a(0, s, flag);
        }
        return s;
        Exception exception;
        exception;
        if (com.baidu.android.pushservice.a.b())
        {
            Log.d("LightAppManager", (new StringBuilder("getMsgs E: ")).append(exception).toString());
        }
        flag = false;
        if (true) goto _L3; else goto _L2
_L2:
        if (a1 != null)
        {
            a1.a(1, null, false);
        }
        return null;
    }

    protected String a(String s, String s1)
    {
        return com.baidu.android.pushservice.db.a.a().a(s, s1);
    }

    public String a(ArrayList arraylist, com.baidu.android.pushservice.e.a a1)
    {
        arraylist = com.baidu.android.pushservice.db.a.a().a(arraylist);
        if (TextUtils.isEmpty(arraylist))
        {
            if (a1 != null)
            {
                a1.i(-1, null);
            }
            return null;
        }
        if (a1 != null)
        {
            a1.i(0, arraylist);
        }
        return arraylist;
    }

    public ArrayList a(String s, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = com.baidu.android.pushservice.db.a.a().g();
        if (obj == null)
        {
            return arraylist;
        }
        s = com.baidu.android.pushservice.db.a.a().o(s);
        obj = ((HashMap) (obj)).keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            if (s != null && s.containsKey(s1))
            {
                int i1 = ((Integer)s.get(s1)).intValue();
                if (i1 != 0 && i1 != j)
                {
                    arraylist.add(s1);
                }
            } else
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    protected void a(d d1, String s, String s1, String s2)
    {
        com.baidu.android.pushservice.db.a.a().a(d1.b(), d1.c(), d1.d(), d1.f(), s, s1, s2);
    }

    public void a(String s, com.baidu.android.pushservice.e.a a1)
    {
        boolean flag = com.baidu.android.pushservice.db.a.a().e(s);
        if (a1 != null)
        {
            a1.a(flag);
        }
    }

    protected void a(String s, d d1)
    {
        com.baidu.android.pushservice.db.a.a().a(d1.b(), d1.c(), d1.d(), d1.f(), s);
    }

    public void a(String s, String s1, com.baidu.android.pushservice.e.a a1)
    {
        b(null, null, s, s1, a1, true);
    }

    public void a(String s, String s1, String s2, com.baidu.android.pushservice.e.a a1)
    {
        b(s, s1, null, s2, a1, true);
    }

    public void a(String s, String s1, String s2, String s3)
    {
        com.baidu.android.pushservice.db.a.a().a(s, s1, s2, s3);
    }

    public void a(String s, String s1, String s2, String s3, com.baidu.android.pushservice.e.a a1)
    {
        a(s, s1, s2, s3, a1, true);
    }

    public void a(String s, String s1, String s2, String s3, com.baidu.android.pushservice.e.a a1, boolean flag)
    {
        a(((com.baidu.android.pushservice.d.a) (new x(new l("method_lapp_unbind", s, null), 1, s1, s2, s3, null, null, new com.baidu.android.pushservice.e.h(this, s, flag, a1), b))));
    }

    public void a(String s, String s1, String s2, String s3, String s4, com.baidu.android.pushservice.e.a a1)
    {
        Object obj = a(s, ((String) (null)));
        int j;
        obj = new JSONObject(((String) (obj)));
        j = ((JSONObject) (obj)).getInt("error_code");
        if (j == 0)
        {
            try
            {
                a(s, s1, s2, s3, false, s4, a1, 5);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                a1.a(20001, null);
            }
            return;
        }
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        s1 = ((JSONObject) (obj)).getString("push_token");
        ((JSONObject) (obj)).put("type", "bind_light");
        ((JSONObject) (obj)).put("error", 0);
        ((JSONObject) (obj)).put("pushToken", s1);
        ((JSONObject) (obj)).put("api_key", s);
_L1:
        a1.a(0, ((JSONObject) (obj)).toString());
        return;
        s;
        s.printStackTrace();
          goto _L1
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        a1.a(0x1adb1, null);
    }

    public void a(String s, String s1, String s2, String s3, String s4, String s5, com.baidu.android.pushservice.e.a a1)
    {
        Object obj = a(s, s1);
        int j;
        obj = new JSONObject(((String) (obj)));
        j = ((JSONObject) (obj)).getInt("error_code");
        if (j != 0) goto _L2; else goto _L1
_L1:
        a(s, s1, s2, s3, s4, s5, a1, 2);
_L6:
        return;
_L2:
        if (j != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((JSONObject) (obj)).put("error", 0);
        ((JSONObject) (obj)).put("api_key", s);
        s = new JSONObject();
        s2 = new JSONArray();
        s.put("tag", s1);
        s.put("result", 0);
        s2.put(s);
        ((JSONObject) (obj)).put("tag", s2.toString());
_L4:
        try
        {
            a1.e(0, ((JSONObject) (obj)).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a1.e(20001, null);
        }
        return;
        s;
        Log.e("LightAppManager", (new StringBuilder("error ")).append(s.getMessage()).toString());
        if (true) goto _L4; else goto _L3
_L3:
        if (j != -1) goto _L6; else goto _L5
_L5:
        a1.e(0x1adb1, null);
        return;
    }

    public void a(String s, String s1, String s2, String s3, String s4, String s5, com.baidu.android.pushservice.e.a a1, 
            int j)
    {
        if (com.baidu.android.pushservice.db.a.a().f(s))
        {
            b(s, s1, s2, s3, s4, s5, a1, j);
            return;
        } else
        {
            a(s, null, s5, ((com.baidu.android.pushservice.d.t.a) (new m(this, s, s1, s2, s3, s4, s5, a1, j))));
            return;
        }
    }

    public void a(String s, String s1, String s2, String s3, boolean flag, String s4, com.baidu.android.pushservice.e.a a1, 
            int j)
    {
        a(((com.baidu.android.pushservice.d.a) (new u(new l("method_deal_lapp_bind_intent", s, null), j, s1, s2, s3, s4, new com.baidu.android.pushservice.e.f(this, a1, s, j, s4, flag), b))));
    }

    public void a(String s, String s1, String s2, boolean flag, com.baidu.android.pushservice.e.a a1)
    {
        b(s, s1, null, s2, flag, null, a1, 3);
    }

    public void a(String s, String s1, boolean flag)
    {
        com.baidu.android.pushservice.db.a.a().a(s, s1, flag);
    }

    public void a(String s, String s1, boolean flag, com.baidu.android.pushservice.e.a a1)
    {
        b(null, null, s, s1, flag, null, a1, 2);
    }

    public void a(String s, String s1, boolean flag, String s2, com.baidu.android.pushservice.e.a a1)
    {
        JSONObject jsonobject;
        String s3;
        try
        {
            jsonobject = new JSONObject(s2);
            s3 = jsonobject.optString("type");
            if (TextUtils.isEmpty(s3) || s3.equals("subscribe"))
            {
                b(null, null, s, s1, flag, s2, a1, 2);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a1.c(30602, a(30602, null, s, s, null, (new StringBuilder()).append(PushConstants.getErrorMsg(30602)).append(s1).toString(), 0));
            return;
        }
        if (s3.equals("subscribe_service"))
        {
            s2 = jsonobject.getString("nonce");
            s3 = jsonobject.getString("csrfToken");
            a(s, jsonobject.getString("tags"), s3, s2, jsonobject.optString("referer", null), s1, a1, 1);
            return;
        }
        if (s3.equals("bind_light"))
        {
            s2 = jsonobject.getString("nonce");
            a(s, jsonobject.getString("csrfToken"), s2, jsonobject.optString("referer", null), flag, s1, a1, 4);
            return;
        }
        a1.c(30602, a(30602, null, s, s, null, (new StringBuilder()).append(PushConstants.getErrorMsg(30602)).append(" WRONG TYPE").toString(), 0));
        return;
    }

    public void a(ArrayList arraylist)
    {
        com.baidu.android.pushservice.db.a.a().d(arraylist);
    }

    protected void a(boolean flag, String s, d d1)
    {
        if (d1.g() && flag && d1.a() != null)
        {
            com.baidu.android.pushservice.e.p.a(b, s, d1);
        }
    }

    public boolean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return com.baidu.android.pushservice.db.a.a().d(s);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, String s1, int j)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        }
        if (com.baidu.android.pushservice.db.a.a().d(s1, s))
        {
            return com.baidu.android.pushservice.db.a.a().a(s1, s, j);
        } else
        {
            return com.baidu.android.pushservice.db.a.a().b(s1, s, j);
        }
    }

    public boolean a(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return com.baidu.android.pushservice.db.a.a().a(s, flag);
        }
    }

    public int b(int j, String s, com.baidu.android.pushservice.e.a a1)
    {
        j = com.baidu.android.pushservice.db.a.a().b(j, s);
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        com.baidu.android.pushservice.db.a.a().a(null, arraylist);
        if (a1 != null)
        {
            a1.c(j);
        }
        return j;
    }

    public int b(ArrayList arraylist, com.baidu.android.pushservice.e.a a1)
    {
        int j = com.baidu.android.pushservice.db.a.a().b(arraylist);
        com.baidu.android.pushservice.db.a.a().a(arraylist, null);
        if (a1 != null)
        {
            a1.b(j);
        }
        return j;
    }

    public String b(com.baidu.android.pushservice.e.a a1)
    {
        Object obj = com.baidu.android.pushservice.db.a.a().f();
        String s = "";
        if (obj != null)
        {
            s = (new JSONArray(((java.util.Collection) (obj)))).toString();
        }
        if (TextUtils.isEmpty(s))
        {
            if (a1 != null)
            {
                a1.h(-1, null);
            }
            obj = null;
        } else
        {
            obj = s;
            if (a1 != null)
            {
                a1.h(0, s);
                return s;
            }
        }
        return ((String) (obj));
    }

    public ArrayList b(String s, int j)
    {
        return com.baidu.android.pushservice.db.a.a().a(s, j);
    }

    public void b(String s, com.baidu.android.pushservice.e.a a1)
    {
        boolean flag = com.baidu.android.pushservice.db.a.a().e(s);
        boolean flag1 = com.baidu.android.pushservice.db.a.a().g(s);
        if (a1 != null)
        {
            a1.a(flag1, flag);
        }
    }

    public void b(String s, String s1, com.baidu.android.pushservice.e.a a1)
    {
        b(null, null, s, s1, a1, false);
    }

    public void b(String s, String s1, String s2, String s3, String s4, com.baidu.android.pushservice.e.a a1)
    {
        a(new v(new l("method_del_lapp_tags", s, null), s1, s2, s3, s4, new n(this, a1), b));
    }

    public boolean b()
    {
        boolean flag1 = false;
        HashMap hashmap = com.baidu.android.pushservice.db.a.a().g();
        boolean flag = flag1;
        if (hashmap != null)
        {
            flag = flag1;
            if (!hashmap.isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean b(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        int j = com.baidu.android.pushservice.db.a.a().b(arraylist);
        com.baidu.android.pushservice.db.a.a().a(arraylist, null);
        return j >= 0;
    }

    public boolean b(String s, String s1)
    {
        boolean flag = com.baidu.android.pushservice.db.a.a().h(s1);
        if (com.baidu.android.pushservice.a.b())
        {
            if (flag)
            {
                Log.d("LightAppManager", "has registered");
            } else
            {
                Log.d("LightAppManager", "registering");
            }
        }
        if (flag)
        {
            return com.baidu.android.pushservice.db.a.a().i(s1);
        } else
        {
            return com.baidu.android.pushservice.db.a.a().c(s, s1);
        }
    }

    public boolean b(String s, String s1, String s2, String s3)
    {
        return com.baidu.android.pushservice.db.a.a().b(s, s1, s2, s3);
    }

    public int c(int j, String s, com.baidu.android.pushservice.e.a a1)
    {
        j = com.baidu.android.pushservice.db.a.a().c(j, s);
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        com.baidu.android.pushservice.db.a.a().a(null, arraylist);
        if (a1 != null)
        {
            a1.e(j);
        }
        return j;
    }

    public int c(String s)
    {
        return com.baidu.android.pushservice.db.a.a().m(s);
    }

    public int c(ArrayList arraylist, com.baidu.android.pushservice.e.a a1)
    {
        int j = com.baidu.android.pushservice.db.a.a().c(arraylist);
        com.baidu.android.pushservice.db.a.a().a(arraylist, null);
        if (a1 != null)
        {
            a1.d(j);
        }
        return j;
    }

    public ArrayList c()
    {
        return com.baidu.android.pushservice.db.a.a().h();
    }

    public boolean c(String s, int j)
    {
        return com.baidu.android.pushservice.db.a.a().b(s, j);
    }

    public boolean c(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            return com.baidu.android.pushservice.db.a.a().e(s1, s);
        }
    }

    public void d(String s, String s1)
    {
        com.baidu.android.pushservice.db.a.a().f(s, s1);
    }

    public boolean d(String s)
    {
        return com.baidu.android.pushservice.db.a.a().n(s);
    }

    public int e(String s)
    {
        return com.baidu.android.pushservice.db.a.a().b(s);
    }

    public int f(String s)
    {
        return com.baidu.android.pushservice.db.a.a().c(s);
    }

    public String g(String s)
    {
        s = com.baidu.android.pushservice.db.a.a().p(s);
        int j;
        try
        {
            s = (new JSONObject(s)).getJSONObject("thumbnails");
            j = b.getResources().getDisplayMetrics().densityDpi;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("LightAppManager", (new StringBuilder("error ")).append(s.getMessage()).toString());
            return "";
        }
        j;
        JVM INSTR lookupswitch 3: default 152
    //                   120: 87
    //                   160: 95
    //                   240: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        if (j <= 240) goto _L6; else goto _L5
_L5:
        return s.getString("XL");
_L2:
        return s.getString("S");
_L3:
        return s.getString("M");
_L4:
        return s.getString("L");
_L6:
        s = s.getString("S");
        return s;
    }

    public h h(String s)
    {
        return com.baidu.android.pushservice.db.a.a().k(s);
    }

    public String i(String s)
    {
        return com.baidu.android.pushservice.db.a.a().q(s);
    }
}
