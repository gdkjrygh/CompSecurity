// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nai
    implements mjx, nug
{

    private final nao a;
    private final nam b;
    private mjy c;

    nai(nao nao1, nam nam1)
    {
        a = nao1;
        b = nam1;
        nam1.a().a(this, false);
    }

    public final atb a(mjn mjn1)
    {
        return a.a(mjn1.c);
    }

    public final void a(mjy mjy1)
    {
        c = mjy1;
    }

    public final void b(mjn mjn1)
    {
        nam nam1 = b;
        mjn1 = String.valueOf(mjn1);
        nam1.a((new StringBuilder(String.valueOf(mjn1).length() + 27)).append("Fife model request failed: ").append(mjn1).toString());
    }

    public final void b_(Object obj)
    {
        if (c != null)
        {
            c.a();
        }
    }
}
