// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class aub
    implements anc
{

    private final aqp a;

    public aub(aqp aqp1)
    {
        a = aqp1;
    }

    private boolean a(InputStream inputstream, File file)
    {
        byte abyte0[] = a.a(0x10000);
        file = new FileOutputStream(file);
_L3:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        file.write(abyte0, 0, i);
          goto _L3
        inputstream;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        a.a(abyte0);
        return false;
_L2:
        file.close();
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        a.a(abyte0);
        return true;
        inputstream;
        file = null;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        a.a(abyte0);
        throw inputstream;
        inputstream;
        if (true) goto _L5; else goto _L4
_L4:
        inputstream;
        file = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final volatile boolean a(Object obj, File file, ani ani)
    {
        return a((InputStream)obj, file);
    }
}
