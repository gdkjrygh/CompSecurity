// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.qihoo.security.appbox.core.c;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Locale;

public class a
{

    public static void a(Context context)
    {
        SharedPref.a(context, "google_play_rate_exp_need", false);
    }

    public static void a(Context context, c c1)
    {
        String s = c1.f;
        boolean flag = c1.a();
        if (TextUtils.isEmpty(s))
        {
            flag = false;
        } else
        {
            s = s.trim();
        }
        if (flag && a(s))
        {
            b(context, c1.k, s);
            return;
        } else
        {
            a(context, c1.k, s);
            return;
        }
    }

    public static void a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        String s1 = String.format(Locale.US, "https://play.google.com/store/apps/details?id=%s", new Object[] {
            s
        });
        if (o.a(context, "com.android.vending"))
        {
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                intent.addFlags(0x10000000);
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
                return;
            }
            catch (Exception exception)
            {
                c(context, s, s1);
            }
            return;
        } else
        {
            c(context, s, s1);
            return;
        }
    }

    public static void a(Context context, String s, String s1)
    {
        String s3;
        if (!o.a(context, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s3 = s1;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        String s2;
        s2 = s1;
        s3 = s1;
        if (!s.equals(s1))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        s3 = s1;
        s2 = String.format(Locale.US, "https://play.google.com/store/apps/details?id=%s", new Object[] {
            s
        });
        s3 = s2;
        s1 = new Intent("android.intent.action.VIEW", Uri.parse(s2));
        s3 = s2;
        s1.addFlags(0x10000000);
        s3 = s2;
        s1.setPackage("com.android.vending");
        s3 = s2;
        try
        {
            context.startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b(context, s, s3);
        }
        return;
        b(context, s, s1);
        return;
    }

    public static boolean a(String s)
    {
        return s.matches("^((https?|http)://)+\\S*");
    }

    public static void b(Context context, String s, String s1)
    {
        String s2;
        try
        {
            if (TextUtils.isEmpty(s1))
            {
                break MISSING_BLOCK_LABEL_17;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            q.a().a(0x7f0c0171);
            return;
        }
        s2 = s1;
        if (!s.equals(s1))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        s2 = String.format(Locale.US, "https://play.google.com/store/apps/details?id=%s", new Object[] {
            s
        });
        s = new Intent("android.intent.action.VIEW", Uri.parse(s2));
        s.addFlags(0x10000000);
        context.startActivity(s);
        return;
    }

    public static void c(Context context, String s, String s1)
    {
        String s2;
        try
        {
            if (TextUtils.isEmpty(s1))
            {
                break MISSING_BLOCK_LABEL_17;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            q.a().a(0x7f0c0171);
            return;
        }
        s2 = s1;
        if (!s.equals(s1))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        s2 = String.format(Locale.US, "https://play.google.com/store/apps/details?id=%s", new Object[] {
            s
        });
        s = new Intent("android.intent.action.VIEW", Uri.parse(s2));
        s1 = com.qihoo.security.ui.result.c.a(context);
        if (!TextUtils.isEmpty(s1))
        {
            s.setPackage(s1);
        }
        s.addFlags(0x10000000);
        context.startActivity(s);
        return;
    }
}
