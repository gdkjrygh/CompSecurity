// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            ObjectDescriptorBase, ObjectDescriptorFactory, ExtensionDescriptor, BaseDescriptor, 
//            ESDescriptor

public class InitialObjectDescriptor extends ObjectDescriptorBase
{

    int audioProfileLevelIndication;
    List esDescriptors;
    List extensionDescriptors;
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    List unknownDescriptors;
    int urlFlag;
    int urlLength;
    String urlString;
    int visualProfileLevelIndication;

    public InitialObjectDescriptor()
    {
        esDescriptors = new ArrayList();
        extensionDescriptors = new ArrayList();
        unknownDescriptors = new ArrayList();
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        int i;
        i = IsoTypeReader.readUInt16(bytebuffer);
        objectDescriptorId = (0xffc0 & i) >> 6;
        urlFlag = (i & 0x3f) >> 5;
        includeInlineProfileLevelFlag = (i & 0x1f) >> 4;
        i = getSize() - 2;
        if (urlFlag != 1) goto _L2; else goto _L1
_L1:
        urlLength = IsoTypeReader.readUInt8(bytebuffer);
        urlString = IsoTypeReader.readString(bytebuffer, urlLength);
        i -= urlLength + 1;
_L4:
        if (i > 2)
        {
            bytebuffer = ObjectDescriptorFactory.createFrom(-1, bytebuffer);
            if (!(bytebuffer instanceof ExtensionDescriptor))
            {
                break; /* Loop/switch isn't completed */
            }
            extensionDescriptors.add((ExtensionDescriptor)bytebuffer);
        }
        return;
_L2:
        oDProfileLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        sceneProfileLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        audioProfileLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        visualProfileLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        graphicsProfileLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
        int j = i - 5;
        i = j;
        if (j > 2)
        {
            BaseDescriptor basedescriptor = ObjectDescriptorFactory.createFrom(-1, bytebuffer);
            i = j - basedescriptor.getSize();
            if (basedescriptor instanceof ESDescriptor)
            {
                esDescriptors.add((ESDescriptor)basedescriptor);
            } else
            {
                unknownDescriptors.add(basedescriptor);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        unknownDescriptors.add(bytebuffer);
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("InitialObjectDescriptor");
        stringbuilder.append("{objectDescriptorId=").append(objectDescriptorId);
        stringbuilder.append(", urlFlag=").append(urlFlag);
        stringbuilder.append(", includeInlineProfileLevelFlag=").append(includeInlineProfileLevelFlag);
        stringbuilder.append(", urlLength=").append(urlLength);
        stringbuilder.append(", urlString='").append(urlString).append('\'');
        stringbuilder.append(", oDProfileLevelIndication=").append(oDProfileLevelIndication);
        stringbuilder.append(", sceneProfileLevelIndication=").append(sceneProfileLevelIndication);
        stringbuilder.append(", audioProfileLevelIndication=").append(audioProfileLevelIndication);
        stringbuilder.append(", visualProfileLevelIndication=").append(visualProfileLevelIndication);
        stringbuilder.append(", graphicsProfileLevelIndication=").append(graphicsProfileLevelIndication);
        stringbuilder.append(", esDescriptors=").append(esDescriptors);
        stringbuilder.append(", extensionDescriptors=").append(extensionDescriptors);
        stringbuilder.append(", unknownDescriptors=").append(unknownDescriptors);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
