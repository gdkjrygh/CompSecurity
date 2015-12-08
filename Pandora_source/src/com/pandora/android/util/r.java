// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.provider.b;
import com.pandora.radio.data.af;
import com.pandora.radio.util.i;
import java.util.Locale;

public class r
{

    private static final Locale a = new Locale("en", "AU");
    private static final Locale b = new Locale("en", "NZ");
    private static Locale c;

    static Locale a(Locale locale)
    {
        c = locale;
        return locale;
    }

    public static void a(Context context, Intent intent)
    {
        String as[] = new String[4];
        as[0] = "AU";
        as[1] = "NZ";
        as[2] = "US";
        as[3] = "Default";
        context = (new android.app.AlertDialog.Builder(context)).setTitle("Select locale").setItems(as, new android.content.DialogInterface.OnClickListener(as) {

            final String a[];

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j == a.length - 1)
                {
                    r.a(null);
                    return;
                } else
                {
                    r.a(new Locale("en", a[j]));
                    return;
                }
            }

            
            {
                a = as;
                super();
            }
        }).create();
        context.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(intent) {

            final Intent a;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (a != null)
                {
                    b.a.C().a(a);
                }
            }

            
            {
                a = intent;
                super();
            }
        });
        context.show();
    }

    public static void a(String s)
    {
        if ("US".equals(s) || "AU".equals(s) || "NZ".equals(s))
        {
            c = new Locale("en", s);
        }
    }

    public static boolean a()
    {
        Locale locale = d();
        return locale.equals(a) || locale.equals(b);
    }

    public static boolean a(int j)
    {
        j = i.a(j);
        return a() && j <= 15;
    }

    public static boolean b()
    {
        return a(b.a.d().k());
    }

    public static String c()
    {
        Locale locale = d();
        if (locale.equals(a))
        {
            return "AU";
        }
        if (locale.equals(b))
        {
            return "NZ";
        } else
        {
            return "US";
        }
    }

    private static Locale d()
    {
        if (c == null)
        {
            return Locale.getDefault();
        } else
        {
            return c;
        }
    }

}
