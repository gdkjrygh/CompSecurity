// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor

public class ProfileLevelIndicationDescriptor extends BaseDescriptor
{

    int profileLevelIndicationIndex;

    public ProfileLevelIndicationDescriptor()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProfileLevelIndicationDescriptor)obj;
            if (profileLevelIndicationIndex != ((ProfileLevelIndicationDescriptor) (obj)).profileLevelIndicationIndex)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return profileLevelIndicationIndex;
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        profileLevelIndicationIndex = IsoTypeReader.readUInt8(bytebuffer);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ProfileLevelIndicationDescriptor");
        stringbuilder.append("{profileLevelIndicationIndex=").append(Integer.toHexString(profileLevelIndicationIndex));
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
