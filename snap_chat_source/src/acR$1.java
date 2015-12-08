// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements ang.Object
{

    private acU a;

    public final int a(aec aec)
    {
        acU acu = a;
        if (aec instanceof aey)
        {
            aec = acu.f.a(aec);
        } else
        if (aec instanceof aez)
        {
            aec = acu.g.a(aec);
        } else
        if (aec instanceof aef)
        {
            aec = acu.j.a(aec);
        } else
        if (aec instanceof ael)
        {
            aec = acu.i.a(aec);
        } else
        {
            aec = null;
        }
        if (aec == null)
        {
            return -1;
        } else
        {
            return aec.c();
        }
    }

    (acU acu)
    {
        a = acu;
        super();
    }
}
