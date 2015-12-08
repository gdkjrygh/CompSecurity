// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fedorvlasov.lazylist;

import java.io.InputStream;
import java.io.OutputStream;

public class Utils
{

    public Utils()
    {
    }

    public static void CopyStream(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
_L1:
        int i = inputstream.read(abyte0, 0, 1024);
        if (i == -1)
        {
            return;
        }
        try
        {
            outputstream.write(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
          goto _L1
    }
}
