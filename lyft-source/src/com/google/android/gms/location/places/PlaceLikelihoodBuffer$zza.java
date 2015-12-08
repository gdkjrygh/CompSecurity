// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;


public class 
{

    static int a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("invalid source: ").append(i).toString());

        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
            return i;
        }
    }
}
