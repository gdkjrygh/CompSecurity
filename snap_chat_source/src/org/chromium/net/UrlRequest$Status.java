// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            UrlRequest

public static class 
{

    private static boolean a;

    static int a(int i)
    {
        if (!a && (i < 0 || i > 15))
        {
            throw new AssertionError();
        }
        switch (i)
        {
        case 5: // '\005'
        default:
            throw new IllegalArgumentException("No request status found.");

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 4;

        case 6: // '\006'
            return 5;

        case 7: // '\007'
            return 6;

        case 8: // '\b'
            return 7;

        case 9: // '\t'
            return 8;

        case 10: // '\n'
            return 9;

        case 11: // '\013'
            return 10;

        case 12: // '\f'
            return 11;

        case 13: // '\r'
            return 12;

        case 14: // '\016'
            return 13;

        case 15: // '\017'
            return 14;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/net/UrlRequest.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private ()
    {
    }
}
