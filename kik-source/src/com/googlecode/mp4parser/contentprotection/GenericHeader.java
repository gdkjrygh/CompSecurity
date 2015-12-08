// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.contentprotection;

import com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

public class GenericHeader extends ProtectionSpecificHeader
{

    public static UUID PROTECTION_SYSTEM_ID;
    ByteBuffer data;

    public GenericHeader()
    {
    }

    public ByteBuffer getData()
    {
        return data;
    }

    public UUID getSystemId()
    {
        return PROTECTION_SYSTEM_ID;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
    }

    static 
    {
        PROTECTION_SYSTEM_ID = UUID.fromString("00000000-0000-0000-0000-000000000000");
        ProtectionSpecificHeader.uuidRegistry.put(PROTECTION_SYSTEM_ID, com/googlecode/mp4parser/contentprotection/GenericHeader);
    }
}
