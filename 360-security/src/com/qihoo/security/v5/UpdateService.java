// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.collect.Maps;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.security.clearengine.b.a;
import com.qihoo.security.locale.c;
import com.qihoo.security.locale.d;
import com.qihoo.security.service.BsPatchService;
import com.qihoo.security.service.e;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.HashUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.qihoo.security.v5:
//            c, b, UpdatedDialog, f, 
//            d, a, DownloadStatus

public class UpdateService extends UiProcessService
{
    public class a extends Binder
    {

        final UpdateService a;

        public UpdateService a()
        {
            return a;
        }

        public a()
        {
            a = UpdateService.this;
            super();
        }
    }


    private static com.qihoo.security.clearengine.b.a.a j = new com.qihoo.security.clearengine.b.a.a() {

        public void a(int i1, int j1)
        {
            this;
            JVM INSTR monitorenter ;
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            com.qihoo.security.support.b.b(18015, i1, j1);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

    };
    private int c;
    private int d;
    private com.qihoo.security.v5.b e;
    private boolean f;
    private final IBinder g = new a();
    private long h;
    private Map i;
    private final BroadcastReceiver k = new BroadcastReceiver() {

        final UpdateService a;

        public void onReceive(Context context, Intent intent)
        {
            Object obj = intent.getAction();
            if (!"com.qihoo.antivirus.update.action.UPDATE_NOTICE".equals(obj)) goto _L2; else goto _L1
_L1:
            Bundle bundle;
            com.qihoo.security.support.b.b(27023);
            com.qihoo.security.v5.f.a(com.qihoo.security.v5.UpdateService.a(a));
            com.qihoo.security.v5.UpdateService.b(a);
            bundle = intent.getExtras();
            context = null;
            if (bundle != null)
            {
                intent = com.qihoo.security.v5.d.a(bundle);
                context = intent;
                if (intent != null)
                {
                    context = bundle.getString("app_version");
                    com.qihoo.security.v5.a.a(com.qihoo.security.v5.UpdateService.c(a), context);
                    context = intent;
                }
            }
            if (com.qihoo.security.v5.UpdateService.a(a, com.qihoo.security.v5.UpdateService.d(a), ((String) (obj)))) goto _L4; else goto _L3
_L3:
            if (com.qihoo.security.v5.UpdateService.d(a) == 3001)
            {
                context = new Bundle();
                context.putInt("UPDATE_TYPE", 2);
                context.putInt("type", com.qihoo.security.v5.UpdateService.d(a));
                com.qihoo.security.v5.UpdateService.a(a, context);
            }
            a.stopSelf();
_L14:
            return;
_L4:
            if (context != null)
            {
                if (((com.qihoo.security.v5.d) (context)).e)
                {
                    com.qihoo.security.v5.UpdateService.a(a, bundle, ((com.qihoo.security.v5.d) (context)).c);
                }
            } else
            {
                com.qihoo.utils.notice.a.a().b(4105);
            }
            bundle.putInt("UPDATE_TYPE", 1);
            if (!com.qihoo.security.v5.UpdateService.e(a)) goto _L6; else goto _L5
_L5:
            bundle.putInt("type", com.qihoo.security.v5.UpdateService.d(a));
            com.qihoo.security.v5.UpdateService.a(a, bundle);
_L7:
            a.stopSelf();
            return;
_L6:
            if (bundle != null)
            {
                com.qihoo.utils.notice.a.a().a(bundle);
                com.qihoo.security.support.b.b(27015);
            }
            if (true) goto _L7; else goto _L2
_L2:
            if (!"com.qihoo.antivirus.update.action.INSTALL_NOTICE".equals(obj)) goto _L9; else goto _L8
_L8:
            com.qihoo.security.support.b.b(27023);
            com.qihoo.security.v5.f.a(UpdateService.f(a));
            obj = intent.getStringExtra("app_path");
            intent = intent.getStringExtra("app_version");
            com.qihoo.security.v5.a.a(UpdateService.g(a), intent);
            UpdateService.h(a);
            if (com.qihoo.security.v5.UpdateService.d(a) != 0) goto _L11; else goto _L10
_L10:
            com.qihoo.utils.notice.a.a().c(((String) (obj)));
            com.qihoo.security.support.b.b(27015);
_L12:
            a.stopSelf();
            return;
_L11:
            if (com.qihoo.security.v5.UpdateService.d(a) == 3002)
            {
                com.qihoo360.mobilesafe.b.r.a(context, ((String) (obj)));
            } else
            if (com.qihoo.security.v5.UpdateService.d(a) == 3001)
            {
                context = new Bundle();
                context.putInt("UPDATE_TYPE", 2);
                context.putInt("type", com.qihoo.security.v5.UpdateService.d(a));
                com.qihoo.security.v5.UpdateService.a(a, context);
            }
            if (true) goto _L12; else goto _L9
_L9:
            if (!"com.qihoo.antivirus.update.action.APP_PROGRESS".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            long l2 = intent.getLongExtra("current", 0L);
            long l6 = intent.getLongExtra("total", 0L);
            if (l6 > 0L && l2 <= l6)
            {
                int i1 = (int)((l2 * 100L) / l6);
                com.qihoo.utils.notice.a.a().a(i1);
                return;
            }
            if (true) goto _L14; else goto _L13
_L13:
            if (!"com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            obj = intent.getStringExtra("vdata_target_name");
            String s1 = intent.getStringExtra("vdata_patch_name");
            int j1 = intent.getIntExtra("vdata_method", 0);
            int i2 = intent.getIntExtra("vdata_flag", 0);
            int j2 = intent.getIntExtra("vdata_version", 0);
            int k2 = intent.getIntExtra("vdata_patch_type", 0);
            if (j1 == 1001)
            {
                context.startService((new Intent(context, com/qihoo/security/service/BsPatchService)).setAction("com.qihoo.security.action.ACTION_BSPATCH").putExtra("patch_path", s1).putExtra("target_path", ((String) (obj))));
            }
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).a(((String) (obj)), s1, j1, i2, j2, k2);
                return;
            }
            if (true) goto _L14; else goto _L15
_L15:
            if (!"com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            context = intent.getStringExtra("vdata_target_name");
            boolean flag = intent.getBooleanExtra("vdata_update_result", false);
            if (!flag)
            {
                a.a(context);
            }
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).a(context, flag);
                return;
            }
            if (flag)
            {
                UpdateService.k(a);
                return;
            }
            if (com.qihoo.security.v5.UpdateService.d(a) == 3001 && !TextUtils.isEmpty(context) && context.endsWith(".apk"))
            {
                com.qihoo360.mobilesafe.b.r.a(UpdateService.l(a), context);
                return;
            }
            if (true) goto _L14; else goto _L16
_L16:
            if ("com.qihoo.antivirus.update.action.APK_PATCH_ERROR".equals(obj))
            {
                UpdateService.k(a);
                a.stopSelf();
                return;
            }
            if ("com.qihoo.antivirus.update.action.CONNECT_RETRY".equals(obj))
            {
                com.qihoo.security.support.b.a(27026, com.qihoo.security.v5.UpdateService.d(a));
                if (UpdateService.m(a) < 10)
                {
                    UpdateService.n(a);
                }
                if (UpdateService.i(a) != null && !UpdateService.j(a))
                {
                    UpdateService.i(a).a();
                    return;
                } else
                {
                    com.qihoo.security.v5.f.a(UpdateService.o(a), DownloadStatus.PENDING, 0);
                    return;
                }
            }
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            context = intent.getStringExtra("data_file_path");
            UpdateService.p(a).put(context, Long.valueOf(System.currentTimeMillis()));
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).a(context);
                return;
            }
            if (true) goto _L14; else goto _L17
_L17:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            intent = intent.getStringExtra("data_file_path");
            if (UpdateService.p(a).containsKey(intent))
            {
                long l3 = ((Long)UpdateService.p(a).get(intent)).longValue();
                l3 = System.currentTimeMillis() - l3;
                if (l3 > 0L && l3 < 0x36ee80L)
                {
                    com.qihoo.security.support.b.a(27025, intent, String.valueOf(l3));
                }
            }
            obj = intent.split("/");
            if (obj != null && obj.length > 0)
            {
                obj = obj[obj.length - 1];
                if ("avedb.zip".equals(obj))
                {
                    if (com.qihoo.security.v5.UpdateService.d(a) == 0 && com.qihoo.security.service.e.a(context))
                    {
                        com.qihoo.utils.notice.a.a().b();
                    }
                    SharedPref.a(com.qihoo.security.v5.UpdateService.q(a), "malware_update_timestamp", System.currentTimeMillis());
                    com.qihoo.security.support.b.a(14314, Utils.bytesToHexString(HashUtil.getFileHash("MD5", new File(intent))), "");
                } else
                if ("b_g.dat".equals(obj))
                {
                    com.qihoo.security.gamebooster.b.a().i();
                }
            }
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).d(intent);
                return;
            }
            if (true) goto _L14; else goto _L18
_L18:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            int k1 = intent.getIntExtra("data_file_count", 0);
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).b(k1);
                return;
            }
            if (true) goto _L14; else goto _L19
_L19:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS".equals(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            long l4 = intent.getLongExtra("current", 0L);
            long l7 = intent.getLongExtra("total", 0L);
            int l1;
            if (l7 > 0L && l4 <= l7)
            {
                l1 = (int)((100L * l4) / l7);
            }
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).a(l4, l7);
                return;
            }
            if (true) goto _L14; else goto _L20
_L20:
            if ("com.qihoo.antivirus.update.action.ERROR".equals(obj))
            {
                context = intent.getStringExtra("error_code");
                long l5 = System.currentTimeMillis() - com.qihoo.security.v5.UpdateService.r(a);
                if (l5 > 0L && l5 < 0x36ee80L)
                {
                    com.qihoo.security.support.b.a(27030, String.valueOf(com.qihoo.security.v5.UpdateService.d(a)), String.valueOf(l5 / 1000L));
                }
                try
                {
                    com.qihoo.security.support.b.a(27022, Integer.parseInt(context));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent) { }
                if (UpdateService.i(a) != null && !UpdateService.j(a))
                {
                    UpdateService.i(a).c(context);
                    a.stopSelf();
                    return;
                } else
                {
                    com.qihoo.security.v5.f.a(UpdateService.s(a));
                    UpdateService.k(a);
                    a.stopSelf();
                    return;
                }
            }
            if (!"com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER".equals(obj)) goto _L14; else goto _L21
_L21:
            context = intent.getStringExtra("data_file_version");
            SharedPref.d(UpdateService.t(a), context);
            com.qihoo.security.support.b.b(27023);
            if (UpdateService.i(a) != null && !UpdateService.j(a))
            {
                UpdateService.i(a).b(context);
                a.stopSelf();
                return;
            }
            com.qihoo.security.v5.f.a(UpdateService.u(a));
            if (com.qihoo.security.v5.UpdateService.d(a) != 3001 && com.qihoo.security.v5.UpdateService.d(a) != 1002) goto _L23; else goto _L22
_L22:
            context = new Bundle();
            context.putInt("UPDATE_TYPE", 2);
            context.putInt("type", com.qihoo.security.v5.UpdateService.d(a));
            com.qihoo.security.v5.UpdateService.a(a, context);
_L25:
            a.stopSelf();
            return;
_L23:
            if (com.qihoo.security.v5.UpdateService.d(a) == 3002)
            {
                context = new Bundle();
                context.putInt("UPDATE_TYPE", 0);
                context.putInt("type", com.qihoo.security.v5.UpdateService.d(a));
                com.qihoo.security.v5.UpdateService.a(a, context);
            }
            if (true) goto _L25; else goto _L24
_L24:
        }

            
            {
                a = UpdateService.this;
                super();
            }
    };

    public UpdateService()
    {
        c = 0;
        i = Maps.newHashMap();
    }

    static Context a(UpdateService updateservice)
    {
        return updateservice.b;
    }

    public static void a()
    {
        if (SharedPref.b(SecurityApplication.a(), "setting_auto_update", true));
        if (Calendar.getInstance().get(12) % 30 != 0)
        {
            Context context = SecurityApplication.a();
            com.qihoo.security.clearengine.b.a.a(context, null, 2, com.qihoo.security.locale.d.b(context), j);
            long l1 = SharedPref.b(SecurityApplication.a(), "sp.key.update.check.timestp", 0L);
            long l2 = System.currentTimeMillis();
            if (l2 <= l1 || l2 - l1 > 0x5265c00L)
            {
                Intent intent = new Intent(context, com/qihoo/security/v5/UpdateService);
                intent.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
                intent.putExtra("update_in_background", true);
                if (SharedPref.b(context, "key_malware_is_avc", false))
                {
                    intent.putExtra("type", 1002);
                } else
                {
                    intent.putExtra("type", 0);
                }
                context.startService(intent);
                return;
            }
        }
    }

    private void a(int i1, Intent intent)
    {
        intent = new HashMap();
        intent.put("i18ntype", (new StringBuilder()).append("").append(i1).toString());
        String s1 = b(com.qihoo.security.locale.c.b(this));
        Object obj = Locale.getDefault();
        String s3 = b(((Locale) (obj)).getLanguage());
        obj = b(((Locale) (obj)).getCountry());
        intent.put("applang", s1);
        intent.put("syslang1", s3);
        intent.put("syslang2", obj);
        i1;
        JVM INSTR lookupswitch 4: default 140
    //                   0: 224
    //                   2001: 140
    //                   3001: 233
    //                   4001: 140;
           goto _L1 _L2 _L1 _L3 _L1
_L1:
        int j1;
        String s2 = com.qihoo.security.v5.c.a();
        j1 = com.qihoo.security.v5.c.a(b, 3, s2, intent);
        e();
        com.qihoo.security.support.b.a(27021, j1);
        h = System.currentTimeMillis();
        if (j1 == 0)
        {
            SharedPref.a(b, "sp.key.update.check.timestp", System.currentTimeMillis());
            c = i1;
        }
        if (e != null && !g())
        {
            e.a(j1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        com.qihoo.security.support.b.b(27028);
        continue; /* Loop/switch isn't completed */
_L3:
        com.qihoo.security.clearengine.b.a.a(b, null, 8, com.qihoo.security.locale.d.b(b), j);
        if (true) goto _L1; else goto _L4
_L4:
        switch (j1)
        {
        case -2: 
        default:
            return;

        case -3: 
            c();
            return;

        case 0: // '\0'
            d();
            return;

        case -1: 
            c();
            return;
        }
    }

    private void a(Bundle bundle)
    {
        Intent intent = new Intent(b, com/qihoo/security/v5/UpdatedDialog);
        intent.addFlags(0x10000000);
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        b.startActivity(intent);
    }

    private void a(Bundle bundle, String s1)
    {
        com.qihoo360.mobilesafe.b.r.a(bundle, (new File(getFilesDir(), "v5/saved/info")).getAbsolutePath());
        SharedPref.a(b, "skfutv", s1);
    }

    static void a(UpdateService updateservice, Bundle bundle)
    {
        updateservice.a(bundle);
    }

    static void a(UpdateService updateservice, Bundle bundle, String s1)
    {
        updateservice.a(bundle, s1);
    }

    private boolean a(int i1, String s1)
    {
        return i1 == 3002 || i1 == 0;
    }

    static boolean a(UpdateService updateservice, int i1, String s1)
    {
        return updateservice.a(i1, s1);
    }

    private String b(String s1)
    {
        if (s1 == null)
        {
            return "";
        } else
        {
            return s1.toLowerCase();
        }
    }

    private void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.antivirus.update.action.INSTALL_NOTICE");
        intentfilter.addAction("com.qihoo.antivirus.update.action.UPDATE_NOTICE");
        intentfilter.addAction("com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY");
        intentfilter.addAction("com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY");
        intentfilter.addAction("com.qihoo.antivirus.update.action.APK_PATCH_ERROR");
        intentfilter.addAction("com.qihoo.antivirus.update.action.CONNECT_RETRY");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS");
        intentfilter.addAction("com.qihoo.antivirus.update.action.ERROR");
        intentfilter.addAction("com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER");
        registerReceiver(k, intentfilter, "com.qihoo.security.lite.PERMISSION", null);
    }

    static void b(UpdateService updateservice)
    {
        updateservice.d();
    }

    static Context c(UpdateService updateservice)
    {
        return updateservice.b;
    }

    private void c()
    {
        while (c != 3001 || !f() || !com.qihoo360.mobilesafe.b.a.d(b)) 
        {
            return;
        }
        com.qihoo360.mobilesafe.b.q.a().a(0x7f0c0188, 0x7f020142);
    }

    static int d(UpdateService updateservice)
    {
        return updateservice.c;
    }

    private void d()
    {
        File file = new File(getFilesDir(), "v5/saved/info");
        if (file != null && file.exists() && file.isFile())
        {
            file.delete();
        }
        SharedPref.a(b, "skfutv", "0.0.0.0");
    }

    private void e()
    {
        com.qihoo.security.support.b.a(27020, com.qihoo.security.locale.language.b.d(this));
    }

    static boolean e(UpdateService updateservice)
    {
        return updateservice.f();
    }

    static Context f(UpdateService updateservice)
    {
        return updateservice.b;
    }

    private boolean f()
    {
        return !f;
    }

    static Context g(UpdateService updateservice)
    {
        return updateservice.b;
    }

    private boolean g()
    {
        return c == 0 || c == 3001 || c == 1002;
    }

    private void h()
    {
        if (!SecurityApplication.b())
        {
            com.qihoo.antivirus.update.b.a(b, "i18n_security_lite", 0);
        }
    }

    static void h(UpdateService updateservice)
    {
        updateservice.h();
    }

    static com.qihoo.security.v5.b i(UpdateService updateservice)
    {
        return updateservice.e;
    }

    static boolean j(UpdateService updateservice)
    {
        return updateservice.g();
    }

    static void k(UpdateService updateservice)
    {
        updateservice.c();
    }

    static Context l(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static int m(UpdateService updateservice)
    {
        return updateservice.d;
    }

    static int n(UpdateService updateservice)
    {
        int i1 = updateservice.d;
        updateservice.d = i1 + 1;
        return i1;
    }

    static Context o(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Map p(UpdateService updateservice)
    {
        return updateservice.i;
    }

    static Context q(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static long r(UpdateService updateservice)
    {
        return updateservice.h;
    }

    static Context s(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context t(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context u(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context v(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context w(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context x(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context y(UpdateService updateservice)
    {
        return updateservice.b;
    }

    static Context z(UpdateService updateservice)
    {
        return updateservice.b;
    }

    public void a(com.qihoo.security.v5.b b1)
    {
        e = b1;
    }

    protected void a(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        InputStream inputstream;
        boolean flag;
        boolean flag1;
        boolean flag2;
        s1 = s1.substring(s1.lastIndexOf("/") + 1);
        if ("o_c_spb.dat".equals(s1) || "lock_screen.dat".equals(s1) || "locale.dat".equals(s1))
        {
            Intent intent = new Intent("com.qihoo.security.action.RELOAD_CONFIG");
            intent.putExtra("CONFIG_FILENAME", s1);
            b.sendBroadcast(intent);
            return;
        }
        if (com.qihoo.security.env.a.d.equals(s1))
        {
            (new Thread(s1) {

                final String a;
                final UpdateService b;

                public void run()
                {
                    Object obj = new File(UpdateService.v(b).getFilesDir(), a);
                    obj = new BufferedReader(new FileReader(((File) (obj))));
                    Object obj1 = ((BufferedReader) (obj)).readLine();
                    if (obj1 == null) goto _L2; else goto _L1
_L1:
                    if (!Pattern.compile("\\d{1,3}").matcher(((CharSequence) (obj1))).matches()) goto _L2; else goto _L3
_L3:
                    obj1 = Integer.decode(((String) (obj1)));
                    if (((Integer) (obj1)).intValue() > 100 || ((Integer) (obj1)).intValue() < 0) goto _L2; else goto _L4
_L4:
                    int i1;
                    i1 = (new Random()).nextInt(101);
                    if (((Integer) (obj1)).intValue() == 0)
                    {
                        SharedPref.a(UpdateService.w(b), "user_ex_v3", false);
                        return;
                    }
                    if (((Integer) (obj1)).intValue() == 100)
                    {
                        SharedPref.a(UpdateService.x(b), "user_ex_v3", true);
                        return;
                    }
                      goto _L5
_L6:
                    if (obj != null)
                    {
                        try
                        {
                            ((BufferedReader) (obj)).close();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            return;
                        }
                    }
                    break; /* Loop/switch isn't completed */
_L5:
                    if (i1 < ((Integer) (obj1)).intValue())
                    {
                        SharedPref.a(UpdateService.y(b), "user_ex_v3", true);
                        return;
                    }
                    try
                    {
                        SharedPref.a(UpdateService.z(b), "user_ex_v3", false);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                    continue; /* Loop/switch isn't completed */
                    Exception exception2;
                    exception2;
                    exception2 = null;
                    if (true) goto _L6; else goto _L2
_L2:
                }

            
            {
                b = UpdateService.this;
                a = s1;
                super();
            }
            }).start();
            return;
        }
        if (!"root.conf".equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        inputstream = Utils.openLatestInputFile(b, s1);
        flag2 = false;
        flag1 = false;
        flag = flag2;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        s1 = bufferedreader;
        String s2 = bufferedreader.readLine();
        flag = flag1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        s1 = bufferedreader;
        boolean flag3 = s2.trim().startsWith("1");
        flag = flag1;
        if (flag3)
        {
            flag = true;
        }
        Exception exception;
        Exception exception1;
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        } else
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        com.qihoo360.mobilesafe.support.a.a(b, flag);
        return;
        exception1;
        bufferedreader = null;
_L5:
        s1 = bufferedreader;
        Log.e("V5UpdateService", " load cfg fail ", exception1);
        if (bufferedreader == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            flag = flag2;
            break MISSING_BLOCK_LABEL_205;
        }
        flag = flag2;
        break MISSING_BLOCK_LABEL_205;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            flag = flag2;
            break MISSING_BLOCK_LABEL_205;
        }
        flag = flag2;
        break MISSING_BLOCK_LABEL_205;
        exception;
        s1 = null;
_L4:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        } else
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw exception;
        if (!"c_t.config".equals(s1)) goto _L1; else goto _L3
_L3:
        (new Thread() {

            final UpdateService a;

            public void run()
            {
                com.qihoo.security.opti.trashclear.a.a();
                com.qihoo.security.opti.trashclear.a.c();
            }

            
            {
                a = UpdateService.this;
                super();
            }
        }).start();
        return;
        exception;
          goto _L4
        exception1;
          goto _L5
    }

    public IBinder onBind(Intent intent)
    {
        return g;
    }

    public void onCreate()
    {
        super.onCreate();
        b();
    }

    public void onDestroy()
    {
        h();
        try
        {
            unregisterReceiver(k);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        super.onStartCommand(intent, i1, j1);
        while (intent == null || !"com.qihoo.security.action.ACTION_CHECK_UPDATE".equals(intent.getAction())) 
        {
            return 1;
        }
        if (SecurityApplication.b())
        {
            stopSelf();
            return 1;
        }
        f = intent.getBooleanExtra("update_in_background", false);
        i1 = intent.getIntExtra("type", 0);
        if (c == 0 && i1 != 0)
        {
            h();
        }
        if (c == 3002 && i1 == 3002)
        {
            com.qihoo.security.v5.c.b(this);
        }
        a(i1, intent);
        return 1;
    }

    public void onTaskRemoved(Intent intent)
    {
        super.onTaskRemoved(intent);
        h();
    }

}
