// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ojp extends ojn
{

    public ojp()
    {
        super(Arrays.asList(new ojm[] {
            ojm.b, ojm.d
        }));
    }

    public final ojm a(ojm ojm1)
    {
        ojm ojm2 = super.a(ojm1);
        ojm1 = ojm2;
        if (ojm2 == ojm.c)
        {
            ojm1 = ojm.b;
        }
        return ojm1;
    }

    public final ojm c(ojm ojm1)
    {
        ojm ojm2 = ojm1;
        if (ojm1 == ojm.c)
        {
            ojm2 = ojm.d;
        }
        return ojm2;
    }
}
