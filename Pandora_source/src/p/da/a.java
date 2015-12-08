// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.da;


public class a
{

    public static String a(int i)
    {
        switch (i)
        {
        case -1006: 
        default:
            return Integer.valueOf(i).toString();

        case -1000: 
            return "sf - ERROR_ALREADY_CONNECTED";

        case -1001: 
            return "sf - ERROR_NOT_CONNECTED";

        case -1002: 
            return "sf - ERROR_UNKNOWN_HOST";

        case -1003: 
            return "sf - ERROR_CANNOT_CONNECT";

        case -1004: 
            return "sf - ERROR_IO";

        case -1005: 
            return "sf - ERROR_CONNECTION_LOST";

        case -1007: 
            return "sf - ERROR_MALFORMED";

        case -1008: 
            return "sf - ERROR_OUT_OF_RANGE";

        case -1009: 
            return "sf - ERROR_BUFFER_TOO_SMALL";

        case -1010: 
            return "sf - ERROR_UNSUPPORTED";

        case -1011: 
            return "sf - ERROR_END_OF_STREAM";

        case -1012: 
            return "sf - INFO_FORMAT_CHANGED";

        case -1013: 
            return "sf - INFO_DISCONTINUITY";

        case -1014: 
            return "sf - ERROR_NO_LICENSE";
        }
    }
}
