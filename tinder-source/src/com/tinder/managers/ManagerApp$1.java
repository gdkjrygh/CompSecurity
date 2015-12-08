// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.squareup.okhttp.c;
import com.squareup.okhttp.internal.b;
import com.squareup.picasso.m;
import com.tinder.utils.v;
import java.io.IOException;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, i

final class a
    implements ComponentCallbacks2
{

    final m a;
    final ManagerApp b;

    public final void onConfigurationChanged(Configuration configuration)
    {
    }

    public final void onLowMemory()
    {
        v.a("Low memory warning!");
    }

    public final void onTrimMemory(int j)
    {
        switch (j)
        {
        default:
            return;

        case 60: // '<'
            v.a("Trimming memory moderate");
            try
            {
                b.j.b.a();
                return;
            }
            catch (IOException ioexception)
            {
                v.a("Failed to clear HTTP Cache", ioexception);
            }
            return;

        case 10: // '\n'
            v.a("Trimming memory running low");
            ManagerApp.a(b, a);
            return;

        case 15: // '\017'
            v.a("Trimming memory critical");
            ManagerApp.a(b, a);
            return;

        case 20: // '\024'
            v.a("Trimming memory UI hidden");
            ManagerApp.a(b, a);
            b.k.m();
            try
            {
                b.j.b.a();
                return;
            }
            catch (IOException ioexception1)
            {
                v.a("Failed to clear HTTP Cache", ioexception1);
            }
            return;

        case 40: // '('
            v.a("Trimming memory background");
            ManagerApp.a(b, a);
            return;

        case 80: // 'P'
            v.a("Trimming memory complete");
            ManagerApp.a(b, a);
            return;
        }
    }

    (ManagerApp managerapp, m m)
    {
        b = managerapp;
        a = m;
        super();
    }
}
