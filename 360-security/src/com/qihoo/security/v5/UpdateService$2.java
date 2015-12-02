// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.security.service.BsPatchService;
import com.qihoo.security.service.e;
import com.qihoo.security.support.b;
import com.qihoo.utils.notice.a;
import com.qihoo360.common.utils.HashUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateService, f, d, a, 
//            b, DownloadStatus

class t> extends BroadcastReceiver
{

    final UpdateService a;

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        if (!"com.qihoo.antivirus.update.action.UPDATE_NOTICE".equals(obj)) goto _L2; else goto _L1
_L1:
        Bundle bundle;
        b.b(27023);
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
                com.qihoo.security.v5.a.a(UpdateService.c(a), context);
                context = intent;
            }
        }
        if (com.qihoo.security.v5.UpdateService.a(a, UpdateService.d(a), ((String) (obj)))) goto _L4; else goto _L3
_L3:
        if (UpdateService.d(a) == 3001)
        {
            context = new Bundle();
            context.putInt("UPDATE_TYPE", 2);
            context.putInt("type", UpdateService.d(a));
            com.qihoo.security.v5.UpdateService.a(a, context);
        }
        a.stopSelf();
_L14:
        return;
_L4:
        if (context != null)
        {
            if (((d) (context)).e)
            {
                com.qihoo.security.v5.UpdateService.a(a, bundle, ((d) (context)).c);
            }
        } else
        {
            com.qihoo.utils.notice.a.a().b(4105);
        }
        bundle.putInt("UPDATE_TYPE", 1);
        if (!com.qihoo.security.v5.UpdateService.e(a)) goto _L6; else goto _L5
_L5:
        bundle.putInt("type", UpdateService.d(a));
        com.qihoo.security.v5.UpdateService.a(a, bundle);
_L7:
        a.stopSelf();
        return;
_L6:
        if (bundle != null)
        {
            com.qihoo.utils.notice.a.a().a(bundle);
            b.b(27015);
        }
        if (true) goto _L7; else goto _L2
_L2:
        if (!"com.qihoo.antivirus.update.action.INSTALL_NOTICE".equals(obj)) goto _L9; else goto _L8
_L8:
        b.b(27023);
        com.qihoo.security.v5.f.a(UpdateService.f(a));
        obj = intent.getStringExtra("app_path");
        intent = intent.getStringExtra("app_version");
        com.qihoo.security.v5.a.a(UpdateService.g(a), intent);
        UpdateService.h(a);
        if (UpdateService.d(a) != 0) goto _L11; else goto _L10
_L10:
        com.qihoo.utils.notice.a.a().c(((String) (obj)));
        b.b(27015);
_L12:
        a.stopSelf();
        return;
_L11:
        if (UpdateService.d(a) == 3002)
        {
            r.a(context, ((String) (obj)));
        } else
        if (UpdateService.d(a) == 3001)
        {
            context = new Bundle();
            context.putInt("UPDATE_TYPE", 2);
            context.putInt("type", UpdateService.d(a));
            com.qihoo.security.v5.UpdateService.a(a, context);
        }
        if (true) goto _L12; else goto _L9
_L9:
        if (!"com.qihoo.antivirus.update.action.APP_PROGRESS".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = intent.getLongExtra("current", 0L);
        long l5 = intent.getLongExtra("total", 0L);
        if (l5 > 0L && l1 <= l5)
        {
            int i = (int)((l1 * 100L) / l5);
            com.qihoo.utils.notice.a.a().a(i);
            return;
        }
        if (true) goto _L14; else goto _L13
_L13:
        if (!"com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = intent.getStringExtra("vdata_target_name");
        String s = intent.getStringExtra("vdata_patch_name");
        int j = intent.getIntExtra("vdata_method", 0);
        int i1 = intent.getIntExtra("vdata_flag", 0);
        int j1 = intent.getIntExtra("vdata_version", 0);
        int k1 = intent.getIntExtra("vdata_patch_type", 0);
        if (j == 1001)
        {
            context.startService((new Intent(context, com/qihoo/security/service/BsPatchService)).setAction("com.qihoo.security.action.ACTION_BSPATCH").putExtra("patch_path", s).putExtra("target_path", ((String) (obj))));
        }
        if (UpdateService.i(a) != null && !UpdateService.j(a))
        {
            UpdateService.i(a).a(((String) (obj)), s, j, i1, j1, k1);
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
        if (UpdateService.d(a) == 3001 && !TextUtils.isEmpty(context) && context.endsWith(".apk"))
        {
            r.a(UpdateService.l(a), context);
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
            b.a(27026, UpdateService.d(a));
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
            long l2 = ((Long)UpdateService.p(a).get(intent)).longValue();
            l2 = System.currentTimeMillis() - l2;
            if (l2 > 0L && l2 < 0x36ee80L)
            {
                b.a(27025, intent, String.valueOf(l2));
            }
        }
        obj = intent.split("/");
        if (obj != null && obj.length > 0)
        {
            obj = obj[obj.length - 1];
            if ("avedb.zip".equals(obj))
            {
                if (UpdateService.d(a) == 0 && e.a(context))
                {
                    com.qihoo.utils.notice.a.a().b();
                }
                SharedPref.a(UpdateService.q(a), "malware_update_timestamp", System.currentTimeMillis());
                b.a(14314, Utils.bytesToHexString(HashUtil.getFileHash("MD5", new File(intent))), "");
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
        int k = intent.getIntExtra("data_file_count", 0);
        if (UpdateService.i(a) != null && !UpdateService.j(a))
        {
            UpdateService.i(a).b(k);
            return;
        }
        if (true) goto _L14; else goto _L19
_L19:
        if (!"com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        long l3 = intent.getLongExtra("current", 0L);
        long l6 = intent.getLongExtra("total", 0L);
        int l;
        if (l6 > 0L && l3 <= l6)
        {
            l = (int)((100L * l3) / l6);
        }
        if (UpdateService.i(a) != null && !UpdateService.j(a))
        {
            UpdateService.i(a).a(l3, l6);
            return;
        }
        if (true) goto _L14; else goto _L20
_L20:
        if ("com.qihoo.antivirus.update.action.ERROR".equals(obj))
        {
            context = intent.getStringExtra("error_code");
            long l4 = System.currentTimeMillis() - com.qihoo.security.v5.UpdateService.r(a);
            if (l4 > 0L && l4 < 0x36ee80L)
            {
                b.a(27030, String.valueOf(UpdateService.d(a)), String.valueOf(l4 / 1000L));
            }
            try
            {
                b.a(27022, Integer.parseInt(context));
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
        b.b(27023);
        if (UpdateService.i(a) != null && !UpdateService.j(a))
        {
            UpdateService.i(a).b(context);
            a.stopSelf();
            return;
        }
        com.qihoo.security.v5.f.a(UpdateService.u(a));
        if (UpdateService.d(a) != 3001 && UpdateService.d(a) != 1002) goto _L23; else goto _L22
_L22:
        context = new Bundle();
        context.putInt("UPDATE_TYPE", 2);
        context.putInt("type", UpdateService.d(a));
        com.qihoo.security.v5.UpdateService.a(a, context);
_L25:
        a.stopSelf();
        return;
_L23:
        if (UpdateService.d(a) == 3002)
        {
            context = new Bundle();
            context.putInt("UPDATE_TYPE", 0);
            context.putInt("type", UpdateService.d(a));
            com.qihoo.security.v5.UpdateService.a(a, context);
        }
        if (true) goto _L25; else goto _L24
_L24:
    }

    ef(UpdateService updateservice)
    {
        a = updateservice;
        super();
    }
}
