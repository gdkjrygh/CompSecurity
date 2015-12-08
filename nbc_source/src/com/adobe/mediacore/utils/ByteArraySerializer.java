// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

public final class ByteArraySerializer
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/utils/ByteArraySerializer.getSimpleName()).toString();
    private static final Logger _logger = Log.getLogger(LOG_TAG);

    public ByteArraySerializer()
    {
    }

    public static Object fromByteArray(byte abyte0[])
    {
        abyte0 = new ByteArrayInputStream(abyte0);
        Object obj = new ObjectInputStream(abyte0);
        abyte0 = ((byte []) (obj));
        Object obj1 = ((ObjectInput) (obj)).readObject();
        quietCloseInput(((ObjectInput) (obj)));
        return obj1;
        Object obj2;
        obj2;
        obj = null;
_L8:
        abyte0 = ((byte []) (obj));
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#fromByteArray").toString(), "Exception received.", ((Exception) (obj2)));
        quietCloseInput(((ObjectInput) (obj)));
        return null;
        obj2;
        obj = null;
_L6:
        abyte0 = ((byte []) (obj));
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#fromByteArray").toString(), "Exception received.", ((Exception) (obj2)));
        quietCloseInput(((ObjectInput) (obj)));
        return null;
        obj2;
        obj = null;
_L4:
        abyte0 = ((byte []) (obj));
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#fromByteArray").toString(), "Exception received.", ((Exception) (obj2)));
        quietCloseInput(((ObjectInput) (obj)));
        return null;
        abyte0;
        obj2 = null;
        obj = abyte0;
_L2:
        quietCloseInput(((ObjectInput) (obj2)));
        throw obj;
        obj;
        obj2 = abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void quietCloseInput(ObjectInput objectinput)
    {
        if (objectinput == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        objectinput.close();
        return;
        objectinput;
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#quietClose").toString(), "Unable to close input stream.", objectinput);
        return;
    }

    private static void quietCloseOutput(ObjectOutput objectoutput)
    {
        if (objectoutput == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        objectoutput.close();
        return;
        objectoutput;
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#quietClose").toString(), "Unable to close output stream.", objectoutput);
        return;
    }

    public static byte[] toByteArray(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        Object obj1 = objectoutputstream;
        objectoutputstream.writeObject(obj);
        obj1 = objectoutputstream;
        obj = bytearrayoutputstream.toByteArray();
        quietCloseOutput(objectoutputstream);
        return ((byte []) (obj));
        IOException ioexception;
        ioexception;
        obj = null;
_L4:
        obj1 = obj;
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#toByteArray").toString(), "Exception received.", ioexception);
        quietCloseOutput(((ObjectOutput) (obj)));
        return null;
        obj;
        obj1 = null;
_L2:
        quietCloseOutput(((ObjectOutput) (obj1)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        obj = objectoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
