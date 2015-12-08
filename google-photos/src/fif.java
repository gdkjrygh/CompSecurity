// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fif extends mtf
{

    private final int a;
    private final String b;
    private final boolean c;

    public fif(int i, String s, boolean flag)
    {
        super("UpdateEnvelopeSettingsTask");
        boolean flag1;
        if (i != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        p.a(s, "must specify a non-empty media key");
        a = i;
        b = s;
        c = flag;
    }

    protected final mue a(Context context)
    {
        fie fie1 = new fie(a, b, c);
        ((hpz)olm.a(context, hpz)).a(a, fie1);
        boolean flag;
        if (fie1.a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new mue(flag);
    }
}
