// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import com.google.common.base.Preconditions;

public class o
{

    private final String a;

    public o(String s)
    {
        a = (String)Preconditions.checkNotNull(s, "must provide a google map api key");
    }
}
