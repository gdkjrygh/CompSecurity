// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.exception;

import java.io.BufferedReader;
import java.io.IOException;

// Referenced classes of package com.dropbox.client2.exception:
//            DropboxException

public class DropboxParseException extends DropboxException
{

    private static final long serialVersionUID = 1L;

    public DropboxParseException(BufferedReader bufferedreader)
    {
        super((new StringBuilder("failed to parse: ")).append(stringifyBody(bufferedreader)).toString());
    }

    public DropboxParseException(String s)
    {
        super(s);
    }

    public static String stringifyBody(BufferedReader bufferedreader)
    {
        StringBuffer stringbuffer;
        String s;
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.reset();
            }
            catch (IOException ioexception) { }
        }
        stringbuffer = new StringBuffer();
        s = bufferedreader.readLine();
label0:
        {
            if (s == null)
            {
                break label0;
            }
            try
            {
                stringbuffer.append(s);
                break MISSING_BLOCK_LABEL_16;
            }
            // Misplaced declaration of an exception variable
            catch (BufferedReader bufferedreader) { }
        }
        return stringbuffer.toString();
    }
}
