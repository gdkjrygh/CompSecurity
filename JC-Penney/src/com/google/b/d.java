// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


// Referenced classes of package com.google.b:
//            p

public final class d extends p
{

    private static final d b = new d();

    private d()
    {
    }

    public static d a()
    {
        if (a)
        {
            return new d();
        } else
        {
            return b;
        }
    }

}
