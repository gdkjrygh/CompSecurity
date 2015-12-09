// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

class i
    implements c
{

    private final String a;
    private final c b;

    public i(String s, c c1)
    {
        a = s;
        b = c1;
    }

    public void a(MessageDigest messagedigest)
        throws UnsupportedEncodingException
    {
        messagedigest.update(a.getBytes("UTF-8"));
        b.a(messagedigest);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (i)obj;
            if (!a.equals(((i) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((i) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }
}
