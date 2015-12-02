// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.f;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class e
{

    public e()
    {
    }

    public static void a(byte abyte0[], File file)
    {
        IOException ioexception;
        ioexception = null;
        if (abyte0 == null)
        {
            throw new IOException("No data given to write to file");
        }
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        fileoutputstream.write(abyte0, 0, abyte0.length);
        fileoutputstream.close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
        abyte0;
_L2:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        if (file != null && file.exists())
        {
            file.delete();
        }
        throw abyte0;
        abyte0;
        ioexception = fileoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
