// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class UnknownDescriptor extends BaseDescriptor
{

    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/UnknownDescriptor.getName());
    private ByteBuffer data;

    public UnknownDescriptor()
    {
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        data = (ByteBuffer)bytebuffer.slice().limit(getSizeOfInstance());
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("UnknownDescriptor");
        stringbuilder.append("{tag=").append(tag);
        stringbuilder.append(", sizeOfInstance=").append(sizeOfInstance);
        stringbuilder.append(", data=").append(data);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
