// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.qihoo.antivirus.update:
//            ac, y, d, e, 
//            UpdateService, a, UpdatePatchInstall, af

public class ai
    implements ac, y
{
    private static class a
        implements FilenameFilter
    {

        public boolean a(String s)
        {
            return s.endsWith(".apk");
        }

        public boolean accept(File file, String s)
        {
            return a(s);
        }

        private a()
        {
        }

        a(a a1)
        {
            this();
        }
    }


    public boolean a;
    private final Context b;
    private d c;
    private Runnable d;

    public ai(Context context, d d1)
    {
        c = null;
        a = false;
        d = new Runnable() {

            final ai a;

            public void run()
            {
                Intent intent = new Intent(ai.a(a), com/qihoo/antivirus/update/UpdateService);
                intent.setAction("com.qihoo.action.UPDATE_NOTICE_TIMEOUT");
                ai.a(a).startService(intent);
            }

            
            {
                a = ai.this;
                super();
            }
        };
        b = context;
        c = d1;
    }

    static Context a(ai ai1)
    {
        return ai1.b;
    }

    private void a()
    {
        if (d.b == null) goto _L2; else goto _L1
_L1:
        File afile[] = (new File(d.b)).listFiles(new a(null));
        if (afile == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = afile.length;
        i = 0;
_L6:
        if (i < j) goto _L4; else goto _L2
_L2:
        return;
_L4:
        File file = afile[i];
        if (file.isFile())
        {
            String s1 = file.getName();
            String s = com.qihoo.antivirus.update.e.a(b, "product");
            if (s != null)
            {
                s = (new StringBuilder(String.valueOf(s))).append("_").toString();
            } else
            {
                s = "MyUpdate_";
            }
            if (s1.startsWith(s))
            {
                file.delete();
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(String s, Context context)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.ERROR");
            intent.putExtra("error_code", s);
            intent.putExtra("product", UpdateService.c);
            context.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
        UpdateService.a(context);
    }

    private void a(String s, String s1, String s2, String s3)
    {
        if (e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.UPDATE_OVER");
            intent.putExtra("app_path", s);
            intent.putExtra("app_version", s1);
            intent.putExtra("app_desc", s2);
            intent.putExtra("force", s3);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
        UpdateService.a(b);
    }

    private void a(String s, String s1, String s2, String s3, String s4)
    {
        if (!e())
        {
            UpdateService.a(b);
            return;
        } else
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.UPDATE_NOTICE");
            intent.putExtra("app_desc", s);
            intent.putExtra("app_patch_size", s3);
            intent.putExtra("app_size", s2);
            intent.putExtra("app_version", s1);
            intent.putExtra("force", s4);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
            (new Handler()).postDelayed(d, 0x1d4c0L);
            return;
        }
    }

    private void a(String s, String s1, String s2, String s3, String s4, boolean flag)
    {
        s2 = s4;
        if (flag)
        {
            s2 = c.a(s1).getAbsolutePath();
            if (UpdatePatchInstall.a(b, s4, s2) != 0)
            {
                d();
            }
        }
        if (UpdateService.b != 2)
        {
            b(s1, s, s3, s2);
            return;
        } else
        {
            UpdateService.a(b);
            return;
        }
    }

    private void a(boolean flag)
    {
        Intent intent = new Intent(b, com/qihoo/antivirus/update/UpdateService);
        intent.setAction("com.qihoo.action.BEGIN_UPGRADE_APP");
        intent.putExtra("extra_apk_merge", flag);
        b.startService(intent);
    }

    private boolean a(String s, String s1)
    {
        boolean flag1 = false;
        s = new File(s);
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s1))
        {
            flag = flag1;
            if (s.exists())
            {
                s = af.a(s.getAbsolutePath());
                flag = flag1;
                if (!TextUtils.isEmpty(s))
                {
                    flag = flag1;
                    if (s.equals(s1))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private void b()
    {
        String s = c.b("Update", "version");
        String s1 = c.b("Update", "description");
        c.b("Update", "versioncode");
        String s2 = c.b("Update", "size");
        Object obj = c.a(s);
        String s3 = c.b("Update", "md5");
        String s4 = c.b("Update", "force");
        String s5 = c.b("Update", "patchsize");
        String s6 = c.b("Update", "patchmd5");
        obj = ((File) (obj)).getAbsolutePath();
        if (af.a(s5, 0L) > 0L)
        {
            if (a(((String) (obj)), s3))
            {
                a(s1, s, s2, s4, ((String) (obj)), false);
                return;
            }
            if (a(f(((String) (obj))), s6))
            {
                a(s1, s, s5, s4, f(((String) (obj))), true);
                return;
            } else
            {
                a = true;
                b(s1, s, s2, s5, s4, true);
                return;
            }
        }
        if (a(((String) (obj)), s3))
        {
            a(s1, s, s2, s4, ((String) (obj)), false);
            return;
        } else
        {
            b(s1, s, s2, s5, s4, false);
            return;
        }
    }

    private void b(int i)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI");
            intent.putExtra("data_file_count", i);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    private void b(String s, String s1, String s2, String s3)
    {
        if (e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.INSTALL_NOTICE");
            intent.putExtra("app_desc", s1);
            intent.putExtra("app_path", s3);
            intent.putExtra("app_version", s);
            intent.putExtra("force", s2);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
        UpdateService.a(b);
    }

    private void b(String s, String s1, String s2, String s3, String s4, boolean flag)
    {
        if (UpdateService.b == 2 && com.qihoo.antivirus.update.e.a(b, "silent_update", true))
        {
            a(flag);
            return;
        } else
        {
            a(s, s1, s2, s3, s4);
            return;
        }
    }

    private void c()
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.CONNECT_RETRY");
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    private void c(long l, long l1)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.APP_PROGRESS");
            intent.putExtra("current", l);
            intent.putExtra("total", l1);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    private void d()
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.APK_PATCH_ERROR");
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
        UpdateService.a(b);
    }

    private void d(long l, long l1)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS");
            intent.putExtra("current", l);
            intent.putExtra("total", l1);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    private static boolean e()
    {
        return !UpdateService.f;
    }

    private String f(String s)
    {
        return (new StringBuilder(String.valueOf(s))).append(".patch").toString();
    }

    private void g(String s)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER");
            intent.putExtra("data_file_version", s);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
        UpdateService.a(b);
    }

    public void a(int i)
    {
        b(i);
    }

    public void a(int i, String s)
    {
        c();
    }

    public void a(long l, long l1)
    {
        c(l, l1);
    }

    public void a(String s)
    {
        a(s, b);
    }

    public void a(String s, String s1, int i, int j, int k, int l)
    {
        if (e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY");
            intent.putExtra("vdata_patch_name", s1);
            intent.putExtra("vdata_target_name", s);
            intent.putExtra("vdata_flag", j);
            intent.putExtra("vdata_method", k);
            intent.putExtra("vdata_version", i);
            intent.putExtra("vdata_patch_type", l);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    public void a(String s, boolean flag)
    {
        if (e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY");
            intent.putExtra("vdata_target_name", s);
            intent.putExtra("vdata_update_result", flag);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (d.b != null)
            {
                b();
                return;
            } else
            {
                a((new StringBuilder(String.valueOf(String.valueOf(1)))).append("99").toString(), b);
                return;
            }
        } else
        {
            a();
            g(com.qihoo.antivirus.update.d.a(b));
            return;
        }
    }

    public void b(int i, String s)
    {
        c();
    }

    public void b(long l, long l1)
    {
        d(l, l1);
    }

    public void b(String s)
    {
        String s2 = c.b("Update", "version");
        String s3 = c.b("Update", "description");
        String s4 = c.b("Update", "force");
        String s1 = s;
        if (a)
        {
            s1 = c.a(s2).getAbsolutePath();
            if (UpdatePatchInstall.a(b, s, s1) != 0)
            {
                d();
                return;
            }
        }
        a(s1, s2, s3, s4);
    }

    public void c(String s)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN");
            intent.putExtra("data_file_path", s);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    public void d(String s)
    {
        if (UpdateService.b == 3 && e())
        {
            Intent intent = new Intent("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END");
            intent.putExtra("data_file_path", s);
            intent.putExtra("product", UpdateService.c);
            b.sendBroadcast(intent, com.qihoo.antivirus.update.a.a);
        }
    }

    public void e(String s)
    {
        a(s, b);
    }
}
