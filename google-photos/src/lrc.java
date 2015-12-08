// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class lrc
    implements jyx
{

    private lrb a;

    public lrc(lrb lrb1)
    {
        a = lrb1;
        super();
    }

    public final void a(jyw jyw)
    {
        jyw = (lpn)jyw;
        if (jyw.a_().b())
        {
            jyw = jyw.c();
        } else
        {
            jyw = null;
        }
        jyw = new lre(lrb.a(a), jyw, a.a());
        lrb.a(a, ((lre) (jyw)).a);
        lrb.b(a);
    }
}
