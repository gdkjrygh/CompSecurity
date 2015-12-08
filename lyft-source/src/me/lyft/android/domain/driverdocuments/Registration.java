// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driverdocuments;

import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.domain.driverdocuments:
//            DriverDocument

public class Registration extends DriverDocument
    implements INullable
{

    public Registration(String s, String s1)
    {
        super(s, s1);
    }

    public boolean isNull()
    {
        return false;
    }
}
