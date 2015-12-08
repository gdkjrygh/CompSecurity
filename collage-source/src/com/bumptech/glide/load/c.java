// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public interface c
{

    public abstract void a(MessageDigest messagedigest)
        throws UnsupportedEncodingException;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
