// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            b

public final class s
{

    public s()
    {
    }

    public static boolean a()
    {
        b b1 = b.a();
        boolean flag;
        try
        {
            flag = b1.b();
        }
        catch (NullPointerException nullpointerexception)
        {
            return false;
        }
        return flag;
    }
}
