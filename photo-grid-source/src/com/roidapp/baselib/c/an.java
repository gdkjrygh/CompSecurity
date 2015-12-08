// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.InflateException;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;

public final class an
{

    protected static Toast a = null;
    protected static Toast b = null;
    protected static Toast c = null;
    private static String d;
    private static long e = 0L;
    private static long f = 0L;

    public static void a(Context context, int i)
    {
        if (context != null)
        {
            Resources resources = context.getResources();
            if (resources != null)
            {
                a(new WeakReference(context), resources.getString(i));
            }
        }
    }

    public static void a(Context context, String s)
    {
        a(new WeakReference(context), s);
    }

    public static void a(WeakReference weakreference, String s)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        weakreference = (Context)weakreference.get();
        if (weakreference != null)
        {
            try
            {
                weakreference = Toast.makeText(weakreference.getApplicationContext(), s, 0);
                a = weakreference;
                weakreference.show();
                e = System.currentTimeMillis();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference)
            {
                weakreference.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference)
            {
                weakreference.printStackTrace();
            }
        }
_L4:
        e = f;
        return;
_L2:
        f = System.currentTimeMillis();
        if (s == d)
        {
            if (f - e > 0L)
            {
                a.show();
            }
        } else
        {
            d = s;
            a.setText(s);
            a.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b(WeakReference weakreference, String s)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        weakreference = (Context)weakreference.get();
        if (weakreference != null)
        {
            try
            {
                weakreference = Toast.makeText(weakreference.getApplicationContext(), s, 0);
                c = weakreference;
                weakreference.setGravity(17, 0, 0);
                c.show();
                e = System.currentTimeMillis();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference)
            {
                weakreference.printStackTrace();
            }
        }
_L4:
        e = f;
        return;
_L2:
        f = System.currentTimeMillis();
        if (s.equals(d))
        {
            if (f - e > 0L)
            {
                c.setGravity(17, 0, 0);
                c.show();
            }
        } else
        {
            d = s;
            c.setText(s);
            c.setGravity(17, 0, 0);
            c.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void c(WeakReference weakreference, String s)
    {
        weakreference = (Context)weakreference.get();
        if (weakreference == null)
        {
            return;
        }
        if (b != null) goto _L2; else goto _L1
_L1:
        Toast toast = (Toast)(new WeakReference(new Toast(weakreference.getApplicationContext()))).get();
        b = toast;
        if (toast != null)
        {
            weakreference = new TextView(weakreference.getApplicationContext());
            weakreference.setText(s);
            weakreference.setGravity(17);
            weakreference.setBackgroundResource(0x1080096);
            b.setDuration(0);
            b.setView(weakreference);
            b.show();
            e = System.currentTimeMillis();
        }
_L4:
        e = f;
        return;
_L2:
        f = System.currentTimeMillis();
        if (s.equals(d))
        {
            if (f - e > 0L)
            {
                weakreference = (TextView)b.getView();
                weakreference.setText(s);
                b.setView(weakreference);
                b.show();
            }
        } else
        {
            d = s;
            weakreference = (TextView)b.getView();
            weakreference.setText(s);
            b.setView(weakreference);
            b.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
