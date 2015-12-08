// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

public final class gvp extends nzc
{

    public List a;
    private String b;
    private String c;
    private qor d;

    public gvp(gvq gvq1)
    {
        super(gvq1.a, (new nyh()).a(gvq1.a, gvq1.b).a(), "copyphotosbyshare", new pan(), new pao());
        b = gvq1.c;
        c = gvq1.d;
        d = gvq1.e;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pan)qlw;
        pje pje1 = new pje();
        qlw.a = pje1;
        if (!TextUtils.isEmpty(b))
        {
            pje1.d = b;
            pje1.f = 3;
        } else
        {
            pje1.e = Boolean.valueOf(true);
            pje1.f = 1;
        }
        pje1.b = (new String[] {
            c
        });
        pje1.i = new qga();
        pje1.j = Boolean.valueOf(true);
        pje1.h = new pnp();
        pje1.h.a = d;
    }

    protected final void b(qlw qlw)
    {
        a = Arrays.asList(((pao)qlw).a.c);
    }
}
