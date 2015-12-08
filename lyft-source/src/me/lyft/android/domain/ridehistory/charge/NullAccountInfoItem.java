// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory.charge;


// Referenced classes of package me.lyft.android.domain.ridehistory.charge:
//            AccountInfoItem

public class NullAccountInfoItem extends AccountInfoItem
{

    public NullAccountInfoItem()
    {
        super(null, null, null, null);
    }

    public boolean isNull()
    {
        return true;
    }
}
