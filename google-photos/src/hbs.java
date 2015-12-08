// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hbs
    implements ftw, omb, opv
{

    private ame a;
    private flj b;

    public hbs(opd opd1)
    {
        opd1.a(this);
    }

    public final ame a(amh amh1, fli fli1, gap gap)
    {
        if (a == null)
        {
            if (b == flj.a)
            {
                fli1 = fli1.e();
            } else
            {
                fli1 = fli1.g();
            }
            a = amh1.f().a(fli1).a(ayt.b(amb.b));
        }
        return a.a(gap);
    }

    public final hbs a(olm olm1)
    {
        olm1.a(ftw, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (flj)olm1.b(flj);
        if (b == null)
        {
            b = flj.b;
        }
    }
}
