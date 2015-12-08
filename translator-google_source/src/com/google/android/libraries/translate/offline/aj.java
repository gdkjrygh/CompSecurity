// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.translate.d.d;
import com.google.android.libraries.translate.d.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ad, ai, e, OfflinePackage, 
//            ProfileManagerV2Profile, x, TranslateLocationProfileProf, ak, 
//            j, LocationProfileProf

public final class aj extends ad
    implements ai
{

    int k;

    public aj(Context context, TranslateLocationProfileProf translatelocationprofileprof, e e1)
    {
        super(context, translatelocationprofileprof, e1);
        k = d.getInt("key_rr_version", -1);
    }

    private String a(e e1, int i1, int j1, String s)
    {
        e1 = new StringBuilder(a(e1, i1, j1));
        if (TextUtils.equals(s, "en"))
        {
            e1.append("/c");
        } else
        {
            e1.append("/");
            e1.append(s);
        }
        e1.append("/");
        e1.append("lmt");
        e1.append("_");
        e1.append(s);
        e1.append(".bin");
        return e1.toString();
    }

    private String a(e e1, int i1, int j1, String s, String s1)
    {
        s = a(e1, i1, j1, s, s1, "fqs", "bin");
        if (e1.a(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    private String a(e e1, int i1, int j1, String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder(a(e1, i1, j1));
        stringbuilder.append("/");
        stringbuilder.append(l(s1, s2));
        stringbuilder.append("/");
        stringbuilder.append(s);
        stringbuilder.append(".bin");
        if (e1.a(stringbuilder.toString()))
        {
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    private String a(e e1, int i1, int j1, String s, String s1, String s2, String s3)
    {
        e1 = new StringBuilder(a(e1, i1, j1));
        e1.append("/");
        e1.append(l(s, s1));
        e1.append("/");
        e1.append(s2);
        e1.append("_");
        e1.append(s);
        e1.append("_");
        e1.append(s1);
        e1.append(".");
        e1.append(s3);
        return e1.toString();
    }

    private List a(e e1, OfflinePackage offlinepackage, boolean flag, boolean flag1)
    {
        ArrayList arraylist = new ArrayList();
        String s = offlinepackage.a;
        if (ProfileManagerV2Profile.b(s))
        {
            return arraylist;
        }
        int i1 = offlinepackage.g;
        int j1 = offlinepackage.h;
        a(((List) (arraylist)), a(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), a(e1, i1, j1, "en", s));
        a(((List) (arraylist)), c(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), c(e1, i1, j1, "en", s));
        a(((List) (arraylist)), e(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), e(e1, i1, j1, "en", s));
        a(((List) (arraylist)), b(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), b(e1, i1, j1, "en", s));
        a(((List) (arraylist)), a(e1, i1, j1, s));
        a(((List) (arraylist)), f(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), f(e1, i1, j1, "en", s));
        a(((List) (arraylist)), d(e1, i1, j1, s, "en"));
        a(((List) (arraylist)), d(e1, i1, j1, "en", s));
        if (flag)
        {
            a(((List) (arraylist)), c(e1, i1, j1));
            a(((List) (arraylist)), a(e1, i1, j1, "en"));
            a(((List) (arraylist)), d(e1, i1, j1));
            if (flag1)
            {
                for (e1 = e1.c(b(e1, i1, j1)).iterator(); e1.hasNext(); a(((List) (arraylist)), (String)e1.next())) { }
            }
        }
        return arraylist;
    }

    private static void a(List list, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            list.add(s);
        }
    }

    private String b(e e1, int i1, int j1, String s, String s1)
    {
        e1 = new StringBuilder(a(e1, i1, j1));
        e1.append("/");
        e1.append(l(s, s1));
        e1.append("/c_");
        e1.append(s);
        e1.append("_");
        e1.append(s1);
        e1.append(".txt");
        return e1.toString();
    }

    private String c(e e1, int i1, int j1)
    {
        return String.valueOf(a(e1, i1, j1)).concat("/c/c.txt");
    }

    private String c(e e1, int i1, int j1, String s, String s1)
    {
        s = a(e1, i1, j1, s, s1, "fqt", "bin");
        if (e1.a(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    private String d(e e1, int i1, int j1)
    {
        return String.valueOf(a(e1, i1, j1)).concat("/c/p.bin");
    }

    private String d(e e1, int i1, int j1, String s, String s1)
    {
        return a(e1, i1, j1, s, s1, "ptt", "bin");
    }

    private String e(e e1, int i1, int j1, String s, String s1)
    {
        s = a(e1, i1, j1, s, s1, "frq", "txt");
        if (e1.a(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    private String f(e e1, int i1, int j1, String s, String s1)
    {
        return a(e1, i1, j1, s, s1, "pts", "bin");
    }

    private static String l(String s, String s1)
    {
        if (TextUtils.equals(s, "en"))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    private String r()
    {
        return a(j, "rapid", a, b);
    }

    public final String a(String s, String s1)
    {
        return e(j, a, b, s, s1);
    }

    protected final boolean a(e e1, OfflinePackage offlinepackage)
    {
        boolean flag = false;
        offlinepackage = a(e1, offlinepackage, true, false).iterator();
        int i1 = 0;
        do
        {
            if (!offlinepackage.hasNext())
            {
                break;
            }
            if (!e1.a((String)offlinepackage.next()))
            {
                i1++;
            }
        } while (true);
        if (i1 == 0)
        {
            flag = true;
        }
        return flag;
    }

    final String b(e e1, int i1, int j1)
    {
        e1 = new StringBuilder(a(e1, i1, j1));
        e1.append("/c_p");
        return e1.toString();
    }

    public final String b(String s)
    {
        return a(j, a, b, s);
    }

    public final String b(String s, String s1)
    {
        return a(j, a, b, "sc2tc_ur", s, s1);
    }

    public final String c(String s, String s1)
    {
        return a(j, a, b, "sc2tc_br", s, s1);
    }

    public final String d(String s, String s1)
    {
        return a(j, a, b, "tc2sc_ur", s, s1);
    }

    public final String e(String s, String s1)
    {
        return a(j, a, b, "tc2sc_br", s, s1);
    }

    protected final void e(OfflinePackage offlinepackage)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = g.iterator();
        int i1 = 0;
_L2:
        OfflinePackage offlinepackage1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        offlinepackage1 = (OfflinePackage)((Iterator) (obj)).next();
        if (!offlinepackage1.f && offlinepackage.a().equals(offlinepackage1.a()))
        {
            i1++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj = j;
        boolean flag;
        if (i1 <= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (offlinepackage = a(((e) (obj)), offlinepackage, flag, true).iterator(); offlinepackage.hasNext(); j.d(((String) (obj))))
        {
            obj = (String)offlinepackage.next();
        }

        break MISSING_BLOCK_LABEL_136;
        offlinepackage;
        throw offlinepackage;
        this;
        JVM INSTR monitorexit ;
    }

    public final String f(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder(a(j, a, b));
        stringbuilder.append("/c_p/rr_");
        stringbuilder.append(s);
        stringbuilder.append("_");
        stringbuilder.append(s1);
        return stringbuilder.toString();
    }

    public final String g(String s, String s1)
    {
        return f(j, a, b, s, s1);
    }

    public final String h(String s, String s1)
    {
        return b(j, a, b, s, s1);
    }

    protected final String i()
    {
        return "ol";
    }

    public final String i(String s, String s1)
    {
        return d(j, a, b, s, s1);
    }

    protected final int j()
    {
        return 3;
    }

    public final String j(String s, String s1)
    {
        return a(j, a, b, s, s1);
    }

    protected final String k()
    {
        return "pmv2_com_mv";
    }

    public final String k(String s, String s1)
    {
        return c(j, a, b, s, s1);
    }

    protected final String l()
    {
        return "pmv2_fl_mv";
    }

    protected final String m()
    {
        return "pmv2_pkg_mv";
    }

    public final void n()
    {
        this;
        JVM INSTR monitorenter ;
        String s = ((TranslateLocationProfileProf)i).g;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (((TranslateLocationProfileProf)i).h > k) goto _L4; else goto _L3
_L3:
        int i1 = ((TranslateLocationProfileProf)i).h;
        i1 = k;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        (new ak(this, new g(s, new d(r())), new j(this, b, s, r(), i.b))).a(new Void[0]);
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final String o()
    {
        return c(j, a, b);
    }

    public final String p()
    {
        return d(j, a, b);
    }

    public final String q()
    {
        StringBuilder stringbuilder = new StringBuilder(a(j, a, b));
        stringbuilder.append("/");
        stringbuilder.append("ko");
        stringbuilder.append("/ko_s");
        if (j.a(stringbuilder.toString()))
        {
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }
}
