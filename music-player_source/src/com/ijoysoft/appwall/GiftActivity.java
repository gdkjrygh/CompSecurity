// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ijoysoft.appwall:
//            j, o, p, x, 
//            v, n, ac, ab, 
//            l, m, a, k

public class GiftActivity extends Activity
{

    public static String a = "http://1.appgift.sinaapp.com/";
    public static String b = "giftList.xml";
    public static final String c = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/gift/").toString();
    private static ArrayList e = null;
    private static SharedPreferences f;
    private AppBroadcastReceiver d;
    private ImageView g;
    private p h;
    private GridView i;
    private Handler j;

    public GiftActivity()
    {
        j = new j(this);
    }

    static SharedPreferences a()
    {
        return f;
    }

    static ImageView a(GiftActivity giftactivity)
    {
        return giftactivity.g;
    }

    static void a(SharedPreferences sharedpreferences)
    {
        f = sharedpreferences;
    }

    public static void a(ArrayList arraylist)
    {
        e = arraylist;
    }

    private boolean a(Context context, String s)
    {
        context = context.getPackageManager().getInstalledPackages(0);
        ArrayList arraylist = new ArrayList();
        if (context != null)
        {
            int i1 = 0;
            do
            {
                if (i1 >= context.size())
                {
                    return arraylist.contains(s);
                }
                arraylist.add(((PackageInfo)context.get(i1)).packageName);
                i1++;
            } while (true);
        }
        if (a(((Context) (this)), "com.skype.android.verizon"))
        {
            context = new Intent();
            context.setComponent(new ComponentName("com.skype.android.verizon", "com.skype.android.verizon.SkypeActivity"));
            startActivityForResult(context, -1);
        }
        return true;
    }

    static p b(GiftActivity giftactivity)
    {
        return giftactivity.h;
    }

    private int c(ArrayList arraylist)
    {
        SharedPreferences sharedpreferences = getSharedPreferences("settings", 0);
        if (arraylist != null)
        {
            int i1 = 0;
            int j1 = 0;
            do
            {
                if (i1 >= arraylist.size())
                {
                    return j1;
                }
                int k1 = j1;
                if (!sharedpreferences.getBoolean(((o)arraylist.get(i1)).b(), false))
                {
                    k1 = j1 + 1;
                }
                i1++;
                j1 = k1;
            } while (true);
        } else
        {
            return 0;
        }
    }

    public final void a(String s, String s1)
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        if (packageinfo == null)
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
            return;
        } else
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("https://play.google.com/store/apps/details?id=")).append(s).toString()));
            s.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
            s.setFlags(0x10000000);
            startActivity(s);
            return;
        }
    }

    public final boolean a(String s)
    {
        if (s == null || "".equals(s))
        {
            return false;
        }
        try
        {
            getPackageManager().getApplicationInfo(s, 8192);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final void b(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            ArrayList arraylist1 = new ArrayList();
            int i1 = 0;
            do
            {
                if (i1 >= arraylist.size())
                {
                    h.a(arraylist1);
                    e = arraylist1;
                    arraylist = getSharedPreferences("settings", 0);
                    if (!arraylist.getBoolean(((o)arraylist1.get(0)).b(), false))
                    {
                        Log.i("changle-jar", "new : true");
                        arraylist = arraylist.edit();
                        arraylist.putBoolean(((o)arraylist1.get(0)).b(), true);
                        arraylist.commit();
                        if (a(((o)arraylist1.get(0)).b()))
                        {
                            Toast.makeText(this, "APP is installed", 0).show();
                        } else
                        {
                            arraylist = ((o)arraylist1.get(0)).f();
                            a(((o)arraylist1.get(0)).b(), arraylist);
                            h.notifyDataSetChanged();
                        }
                    }
                    arraylist = getSharedPreferences("title", 0).edit();
                    arraylist.putInt("title_num", c(arraylist1));
                    arraylist.commit();
                    j.sendEmptyMessage(1);
                    return;
                }
                if (!a(this, ((o)arraylist.get(i1)).b()))
                {
                    arraylist1.add((o)arraylist.get(i1));
                }
                i1++;
            } while (true);
        } else
        {
            arraylist = x.b();
            String s = x.d();
            v v1 = new v(new n(this));
            v1.execute(new String[] {
                (new StringBuilder(String.valueOf(arraylist))).append(s).toString()
            });
            v1.getStatus();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        setContentView(ac.a);
        d = new AppBroadcastReceiver();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addDataScheme("package");
        registerReceiver(d, intentfilter);
        g = (ImageView)findViewById(ab.f);
        findViewById(ab.b);
        i = (GridView)findViewById(ab.c);
        h = new p(this, i);
        i.setAdapter(h);
        i.setOnItemClickListener(new l(this));
        findViewById(ab.a).setOnClickListener(new m(this));
        j.sendEmptyMessage(0);
        b(e);
        if (!com.ijoysoft.appwall.a.c(this))
        {
            a.b = true;
            String s = x.a();
            String s1 = x.c();
            v v1 = new v(new k(this));
            v1.execute(new String[] {
                (new StringBuilder(String.valueOf(s))).append(s1).toString()
            });
            v1.getStatus();
        }
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        if (d != null)
        {
            unregisterReceiver(d);
        }
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStop()
    {
        Intent intent = new Intent();
        intent.setAction("popularize.newnum2");
        intent.putExtra("newnum2", (new StringBuilder(String.valueOf(c(e)))).toString());
        sendBroadcast(intent);
        super.onStop();
    }


    private class AppBroadcastReceiver extends BroadcastReceiver
    {

        final GiftActivity a;
        private final String b = "android.intent.action.PACKAGE_ADDED";
        private final String c = "android.intent.action.PACKAGE_REMOVED";

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(context))
            {
                Log.i("changle-rece", "add");
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(context))
            {
                Log.i("changle-rece", intent.getDataString());
                context = a.getSharedPreferences("settings", 0).edit();
                context.putBoolean("packageName", true);
                context.commit();
            }
        }

        public AppBroadcastReceiver()
        {
            a = GiftActivity.this;
            super();
        }
    }

}
