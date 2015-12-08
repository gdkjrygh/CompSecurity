// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class UUIDSerializer extends StdScalarSerializer
{

    static final char HEX_CHARS[] = "0123456789abcdef".toCharArray();

    public UUIDSerializer()
    {
        super(java/util/UUID);
    }

    private static final void _appendInt(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >> 24);
        j++;
        abyte0[j] = (byte)(i >> 16);
        j++;
        abyte0[j] = (byte)(i >> 8);
        abyte0[j + 1] = (byte)i;
    }

    private static void _appendInt(int i, char ac[], int j)
    {
        _appendShort(i >> 16, ac, j);
        _appendShort(i, ac, j + 4);
    }

    private static void _appendShort(int i, char ac[], int j)
    {
        ac[j] = HEX_CHARS[i >> 12 & 0xf];
        j++;
        ac[j] = HEX_CHARS[i >> 8 & 0xf];
        j++;
        ac[j] = HEX_CHARS[i >> 4 & 0xf];
        ac[j + 1] = HEX_CHARS[i & 0xf];
    }

    private static final byte[] _asBytes(UUID uuid)
    {
        byte abyte0[] = new byte[16];
        long l = uuid.getMostSignificantBits();
        long l1 = uuid.getLeastSignificantBits();
        _appendInt((int)(l >> 32), abyte0, 0);
        _appendInt((int)l, abyte0, 4);
        _appendInt((int)(l1 >> 32), abyte0, 8);
        _appendInt((int)l1, abyte0, 12);
        return abyte0;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (UUID)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, UUID uuid)
    {
        while (uuid == null || uuid.getLeastSignificantBits() == 0L && uuid.getMostSignificantBits() == 0L) 
        {
            return true;
        }
        return false;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((UUID)obj);
    }

    public boolean isEmpty(UUID uuid)
    {
        return isEmpty(null, uuid);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((UUID)obj, jsongenerator, serializerprovider);
    }

    public void serialize(UUID uuid, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (jsongenerator.canWriteBinaryNatively() && !(jsongenerator instanceof TokenBuffer))
        {
            jsongenerator.writeBinary(_asBytes(uuid));
            return;
        } else
        {
            serializerprovider = new char[36];
            long l = uuid.getMostSignificantBits();
            _appendInt((int)(l >> 32), serializerprovider, 0);
            serializerprovider[8] = '-';
            int i = (int)l;
            _appendShort(i >>> 16, serializerprovider, 9);
            serializerprovider[13] = '-';
            _appendShort(i, serializerprovider, 14);
            serializerprovider[18] = '-';
            l = uuid.getLeastSignificantBits();
            _appendShort((int)(l >>> 48), serializerprovider, 19);
            serializerprovider[23] = '-';
            _appendShort((int)(l >>> 32), serializerprovider, 24);
            _appendInt((int)l, serializerprovider, 28);
            jsongenerator.writeString(serializerprovider, 0, 36);
            return;
        }
    }

}
