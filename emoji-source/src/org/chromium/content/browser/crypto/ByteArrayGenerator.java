// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.crypto;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class ByteArrayGenerator
{

    public ByteArrayGenerator()
    {
    }

    public byte[] getBytes(int i)
        throws IOException, GeneralSecurityException
    {
        Object obj1 = null;
        Object obj = new FileInputStream("/dev/urandom");
        obj1 = new byte[i];
        if (obj1.length != ((FileInputStream) (obj)).read(((byte []) (obj1))))
        {
            throw new GeneralSecurityException("Not enough random data available");
        }
          goto _L1
        obj1;
_L3:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        throw obj1;
_L1:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        return ((byte []) (obj1));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
