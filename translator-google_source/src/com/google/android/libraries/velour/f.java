// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

public final class f extends ContextThemeWrapper
{

    Resources a;
    String b;
    ClassLoader c;
    private final f d;
    private android.content.res.Resources.Theme e;

    public f(Context context)
    {
        super(context, 0);
        d = this;
    }

    public f(Context context, f f1)
    {
        super(context, 0);
        d = f1;
    }

    public final Context a()
    {
        f f1 = this;
        do
        {
            if (f1.d == f1)
            {
                return f1.getBaseContext();
            }
            f1 = f1.d;
        } while (true);
    }

    public final Context getApplicationContext()
    {
        f f1 = this;
        do
        {
            if (f1.d == f1)
            {
                return f1;
            }
            f1 = f1.d;
        } while (true);
    }

    public final ClassLoader getClassLoader()
    {
        f f1;
        for (f1 = this; f1.c == null; f1 = f1.d)
        {
            if (f1.d == f1)
            {
                return f1.ContextThemeWrapper.getClassLoader();
            }
        }

        return f1.c;
    }

    public final String getPackageName()
    {
        f f1;
        for (f1 = this; f1.b == null; f1 = f1.d)
        {
            if (f1.d == f1)
            {
                return f1.ContextThemeWrapper.getPackageName();
            }
        }

        return f1.b;
    }

    public final Resources getResources()
    {
        f f1;
        for (f1 = this; f1.a == null; f1 = f1.d)
        {
            if (f1.d == f1)
            {
                return f1.ContextThemeWrapper.getResources();
            }
        }

        return f1.a;
    }

    public final android.content.res.Resources.Theme getTheme()
    {
        android.content.res.Resources.Theme theme;
        if (d == this)
        {
            theme = super.getTheme();
        } else
        {
            theme = d.getTheme();
        }
        if (a == null)
        {
            return theme;
        }
        if (e == null)
        {
            e = a.newTheme();
            e.setTo(theme);
        }
        return e;
    }
}
