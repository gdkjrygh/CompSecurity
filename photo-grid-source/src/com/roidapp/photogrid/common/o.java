// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.common:
//            p

public final class o
{

    public static String a;
    private Activity b;
    private String c[];
    private String d[];

    public o(Activity activity)
    {
label0:
        {
            super();
            b = activity;
            String s = Environment.getExternalStorageDirectory().getAbsolutePath();
            if (s != null)
            {
                activity = s;
                if (s.length() > 0)
                {
                    break label0;
                }
            }
            activity = "/mnt/sdcard";
        }
        a = activity;
    }

    public final void a()
    {
        try
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", b.getString(0x7f0702ba));
            intent.putExtra("android.intent.extra.SUBJECT", b.getString(0x7f0702bb));
            b.startActivity(Intent.createChooser(intent, b.getResources().getString(0x7f0701a5)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            activitynotfoundexception.printStackTrace();
        }
    }

    public final void b()
    {
        Object obj = new DisplayMetrics();
        b.getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        int i = ((DisplayMetrics) (obj)).widthPixels;
        int j = ((DisplayMetrics) (obj)).heightPixels;
        obj = new Intent("android.intent.action.SEND");
        c = (new String[] {
            "RoidApp@gmail.com"
        });
        ((Intent) (obj)).putExtra("android.intent.extra.EMAIL", c);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append(b.getString(0x7f07015c)).append("(V").append(n.d(b)).append(")").toString());
        stringbuilder.append("\n");
        stringbuilder.append((new StringBuilder("(Product Model:")).append(Build.MODEL).append(",SDK:").append(android.os.Build.VERSION.RELEASE).append(")").toString());
        stringbuilder.append((new StringBuilder(", (Resolution:")).append(j).append("x").append(i).append(")").toString());
        String s = p.a(b);
        if (!s.equals(""))
        {
            stringbuilder.append((new StringBuilder(", (Available Capacity: ")).append(s).append(")").toString());
        }
        stringbuilder.append((new StringBuilder(", (GPU Model ")).append(com.roidapp.baselib.gl.c.a().d(b)).toString()).append(")\n");
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", stringbuilder.toString());
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", b.getString(0x7f0702d2));
        ((Intent) (obj)).setType("text/plain");
        if (n.a(b, "com.google.android.gm"))
        {
            ((Intent) (obj)).setPackage("com.google.android.gm");
            ((Intent) (obj)).setFlags(0x10000000);
        }
        b.startActivity(Intent.createChooser(((Intent) (obj)), b.getResources().getString(0x7f070218)));
    }

    public final void c()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        c = (new String[] {
            "nanjingwei@ijinshan.com"
        });
        d = (new String[] {
            "RoidApp@gmail.com"
        });
        intent.putExtra("android.intent.extra.EMAIL", c);
        intent.putExtra("android.intent.extra.CC", d);
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.putExtra("android.intent.extra.SUBJECT", b.getString(0x7f070047));
        intent.setType("text/plain");
        if (n.a(b, "com.google.android.gm"))
        {
            intent.setPackage("com.google.android.gm");
            intent.setFlags(0x10000000);
        }
        b.startActivity(Intent.createChooser(intent, b.getResources().getString(0x7f070218)));
    }

    public final void d()
    {
        Object obj = new DisplayMetrics();
        b.getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        int i = ((DisplayMetrics) (obj)).widthPixels;
        int j = ((DisplayMetrics) (obj)).heightPixels;
        obj = new Intent("android.intent.action.SEND");
        c = (new String[] {
            "photogrid.cheetah@gmail.com"
        });
        ((Intent) (obj)).putExtra("android.intent.extra.EMAIL", c);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append(b.getString(0x7f07015c)).append("(V").append(n.d(b)).append(")").toString());
        stringbuilder.append("\n");
        stringbuilder.append((new StringBuilder("(Product Model:")).append(Build.MODEL).append(",SDK:").append(android.os.Build.VERSION.RELEASE).append(")").toString());
        stringbuilder.append((new StringBuilder(", (Resolution:")).append(j).append("x").append(i).append(")").toString());
        String s = p.a(b);
        if (!s.equals(""))
        {
            stringbuilder.append((new StringBuilder(", (Available Capacity: ")).append(s).append(")").toString());
        }
        stringbuilder.append((new StringBuilder(", (GPU Model ")).append(com.roidapp.baselib.gl.c.a().d(b)).toString()).append(")\n");
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", stringbuilder.toString());
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", b.getString(0x7f0702d2));
        ((Intent) (obj)).setType("text/plain");
        if (n.a(b, "com.google.android.gm"))
        {
            ((Intent) (obj)).setPackage("com.google.android.gm");
            ((Intent) (obj)).setFlags(0x10000000);
        }
        b.startActivity(Intent.createChooser(((Intent) (obj)), b.getResources().getString(0x7f070218)));
    }
}
