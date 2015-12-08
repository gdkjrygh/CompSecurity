// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.a.aa;
import com.google.a.ac;
import com.google.a.x;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.al;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.template:
//            b, TemplateInfo, a, k, 
//            l

public final class j
{

    private static b a;
    private static com.roidapp.cloudlib.template.a b;
    private static ExecutorService c;
    private static boolean d;
    private static final long e[] = {
        0x77fda406L, 0x77fda407L, 0x77fda40aL
    };

    public static int a(String s)
    {
        int i1;
        new ac();
        s = ac.a(new StringReader(s)).i();
        if (s.a("data_version") == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        i1 = s.a("data_version").g();
        return i1;
        s;
        s.printStackTrace();
        return -1;
    }

    public static b a()
    {
        if (a == null)
        {
            a = new b();
        }
        return a;
    }

    public static List a(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        float f1;
        JSONObject jsonobject;
        TemplateInfo templateinfo;
        int i1;
        boolean flag1;
        boolean flag2;
        try
        {
            s = (new JSONObject(s)).getJSONArray("data");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        i1 = 0;
        if (i1 >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = s.getJSONObject(i1);
        f1 = (float)jsonobject.optDouble("version");
        flag1 = jsonobject.optBoolean("needFilter");
        flag2 = jsonobject.optBoolean("toCameraPreview", true);
        if (f1 > 4F || flag2 && flag1 && flag || flag1)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        if (al.g().f())
        {
            templateinfo = new TemplateInfo();
            templateinfo.a(f1);
            templateinfo.b(flag1);
            templateinfo.a(jsonobject.optLong("id"));
            templateinfo.b(jsonobject.optInt("download"));
            templateinfo.b(jsonobject.optInt("count"));
            templateinfo.c(jsonobject.optInt("width"));
            templateinfo.d(jsonobject.optInt("height"));
            templateinfo.b(jsonobject.optString("url"));
            templateinfo.a(jsonobject.optBoolean("supportLayout"));
            templateinfo.c(flag2);
            templateinfo.c(jsonobject.optString("templateName"));
            templateinfo.a(jsonobject.optString("downloadUrl"));
            templateinfo.d(jsonobject.optBoolean("needWeather"));
            templateinfo.e(jsonobject.optBoolean("needLock"));
            arraylist.add(templateinfo);
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
_L1:
        return arraylist;
    }

    public static void a(TemplateInfo templateinfo)
    {
        if (b != null)
        {
            com.roidapp.cloudlib.template.a.a(templateinfo);
            d = b.d(templateinfo);
            return;
        } else
        {
            d = false;
            return;
        }
    }

    public static void a(WeakReference weakreference)
    {
        if (com.roidapp.cloudlib.template.a.d() != null)
        {
            weakreference.get();
            a(true);
            d = true;
        }
    }

    public static void a(ArrayList arraylist, String s)
    {
        if (c == null)
        {
            c = Executors.newCachedThreadPool();
        }
        c.execute(new k(arraylist, s));
    }

    private static void a(boolean flag)
    {
        if (c == null)
        {
            c = Executors.newCachedThreadPool();
        }
        c.execute(new l(flag));
    }

    public static boolean a(long l1)
    {
        boolean flag1 = false;
        long al1[] = e;
        int j1 = al1.length;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < j1)
                {
                    if (al1[i1] != l1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public static com.roidapp.cloudlib.template.a b()
    {
        if (b == null)
        {
            b = new com.roidapp.cloudlib.template.a();
        }
        return b;
    }

    public static List b(String s)
    {
        return a(s, false);
    }

    public static boolean b(long l1)
    {
        return aj.a().getSharedPreferences("TemplateUtils", 0).contains(String.valueOf(l1));
    }

    public static void c()
    {
        if (a != null)
        {
            a.b();
            a = null;
        }
        if (b != null)
        {
            b.g();
            b = null;
        }
    }

    public static void c(long l1)
    {
        aj.a().getSharedPreferences("TemplateUtils", 0).edit().putInt(String.valueOf(l1), 0).apply();
    }

    public static void d()
    {
        if (b != null)
        {
            com.roidapp.cloudlib.template.a.a();
        }
    }

    public static boolean e()
    {
        return d;
    }

    public static boolean f()
    {
        boolean flag1 = false;
        TemplateInfo templateinfo = com.roidapp.cloudlib.template.a.d();
        boolean flag = flag1;
        if (templateinfo != null)
        {
            flag = flag1;
            if (templateinfo.n())
            {
                flag = flag1;
                if (templateinfo.o())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static String g()
    {
        TemplateInfo templateinfo = com.roidapp.cloudlib.template.a.d();
        if (templateinfo != null)
        {
            return templateinfo.i();
        } else
        {
            return null;
        }
    }

    public static long h()
    {
        TemplateInfo templateinfo = com.roidapp.cloudlib.template.a.d();
        if (templateinfo != null)
        {
            return templateinfo.e();
        } else
        {
            return -1L;
        }
    }

    public static boolean i()
    {
        TemplateInfo templateinfo = com.roidapp.cloudlib.template.a.d();
        return templateinfo != null && templateinfo.q();
    }

    public static void j()
    {
        a(false);
        d = false;
    }

    public static int k()
    {
        Object obj;
        int i1;
        boolean flag;
        flag = false;
        obj = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.Template/info").toString();
        i1 = ((flag) ? 1 : 0);
        if (!com.roidapp.baselib.d.a.a(((String) (obj)), false))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        FileReader filereader = new FileReader(new File(((String) (obj))));
        obj = filereader;
        new ac();
        obj = filereader;
        i1 = ac.a(filereader).i().a("data_version").g();
        Exception exception;
        Exception exception1;
        try
        {
            filereader.close();
        }
        catch (IOException ioexception)
        {
            return i1;
        }
        return i1;
        exception1;
        filereader = null;
_L4:
        obj = filereader;
        exception1.printStackTrace();
        i1 = ((flag) ? 1 : 0);
        if (filereader != null)
        {
            try
            {
                filereader.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            return 0;
        } else
        {
            break MISSING_BLOCK_LABEL_85;
        }
        exception;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
