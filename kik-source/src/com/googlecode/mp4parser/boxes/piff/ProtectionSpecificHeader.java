// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.contentprotection.GenericHeader;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class ProtectionSpecificHeader
{

    protected static Map uuidRegistry = new HashMap();

    public ProtectionSpecificHeader()
    {
    }

    public static ProtectionSpecificHeader createFor(UUID uuid, ByteBuffer bytebuffer)
    {
        uuid = (Class)uuidRegistry.get(uuid);
        Object obj;
        if (uuid != null)
        {
            try
            {
                uuid = (ProtectionSpecificHeader)uuid.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (UUID uuid)
            {
                throw new RuntimeException(uuid);
            }
            // Misplaced declaration of an exception variable
            catch (UUID uuid)
            {
                throw new RuntimeException(uuid);
            }
        } else
        {
            uuid = null;
        }
        obj = uuid;
        if (uuid == null)
        {
            obj = new GenericHeader();
        }
        ((ProtectionSpecificHeader) (obj)).parse(bytebuffer);
        return ((ProtectionSpecificHeader) (obj));
    }

    public boolean equals(Object obj)
    {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public abstract ByteBuffer getData();

    public abstract UUID getSystemId();

    public abstract void parse(ByteBuffer bytebuffer);

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ProtectionSpecificHeader");
        stringbuilder.append("{data=");
        ByteBuffer bytebuffer = getData().duplicate();
        bytebuffer.rewind();
        byte abyte0[] = new byte[bytebuffer.limit()];
        bytebuffer.get(abyte0);
        stringbuilder.append(Hex.encodeHex(abyte0));
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
