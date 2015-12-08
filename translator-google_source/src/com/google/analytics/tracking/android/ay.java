// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

// Referenced classes of package com.google.analytics.tracking.android:
//            ax, aq

public final class ay
    implements ax
{

    private final Context a;

    public ay(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("Context cannot be null");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }

    private int a(String s, String s1)
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getResources().getIdentifier(s, s1, a.getPackageName());
        }
    }

    public final int a(String s, int i)
    {
        int j = a(s, "integer");
        if (j == 0)
        {
            return i;
        }
        int k;
        try
        {
            k = Integer.parseInt(a.getString(j));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aq.f((new StringBuilder("NumberFormatException parsing ")).append(a.getString(j)).toString());
            return i;
        }
        return k;
    }

    public final String a(String s)
    {
        int i = a(s, "string");
        if (i == 0)
        {
            return null;
        } else
        {
            return a.getString(i);
        }
    }

    public final Double b(String s)
    {
        s = a(s);
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        double d;
        try
        {
            d = Double.parseDouble(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            aq.f((new StringBuilder("NumberFormatException parsing ")).append(s).toString());
            return null;
        }
        return Double.valueOf(d);
    }

    public final boolean c(String s)
    {
        int i = a(s, "bool");
        if (i == 0)
        {
            return false;
        } else
        {
            return "true".equalsIgnoreCase(a.getString(i));
        }
    }
}
