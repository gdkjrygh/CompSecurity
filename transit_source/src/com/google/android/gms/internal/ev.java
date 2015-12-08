// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class ev
{

    public static String R(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown time span ").append(i).toString());

        case 0: // '\0'
            return "DAILY";

        case 1: // '\001'
            return "WEEKLY";

        case 2: // '\002'
            return "ALL_TIME";
        }
    }
}
