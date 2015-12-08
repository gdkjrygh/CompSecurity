// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor, ObjectDescriptorFactory, DecoderSpecificInfo, AudioSpecificConfig, 
//            ProfileLevelIndicationDescriptor

public class DecoderConfigDescriptor extends BaseDescriptor
{

    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor.getName());
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte configDescriptorDeadBytes[];
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List profileLevelIndicationDescriptors;
    int streamType;
    int upStream;

    public DecoderConfigDescriptor()
    {
        profileLevelIndicationDescriptors = new ArrayList();
    }

    public AudioSpecificConfig getAudioSpecificInfo()
    {
        return audioSpecificInfo;
    }

    public long getAvgBitRate()
    {
        return avgBitRate;
    }

    public int getBufferSizeDB()
    {
        return bufferSizeDB;
    }

    public DecoderSpecificInfo getDecoderSpecificInfo()
    {
        return decoderSpecificInfo;
    }

    public long getMaxBitRate()
    {
        return maxBitRate;
    }

    public int getObjectTypeIndication()
    {
        return objectTypeIndication;
    }

    public List getProfileLevelIndicationDescriptors()
    {
        return profileLevelIndicationDescriptors;
    }

    public int getStreamType()
    {
        return streamType;
    }

    public int getUpStream()
    {
        return upStream;
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        objectTypeIndication = IsoTypeReader.readUInt8(bytebuffer);
        int i = IsoTypeReader.readUInt8(bytebuffer);
        streamType = i >>> 2;
        upStream = i >> 1 & 1;
        bufferSizeDB = IsoTypeReader.readUInt24(bytebuffer);
        maxBitRate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitRate = IsoTypeReader.readUInt32(bytebuffer);
        if (bytebuffer.remaining() > 2)
        {
            int j = bytebuffer.position();
            BaseDescriptor basedescriptor = ObjectDescriptorFactory.createFrom(objectTypeIndication, bytebuffer);
            j = bytebuffer.position() - j;
            Logger logger = log;
            StringBuilder stringbuilder = (new StringBuilder()).append(basedescriptor).append(" - DecoderConfigDescr1 read: ").append(j).append(", size: ");
            Integer integer;
            if (basedescriptor != null)
            {
                integer = Integer.valueOf(basedescriptor.getSize());
            } else
            {
                integer = null;
            }
            logger.finer(stringbuilder.append(integer).toString());
            if (basedescriptor != null)
            {
                int k = basedescriptor.getSize();
                if (j < k)
                {
                    configDescriptorDeadBytes = new byte[k - j];
                    bytebuffer.get(configDescriptorDeadBytes);
                }
            }
            if (basedescriptor instanceof DecoderSpecificInfo)
            {
                decoderSpecificInfo = (DecoderSpecificInfo)basedescriptor;
            }
            if (basedescriptor instanceof AudioSpecificConfig)
            {
                audioSpecificInfo = (AudioSpecificConfig)basedescriptor;
            }
        }
        do
        {
            do
            {
                if (bytebuffer.remaining() <= 2)
                {
                    return;
                }
                long l = bytebuffer.position();
                BaseDescriptor basedescriptor1 = ObjectDescriptorFactory.createFrom(objectTypeIndication, bytebuffer);
                long l1 = bytebuffer.position();
                Logger logger1 = log;
                StringBuilder stringbuilder1 = (new StringBuilder()).append(basedescriptor1).append(" - DecoderConfigDescr2 read: ").append(l1 - l).append(", size: ");
                Integer integer1;
                if (basedescriptor1 != null)
                {
                    integer1 = Integer.valueOf(basedescriptor1.getSize());
                } else
                {
                    integer1 = null;
                }
                logger1.finer(stringbuilder1.append(integer1).toString());
            } while (!(basedescriptor1 instanceof ProfileLevelIndicationDescriptor));
            profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor)basedescriptor1);
        } while (true);
    }

    public ByteBuffer serialize()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(bytebuffer, 4);
        IsoTypeWriter.writeUInt8(bytebuffer, serializedSize() - 2);
        IsoTypeWriter.writeUInt8(bytebuffer, objectTypeIndication);
        IsoTypeWriter.writeUInt8(bytebuffer, streamType << 2 | upStream << 1 | 1);
        IsoTypeWriter.writeUInt24(bytebuffer, bufferSizeDB);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitRate);
        if (audioSpecificInfo != null)
        {
            bytebuffer.put(audioSpecificInfo.serialize().array());
        }
        return bytebuffer;
    }

    public int serializedSize()
    {
        int i;
        if (audioSpecificInfo == null)
        {
            i = 0;
        } else
        {
            i = audioSpecificInfo.serializedSize();
        }
        return i + 15;
    }

    public void setAudioSpecificInfo(AudioSpecificConfig audiospecificconfig)
    {
        audioSpecificInfo = audiospecificconfig;
    }

    public void setAvgBitRate(long l)
    {
        avgBitRate = l;
    }

    public void setBufferSizeDB(int i)
    {
        bufferSizeDB = i;
    }

    public void setMaxBitRate(long l)
    {
        maxBitRate = l;
    }

    public void setObjectTypeIndication(int i)
    {
        objectTypeIndication = i;
    }

    public void setStreamType(int i)
    {
        streamType = i;
    }

    public void setUpStream(int i)
    {
        upStream = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DecoderConfigDescriptor");
        stringbuilder.append("{objectTypeIndication=").append(objectTypeIndication);
        stringbuilder.append(", streamType=").append(streamType);
        stringbuilder.append(", upStream=").append(upStream);
        stringbuilder.append(", bufferSizeDB=").append(bufferSizeDB);
        stringbuilder.append(", maxBitRate=").append(maxBitRate);
        stringbuilder.append(", avgBitRate=").append(avgBitRate);
        stringbuilder.append(", decoderSpecificInfo=").append(decoderSpecificInfo);
        stringbuilder.append(", audioSpecificInfo=").append(audioSpecificInfo);
        StringBuilder stringbuilder1 = stringbuilder.append(", configDescriptorDeadBytes=");
        Object obj;
        if (configDescriptorDeadBytes != null)
        {
            obj = configDescriptorDeadBytes;
        } else
        {
            obj = new byte[0];
        }
        stringbuilder1.append(Hex.encodeHex(((byte []) (obj))));
        stringbuilder1 = stringbuilder.append(", profileLevelIndicationDescriptors=");
        if (profileLevelIndicationDescriptors == null)
        {
            obj = "null";
        } else
        {
            obj = Arrays.asList(new List[] {
                profileLevelIndicationDescriptors
            }).toString();
        }
        stringbuilder1.append(((String) (obj)));
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
