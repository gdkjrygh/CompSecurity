// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gim extends mtf
{

    private final boolean a;

    gim(boolean flag)
    {
        super("onboarding_prepare_accounts");
        a = flag;
    }

    protected final mue a(Context context)
    {
        try
        {
            context = (ngc)olm.a(context, ngc);
            ngf ngf1 = new ngf();
            ngf1.a = a;
            ngf1.b = 0L;
            ngf1.c = false;
            context.a(ngf1.a());
            context = new mue(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }

    public final String b(Context context)
    {
        return context.getString(b.sp);
    }
}
