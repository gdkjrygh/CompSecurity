// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

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
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.c.d;
import net.hockeyapp.android.c.e;
import net.hockeyapp.android.d.a;
import net.hockeyapp.android.d.l;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.views.UpdateView;

// Referenced classes of package net.hockeyapp.android:
//            n, p, q, r

public class UpdateActivity extends Activity
    implements android.view.View.OnClickListener, n, p
{

    protected d a;
    protected l b;
    private final int c = 0;
    private ErrorObject d;
    private Context e;

    public UpdateActivity()
    {
    }

    static ErrorObject a(UpdateActivity updateactivity, ErrorObject errorobject)
    {
        updateactivity.d = errorobject;
        return errorobject;
    }

    private boolean a(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private boolean i()
    {
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 17 && android.os.Build.VERSION.SDK_INT < 21)
        {
            return android.provider.Settings.Global.getInt(getContentResolver(), "install_non_market_apps") == 1;
        }
        try
        {
            j = android.provider.Settings.Secure.getInt(getContentResolver(), "install_non_market_apps");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return true;
        }
label0:
        {
            if (j != 1)
            {
                return false;
            }
            break label0;
        }
    }

    protected void a()
    {
        ((TextView)findViewById(4098)).setText(g());
        TextView textview = (TextView)findViewById(4099);
        String s = (new StringBuilder()).append("Version ").append(b.a()).toString();
        String s1 = b.b();
        Object obj = "Unknown size";
        long l1 = b.c();
        if (l1 >= 0L)
        {
            obj = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                Float.valueOf((float)l1 / 1048576F)
            })).append(" MB").toString();
        } else
        {
            net.hockeyapp.android.d.a.a(new e(this, getIntent().getStringExtra("url"), new net.hockeyapp.android.b.a(textview, s, s1) {

                final TextView a;
                final String b;
                final String c;
                final UpdateActivity d;

                public void a(d d1)
                {
                    if (d1 instanceof e)
                    {
                        long l2 = ((e)d1).c();
                        d1 = (new StringBuilder()).append(String.format("%.2f", new Object[] {
                            Float.valueOf((float)l2 / 1048576F)
                        })).append(" MB").toString();
                        a.setText((new StringBuilder()).append(b).append("\n").append(c).append(" - ").append(d1).toString());
                    }
                }

            
            {
                d = UpdateActivity.this;
                a = textview;
                b = s;
                c = s1;
                super();
            }
            }));
        }
        textview.setText((new StringBuilder()).append(s).append("\n").append(s1).append(" - ").append(((String) (obj))).toString());
        ((Button)findViewById(4100)).setOnClickListener(this);
        obj = (WebView)findViewById(4101);
        ((WebView) (obj)).clearCache(true);
        ((WebView) (obj)).destroyDrawingCache();
        ((WebView) (obj)).loadDataWithBaseURL("https://sdk.hockeyapp.net/", b(), "text/html", "utf-8", null);
    }

    protected void a(String s)
    {
        a(s, ((net.hockeyapp.android.b.a) (new net.hockeyapp.android.b.a() {

            final UpdateActivity a;

            public String a(int j)
            {
                r r1 = q.b();
                if (r1 != null)
                {
                    return r1.a(j);
                } else
                {
                    return null;
                }
            }

            public void a(d d1)
            {
                a.d();
            }

            public void a(d d1, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    a.c();
                    return;
                } else
                {
                    a.d();
                    return;
                }
            }

            
            {
                a = UpdateActivity.this;
                super();
            }
        })));
        net.hockeyapp.android.d.a.a(a);
    }

    protected void a(String s, net.hockeyapp.android.b.a a1)
    {
        a = new d(this, s, a1);
    }

    protected String b()
    {
        return b.a(false);
    }

    protected void c()
    {
        a(getIntent().getStringExtra("url"));
    }

    public void d()
    {
        findViewById(4100).setEnabled(true);
    }

    public int e()
    {
        int j;
        try
        {
            j = getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        return j;
    }

    public ViewGroup f()
    {
        return new UpdateView(this);
    }

    public String g()
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

    public View h()
    {
        return f();
    }

    public void onClick(View view)
    {
        if (!a(e))
        {
            d = new ErrorObject();
            d.a("The permission to access the external storage permission is not set. Please contact the developer.");
            runOnUiThread(new Runnable() {

                final UpdateActivity a;

                public void run()
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
        if (!i())
        {
            d = new ErrorObject();
            d.a("The installation from unknown sources is not enabled. Please check the device settings.");
            runOnUiThread(new Runnable() {

                final UpdateActivity a;

                public void run()
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
            c();
            view.setEnabled(false);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(f());
        e = this;
        b = new l(this, getIntent().getStringExtra("json"), this);
        a();
        a = (d)getLastNonConfigurationInstance();
        if (a != null)
        {
            a.a(this);
        }
    }

    protected Dialog onCreateDialog(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(0x1080027).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final UpdateActivity a;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    net.hockeyapp.android.UpdateActivity.a(a, null);
                    dialoginterface.cancel();
                }

            
            {
                a = UpdateActivity.this;
                super();
            }
            }).create();
        }
    }

    protected void onPrepareDialog(int j, Dialog dialog)
    {
        switch (j)
        {
        default:
            return;

        case 0: // '\0'
            dialog = (AlertDialog)dialog;
            break;
        }
        if (d != null)
        {
            dialog.setMessage(d.b());
            return;
        } else
        {
            dialog.setMessage("An unknown error has occured.");
            return;
        }
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (a != null)
        {
            a.a();
        }
        return a;
    }
}
