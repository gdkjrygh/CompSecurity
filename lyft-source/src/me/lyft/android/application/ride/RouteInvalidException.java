// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class RouteInvalidException extends RideRequestException
{

    private String message;

    public RouteInvalidException(String s)
    {
        message = s;
    }

    public String getMessage()
    {
        return message;
    }

    public String getReason()
    {
        return "route_invalid";
    }
}
