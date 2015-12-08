// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;


// Referenced classes of package com.google.android.gms.games.jingle:
//            LibjingleEventCallback

public static final class 
{

    public static String toString(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder("UNKNOWN-")).append(i).toString();

        case 0: // '\0'
            return "STATE_INIT";

        case 1: // '\001'
            return "STATE_SENTINITIATE";

        case 2: // '\002'
            return "STATE_RECEIVEDINITIATE";

        case 3: // '\003'
            return "STATE_SENTPRACCEPT";

        case 4: // '\004'
            return "STATE_SENTACCEPT";

        case 5: // '\005'
            return "STATE_RECEIVEDPRACCEPT";

        case 6: // '\006'
            return "STATE_RECEIVEDACCEPT";

        case 7: // '\007'
            return "STATE_SENTMODIFY";

        case 8: // '\b'
            return "STATE_RECEIVEDMODIFY";

        case 9: // '\t'
            return "STATE_SENTREJECT";

        case 10: // '\n'
            return "STATE_RECEIVEDREJECT";

        case 11: // '\013'
            return "STATE_SENTREDIRECT";

        case 12: // '\f'
            return "STATE_SENTTERMINATE";

        case 13: // '\r'
            return "STATE_RECEIVEDTERMINATE";

        case 14: // '\016'
            return "STATE_INPROGRESS";

        case 15: // '\017'
            return "STATE_DEINIT";
        }
    }
}
