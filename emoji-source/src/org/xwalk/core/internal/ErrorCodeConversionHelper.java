// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


class ErrorCodeConversionHelper
{

    ErrorCodeConversionHelper()
    {
    }

    static int convertErrorCode(int i)
    {
        switch (i)
        {
        default:
            return -1;

        case -339: 
            return -3;

        case -343: 
        case -341: 
        case -338: 
            return -4;

        case -310: 
            return -9;

        case -14: 
            return -14;

        case -300: 
            return -12;

        case -302: 
        case -301: 
            return -10;

        case -331: 
        case -1: 
            return -7;

        case -118: 
        case -7: 
            return -8;

        case -8: 
            return -13;

        case -119: 
        case -13: 
        case -12: 
            return -15;

        case -104: 
        case -103: 
        case -102: 
        case -101: 
        case -100: 
        case -15: 
            return -6;

        case -137: 
        case -109: 
        case -108: 
        case -106: 
        case -105: 
            return -2;

        case -135: 
        case -134: 
        case -129: 
        case -128: 
        case -126: 
        case -125: 
        case -123: 
        case -117: 
        case -116: 
        case -114: 
        case -113: 
        case -112: 
        case -111: 
        case -110: 
        case -107: 
            return -11;

        case -323: 
        case -130: 
        case -127: 
        case -115: 
            return -5;

        case -210: 
        case -208: 
        case -207: 
        case -206: 
        case -205: 
        case -204: 
        case -203: 
        case -202: 
        case -201: 
        case -200: 
            return 0;
        }
    }
}
