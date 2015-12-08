// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acm extends abR
{

    public static final abR b = new acm();

    private acm()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final void a(aeG aeg, abL abl)
    {
        int i = ((ace)abl).b();
        a(aeg, a(abl, 0), (short)i);
    }

    public final boolean a(abL abl)
    {
        if (!(abl instanceof ace) || ((aeN) (abl.e)).K.length != 0)
        {
            return false;
        }
        abl = (ace)abl;
        if (abl.g())
        {
            return a(((ace) (abl)));
        } else
        {
            return true;
        }
    }

    public final boolean a(ace ace1)
    {
        int i = ace1.b();
        return i != 0 && d(i);
    }

}
