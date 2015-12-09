// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;


// Referenced classes of package com.mixpanel.android.util:
//            RemoteService

public static class mRetryAfter extends Exception
{

    private final int mRetryAfter;

    public int a()
    {
        return mRetryAfter;
    }

    public I(String s, String s1)
    {
        super(s);
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            i = 0;
        }
        mRetryAfter = i;
    }
}
