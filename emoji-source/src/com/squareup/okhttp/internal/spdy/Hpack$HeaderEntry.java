// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Hpack

static class value
{

    private final String name;
    private final String value;

    int length()
    {
        return name.length() + 32 + value.length();
    }



    _cls9(String s, String s1)
    {
        name = s;
        value = s1;
    }
}
