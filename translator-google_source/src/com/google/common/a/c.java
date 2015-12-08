// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class c
{

    static final Logger a = Logger.getLogger(com/google/common/a/c.getName());

    private c()
    {
    }

    public static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        inputstream.close();
        return;
        inputstream;
        try
        {
            a.log(Level.WARNING, "IOException thrown while closing Closeable.", inputstream);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AssertionError(inputstream);
        }
    }

}
