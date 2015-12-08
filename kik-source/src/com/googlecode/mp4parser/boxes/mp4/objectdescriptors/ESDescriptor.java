// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.objectdescriptors:
//            BaseDescriptor, SLConfigDescriptor, ObjectDescriptorFactory, DecoderConfigDescriptor

public class ESDescriptor extends BaseDescriptor
{

    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor.getName());
    int URLFlag;
    int URLLength;
    String URLString;
    DecoderConfigDescriptor decoderConfigDescriptor;
    int dependsOnEsId;
    int esId;
    int oCREsId;
    int oCRstreamFlag;
    List otherDescriptors;
    int remoteODFlag;
    SLConfigDescriptor slConfigDescriptor;
    int streamDependenceFlag;
    int streamPriority;

    public ESDescriptor()
    {
        URLLength = 0;
        otherDescriptors = new ArrayList();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ESDescriptor)obj;
            if (URLFlag != ((ESDescriptor) (obj)).URLFlag)
            {
                return false;
            }
            if (URLLength != ((ESDescriptor) (obj)).URLLength)
            {
                return false;
            }
            if (dependsOnEsId != ((ESDescriptor) (obj)).dependsOnEsId)
            {
                return false;
            }
            if (esId != ((ESDescriptor) (obj)).esId)
            {
                return false;
            }
            if (oCREsId != ((ESDescriptor) (obj)).oCREsId)
            {
                return false;
            }
            if (oCRstreamFlag != ((ESDescriptor) (obj)).oCRstreamFlag)
            {
                return false;
            }
            if (remoteODFlag != ((ESDescriptor) (obj)).remoteODFlag)
            {
                return false;
            }
            if (streamDependenceFlag != ((ESDescriptor) (obj)).streamDependenceFlag)
            {
                return false;
            }
            if (streamPriority != ((ESDescriptor) (obj)).streamPriority)
            {
                return false;
            }
            if (URLString == null ? ((ESDescriptor) (obj)).URLString != null : !URLString.equals(((ESDescriptor) (obj)).URLString))
            {
                return false;
            }
            if (decoderConfigDescriptor == null ? ((ESDescriptor) (obj)).decoderConfigDescriptor != null : !decoderConfigDescriptor.equals(((ESDescriptor) (obj)).decoderConfigDescriptor))
            {
                return false;
            }
            if (otherDescriptors == null ? ((ESDescriptor) (obj)).otherDescriptors != null : !otherDescriptors.equals(((ESDescriptor) (obj)).otherDescriptors))
            {
                return false;
            }
            if (slConfigDescriptor == null ? ((ESDescriptor) (obj)).slConfigDescriptor != null : !slConfigDescriptor.equals(((ESDescriptor) (obj)).slConfigDescriptor))
            {
                return false;
            }
        }
        return true;
    }

    public DecoderConfigDescriptor getDecoderConfigDescriptor()
    {
        return decoderConfigDescriptor;
    }

    public int getDependsOnEsId()
    {
        return dependsOnEsId;
    }

    public int getEsId()
    {
        return esId;
    }

    public List getOtherDescriptors()
    {
        return otherDescriptors;
    }

    public int getRemoteODFlag()
    {
        return remoteODFlag;
    }

    public SLConfigDescriptor getSlConfigDescriptor()
    {
        return slConfigDescriptor;
    }

    public int getStreamDependenceFlag()
    {
        return streamDependenceFlag;
    }

    public int getStreamPriority()
    {
        return streamPriority;
    }

    public int getURLFlag()
    {
        return URLFlag;
    }

    public int getURLLength()
    {
        return URLLength;
    }

    public String getURLString()
    {
        return URLString;
    }

    public int getoCREsId()
    {
        return oCREsId;
    }

    public int getoCRstreamFlag()
    {
        return oCRstreamFlag;
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = esId;
        int j1 = streamDependenceFlag;
        int k1 = URLFlag;
        int l1 = oCRstreamFlag;
        int i2 = streamPriority;
        int j2 = URLLength;
        int i;
        int j;
        int k;
        int k2;
        int l2;
        int i3;
        if (URLString != null)
        {
            i = URLString.hashCode();
        } else
        {
            i = 0;
        }
        k2 = remoteODFlag;
        l2 = dependsOnEsId;
        i3 = oCREsId;
        if (decoderConfigDescriptor != null)
        {
            j = decoderConfigDescriptor.hashCode();
        } else
        {
            j = 0;
        }
        if (slConfigDescriptor != null)
        {
            k = slConfigDescriptor.hashCode();
        } else
        {
            k = 0;
        }
        if (otherDescriptors != null)
        {
            l = otherDescriptors.hashCode();
        }
        return (k + (j + ((((i + (((((i1 * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31 + l;
    }

    public void parseDetail(ByteBuffer bytebuffer)
    {
        byte byte0 = 0;
        esId = IsoTypeReader.readUInt16(bytebuffer);
        int i = IsoTypeReader.readUInt8(bytebuffer);
        streamDependenceFlag = i >>> 7;
        URLFlag = i >>> 6 & 1;
        oCRstreamFlag = i >>> 5 & 1;
        streamPriority = i & 0x1f;
        if (streamDependenceFlag == 1)
        {
            dependsOnEsId = IsoTypeReader.readUInt16(bytebuffer);
        }
        if (URLFlag == 1)
        {
            URLLength = IsoTypeReader.readUInt8(bytebuffer);
            URLString = IsoTypeReader.readString(bytebuffer, URLLength);
        }
        if (oCRstreamFlag == 1)
        {
            oCREsId = IsoTypeReader.readUInt16(bytebuffer);
        }
        int j1 = getSizeBytes();
        Integer integer;
        int j;
        long l1;
        if (streamDependenceFlag == 1)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (URLFlag == 1)
        {
            j = URLLength + 1;
        } else
        {
            j = 0;
        }
        if (oCRstreamFlag == 1)
        {
            byte0 = 2;
        }
        i = j + (j1 + 1 + 2 + 1 + i) + byte0;
        j = bytebuffer.position();
        if (getSize() > i + 2)
        {
            BaseDescriptor basedescriptor = ObjectDescriptorFactory.createFrom(-1, bytebuffer);
            l1 = bytebuffer.position() - j;
            Logger logger = log;
            StringBuilder stringbuilder = (new StringBuilder()).append(basedescriptor).append(" - ESDescriptor1 read: ").append(l1).append(", size: ");
            int l;
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
                bytebuffer.position(j + k);
                j = k + i;
            } else
            {
                j = (int)((long)i + l1);
            }
            i = j;
            if (basedescriptor instanceof DecoderConfigDescriptor)
            {
                decoderConfigDescriptor = (DecoderConfigDescriptor)basedescriptor;
                i = j;
            }
        }
        j = bytebuffer.position();
        if (getSize() > i + 2)
        {
            basedescriptor = ObjectDescriptorFactory.createFrom(-1, bytebuffer);
            l1 = bytebuffer.position() - j;
            logger = log;
            stringbuilder = (new StringBuilder()).append(basedescriptor).append(" - ESDescriptor2 read: ").append(l1).append(", size: ");
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
                l = basedescriptor.getSize();
                bytebuffer.position(j + l);
                j = i + l;
            } else
            {
                j = (int)((long)i + l1);
            }
            i = j;
            if (basedescriptor instanceof SLConfigDescriptor)
            {
                slConfigDescriptor = (SLConfigDescriptor)basedescriptor;
                i = j;
            }
        } else
        {
            log.warning("SLConfigDescriptor is missing!");
        }
        do
        {
            if (getSize() - i <= 2)
            {
                return;
            }
            j = bytebuffer.position();
            BaseDescriptor basedescriptor1 = ObjectDescriptorFactory.createFrom(-1, bytebuffer);
            l1 = bytebuffer.position() - j;
            Logger logger1 = log;
            StringBuilder stringbuilder1 = (new StringBuilder()).append(basedescriptor1).append(" - ESDescriptor3 read: ").append(l1).append(", size: ");
            if (basedescriptor1 != null)
            {
                integer = Integer.valueOf(basedescriptor1.getSize());
            } else
            {
                integer = null;
            }
            logger1.finer(stringbuilder1.append(integer).toString());
            if (basedescriptor1 != null)
            {
                int i1 = basedescriptor1.getSize();
                bytebuffer.position(j + i1);
                i += i1;
            } else
            {
                i = (int)(l1 + (long)i);
            }
            otherDescriptors.add(basedescriptor1);
        } while (true);
    }

    public ByteBuffer serialize()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(bytebuffer, 3);
        IsoTypeWriter.writeUInt8(bytebuffer, serializedSize() - 2);
        IsoTypeWriter.writeUInt16(bytebuffer, esId);
        IsoTypeWriter.writeUInt8(bytebuffer, streamDependenceFlag << 7 | URLFlag << 6 | oCRstreamFlag << 5 | streamPriority & 0x1f);
        if (streamDependenceFlag > 0)
        {
            IsoTypeWriter.writeUInt16(bytebuffer, dependsOnEsId);
        }
        if (URLFlag > 0)
        {
            IsoTypeWriter.writeUInt8(bytebuffer, URLLength);
            IsoTypeWriter.writeUtf8String(bytebuffer, URLString);
        }
        if (oCRstreamFlag > 0)
        {
            IsoTypeWriter.writeUInt16(bytebuffer, oCREsId);
        }
        ByteBuffer bytebuffer1 = decoderConfigDescriptor.serialize();
        ByteBuffer bytebuffer2 = slConfigDescriptor.serialize();
        bytebuffer.put(bytebuffer1.array());
        bytebuffer.put(bytebuffer2.array());
        return bytebuffer;
    }

    public int serializedSize()
    {
        int j = 5;
        if (streamDependenceFlag > 0)
        {
            j = 7;
        }
        int i = j;
        if (URLFlag > 0)
        {
            i = j + (URLLength + 1);
        }
        j = i;
        if (oCRstreamFlag > 0)
        {
            j = i + 2;
        }
        return j + decoderConfigDescriptor.serializedSize() + slConfigDescriptor.serializedSize();
    }

    public void setDecoderConfigDescriptor(DecoderConfigDescriptor decoderconfigdescriptor)
    {
        decoderConfigDescriptor = decoderconfigdescriptor;
    }

    public void setDependsOnEsId(int i)
    {
        dependsOnEsId = i;
    }

    public void setEsId(int i)
    {
        esId = i;
    }

    public void setRemoteODFlag(int i)
    {
        remoteODFlag = i;
    }

    public void setSlConfigDescriptor(SLConfigDescriptor slconfigdescriptor)
    {
        slConfigDescriptor = slconfigdescriptor;
    }

    public void setStreamDependenceFlag(int i)
    {
        streamDependenceFlag = i;
    }

    public void setStreamPriority(int i)
    {
        streamPriority = i;
    }

    public void setURLFlag(int i)
    {
        URLFlag = i;
    }

    public void setURLLength(int i)
    {
        URLLength = i;
    }

    public void setURLString(String s)
    {
        URLString = s;
    }

    public void setoCREsId(int i)
    {
        oCREsId = i;
    }

    public void setoCRstreamFlag(int i)
    {
        oCRstreamFlag = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ESDescriptor");
        stringbuilder.append("{esId=").append(esId);
        stringbuilder.append(", streamDependenceFlag=").append(streamDependenceFlag);
        stringbuilder.append(", URLFlag=").append(URLFlag);
        stringbuilder.append(", oCRstreamFlag=").append(oCRstreamFlag);
        stringbuilder.append(", streamPriority=").append(streamPriority);
        stringbuilder.append(", URLLength=").append(URLLength);
        stringbuilder.append(", URLString='").append(URLString).append('\'');
        stringbuilder.append(", remoteODFlag=").append(remoteODFlag);
        stringbuilder.append(", dependsOnEsId=").append(dependsOnEsId);
        stringbuilder.append(", oCREsId=").append(oCREsId);
        stringbuilder.append(", decoderConfigDescriptor=").append(decoderConfigDescriptor);
        stringbuilder.append(", slConfigDescriptor=").append(slConfigDescriptor);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
