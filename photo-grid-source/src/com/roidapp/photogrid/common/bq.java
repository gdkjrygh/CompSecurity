// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.a.a;
import com.roidapp.photogrid.c.b;
import com.roidapp.photogrid.c.c;
import com.roidapp.photogrid.c.d;
import com.roidapp.photogrid.c.g;
import com.roidapp.photogrid.c.h;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.roidapp.photogrid.common:
//            b, bu, br, bv, 
//            bw, bx, by, cb, 
//            ca, bz, bs, bt

public final class bq
    implements c
{

    private static bq a;
    private Activity b;
    private AlertDialog c;
    private h d;
    private boolean e;
    private ProgressBar f;
    private boolean g;
    private boolean h;
    private boolean i;

    private bq(boolean flag, Activity activity)
    {
        g = false;
        h = false;
        i = false;
        b = activity;
        e = flag;
        com.roidapp.photogrid.c.g.a();
    }

    public static bq a(boolean flag, Activity activity)
    {
        if (a == null)
        {
            activity = new bq(flag, activity);
            a = activity;
            return activity;
        } else
        {
            return a;
        }
    }

    static void a(bq bq1)
    {
        if (bq1.h)
        {
            String s = com.roidapp.cloudlib.a.a.a(bq1.b).a("version3", "version_name");
            s = (new StringBuilder()).append(s).append("_show_update_tips").toString();
            PreferenceManager.getDefaultSharedPreferences(bq1.b).edit().putBoolean(s, false).apply();
        }
    }

    private void a(boolean flag)
    {
        File file = new File((new StringBuilder()).append(k()).append("photoGrid.apk").toString());
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        if (!com.roidapp.photogrid.c.a.a(file).equals(PreferenceManager.getDefaultSharedPreferences(b).getString("update_md5", ""))) goto _L4; else goto _L3
_L3:
        Intent intent;
        try
        {
            Runtime.getRuntime().exec((new StringBuilder("chmod 777 ")).append(file).toString());
            String s = (new StringBuilder("chmod 777 ")).append(file.getParent()).toString();
            Runtime.getRuntime().exec(s);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        Toast.makeText(b, (new StringBuilder()).append(k()).append("photoGrid.apk").toString(), 0).show();
        intent = new Intent();
        intent.addFlags(0x10000000);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        b.startActivity(intent);
_L6:
        return;
_L4:
        file.delete();
        if (!flag)
        {
            com.roidapp.photogrid.c.d.a(b, this).a("http://dl.pg.ksmobile.com/update/photoGrid.apk");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!flag)
        {
            com.roidapp.photogrid.c.d.a(b, this).a("http://dl.pg.ksmobile.com/update/photoGrid.apk");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(bq bq1, String s)
    {
        return bq1.a(s);
    }

    private boolean a(String s)
    {
        return n.a(b, s);
    }

    static AlertDialog b(bq bq1)
    {
        return bq1.c;
    }

    static boolean c(bq bq1)
    {
        return bq1.h;
    }

    public static void d()
    {
        if (a != null)
        {
            if (a.d != null)
            {
                a.d.a();
            }
            com.roidapp.photogrid.c.d.a();
            a = null;
        }
    }

    static boolean d(bq bq1)
    {
        return bq1.i;
    }

    static boolean e(bq bq1)
    {
        bq1.i = false;
        return false;
    }

    private String k()
    {
        String s = Environment.getExternalStorageDirectory().getAbsolutePath();
        return com.roidapp.photogrid.c.a.a(PreferenceManager.getDefaultSharedPreferences(b).getString("SAVEPATH", s));
    }

    public final void a()
    {
        if (l.b(aj.a()))
        {
            if (!e && a("com.android.vending"))
            {
                com.roidapp.photogrid.common.b.a("Update/GooglePlay");
                c();
                d();
            } else
            {
                com.roidapp.photogrid.common.b.a("Update/Http");
                d = new h(b, this, g, false);
                d.execute(new String[] {
                    "http://dl.pg.ksmobile.com/update/update2"
                });
            }
            h = false;
            return;
        } else
        {
            a(b.a, b.getString(0x7f070147));
            return;
        }
    }

    public final void a(int i1, String s, String s1, int j1)
    {
        if (c != null)
        {
            c.dismiss();
        }
        i1;
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 169
    //                   3 604
    //                   4 734;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        s = LayoutInflater.from(b).inflate(0x7f03008d, null);
        ((TextView)s.findViewById(0x7f0d021d)).setText(0x7f070055);
        c = (new android.app.AlertDialog.Builder(b)).setTitle(0x7f070054).setView(s).setNegativeButton(0x7f070053, new bu(this)).setOnKeyListener(new br(this)).create();
        c.setCanceledOnTouchOutside(false);
        if (b != null && !b.isFinishing() && c != null)
        {
            c.show();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = n.c(b);
        Object obj = n.d(b);
        if (g)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 > i1)
        {
            obj = LayoutInflater.from(b).inflate(0x7f03008e, null);
            TextView textview = (TextView)((View) (obj)).findViewById(0x7f0d021f);
            TextView textview1 = (TextView)((View) (obj)).findViewById(0x7f0d0225);
            TextView textview2 = (TextView)((View) (obj)).findViewById(0x7f0d0226);
            TextView textview3 = (TextView)((View) (obj)).findViewById(0x7f0d0227);
            c = (new android.app.AlertDialog.Builder(b)).setView(((View) (obj))).create();
            c.setOnDismissListener(new bv(this));
            textview.setText(0x7f0701cf);
            textview1.setText(s1);
            textview2.setOnClickListener(new bw(this));
            textview3.setOnClickListener(new bx(this, s));
        } else
        if (!h)
        {
            c = (new android.app.AlertDialog.Builder(b)).setTitle(0x7f0701f9).setMessage((new StringBuilder()).append(b.getString(0x7f0701a3)).append(":").append(((String) (obj))).toString()).setPositiveButton(0x7f07010e, new by(this)).create();
        }
        if (b != null && !b.isFinishing() && c != null)
        {
            c.show();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (j1 <= i1 || j1 <= PreferenceManager.getDefaultSharedPreferences(b).getInt("lastSilentCheckCode", 0)) goto _L1; else goto _L6
_L6:
        AlarmManager alarmmanager = (AlarmManager)b.getSystemService("alarm");
        Intent intent = new Intent((new StringBuilder()).append(b.getPackageName()).append("_show_new_notification").toString());
        intent.putExtra("NEW_VERSION_CODE", j1);
        intent.putExtra("NEW_VERSION", s);
        intent.putExtra("NEW_VERSION_WHAT", s1);
        s = PendingIntent.getBroadcast(b, 0, intent, 0);
        alarmmanager.cancel(s);
        alarmmanager.set(0, System.currentTimeMillis() + 0x6ddd00L, s);
        return;
_L4:
        s = LayoutInflater.from(b).inflate(0x7f030006, null);
        f = (ProgressBar)s.findViewById(0x7f0d0045);
        c = (new android.app.AlertDialog.Builder(b)).setView(s).setPositiveButton(0x7f070038, new cb(this)).setNegativeButton(0x7f070036, new ca(this)).setOnKeyListener(new bz(this)).create();
        c.setCanceledOnTouchOutside(false);
        if (b != null && !b.isFinishing() && c != null)
        {
            c.show();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        c = (new android.app.AlertDialog.Builder(b)).setTitle(0x7f070146).setMessage(s).setPositiveButton(0x7f07010e, new bs(this)).create();
        if (!h && b != null && !b.isFinishing() && c != null)
        {
            c.show();
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public final void a(b b1, String s)
    {
        com.roidapp.photogrid.c.g.b((new StringBuilder()).append(b1.a()).toString(), s);
        s = "";
        com.roidapp.photogrid.common.bt.a[b1.ordinal()];
        JVM INSTR tableswitch 1 5: default 68
    //                   1 79
    //                   2 93
    //                   3 107
    //                   4 121
    //                   5 135;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        b1 = s;
_L8:
        a(4, ((String) (b1)), null, 0);
        return;
_L2:
        b1 = b.getString(0x7f070147);
        continue; /* Loop/switch isn't completed */
_L3:
        b1 = b.getString(0x7f070143);
        continue; /* Loop/switch isn't completed */
_L4:
        b1 = b.getString(0x7f070144);
        continue; /* Loop/switch isn't completed */
_L5:
        b1 = b.getString(0x7f070145);
        continue; /* Loop/switch isn't completed */
_L6:
        b1 = b.getString(0x7f070148);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(String s, int i1, String s1)
    {
        a(2, s, s1, i1);
    }

    public final transient void a(Integer ainteger[])
    {
        f.setProgress(ainteger[0].intValue());
    }

    public final void b()
    {
        if (l.b(aj.a()))
        {
            h = true;
            d = new h(b, this, true, true);
            d.execute(new String[] {
                "http://dl.pg.ksmobile.com/update/update2"
            });
        }
    }

    public final void c()
    {
        Activity activity;
        Intent intent;
        boolean flag1;
        flag1 = true;
        activity = b;
        intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x10000000);
        intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        intent.setData(Uri.parse("market://details?id=com.roidapp.photogrid"));
        activity.startActivity(intent);
        boolean flag = true;
_L3:
        if (flag) goto _L2; else goto _L1
_L1:
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setPackage("com.android.vending");
        intent1.addFlags(0x10000000);
        intent1.setData(Uri.parse("market://details?id=com.roidapp.photogrid"));
        activity.startActivity(intent1);
        flag = flag1;
_L4:
        if (!flag)
        {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.roidapp.photogrid"));
            intent2.setFlags(0x10000000);
            activity.startActivity(intent2);
        }
_L2:
        return;
        Object obj;
        obj;
        ((ActivityNotFoundException) (obj)).printStackTrace();
        flag = false;
          goto _L3
        obj;
        ((Exception) (obj)).printStackTrace();
        flag = false;
          goto _L4
    }

    public final void e()
    {
        if (!g)
        {
            a(1, null, null, 0);
        }
    }

    public final void f()
    {
        if (d != null)
        {
            d.a();
        }
    }

    public final void g()
    {
        if (com.roidapp.photogrid.c.a.a("").equals(""))
        {
            a(b.e, "");
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public final void h()
    {
        a(3, null, null, 0);
    }

    public final void i()
    {
        if (c != null)
        {
            c.dismiss();
        }
        a(true);
    }

    public final void j()
    {
        Toast.makeText(b, b.getString(0x7f070049), 0).show();
        com.roidapp.photogrid.c.d.a();
    }
}
