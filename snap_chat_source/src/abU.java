// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abU extends acg
{

    final adV a;

    private abU(adZ adz, adV adv)
    {
        super(adz);
        if (adv == null)
        {
            throw new NullPointerException("locals == null");
        } else
        {
            a = adv;
            return;
        }
    }

    public final abL a(adU adu)
    {
        return new abU(super.d, a);
    }

    protected final String a()
    {
        return a.toString();
    }

    public final abL c(int i)
    {
        return new abU(super.d, a.b(i));
    }
}
