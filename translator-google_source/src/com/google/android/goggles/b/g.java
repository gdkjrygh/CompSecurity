// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.a.c.d;
import com.google.android.apps.gsa.speech.c.a.b;
import com.google.android.apps.gsa.speech.c.a.c;
import com.google.bionics.goggles.api2.j;
import com.google.bionics.goggles.api2.t;

// Referenced classes of package com.google.android.goggles.b:
//            h

public final class g
    implements b
{

    final String a;
    final String b;
    final t c;
    final j d;
    private final Context e;

    public g(Context context, String s, String s1, t t, j j)
    {
        e = context;
        a = s;
        b = s1;
        c = t;
        d = j;
    }

    public final c a()
    {
        return new c(new d[] {
            new h(this)
        });
    }

    final String b()
    {
        String s;
        try
        {
            s = e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        return s;
    }
}
