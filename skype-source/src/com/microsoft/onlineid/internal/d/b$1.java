// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.d;

import android.util.JsonToken;

// Referenced classes of package com.microsoft.onlineid.internal.d:
//            b

static final class 
{

    static final int a[];

    static 
    {
        a = new int[JsonToken.values().length];
        try
        {
            a[JsonToken.NULL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[JsonToken.STRING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
