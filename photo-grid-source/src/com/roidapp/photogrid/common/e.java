// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.d;

// Referenced classes of package com.roidapp.photogrid.common:
//            b, j, i, h, 
//            k, f, g

public final class e
{

    private static e a;
    private Activity b;
    private String c;
    private boolean d;

    private e(Activity activity, String s, boolean flag)
    {
        b = activity;
        c = s;
        d = flag;
    }

    public static e a(Activity activity, String s, boolean flag)
    {
        if (a == null)
        {
            a = new e(activity, s, flag);
        }
        return a;
    }

    static String a(e e1)
    {
        return e1.c;
    }

    static void a(e e1, String s, String s1, String s2)
    {
        if (!n.a(e1.b, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(e1.c).append("/").append(s2).append("/").append(s).append("Click/GooglePlay").toString());
        s1 = Uri.parse((new StringBuilder("market://details?id=")).append(s).append("&referrer=utm_source%3D200018%26utm_campaign%3Dphotogrid").toString());
        s2 = new Intent("android.intent.action.VIEW");
        s2.setFlags(0x10000000);
        s2.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
        s2.setData(s1);
        e1.b.startActivity(s2);
_L1:
        return;
        s1;
        s1.printStackTrace();
        s = Uri.parse((new StringBuilder("market://details?id=")).append(s).append("&referrer=utm_source%3D200018%26utm_campaign%3Dphotogrid").toString());
        s1 = new Intent("android.intent.action.VIEW");
        s1.setPackage("com.android.vending");
        s1.setFlags(0x10000000);
        s1.setData(s);
        try
        {
            e1.b.startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            return;
        }
        if (!s1.equals(""))
        {
            com.roidapp.photogrid.common.b.a((new StringBuilder()).append(e1.c).append("/").append(s2).append("/").append(s).append("Click/Http").toString());
            try
            {
                s = new Intent("android.intent.action.VIEW");
                s.setData(Uri.parse(s1));
                s.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                e1.b.startActivity(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            try
            {
                s = new Intent("android.intent.action.VIEW");
                s.setData(Uri.parse(s1));
                s.setPackage("com.android.browser");
                e1.b.startActivity(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            s = new Intent("android.intent.action.VIEW", Uri.parse(s1));
            s.setFlags(0x10000000);
            e1.b.startActivity(s);
            return;
        }
          goto _L1
    }

    static Activity b(e e1)
    {
        return e1.b;
    }

    static boolean c(e e1)
    {
        return e1.d;
    }

    public final void a()
    {
        Object obj;
        if (d)
        {
            obj = "Share";
        } else
        {
            obj = "Save";
        }
        if (b != null && !b.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        d d1;
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(c).append(((String) (obj))).append("/com.cleanmaster.mguard/Click/Description").toString());
        d1 = com.roidapp.cloudlib.ads.d.a(b);
        d1.h("com.cleanmaster.mguard");
        JVM INSTR tableswitch 1 1: default 363
    //                   1 256;
           goto _L3 _L4
_L3:
        View view = LayoutInflater.from(b).inflate(0x7f030087, null);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d0205);
        ((TextView)view.findViewById(0x7f0d0206)).setText(d1.d("com.cleanmaster.mguard"));
        imageview.setImageDrawable(d1.c("com.cleanmaster.mguard"));
        obj = (new android.app.AlertDialog.Builder(b)).setView(view).setPositiveButton(d1.e("com.cleanmaster.mguard"), new j(this, ((String) (obj)), d1)).setNegativeButton(d1.f("com.cleanmaster.mguard"), new i(this, ((String) (obj)))).setOnKeyListener(new h(this, ((String) (obj)))).create();
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).setOnDismissListener(new k(this));
        ((AlertDialog) (obj)).show();
        if (a != null)
        {
            a = null;
            return;
        }
          goto _L1
_L4:
        try
        {
            RelativeLayout relativelayout = (RelativeLayout)LayoutInflater.from(b).inflate(0x7f030032, null);
            ImageView imageview1 = (ImageView)relativelayout.findViewById(0x7f0d0108);
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(b)).create();
            imageview1.setBackgroundDrawable(d1.a("com.cleanmaster.mguard"));
            alertdialog.show();
            alertdialog.getWindow().setContentView(relativelayout);
            relativelayout.findViewById(0x7f0d0109).setOnClickListener(new f(this, alertdialog));
            imageview1.setOnClickListener(new g(this, d1, ((String) (obj)), alertdialog));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return;
        }
    }
}
