// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class HasDebtException extends RideRequestException
{

    public HasDebtException()
    {
    }

    public String getMessage()
    {
        return "Cannot request ride because user has debt";
    }

    public String getReason()
    {
        return "has_debt";
    }
}
