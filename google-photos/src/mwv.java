// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.settings.CheckBoxPreference;

public final class mwv extends mwl
{

    public mwv()
    {
    }

    public final void r()
    {
        b = new oac(ad);
        Object obj = super.b;
        String s1 = a(b.EZ);
        String s = a(b.Fa);
        obj = new CheckBoxPreference(((oac) (obj)).a);
        ((CheckBoxPreference) (obj)).b(s1);
        ((CheckBoxPreference) (obj)).a_(s);
        ((CheckBoxPreference) (obj)).a(Boolean.valueOf(false));
        ((CheckBoxPreference) (obj)).d("debug.plus.frontend.tracing");
        if (true)
        {
            super.a.a(((nzw) (obj)));
            nzm nzm1 = super.b.d(a(b.Fc), a(b.Fb));
            nzm1.d("tracing_token_key");
            if (true)
            {
                super.a.a(nzm1);
                nzm1 = super.b.d(a(b.EY), a(b.EX));
                nzm1.d("tracing_pattern_key");
                nzm1.a("");
                if (true)
                {
                    super.a.a(nzm1);
                    return;
                } else
                {
                    throw new NullPointerException();
                }
            } else
            {
                throw new NullPointerException();
            }
        } else
        {
            throw new NullPointerException();
        }
    }
}
