// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import java.io.InputStream;

public class c
{

    public final InputStream a;
    public final String b;
    public final String c;
    public final boolean d = true;

    static c a(InputStream inputstream, String s, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "application/octet-stream";
        }
        return new <init>(inputstream, s, s2);
    }

    private (InputStream inputstream, String s, String s1)
    {
        a = inputstream;
        b = s;
        c = s1;
    }
}
