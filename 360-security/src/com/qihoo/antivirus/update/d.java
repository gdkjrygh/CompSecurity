// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.qihoo.antivirus.update:
//            ad, e, af, f, 
//            ab, x, v, UpdateService, 
//            a, k, ac, o, 
//            ai, c, y, s, 
//            q, u

public class d
{
    private static class a
        implements FilenameFilter
    {

        private boolean a(File file, String s1)
        {
            while ((new File(file, s1)).isDirectory() || !s1.startsWith("v_")) 
            {
                return false;
            }
            return true;
        }

        public boolean accept(File file, String s1)
        {
            return a(file, s1);
        }

        private a()
        {
        }

        a(a a1)
        {
            this();
        }
    }


    static String b = null;
    private static String i = null;
    volatile String a;
    private final Context c;
    private final ad d = new ad();
    private u e;
    private boolean f;
    private String g;
    private String h;
    private String j;
    private ArrayList k;
    private long l;
    private ArrayList m;
    private o n;
    private v o;
    private c p;
    private ac q;
    private y r;

    public d(Context context)
    {
        e = null;
        f = false;
        g = null;
        a = null;
        h = null;
        j = null;
        l = 0L;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        c = context;
        b(context);
    }

    public static String a(Context context)
    {
        return com.qihoo.antivirus.update.e.a(context, "timestamp");
    }

    private static String a(InputStream inputstream)
    {
        return af.a(inputstream);
    }

    private boolean a(File file, int i1)
    {
        return file.exists() && file.isFile() && file.canRead() && (new f(file)).d == i1;
    }

    private File[] a(File file)
    {
        return file.listFiles(new a(null));
    }

    private void b(Context context)
    {
        File file = new File(context.getFilesDir(), "Update");
        if (file.exists()) goto _L2; else goto _L1
_L1:
        file.mkdirs();
_L4:
        i = file.getAbsolutePath();
        b = af.e(context);
        j = context.getFilesDir().getAbsolutePath();
        return;
_L2:
        if (!file.isDirectory())
        {
            file.delete();
            file.mkdirs();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String c(ab ab1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toHexString(ab1.d()).toUpperCase());
        stringbuilder.append(ab1.c());
        x.g(c);
        return stringbuilder.toString();
    }

    private void g(String s1)
    {
        com.qihoo.antivirus.update.e.a(c, "timestamp", s1);
    }

    private String h(String s1)
    {
        return af.a(s1);
    }

    private void l()
    {
        o = new v(this);
        o.execute(new String[0]);
    }

    private boolean m()
    {
        if (e != null && g != null)
        {
            String s1 = d.a("version");
            if (!TextUtils.isEmpty(s1) && s1.compareTo(g) > 0)
            {
                return true;
            }
        }
        return false;
    }

    private void n()
    {
        if (TextUtils.isEmpty(b("Update", "version")))
        {
            k();
        }
    }

    private String o()
    {
        return (new SimpleDateFormat("yyyy.MM.dd HH:mm:ss")).format(new Date());
    }

    public File a(String s1)
    {
        Object obj = com.qihoo.antivirus.update.e.a(c, "product");
        String s2 = ((String) (obj));
        if (obj == null)
        {
            s2 = "MyUpdate";
        }
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(s2);
        ((StringBuilder) (obj)).append("_");
        ((StringBuilder) (obj)).append("%s");
        ((StringBuilder) (obj)).append(".apk");
        s1 = String.format(((StringBuilder) (obj)).toString(), new Object[] {
            s1
        });
        return new File(b, s1);
    }

    public String a()
    {
        return j;
    }

    public String a(int i1)
    {
        StringBuilder stringbuilder1 = new StringBuilder(256);
        if (a != null)
        {
            stringbuilder1.append(a);
        }
        stringbuilder1.append("sdk=");
        stringbuilder1.append(android.os.Build.VERSION.SDK_INT);
        stringbuilder1.append("\r\n");
        stringbuilder1.append("updscene=");
        Object obj;
        StringBuilder stringbuilder;
        PackageManager packagemanager;
        File afile[];
        int j1;
        int k1;
        int l1;
        long l2;
        boolean flag;
        if (UpdateService.b == 3)
        {
            obj = "2";
        } else
        {
            obj = "0";
        }
        stringbuilder1.append(((String) (obj)));
        stringbuilder1.append("\r\n");
        stringbuilder1.append("updsetting=1\r\n");
        com.qihoo.antivirus.update.a.a = UpdateService.e;
        stringbuilder1.append("pkg=");
        stringbuilder1.append(c.getPackageName());
        stringbuilder1.append("\r\n");
        stringbuilder1.append("connect_type=");
        stringbuilder1.append(i1);
        stringbuilder1.append("\r\n");
        g = com.qihoo.antivirus.update.e.a(c, "local_pkg_version");
        if (g != null)
        {
            stringbuilder1.append("ver=");
            stringbuilder1.append(g);
            stringbuilder1.append("\r\n");
        }
        stringbuilder = null;
        packagemanager = c.getPackageManager();
        obj = stringbuilder;
        f f1;
        Object obj1;
        int i2;
        if (packagemanager != null)
        {
            try
            {
                obj = packagemanager.getPackageInfo(c.getPackageName(), 0);
                if (g == null)
                {
                    stringbuilder1.append("ver=");
                    g = ((PackageInfo) (obj)).versionName;
                    stringbuilder1.append(g);
                    stringbuilder1.append("\r\n");
                }
                obj = h(((PackageInfo) (obj)).applicationInfo.publicSourceDir);
            }
            catch (Exception exception)
            {
                exception = stringbuilder;
            }
        }
        stringbuilder = new StringBuilder();
        j1 = 0;
        k1 = 0;
        afile = a(c.getFilesDir());
        i1 = j1;
        if (afile == null) goto _L2; else goto _L1
_L1:
        i1 = j1;
        if (afile.length <= 0) goto _L2; else goto _L3
_L3:
        l1 = afile.length;
        j1 = 0;
        i1 = k1;
_L6:
        if (j1 < l1) goto _L4; else goto _L2
_L2:
        if (i1 > 0 || obj != null)
        {
            stringbuilder1.append("file_infos=");
            j1 = 0;
            if (i1 > 0)
            {
                stringbuilder1.append(stringbuilder.toString().substring(1));
                j1 = 1;
            }
            if (obj != null)
            {
                if (j1 != 0)
                {
                    stringbuilder1.append("|");
                }
                stringbuilder1.append(c.getPackageName());
                stringbuilder1.append(":");
                stringbuilder1.append(((String) (obj)));
                stringbuilder1.append(",");
                stringbuilder1.append(g);
            }
            stringbuilder1.append("\r\n");
        }
        stringbuilder1.append("date=");
        stringbuilder1.append(o());
        stringbuilder1.append("\r\n");
        obj = af.d(c);
        if (obj != null)
        {
            stringbuilder1.append("imei=");
            stringbuilder1.append(((String) (obj)));
            stringbuilder1.append("\r\n");
        }
        l2 = af.d("/data") / 0x100000L;
        if (l2 >= 0L)
        {
            stringbuilder1.append("free_disk=");
            stringbuilder1.append(l2);
            stringbuilder1.append("\r\n");
        }
        l2 = af.a();
        if (l2 > 0L)
        {
            stringbuilder1.append("cpu=");
            stringbuilder1.append(l2);
            stringbuilder1.append("\r\n");
        }
        flag = af.a(c);
        stringbuilder1.append("wifi=");
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        stringbuilder1.append(((String) (obj)));
        stringbuilder1.append("\r\n");
        obj = Build.BRAND;
        if (obj != null)
        {
            stringbuilder1.append("brand=");
            stringbuilder1.append(((String) (obj)));
            stringbuilder1.append("\r\n");
        }
        obj = Build.MODEL;
        if (obj != null)
        {
            stringbuilder1.append("model=");
            stringbuilder1.append(((String) (obj)));
            stringbuilder1.append("\r\n");
        }
        l2 = af.d(b) / 0x100000L;
        if (l2 >= 0L)
        {
            stringbuilder1.append("free_disk_x=");
            stringbuilder1.append(l2);
            stringbuilder1.append("\r\n");
        }
        obj = com.qihoo.antivirus.update.k.a(c);
        if (obj != null)
        {
            stringbuilder1.append("wid=");
            stringbuilder1.append(((String) (obj)));
            stringbuilder1.append("\r\n");
        }
        return stringbuilder1.toString();
_L4:
        obj1 = afile[j1];
        f1 = new f(((File) (obj1)));
        i2 = f1.d;
        k1 = i1;
        if (i2 >= 0)
        {
            k1 = i1 + 1;
            obj1 = h(((File) (obj1)).getAbsolutePath());
            stringbuilder.append("|");
            stringbuilder.append(f1.a);
            stringbuilder.append(":");
            stringbuilder.append(((String) (obj1)));
            stringbuilder.append(",");
            stringbuilder.append(i2);
        }
        j1++;
        i1 = k1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i1, String s1)
    {
        if (q != null)
        {
            q.b(i1, s1);
        }
    }

    public void a(long l1, long l2)
    {
        if (q != null)
        {
            q.b(l1, l2);
        }
    }

    public void a(ab ab1)
    {
        if (q != null)
        {
            q.e(c(ab1));
        }
    }

    public void a(ac ac1)
    {
        com.qihoo.antivirus.update.e.a(c, "last_checkupdate_time", System.currentTimeMillis());
        q = ac1;
        n = new o(this);
        n.execute(new Void[0]);
    }

    public void a(u u)
    {
        e = u;
    }

    public void a(File file, File file1, int i1, int j1, int k1, int l1)
    {
        if (q != null)
        {
            q.a(file.getAbsolutePath(), file1.getAbsolutePath(), i1, j1, k1, l1);
        }
    }

    public void a(File file, boolean flag)
    {
        if (q != null)
        {
            q.a(file.getAbsolutePath(), flag);
        }
    }

    void a(String s1, String s2)
    {
        if (s2 != null)
        {
            d.a(s1, s2);
        }
    }

    public void a(String s1, String s2, String s3)
    {
        if (s3 != null)
        {
            d.a(s2, s3);
        }
    }

    public void a(ArrayList arraylist)
    {
        k = arraylist;
    }

    public void a(boolean flag)
    {
        o = null;
        String s1 = d.a("timestamp");
        if (s1 != null)
        {
            StringBuilder stringbuilder = new StringBuilder(String.valueOf(s1));
            if (flag)
            {
                s1 = "B";
            } else
            {
                s1 = "A";
            }
            g(stringbuilder.append(s1).toString());
        }
        a(f, flag);
    }

    public void a(boolean flag, y y1)
    {
        String s1;
        String s2;
        String s3;
label0:
        {
            r = y1;
            if (p == null)
            {
                n();
                s3 = b("Update", "version");
                if (flag)
                {
                    s1 = b("Update", "patchurl");
                    s2 = b("Update", "patchmd5");
                    y1 = b("Update", "patchsize");
                } else
                {
                    s1 = b("Update", "url");
                    s2 = b("Update", "md5");
                    y1 = b("Update", "size");
                }
                if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(y1))
                {
                    break label0;
                }
                ai.a((new StringBuilder(String.valueOf(String.valueOf(3)))).append("96").toString(), c);
            }
            return;
        }
        long l1 = af.a(y1, 0L);
        if (!TextUtils.isEmpty(s3))
        {
            if (b != null)
            {
                p = new c(this, s1, a(s3).getAbsolutePath(), s2, l1, flag);
                p.execute(new String[0]);
                return;
            } else
            {
                ai.a((new StringBuilder(String.valueOf(String.valueOf(3)))).append("98").toString(), c);
                return;
            }
        } else
        {
            ai.a((new StringBuilder(String.valueOf(String.valueOf(3)))).append("97").toString(), c);
            return;
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (q != null)
        {
            q.a(flag, flag1);
        }
    }

    public File b(String s1)
    {
        if (s1.startsWith(File.separator))
        {
            return new File(s1);
        } else
        {
            return new File(a(), s1);
        }
    }

    public String b()
    {
        return i;
    }

    public String b(String s1, String s2)
    {
        return d.a(s2);
    }

    public void b(int i1, String s1)
    {
        if (r != null)
        {
            r.a(i1, s1);
        }
    }

    public void b(long l1, long l2)
    {
        if (r != null)
        {
            r.a(l1, l2);
        }
    }

    public void b(ab ab1)
    {
        if (r != null)
        {
            r.a(c(ab1));
        }
    }

    public void b(ArrayList arraylist)
    {
        m = arraylist;
    }

    public long c()
    {
        return l;
    }

    public File c(String s1)
    {
        Object obj = null;
        String s2 = (new File(s1)).getName();
        s1 = obj;
        if (!TextUtils.isEmpty(s2))
        {
            s1 = new File(b(), s2);
        }
        return s1;
    }

    public ArrayList c(ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        String s1;
        ArrayList arraylist1;
        Iterator iterator;
        s1 = c.getFilesDir().getAbsolutePath();
        arraylist1 = new ArrayList();
        iterator = arraylist.iterator();
_L3:
        boolean flag;
        Object obj;
        s s2;
        boolean flag1;
        if (!iterator.hasNext())
        {
            if (arraylist1.isEmpty())
            {
                return null;
            } else
            {
                return arraylist1;
            }
        }
        s2 = (s)iterator.next();
        if (s2.c() != null)
        {
            obj = (new StringBuilder(String.valueOf(s2.b()))).append(".patch").toString();
            arraylist = s2.d();
        } else
        {
            obj = s2.b();
            arraylist = s2.g();
        }
        obj = b(((String) (obj)));
        if (((File) (obj)).getAbsolutePath().startsWith(s1))
        {
            Object obj1 = ((File) (obj)).getName();
            obj1 = af.b(c, ((String) (obj1)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_264;
            }
            obj1 = a(((InputStream) (obj1)));
            if (TextUtils.isEmpty(((CharSequence) (obj1))) || !((String) (obj1)).equals(arraylist))
            {
                break MISSING_BLOCK_LABEL_264;
            }
            flag = true;
        } else
        {
            if (!((File) (obj)).exists())
            {
                break MISSING_BLOCK_LABEL_264;
            }
            String s3 = h(((File) (obj)).getAbsolutePath());
            if (TextUtils.isEmpty(s3) || !s3.equals(arraylist))
            {
                break MISSING_BLOCK_LABEL_264;
            }
            flag = true;
        }
_L4:
        flag1 = flag;
        if (!flag)
        {
            flag1 = a(((File) (obj)), s2.j());
        }
        if (!flag1)
        {
            arraylist1.add(s2);
        }
          goto _L3
_L2:
        return null;
        flag = false;
          goto _L4
    }

    public ArrayList d()
    {
        return k;
    }

    public void d(String s1)
    {
        if (q != null)
        {
            q.c(s1);
        }
    }

    public Context e()
    {
        return c;
    }

    public void e(String s1)
    {
        if (q != null)
        {
            q.d(s1);
        }
    }

    public void f()
    {
        if (m == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = m.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        b(((q)iterator.next()).a()).delete();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void f(String s1)
    {
        p = null;
        if (r != null)
        {
            r.b(s1);
        }
    }

    public ad g()
    {
        return d;
    }

    public void h()
    {
        Iterator iterator;
        int i1;
        i1 = i();
        f = m();
        if (q != null)
        {
            q.a(i1);
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        l = 0L;
        iterator = k.iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        l();
_L4:
        n = null;
        return;
_L2:
        s s1 = (s)iterator.next();
        if (s1.e() != 0L)
        {
            l = l + s1.e();
        } else
        {
            l = l + s1.h();
        }
          goto _L3
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
          goto _L4
    }

    public int i()
    {
        if (k != null && k.size() > 0)
        {
            return k.size();
        } else
        {
            return 0;
        }
    }

    public void j()
    {
        Context context = c;
        String s3 = b("Update", "version");
        String s4 = b("Update", "versioncode");
        String s5 = b("Update", "force");
        String s2 = b("Update", "description");
        String s1 = s2;
        if (!TextUtils.isEmpty(s2))
        {
            s1 = s2.replaceAll("\n", "\\\\n");
        }
        s2 = b("Update", "url");
        String s6 = b("Update", "size");
        String s7 = b("Update", "md5");
        String s8 = b("Update", "patchurl");
        String s9 = b("Update", "patchsize");
        String s10 = b("Update", "patchmd5");
        com.qihoo.antivirus.update.e.a(context, "version", s3);
        com.qihoo.antivirus.update.e.a(context, "versioncode", s4);
        com.qihoo.antivirus.update.e.a(context, "force", s5);
        com.qihoo.antivirus.update.e.a(context, "description", s1);
        com.qihoo.antivirus.update.e.a(context, "url", s2);
        com.qihoo.antivirus.update.e.a(context, "size", s6);
        com.qihoo.antivirus.update.e.a(context, "md5", s7);
        com.qihoo.antivirus.update.e.a(context, "patchurl", s8);
        com.qihoo.antivirus.update.e.a(context, "patchsize", s9);
        com.qihoo.antivirus.update.e.a(context, "patchmd5", s10);
    }

    public void k()
    {
        Object obj = c;
        String s3 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "version");
        String s4 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "versioncode");
        String s5 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "force");
        String s2 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "description");
        String s1 = s2;
        if (!TextUtils.isEmpty(s2))
        {
            s1 = s2.replaceAll("\\\\n", "\n");
        }
        s2 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "url");
        String s6 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "size");
        String s7 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "md5");
        String s8 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "patchurl");
        String s9 = com.qihoo.antivirus.update.e.a(((Context) (obj)), "patchsize");
        obj = com.qihoo.antivirus.update.e.a(((Context) (obj)), "patchmd5");
        a("Update", "version", s3);
        if (s4 != null)
        {
            a("Update", "versioncode", s4);
        }
        a("Update", "url", s2);
        a("Update", "size", s6);
        a("Update", "md5", s7);
        a("Update", "patchurl", s8);
        a("Update", "patchsize", s9);
        a("Update", "patchmd5", ((String) (obj)));
        a("Update", "force", s5);
        a("Update", "description", s1);
    }

}
