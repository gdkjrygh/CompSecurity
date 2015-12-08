// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class bod extends cpe
{

    public final bnf e;
    public boolean f;

    public bod(bnf bnf1)
    {
        super(bnf1.b(), bnf1.c);
        e = bnf1;
    }

    protected final void a(cpc cpc1)
    {
        cpc1 = (clq)cpc1.b(clq);
        if (TextUtils.isEmpty(((clq) (cpc1)).b))
        {
            cpc1.b = e.g().b();
        }
        if (f && TextUtils.isEmpty(((clq) (cpc1)).d))
        {
            bmh bmh1 = e.f();
            cpc1.d = bmh1.c();
            cpc1.e = bmh1.b();
        }
    }
}
