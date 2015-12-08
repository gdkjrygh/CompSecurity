// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ojj extends ojn
{

    public ojj()
    {
        super(Arrays.asList(new ojm[] {
            ojm.b, ojm.c
        }));
    }

    public final ojm a(ojm ojm1)
    {
        return ojm.b;
    }

    public final ojm b(ojm ojm1)
    {
        return ojm.c;
    }

    public final ojm c(ojm ojm1)
    {
        ojm ojm2;
        if (ojm1 == ojm.a)
        {
            ojm2 = ojm.b;
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
