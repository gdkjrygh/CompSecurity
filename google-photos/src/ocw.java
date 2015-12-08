// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class ocw
{

    private static final String a;
    private static final String b;

    public ocw()
    {
    }

    public static String a(Bundle bundle)
    {
        if (!bundle.containsKey(a))
        {
            throw new IllegalStateException("AccountName is not populated for this bundle");
        } else
        {
            return bundle.getString(a);
        }
    }

    public static void a(Context context, Bundle bundle)
    {
        if (!bundle.containsKey(b))
        {
            bundle.putInt(b, b.g(context));
        }
    }

    public static void a(Context context, mru mru1, Bundle bundle)
    {
        if (!bundle.containsKey(a))
        {
            mrw mrw1 = (mrw)olm.a(context, mrw);
            bundle.putString(a, mru1.a(context, mrw1));
        }
    }

    public static void a(Bundle bundle, int i)
    {
        if (!bundle.containsKey(b))
        {
            bundle.putInt(b, i);
        }
    }

    public static void a(Bundle bundle, String s)
    {
        if (!bundle.containsKey(a))
        {
            bundle.putString(a, null);
        }
    }

    public static int b(Bundle bundle)
    {
        if (!bundle.containsKey(b))
        {
            throw new IllegalStateException("AppId is not populated for this bundle");
        } else
        {
            return bundle.getInt(b);
        }
    }

    static 
    {
        a = Integer.toString(b.HX);
        b = Integer.toString(b.HY);
    }
}
