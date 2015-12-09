// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

final class ang.Object
    implements android.content.Preferences.OnSharedPreferenceChangeListener
{

    private cxt a;

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        synchronized (cxt.e())
        {
            cxt.a(a);
            cxt.f();
        }
        return;
        s;
        sharedpreferences;
        JVM INSTR monitorexit ;
        throw s;
    }

    (cxt cxt1)
    {
        a = cxt1;
        super();
    }
}
