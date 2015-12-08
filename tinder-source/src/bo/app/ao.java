// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.Intent;
import com.appboy.Constants;

// Referenced classes of package bo.app:
//            cb, dt, z, bs, 
//            br, ei, ea, eg

public class ao
{

    private static final String a;
    private final cb b;
    private final dt c;
    private final z d;
    private final bs e;
    private final br f;
    private final Context g;
    private final ei h;
    private final Intent i;
    private final ea j;
    private final eg k;

    public ao(cb cb, dt dt, z z, bs bs, br br, Context context, ei ei, 
            ea ea, eg eg)
    {
        b = cb;
        c = dt;
        d = z;
        e = bs;
        f = br;
        g = context;
        h = ei;
        i = new Intent((new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_DISPATCH_ALARM_EXPIRED").toString());
        j = ea;
        k = eg;
    }

    static bs a(ao ao1)
    {
        return ao1.e;
    }

    static String a()
    {
        return a;
    }

    static dt b(ao ao1)
    {
        return ao1.c;
    }

    static ei c(ao ao1)
    {
        return ao1.h;
    }

    static ea d(ao ao1)
    {
        return ao1.j;
    }

    static eg e(ao ao1)
    {
        return ao1.k;
    }

    static z f(ao ao1)
    {
        return ao1.d;
    }

    static cb g(ao ao1)
    {
        return ao1.b;
    }

    static Intent h(ao ao1)
    {
        return ao1.i;
    }

    static Context i(ao ao1)
    {
        return ao1.g;
    }

    static br j(ao ao1)
    {
        return ao1.f;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ao.getName()
        });
    }
}
