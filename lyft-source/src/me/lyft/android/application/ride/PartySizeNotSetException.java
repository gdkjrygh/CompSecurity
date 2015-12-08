// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class PartySizeNotSetException extends RideRequestException
{

    public PartySizeNotSetException()
    {
    }

    public String getMessage()
    {
        return "Party size need to be confirmed to request ride";
    }

    public String getReason()
    {
        return "party_size_not_set";
    }
}
