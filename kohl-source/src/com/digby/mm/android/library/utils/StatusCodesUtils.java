// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;


public final class StatusCodesUtils
{

    public StatusCodesUtils()
    {
    }

    public static final String getActivityName(int i)
    {
        switch (i)
        {
        default:
            return "Unknown";

        case 0: // '\0'
            return "In_Vehicle";

        case 1: // '\001'
            return "On_Bicycle";

        case 2: // '\002'
            return "On_Foot";

        case 3: // '\003'
            return "Still";

        case 4: // '\004'
            return "Unknown";

        case 5: // '\005'
            return "Tilting";
        }
    }

    public static final String getConnectionResultString(int i)
    {
        switch (i)
        {
        default:
            return "Unknown Error";

        case 10: // '\n'
            return "The application is misconfigured";

        case 8: // '\b'
            return "An internal error occurred";

        case 5: // '\005'
            return "The client attempted to connect to the service with an invalid account name specified";

        case 11: // '\013'
            return "The application is not licensed to the user";

        case 7: // '\007'
            return "A network error occurred";

        case 6: // '\006'
            return "Completing the connection requires some form of resolution";

        case 3: // '\003'
            return "The installed version of Google Play services has been disabled on this device";

        case 9: // '\t'
            return "The version of the Google Play services installed on this device is not authentic";

        case 1: // '\001'
            return "Google Play services is missing on this device";

        case 2: // '\002'
            return "The installed version of Google Play services is out of date";

        case 4: // '\004'
            return "The client attempted to connect to the service but the user is not signed in";

        case 12: // '\f'
            return "The device date is likely set incorrectly";

        case 0: // '\0'
            return "The connection was successful";
        }
    }

    public static final String getLocationStatus(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder()).append("Unknown status code: ").append(i).toString();

        case 1: // '\001'
            return "An unspecified error occurred";

        case 1000: 
            return "Geofence service is not available now";

        case 1001: 
            return "Your app has registered more than 100 geofences.";

        case 1002: 
            return "You have provided more than 5 different PendingIntents";

        case 0: // '\0'
            return "successful";
        }
    }

    public static final String getTransitionString(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        default:
            return "Unkowns";

        case 1: // '\001'
            return "Entered";

        case 2: // '\002'
            return "Exited";

        case 4: // '\004'
            return "Dwell";
        }
    }
}
