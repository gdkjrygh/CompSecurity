// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.cm.a.a;
import com.cm.kinfoc.a.e;
import java.io.File;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.cm.kinfoc:
//            ag, y, n, z, 
//            a, r, o

public final class q
{

    private static q h = null;
    private static boolean i = false;
    private static boolean j = true;
    private static String o = null;
    private static String p = null;
    private static long q = 0L;
    private static int r = 0;
    private static final Object s = new Object();
    private Context a;
    private String b;
    private String c;
    private int d;
    private boolean e;
    private z f;
    private n g;
    private int k;
    private final Object l = new Object();
    private Map m;
    private final Object n = new Object();

    private q(Context context)
    {
        a = null;
        b = null;
        c = null;
        d = 0;
        e = true;
        f = null;
        g = null;
        k = -1;
        m = new a();
        a = context;
        if (a != null)
        {
            g();
        }
    }

    public static q a()
    {
        q q1;
        synchronized (s)
        {
            if (h == null)
            {
                h = new q(com.cm.kinfoc.a.e.a().b());
            }
            if (h.c != null && (o == null || p == null) && (long)(r * 5 * 1000) + q < System.currentTimeMillis() && r < 6)
            {
                r++;
                h.c = a(h.a);
                boolean flag = com.cm.kinfoc.ag.a;
            }
            q1 = h;
        }
        return q1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(Context context)
    {
        Object obj1 = com.cm.kinfoc.a.e.a().j();
        StringBuilder stringbuilder = new StringBuilder("");
        stringbuilder.append("uuid=");
        Object obj = c(com.cm.kinfoc.y.a(((String) (obj1))), "uuid");
        boolean flag;
        if (obj == null)
        {
            obj = "11111111111111111111111111111111";
        } else
        {
            "00000000000000000000000000000000".equals(obj);
            o = ((String) (obj));
        }
        q = System.currentTimeMillis();
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("&action=");
        stringbuilder.append(Long.toString(System.currentTimeMillis() / 1000L));
        stringbuilder.append("&xaid=");
        obj1 = c(((String) (obj1)), "xaid");
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("&ver=").append(com.cm.kinfoc.a.e.a().f());
        stringbuilder.append("&lang=");
        obj = Locale.getDefault().getCountry();
        obj1 = Locale.getDefault().getLanguage();
        if (obj == null || ((String) (obj)).equals("") || obj1 == null || ((String) (obj1)).equals(""))
        {
            obj = c(null, "lang");
        } else
        {
            obj = c((new StringBuilder()).append(((String) (obj))).append("_").append(((String) (obj1))).toString(), "lang");
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "NONE";
        }
        stringbuilder.append(((String) (obj1)));
        stringbuilder.append("&cn=");
        obj1 = c(com.cm.kinfoc.a.e.a().h(), "cn");
        obj = obj1;
        if (obj1 == null)
        {
            obj = "-1";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("&osver=").append(com.cm.kinfoc.a.e.a().m()).append("&osname=").append(com.cm.kinfoc.a.e.a().n()).append("&brand=").append(com.cm.kinfoc.a.e.a().k());
        p = c(com.cm.kinfoc.a.e.a().l(), "model");
        stringbuilder.append("&model=").append(p);
        stringbuilder.append("&net=").append(com.cm.kinfoc.y.a(context));
        flag = com.cm.kinfoc.a.e.a().d();
        obj = stringbuilder.append("&newuser=");
        if (flag)
        {
            context = "1";
        } else
        {
            context = "0";
        }
        ((StringBuilder) (obj)).append(context);
        obj = stringbuilder.append("&newusertime=");
        if (flag)
        {
            context = Long.toString(System.currentTimeMillis() / 1000L);
        } else
        {
            context = "0";
        }
        ((StringBuilder) (obj)).append(context);
        return stringbuilder.toString();
    }

    private boolean a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        if (g == null)
        {
            return false;
        }
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1 = (Boolean)m.get(s1);
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        boolean flag = boolean1.booleanValue();
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        int i1 = g.b(s1);
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        m.put(s1, Boolean.valueOf(false));
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (i1 >= 10000)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if ((int)(com.cm.kinfoc.a.e.a().g() * 10000D) <= i1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        m.put(s1, Boolean.valueOf(false));
        obj;
        JVM INSTR monitorexit ;
        return false;
        m.put(s1, Boolean.valueOf(true));
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    private boolean a(String s1, String s2, boolean flag)
    {
        boolean flag3 = true;
        if (i && e) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        if (b == null || c == null || g == null || f == null)
        {
            return false;
        }
        if (j)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        if (!flag) goto _L4; else goto _L3
_L3:
        flag1 = flag3;
        if (!a(s1)) goto _L4; else goto _L5
_L5:
        int i1;
        i1 = g.a(s1);
        flag1 = flag3;
        if (i1 == 0) goto _L4; else goto _L6
_L6:
        if (i1 >= 10000)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        if ((int)(com.cm.kinfoc.a.e.a().g() * 10000D) > i1) goto _L4; else goto _L7
_L7:
        (new StringBuilder("tableName: ")).append(s1).append(" dataString: ").append(s2);
        boolean flag2 = com.cm.kinfoc.ag.a;
        flag2 = com.cm.kinfoc.ag.a;
        byte abyte0[] = a(s1, s2, c, d, b);
        if (abyte0 == null)
        {
            flag = com.cm.kinfoc.ag.a;
            com.cm.kinfoc.a.e.a();
            if ((new File(Environment.getExternalStorageDirectory(), "__test_infoc__")).exists())
            {
                throw new NullPointerException((new StringBuilder("infoc data format error, see logcat for more details. table name: ")).append(s1).append(": ").append(s2).toString());
            } else
            {
                return false;
            }
        }
        if (flag)
        {
            f.a(abyte0, s1);
            return true;
        }
        f.a(abyte0, s1, true, 1);
        s1 = ((String) (l));
        s1;
        JVM INSTR monitorenter ;
        if (k != -1) goto _L9; else goto _L8
_L8:
        i1 = ag.b(a);
_L10:
        k = i1;
        if (k >= 30)
        {
            k = 0;
            if (f != null)
            {
                f.a();
            }
        }
        return true;
        s2;
        s1;
        JVM INSTR monitorexit ;
        throw s2;
_L9:
        i1 = k;
        i1++;
          goto _L10
    }

    static boolean a(boolean flag)
    {
        j = flag;
        return flag;
    }

    private static byte[] a(String s1, String s2, String s3, int i1, String s4)
    {
        try
        {
            s1 = com.cm.kinfoc.a.a(s1, s2, s3, i1, s4);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    public static void b()
    {
        if (i)
        {
            return;
        } else
        {
            (new r((byte)0)).start();
            return;
        }
    }

    static void b(boolean flag)
    {
        i = flag;
    }

    private static String c(String s1, String s2)
    {
        if (!"uuid".equalsIgnoreCase(s2) || s1 != null && !"00000000000000000000000000000000".equals(s1)) goto _L2; else goto _L1
_L1:
label0:
        {
            s2 = com.cm.kinfoc.a.e.a().a(s2);
            if (s2 != null)
            {
                s1 = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s1 = "00000000000000000000000000000000";
        }
_L4:
        return s1;
_L2:
        if (s1 != null && !s1.equals(""))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s2 = com.cm.kinfoc.a.e.a().a(s2);
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s2;
        if (!s2.equals("")) goto _L4; else goto _L3
_L3:
        return null;
        if (!s2.equals(""))
        {
            com.cm.kinfoc.a.e.a().a(s2, s1);
        }
        return s1;
    }

    public static boolean c()
    {
        com/cm/kinfoc/q;
        JVM INSTR monitorenter ;
        boolean flag = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        com/cm/kinfoc/q;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        (new r((byte)0)).run();
        int i1 = 5;
_L6:
        flag = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Exception exception;
        a();
        if (true) goto _L4; else goto _L3
_L3:
        JVM INSTR monitorexit ;
        throw exception;
        try
        {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedexception)
        {
            i1 = 0;
        }
        finally
        {
            com/cm/kinfoc/q;
        }
        if (i1 <= 0) goto _L4; else goto _L5
_L5:
        i1--;
          goto _L6
    }

    public static boolean d()
    {
        return i;
    }

    public static boolean e()
    {
        com.cm.kinfoc.a.e.a();
        return false;
    }

    public static boolean f()
    {
        com.cm.kinfoc.a.e.a();
        return false;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        b = com.cm.kinfoc.a.e.a().c().getAbsolutePath();
        c = a(a);
        g = new n();
        f = new z(a, g);
        d = g.a();
        int i1 = g.b();
        f.a(i1);
        com.cm.kinfoc.o.a().a(g, c, d, i1, b);
        if (c == null)
        {
            h();
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b = null;
        com.cm.kinfoc.o.a().a(null, null, -1, 0, null);
        c = null;
        g = null;
        f = null;
        d = 0;
        h();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void h()
    {
        e = false;
        if (f != null)
        {
            f.b();
        }
    }

    public final boolean a(String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (s2 != null)
            {
                flag = flag1;
                if (a(s1, s2, false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final boolean b(String s1, String s2)
    {
        return a != null && s2 != null && a(s1, s2, true);
    }

}
