// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            eg

public abstract class fy extends eg
{

    public fy()
    {
    }

    protected static boolean b(Integer integer)
    {
        while (integer == null || integer.intValue() < 0x30d400) 
        {
            return false;
        }
        return true;
    }
}
