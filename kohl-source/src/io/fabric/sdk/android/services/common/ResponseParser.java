// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


public class ResponseParser
{

    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public ResponseParser()
    {
    }

    public static int parse(int i)
    {
        if (i < 200 || i > 299)
        {
            if (i >= 300 && i <= 399)
            {
                return 1;
            }
            if (i < 400 || i > 499)
            {
                return i < 500 ? 1 : 1;
            }
        }
        return 0;
    }
}
