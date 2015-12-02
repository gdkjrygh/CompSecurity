// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.qihoo.security.dialog.AbsDialogActivity;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.widget.ProgressView;

// Referenced classes of package com.qihoo.security.v5:
//            c, UpdateDownloadUIService

public class DownloadApkDialog extends AbsDialogActivity
{
    private class a
    {

        final DownloadApkDialog a;
        private final Context b;
        private final ProgressView c;

        public void a()
        {
            a.finish();
        }

        public void a(int i)
        {
            ((LocaleTextView)a.findViewById(0x7f0b0107)).setLocalText((new StringBuilder()).append(String.valueOf(i)).append("%").toString());
            c.setProgress((float)i / 100F);
            DownloadApkDialog.a(a, i);
        }

        public a(Context context)
        {
            a = DownloadApkDialog.this;
            super();
            b = context.getApplicationContext();
            c = (ProgressView)findViewById(0x7f0b0108);
        }
    }


    private Context c;
    private a d;
    private boolean e;
    private int f;
    private final BroadcastReceiver g = new BroadcastReceiver() {

        final DownloadApkDialog a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                if ("com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG".equals(context))
                {
                    a.finish();
                    a.finish();
                } else
                if ("com.qihoo.security.action.ACTION_APP_PROGRESS".equals(context))
                {
                    int i = intent.getIntExtra("progress", 0);
                    if (i >= 100)
                    {
                        DownloadApkDialog.a(a).a();
                        return;
                    } else
                    {
                        DownloadApkDialog.a(a).a(i);
                        return;
                    }
                }
            }
        }

            
            {
                a = DownloadApkDialog.this;
                super();
            }
    };

    public DownloadApkDialog()
    {
        d = null;
        e = false;
    }

    static int a(DownloadApkDialog downloadapkdialog, int i)
    {
        downloadapkdialog.f = i;
        return i;
    }

    static a a(DownloadApkDialog downloadapkdialog)
    {
        return downloadapkdialog.d;
    }

    static Context b(DownloadApkDialog downloadapkdialog)
    {
        return downloadapkdialog.c;
    }

    static int c(DownloadApkDialog downloadapkdialog)
    {
        return downloadapkdialog.f;
    }

    protected View a()
    {
        return LayoutInflater.from(this).inflate(0x7f03004a, null);
    }

    public void onBackPressed()
    {
        if (!e)
        {
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = getApplicationContext();
        bundle = new IntentFilter();
        bundle.addAction("com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG");
        bundle.addAction("com.qihoo.security.action.ACTION_APP_PROGRESS");
        registerReceiver(g, bundle, "com.qihoo.security.lite.PERMISSION", null);
        bundle = getIntent();
        if (bundle == null)
        {
            finish();
            return;
        }
        e = false;
        bundle = bundle.getExtras();
        int i;
        if (bundle != null)
        {
            e = bundle.getBoolean("uiforce");
            i = bundle.getInt("progress");
            ((ProgressView)findViewById(0x7f0b0108)).a((float)i / 100F, 0);
        } else
        {
            i = 0;
        }
        ((LocaleTextView)findViewById(0x7f0b0107)).setLocalText((new StringBuilder()).append(String.valueOf(i)).append("%").toString());
        setDialogTitle(0x7f0c0185);
        if (e)
        {
            setButtonText(new int[] {
                0x7f0c014f
            });
            setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final DownloadApkDialog a;

                    public void onClick(View view)
                    {
                        com.qihoo.security.v5.c.a(DownloadApkDialog.b(a));
                        a.finish();
                        com.qihoo360.mobilesafe.b.a.e(DownloadApkDialog.b(a));
                    }

            
            {
                a = DownloadApkDialog.this;
                super();
            }
                }
            });
        } else
        {
            setButtonText(new int[] {
                0x7f0c0187, 0x7f0c014f
            });
            setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener() {

                    final DownloadApkDialog a;

                    public void onClick(View view)
                    {
                        view = new Intent("com.qihoo.security.action.ACTION_HIDE_DOWNLOAD_APK_DIALOG");
                        view.putExtra("progress", DownloadApkDialog.c(a));
                        DownloadApkDialog.b(a).sendBroadcast(view, "com.qihoo.security.lite.PERMISSION");
                        a.finish();
                    }

            
            {
                a = DownloadApkDialog.this;
                super();
            }
                }, new android.view.View.OnClickListener() {

                    final DownloadApkDialog a;

                    public void onClick(View view)
                    {
                        com.qihoo.security.v5.c.a(DownloadApkDialog.b(a));
                        DownloadApkDialog.b(a).stopService(new Intent(DownloadApkDialog.b(a), com/qihoo/security/v5/UpdateDownloadUIService));
                        a.finish();
                    }

            
            {
                a = DownloadApkDialog.this;
                super();
            }
                }
            });
        }
        d = new a(this);
    }

    public void onDestroy()
    {
        Intent intent = new Intent("com.qihoo.security.action.ACTION_HIDE_DOWNLOAD_APK_DIALOG");
        intent.putExtra("progress", f);
        sendBroadcast(intent, "com.qihoo.security.lite.PERMISSION");
        try
        {
            unregisterReceiver(g);
        }
        catch (Exception exception) { }
        super.onDestroy();
    }

    public void onStop()
    {
        super.onStop();
    }
}
