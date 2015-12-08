// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.jcp.b.b;
import com.jcp.helper.s;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.jcp.util:
//            g, br, ae

public class DownloadService extends IntentService
{

    private static final String a = com/jcp/util/DownloadService.getName();

    public DownloadService()
    {
        super(a);
    }

    private boolean a()
    {
        return e() || !f() || g() || !com.jcp.util.g.a().b();
    }

    private void b()
    {
        g g1 = com.jcp.util.g.a();
        if (g1.b())
        {
            g1.c();
        }
    }

    private void c()
    {
        d().edit().putBoolean("firstTime", false).putBoolean("buildType", b.i).putLong("downloadTime", Calendar.getInstance().getTimeInMillis()).apply();
    }

    private SharedPreferences d()
    {
        return getSharedPreferences("com.jcp.activities", 0);
    }

    private boolean e()
    {
        return d().getBoolean("firstTime", true);
    }

    private boolean f()
    {
        boolean flag = false;
        if (d().getBoolean("buildType", false) == b.i)
        {
            flag = true;
        }
        return flag;
    }

    private boolean g()
    {
        long l = d().getLong("downloadTime", 0L);
        return l == 0L || br.a(l, 24);
    }

    protected void onHandleIntent(Intent intent)
    {
        s s1;
        String s3;
        ResultReceiver resultreceiver;
        ae.d(a, "Start");
        s1 = new s();
        s3 = intent.getStringExtra("url");
        resultreceiver = (ResultReceiver)intent.getParcelableExtra("resultReceiver");
        if (resultreceiver != null)
        {
            s1.a(resultreceiver);
        }
        if (TextUtils.isEmpty(s3)) goto _L2; else goto _L1
_L1:
        if (!intent.getBooleanExtra("categoryMenu", false)) goto _L4; else goto _L3
_L3:
        s1.c(s3);
_L2:
        ae.d(a, "End");
        stopSelf();
        return;
_L4:
        if (a())
        {
            b();
            s1.a(s3);
            s1.a();
            c();
        }
        if (resultreceiver != null)
        {
            try
            {
                resultreceiver.send(1, Bundle.EMPTY);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                String s2 = a;
                if (intent.getMessage() == null)
                {
                    intent = "Failed to download sub categories";
                } else
                {
                    intent = intent.getMessage();
                }
                ae.a(s2, intent);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

}
