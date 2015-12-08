// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afP;
import afS;
import afT;
import agb;
import agc;
import agg;
import agp;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.views.UpdateView;

public class UpdateActivity extends Activity
    implements afP, android.view.View.OnClickListener
{

    private afT a;
    private Context b;
    private agb c;
    private agp d;

    public UpdateActivity()
    {
    }

    static afT a(UpdateActivity updateactivity)
    {
        updateactivity.a = null;
        return null;
    }

    private String d()
    {
        Object obj;
        try
        {
            obj = getPackageManager();
            obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(getPackageName(), 0)).toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "";
        }
        return ((String) (obj));
    }

    private boolean e()
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 17 && android.os.Build.VERSION.SDK_INT < 21)
        {
            return android.provider.Settings.Global.getInt(getContentResolver(), "install_non_market_apps") == 1;
        }
        try
        {
            i = android.provider.Settings.Secure.getInt(getContentResolver(), "install_non_market_apps");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return true;
        }
label0:
        {
            if (i != 1)
            {
                return false;
            }
            break label0;
        }
    }

    protected final void a()
    {
        c = new agb(this, getIntent().getStringExtra("url"), new afS() {

            private UpdateActivity a;

            public final void a(agb agb1)
            {
                a.b();
            }

            public final void a(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    a.a();
                    return;
                } else
                {
                    a.b();
                    return;
                }
            }

            
            {
                a = UpdateActivity.this;
                super();
            }
        });
        agg.a(c);
    }

    public final void b()
    {
        findViewById(4100).setEnabled(true);
    }

    public final int c()
    {
        int i;
        try
        {
            i = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        return i;
    }

    public void onClick(View view)
    {
        boolean flag;
        if (b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a = new afT();
            a.a = "The permission to access the external storage permission is not set. Please contact the developer.";
            runOnUiThread(new Runnable() {

                private UpdateActivity a;

                public final void run()
                {
                    a.showDialog(0);
                }

            
            {
                a = UpdateActivity.this;
                super();
            }
            });
            return;
        }
        if (!e())
        {
            a = new afT();
            a.a = "The installation from unknown sources is not enabled. Please check the device settings.";
            runOnUiThread(new Runnable() {

                private UpdateActivity a;

                public final void run()
                {
                    a.showDialog(0);
                }

            
            {
                a = UpdateActivity.this;
                super();
            }
            });
            return;
        } else
        {
            a();
            view.setEnabled(false);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(new UpdateView(this));
        b = this;
        d = new agp(this, getIntent().getStringExtra("json"), this);
        ((TextView)findViewById(4098)).setText(d());
        TextView textview = (TextView)findViewById(4099);
        String s = (new StringBuilder("Version ")).append(d.a()).toString();
        String s1 = d.b();
        bundle = "Unknown size";
        long l = d.c();
        if (l >= 0L)
        {
            bundle = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l / 1048576F)
            })).append(" MB").toString();
        } else
        {
            agg.a(new agc(this, getIntent().getStringExtra("url"), new afS(textview, s, s1) {

                private TextView a;
                private String b;
                private String c;

                public final void a(agb agb1)
                {
                    if (agb1 instanceof agc)
                    {
                        long l1 = ((agc)agb1).d;
                        agb1 = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                            Float.valueOf((float)l1 / 1048576F)
                        })).append(" MB").toString();
                        a.setText((new StringBuilder()).append(b).append("\n").append(c).append(" - ").append(agb1).toString());
                    }
                }

            
            {
                a = textview;
                b = s;
                c = s1;
                super();
            }
            }));
        }
        textview.setText((new StringBuilder()).append(s).append("\n").append(s1).append(" - ").append(bundle).toString());
        ((Button)findViewById(4100)).setOnClickListener(this);
        bundle = (WebView)findViewById(4101);
        bundle.clearCache(true);
        bundle.destroyDrawingCache();
        bundle.loadDataWithBaseURL("https://sdk.hockeyapp.net/", d.d(), "text/html", "utf-8", null);
        c = (agb)getLastNonConfigurationInstance();
        if (c != null)
        {
            c.a = this;
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(0x1080027).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                private UpdateActivity a;

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    UpdateActivity.a(a);
                    dialoginterface.cancel();
                }

            
            {
                a = UpdateActivity.this;
                super();
            }
            }).create();
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialog = (AlertDialog)dialog;
            break;
        }
        if (a != null)
        {
            dialog.setMessage(a.a);
            return;
        } else
        {
            dialog.setMessage("An unknown error has occured.");
            return;
        }
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (c != null)
        {
            agb agb1 = c;
            agb1.a = null;
            agb1.c = null;
        }
        return c;
    }
}
