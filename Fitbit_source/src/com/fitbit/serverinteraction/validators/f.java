// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import java.util.EnumSet;

// Referenced classes of package com.fitbit.serverinteraction.validators:
//            FitbitResponseValidator, e, b

public class f
{

    public static final String a = "com.fitbit.serverinteraction.validators.Validators.ACTION_INCORRECT_TIMESTAMP";
    private static final EnumSet b;
    private static final FitbitResponseValidator c;
    private static final FitbitResponseValidator d;
    private static final FitbitResponseValidator e = new FitbitResponseValidator(null);
    private static final e f = new e();
    private static final b g = new b();

    public f()
    {
    }

    public static FitbitResponseValidator a()
    {
        return c;
    }

    public static FitbitResponseValidator b()
    {
        return d;
    }

    public static FitbitResponseValidator c()
    {
        return e;
    }

    public static e d()
    {
        return f;
    }

    public static b e()
    {
        return g;
    }

    static 
    {
        b = EnumSet.of(FitbitResponseValidator.FitbitServerError.a, FitbitResponseValidator.FitbitServerError.g, FitbitResponseValidator.FitbitServerError.b, FitbitResponseValidator.FitbitServerError.h);
        c = new FitbitResponseValidator(EnumSet.of(FitbitResponseValidator.FitbitServerError.a, new FitbitResponseValidator.FitbitServerError[] {
            FitbitResponseValidator.FitbitServerError.c, FitbitResponseValidator.FitbitServerError.d, FitbitResponseValidator.FitbitServerError.e, FitbitResponseValidator.FitbitServerError.f, FitbitResponseValidator.FitbitServerError.g, FitbitResponseValidator.FitbitServerError.i
        }));
        d = new FitbitResponseValidator(b);
    }
}
