// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.Intent;
import com.appboy.Constants;

// Referenced classes of package bo.app:
//            ch, dz, ad, by, 
//            bx, eo, eg, em

public class at
{

    private static final String a;
    private final ch b;
    private final dz c;
    private final ad d;
    private final by e;
    private final bx f;
    private final Context g;
    private final eo h;
    private final Intent i;
    private final eg j;
    private final em k;

    public at(ch ch, dz dz, ad ad, by by, bx bx, Context context, eo eo, 
            eg eg, em em)
    {
        b = ch;
        c = dz;
        d = ad;
        e = by;
        f = bx;
        g = context;
        h = eo;
        i = new Intent((new StringBuilder()).append(context.getPackageName()).append(".intent.APPBOY_DISPATCH_ALARM_EXPIRED").toString());
        j = eg;
        k = em;
    }

    static by a(at at1)
    {
        return at1.e;
    }

    static String a()
    {
        return a;
    }

    static dz b(at at1)
    {
        return at1.c;
    }

    static eo c(at at1)
    {
        return at1.h;
    }

    static eg d(at at1)
    {
        return at1.j;
    }

    static em e(at at1)
    {
        return at1.k;
    }

    static ad f(at at1)
    {
        return at1.d;
    }

    static ch g(at at1)
    {
        return at1.b;
    }

    static Intent h(at at1)
    {
        return at1.i;
    }

    static Context i(at at1)
    {
        return at1.g;
    }

    static bx j(at at1)
    {
        return at1.f;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/at.getName()
        });
    }
}
