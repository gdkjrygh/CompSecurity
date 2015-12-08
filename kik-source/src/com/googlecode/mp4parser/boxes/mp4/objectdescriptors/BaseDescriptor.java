// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

public abstract class BaseDescriptor
{

    static final boolean $assertionsDisabled;
    int sizeBytes;
    int sizeOfInstance;
    int tag;

    public BaseDescriptor()
    {
    }

    public int getSize()
    {
        return sizeOfInstance + 1 + sizeBytes;
    }

    public int getSizeBytes()
    {
        return sizeBytes;
    }

    public int getSizeOfInstance()
    {
        return sizeOfInstance;
    }

    public int getTag()
    {
        return tag;
    }

    public final void parse(int i, ByteBuffer bytebuffer)
    {
        tag = i;
        int j = IsoTypeReader.readUInt8(bytebuffer);
        sizeOfInstance = j & 0x7f;
        i = 1;
        do
        {
            if (j >>> 7 != 1)
            {
                sizeBytes = i;
                ByteBuffer bytebuffer1 = bytebuffer.slice();
                bytebuffer1.limit(sizeOfInstance);
                parseDetail(bytebuffer1);
                if (!$assertionsDisabled && bytebuffer1.remaining() != 0)
                {
                    throw new AssertionError((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" has not been fully parsed").toString());
                } else
                {
                    bytebuffer.position(bytebuffer.position() + sizeOfInstance);
                    return;
                }
            }
            j = IsoTypeReader.readUInt8(bytebuffer);
            i++;
            sizeOfInstance = sizeOfInstance << 7 | j & 0x7f;
        } while (true);
    }

    public abstract void parseDetail(ByteBuffer bytebuffer);

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("BaseDescriptor");
        stringbuilder.append("{tag=").append(tag);
        stringbuilder.append(", sizeOfInstance=").append(sizeOfInstance);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/mp4/objectdescriptors/BaseDescriptor.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
