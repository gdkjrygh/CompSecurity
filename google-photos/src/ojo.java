// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ojo extends ojn
{

    public ojo()
    {
        super(Arrays.asList(new ojm[] {
            ojm.a, ojm.c
        }));
    }

    public final ojm a(ojm ojm1)
    {
        return ojm.a;
    }

    public final ojm b(ojm ojm1)
    {
        return ojm.c;
    }

    public final ojm c(ojm ojm1)
    {
        ojm ojm2;
        if (ojm1 == ojm.b)
        {
            ojm2 = ojm.a;
        } else
        {
            ojm2 = ojm1;
            if (ojm1 == ojm.d)
            {
                return ojm.c;
            }
        }
        return ojm2;
    }
}
