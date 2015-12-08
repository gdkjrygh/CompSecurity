// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.content.res.Resources;

public final class bqz
    implements blg
{

    public final SharedPreferences a;
    final String b;
    public final String c;

    public bqz(SharedPreferences sharedpreferences, Resources resources)
    {
        a = (SharedPreferences)b.a(sharedpreferences, "preferences", null);
        b = resources.getString(c.aJ);
        resources.getString(c.aL);
        resources.getString(c.aK);
        resources.getString(c.aM);
        c = resources.getString(c.aN);
    }

    public final void d()
    {
        a.getString("dummy", null);
    }
}
