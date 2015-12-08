// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ojn
{

    public final List a;

    public ojn()
    {
        this(Arrays.asList(new ojm[] {
            ojm.b, ojm.c, ojm.d
        }));
    }

    protected ojn(List list)
    {
        a = Collections.unmodifiableList(list);
    }

    public ojm a(ojm ojm1)
    {
        return ojm1.e;
    }

    public ojm b(ojm ojm1)
    {
        return c(ojm1.f);
    }

    public ojm c(ojm ojm1)
    {
        return ojm1;
    }
}
