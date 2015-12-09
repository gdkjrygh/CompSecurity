// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;


public final class GCoreServiceIdUtil
{

    public static int toLoggingServiceId(int i)
    {
        switch (i)
        {
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        case 66: // 'B'
        case 68: // 'D'
        case 69: // 'E'
        case 70: // 'F'
        case 72: // 'H'
        case 74: // 'J'
        case 75: // 'K'
        case 76: // 'L'
        case 78: // 'N'
        case 80: // 'P'
        case 81: // 'Q'
        case 82: // 'R'
        case 84: // 'T'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        default:
            return 0;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 1: // '\001'
            return 1;

        case 4: // '\004'
            return 4;

        case 79: // 'O'
            return 79;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 6;

        case 7: // '\007'
            return 7;

        case 8: // '\b'
            return 8;

        case 9: // '\t'
            return 9;

        case 10: // '\n'
        case 27: // '\033'
        case 83: // 'S'
            return 10;

        case 11: // '\013'
            return 11;

        case 12: // '\f'
            return 12;

        case 13: // '\r'
            return 13;

        case 14: // '\016'
            return 14;

        case 15: // '\017'
            return 15;

        case 16: // '\020'
            return 16;

        case 17: // '\021'
            return 17;

        case 59: // ';'
            return 59;

        case 60: // '<'
            return 60;

        case 57: // '9'
            return 57;

        case 56: // '8'
            return 56;

        case 55: // '7'
            return 55;

        case 58: // ':'
            return 58;

        case 18: // '\022'
            return 18;

        case 19: // '\023'
            return 19;

        case 20: // '\024'
            return 20;

        case 47: // '/'
            return 47;

        case 48: // '0'
            return 48;

        case 65: // 'A'
            return 65;

        case 67: // 'C'
            return 67;

        case 77: // 'M'
            return 77;

        case 54: // '6'
            return 54;

        case 73: // 'I'
            return 73;

        case 71: // 'G'
            return 71;

        case 91: // '['
            return 91;

        case 28: // '\034'
            return 28;
        }
    }
}
