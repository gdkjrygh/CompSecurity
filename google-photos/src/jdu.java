// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdu
    implements jel
{

    private jel a;
    private jek b;

    public jdu()
    {
    }

    public final void a(jek jek)
    {
        if (a != null)
        {
            a.a(jek);
        }
        b = jek;
    }

    public final void a(jel jel1)
    {
        a = jel1;
        if (jel1 != null && b != null)
        {
            jel1.a(b);
        }
    }
}
