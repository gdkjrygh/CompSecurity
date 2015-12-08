// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipFile;

final class <init> extends <init>
{

    private ZipFile a;

    public final InputStream a(String s)
    {
        s = a.getInputStream(a.getEntry(s));
        if (s == null)
        {
            throw new FileNotFoundException();
        } else
        {
            return s;
        }
    }

    public final void close()
    {
        if (a != null)
        {
            a.close();
            a = null;
        }
    }

    private (String s)
    {
        super((byte)0);
        a = new ZipFile(s);
    }

    a(String s, byte byte0)
    {
        this(s);
    }
}
