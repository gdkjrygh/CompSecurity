// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateService, UpdateHelper

public class CheckUpdateDialog extends AbsDialogActivity
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            CheckUpdateDialog checkupdatedialog = (CheckUpdateDialog)a.get();
            if (checkupdatedialog != null)
            {
                CheckUpdateDialog.a(checkupdatedialog, message);
            }
        }

        public a(CheckUpdateDialog checkupdatedialog)
        {
            a = new WeakReference(checkupdatedialog);
        }
    }


    private Context c;
    private boolean d;
    private final BroadcastReceiver e = new BroadcastReceiver() {

        final CheckUpdateDialog a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null && "com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG".equals(intent.getAction()))
            {
                a.finish();
            }
        }

            
            {
                a = CheckUpdateDialog.this;
                super();
            }
    };

    public CheckUpdateDialog()
    {
    }

    private static int a(File file, File file1)
    {
        int j;
        int k;
        boolean flag;
        flag = false;
        k = 0;
        j = k;
        if (file1 == null) goto _L2; else goto _L1
_L1:
        j = k;
        if (!file1.exists()) goto _L2; else goto _L3
_L3:
        File file2;
        int i;
        i = 0;
        file2 = file1;
_L16:
        if (file2 != null && !file.equals(file2)) goto _L5; else goto _L4
_L4:
        if (i <= 4) goto _L7; else goto _L6
_L6:
        j = k;
_L2:
        return j;
_L5:
        j = k;
        if (i > 4) goto _L2; else goto _L8
_L8:
        file2 = file2.getParentFile();
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        if (!file1.isDirectory())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        file1 = file1.listFiles();
        j = k;
        if (file1 == null) goto _L2; else goto _L9
_L9:
        int l;
        l = file1.length;
        k = 0;
        i = ((flag) ? 1 : 0);
_L11:
        j = i;
        if (k >= l) goto _L2; else goto _L10
_L10:
        j = a(file, file1[k]);
        k++;
        i = j + i;
          goto _L11
        file = file1.getName();
        j = k;
        if (TextUtils.isEmpty(file)) goto _L2; else goto _L12
_L12:
        j = k;
        if (file.length() < ".apk".length()) goto _L2; else goto _L13
_L13:
        j = k;
        if (!file.substring(file.length() - ".apk".length(), file.length()).equalsIgnoreCase(".apk")) goto _L2; else goto _L14
_L14:
        return 1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private void a(Message message)
    {
        if (!d)
        {
            if (message.arg1 >= 150)
            {
                SharedPref.a(c, "key_malware_is_avc", true);
                d = true;
                com.qihoo.security.support.b.c(14028);
            }
            message = new Intent(c, com/qihoo/security/v5/UpdateService);
            message.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
            if (d)
            {
                message.putExtra("type", 1002);
            } else
            {
                message.putExtra("type", 3001);
            }
            c.startService(message);
        }
    }

    static void a(CheckUpdateDialog checkupdatedialog)
    {
        checkupdatedialog.d();
    }

    static void a(CheckUpdateDialog checkupdatedialog, Message message)
    {
        checkupdatedialog.a(message);
    }

    private boolean a(Activity activity, MotionEvent motionevent)
    {
        int i = (int)motionevent.getX();
        int j = (int)motionevent.getY();
        int k = ViewConfiguration.get(activity).getScaledWindowTouchSlop();
        activity = activity.getWindow().getDecorView();
        return i < -k || j < -k || i > activity.getWidth() + k || j > activity.getHeight() + k;
    }

    static int c()
    {
        return f();
    }

    private void d()
    {
        UpdateHelper.a = true;
        Intent intent = new Intent(c, com/qihoo/security/v5/UpdateService);
        intent.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
        c.stopService(intent);
    }

    private String e()
    {
        String s = ((TelephonyManager)c.getSystemService("phone")).getSimCountryIso();
        if (!TextUtils.isEmpty(s))
        {
            return s.toUpperCase(Locale.US);
        } else
        {
            return Locale.getDefault().getCountry();
        }
    }

    private static int f()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            Object obj = Utils.getInternalAndExternalSDPath(SecurityApplication.a());
            i = ((flag) ? 1 : 0);
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                String s;
                for (i = 0; ((Iterator) (obj)).hasNext(); i = a(new File(s), new File(s)) + i)
                {
                    s = (String)((Iterator) (obj)).next();
                }

            }
        }
        return i;
    }

    protected View a()
    {
        return LayoutInflater.from(this).inflate(0x7f0300a3, null);
    }

    public void b(int i)
    {
        ((LocaleTextView)findViewById(0x7f0b017e)).setLocalText(i);
    }

    public void onBackPressed()
    {
        d();
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent() == null)
        {
            finish();
        }
        int i = getIntent().getIntExtra("type", 3001);
        c = getApplicationContext();
        bundle = new IntentFilter();
        bundle.addAction("com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG");
        registerReceiver(e, bundle, "com.qihoo.security.lite.PERMISSION", null);
        if (i == 3002)
        {
            setDialogTitle(0x7f0c017d);
        } else
        if (i == 3001)
        {
            setDialogTitle(0x7f0c01ba);
        }
        b(0x7f0c017e);
        setButtonText(new int[] {
            0x7f0c014f
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final CheckUpdateDialog a;

                public void onClick(View view)
                {
                    a.finish();
                    CheckUpdateDialog.a(a);
                }

            
            {
                a = CheckUpdateDialog.this;
                super();
            }
            }
        });
        d = SharedPref.b(c, "key_malware_is_avc", false);
        bundle = e();
        if (!d)
        {
            if ("AT".equalsIgnoreCase(bundle) || "AUT".equalsIgnoreCase(bundle))
            {
                (new Thread(new a(this)) {

                    final a a;
                    final CheckUpdateDialog b;

                    public void run()
                    {
                        int j = CheckUpdateDialog.c();
                        a.sendMessage(Message.obtain(a, 0, j, 0));
                    }

            
            {
                b = CheckUpdateDialog.this;
                a = a1;
                super();
            }
                }).start();
                return;
            } else
            {
                bundle = new Intent(c, com/qihoo/security/v5/UpdateService);
                bundle.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
                bundle.putExtra("type", i);
                c.startService(bundle);
                return;
            }
        } else
        {
            bundle = new Intent(c, com/qihoo/security/v5/UpdateService);
            bundle.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
            bundle.putExtra("type", 1002);
            c.startService(bundle);
            return;
        }
    }

    protected void onDestroy()
    {
        try
        {
            unregisterReceiver(e);
        }
        catch (Exception exception) { }
        super.onDestroy();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a(this, motionevent))
        {
            d();
            finish();
            return true;
        } else
        {
            return false;
        }
    }
}
