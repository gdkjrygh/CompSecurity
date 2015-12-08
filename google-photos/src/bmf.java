// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Set;

final class bmf
    implements bwu
{

    private SharedPreferences a;
    private String b;

    bmf(bmc bmc, SharedPreferences sharedpreferences, String s)
    {
        a = sharedpreferences;
        b = s;
        super();
    }

    public final Set a()
    {
        return a.getStringSet(b, Collections.emptySet());
    }

    public final void a(Set set)
    {
        a.edit().putStringSet(b, set).apply();
    }

    public final void b()
    {
        a.getString("dummy", null);
    }
}
