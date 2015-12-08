// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;

final class ang.Object
    implements gfm
{

    private fhn a;

    public final void a(gfl gfl1)
    {
        fhn fhn1;
        boolean flag;
label0:
        {
            boolean flag1 = false;
            gfl1.e.b();
            String as[] = gfl1.b;
            fhn1 = a;
            if (as != null && as.length != 3)
            {
                flag = flag1;
                if (Arrays.asList(as).contains(gdh.a.get(0)))
                {
                    break label0;
                }
            }
            flag = flag1;
            if (gfl1.c)
            {
                flag = true;
            }
        }
        fhn1.b = flag;
        a.a = true;
        a.H();
    }

    (fhn fhn1)
    {
        a = fhn1;
        super();
    }
}
