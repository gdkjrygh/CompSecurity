// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

public static class a
{

    public rtionType a;
    public long b;
    public long c;

    public float a()
    {
        if (c == 0L)
        {
            return 0.0F;
        } else
        {
            return (float)b / (float)c;
        }
    }

    public float b()
    {
        return 1.0F - a();
    }

    public long c()
    {
        return c - b;
    }

    public rtionType(rtionType rtiontype)
    {
        b = 0L;
        c = 0L;
        a = rtiontype;
    }
}
