// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.internal:
//            e

public final class n
{

    private final Context a;

    public n(Context context)
    {
        a = context;
    }

    private int a(String s, String s1)
    {
        int i;
        try
        {
            i = a.getResources().getIdentifier(s, s1, a.getPackageName());
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "%s resource with name %s not found", new Object[] {
                s1, s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return 0;
        }
        return i;
    }

    public static String a(Context context)
    {
        return (new n(context)).a("sdk_version_name");
    }

    public final String a(String s)
    {
        String s1;
        try
        {
            s1 = a.getString(a(s, "string"));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "String resource with name %s not found", new Object[] {
                s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return null;
        }
        return s1;
    }

    public final int b(String s)
    {
        int i;
        try
        {
            i = a.getResources().getDimensionPixelSize(a(s, "dimen"));
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "Dimen resource with name %s not found", new Object[] {
                s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return 0;
        }
        return i;
    }

    public final int c(String s)
    {
        int i;
        try
        {
            i = a(s, "layout");
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "Layout resource with name %s not found", new Object[] {
                s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return 0;
        }
        return i;
    }

    public final int d(String s)
    {
        int i;
        try
        {
            i = a(s, "id");
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "Id resource with name %s not found", new Object[] {
                s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return 0;
        }
        return i;
    }

    public final int e(String s)
    {
        int i;
        try
        {
            i = a(s, "menu");
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format(Locale.US, "Menu resource with name %s not found", new Object[] {
                s
            });
            com.microsoft.onlineid.internal.e.a(false);
            return 0;
        }
        return i;
    }
}
