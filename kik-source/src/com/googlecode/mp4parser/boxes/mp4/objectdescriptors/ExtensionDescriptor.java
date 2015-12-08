// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class ExtensionDescriptor extends BaseDescriptor
{

    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ExtensionDescriptor.getName());
    byte bytes[];

    public ExtensionDescriptor()
    {
    }

    static int[] allTags()
    {
        int ai[] = new int[148];
        int i = 106;
        do
        {
            if (i >= 254)
            {
                return ai;
            }
            int j = i - 106;
            log.finest((new StringBuilder("pos:")).append(j).toString());
            ai[j] = i;
            i++;
        } while (true);
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        if (getSize() > 0)
        {
            bytes = new byte[sizeOfInstance];
            bytebuffer.get(bytes);
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ExtensionDescriptor");
        StringBuilder stringbuilder1 = stringbuilder.append("{bytes=");
        String s;
        if (bytes == null)
        {
            s = "null";
        } else
        {
            s = Hex.encodeHex(bytes);
        }
        stringbuilder1.append(s);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
