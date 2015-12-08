// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class auo
    implements atm
{

    private final atj a;

    public auo()
    {
        this(null);
    }

    public auo(atj atj1)
    {
        a = atj1;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        ani = (ata)obj;
        obj = ani;
        if (a != null)
        {
            obj = (ata)a.a(ani, 0, 0);
            if (obj == null)
            {
                a.a(ani, 0, 0, ani);
                obj = ani;
            }
        }
        return new atn(((ane) (obj)), new anx(((ata) (obj))));
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
