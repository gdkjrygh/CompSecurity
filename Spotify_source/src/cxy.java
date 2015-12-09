// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Callable;

final class cxy
    implements Callable
{

    private final Context a;
    private final String b;
    private final cxz c;

    public cxy(Context context, String s, cxz cxz1)
    {
        a = context;
        b = s;
        c = cxz1;
    }

    public final Object call()
    {
        android.content.SharedPreferences sharedpreferences = a.getSharedPreferences(b, 0);
        if (c != null)
        {
            c.a(sharedpreferences);
        }
        return sharedpreferences;
    }
}
