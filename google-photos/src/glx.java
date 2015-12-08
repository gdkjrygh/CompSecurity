// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class glx
    implements gqc
{

    private ehr a;
    private glw b;

    public glx(glw glw1, ehr ehr)
    {
        b = glw1;
        a = ehr;
        super();
    }

    public final int a()
    {
        Integer integer = b.b.b(a);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            return 0;
        }
    }

    public final int a(ekp ekp1)
    {
        ekp1 = b.b.a(a, ekp1);
        if (ekp1 == null)
        {
            return -1;
        } else
        {
            return ekp1.intValue();
        }
    }

    public final ekp a(int i)
    {
        return (ekp)b.b.b(a, i);
    }
}
