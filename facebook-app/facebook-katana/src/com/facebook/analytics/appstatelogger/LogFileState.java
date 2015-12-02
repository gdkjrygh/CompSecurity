// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;


class LogFileState
{

    private LogFileState()
    {
    }

    public static char a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException(String.format("%d is not a valid LogFileState", new Object[] {
                Integer.valueOf(i)
            }));

        case 1: // '\001'
            return 'i';

        case 2: // '\002'
            return 'w';

        case 3: // '\003'
            return 'd';
        }
    }
}
