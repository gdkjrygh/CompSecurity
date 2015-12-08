// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.b.b.b.b;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox
{

    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    protected int algorithmId;
    List entries;
    protected int ivSize;
    protected byte kid[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };

    protected AbstractSampleEncryptionBox(String s)
    {
        super(s);
        algorithmId = -1;
        ivSize = -1;
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("AbstractSampleEncryptionBox.java", com/googlecode/mp4parser/boxes/AbstractSampleEncryptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 189);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 197);
    }

    private List parseEntries(ByteBuffer bytebuffer, long l, int i)
    {
        ArrayList arraylist = new ArrayList();
_L6:
        if (l <= 0L)
        {
            return arraylist;
        }
        CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat;
        cencsampleauxiliarydataformat = new CencSampleAuxiliaryDataFormat();
        cencsampleauxiliarydataformat.iv = new byte[i];
        bytebuffer.get(cencsampleauxiliarydataformat.iv);
        if ((getFlags() & 2) <= 0) goto _L2; else goto _L1
_L1:
        cencsampleauxiliarydataformat.pairs = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[IsoTypeReader.readUInt16(bytebuffer)];
        int j = 0;
_L4:
        if (j < cencsampleauxiliarydataformat.pairs.length) goto _L3; else goto _L2
_L2:
        arraylist.add(cencsampleauxiliarydataformat);
        l--;
        continue; /* Loop/switch isn't completed */
_L3:
        cencsampleauxiliarydataformat.pairs[j] = cencsampleauxiliarydataformat.createPair(IsoTypeReader.readUInt16(bytebuffer), IsoTypeReader.readUInt32(bytebuffer));
        j++;
          goto _L4
        bytebuffer;
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) > 0)
        {
            algorithmId = IsoTypeReader.readUInt24(bytebuffer);
            ivSize = IsoTypeReader.readUInt8(bytebuffer);
            kid = new byte[16];
            bytebuffer.get(kid);
        }
        long l = IsoTypeReader.readUInt32(bytebuffer);
        ByteBuffer bytebuffer1 = bytebuffer.duplicate();
        ByteBuffer bytebuffer2 = bytebuffer.duplicate();
        entries = parseEntries(bytebuffer1, l, 8);
        if (entries == null)
        {
            entries = parseEntries(bytebuffer2, l, 16);
            bytebuffer.position((bytebuffer.position() + bytebuffer.remaining()) - bytebuffer2.remaining());
        } else
        {
            bytebuffer.position((bytebuffer.position() + bytebuffer.remaining()) - bytebuffer1.remaining());
        }
        if (entries == null)
        {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a = b.a(ajc$tjp_3, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AbstractSampleEncryptionBox)obj;
            if (algorithmId != ((AbstractSampleEncryptionBox) (obj)).algorithmId)
            {
                return false;
            }
            if (ivSize != ((AbstractSampleEncryptionBox) (obj)).ivSize)
            {
                return false;
            }
            if (entries == null ? ((AbstractSampleEncryptionBox) (obj)).entries != null : !entries.equals(((AbstractSampleEncryptionBox) (obj)).entries))
            {
                return false;
            }
            if (!Arrays.equals(kid, ((AbstractSampleEncryptionBox) (obj)).kid))
            {
                return false;
            }
        }
        return true;
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        super.getBox(writablebytechannel);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (isOverrideTrackEncryptionBoxParameters())
        {
            IsoTypeWriter.writeUInt24(bytebuffer, algorithmId);
            IsoTypeWriter.writeUInt8(bytebuffer, ivSize);
            bytebuffer.put(kid);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    cencsampleauxiliarydataformat = (CencSampleAuxiliaryDataFormat)iterator.next();
                } while (cencsampleauxiliarydataformat.getSize() <= 0);
                if (cencsampleauxiliarydataformat.iv.length != 8 && cencsampleauxiliarydataformat.iv.length != 16)
                {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                bytebuffer.put(cencsampleauxiliarydataformat.iv);
            } while (!isSubSampleEncryption());
            IsoTypeWriter.writeUInt16(bytebuffer, cencsampleauxiliarydataformat.pairs.length);
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair apair[] = cencsampleauxiliarydataformat.pairs;
            int j = apair.length;
            int i = 0;
            while (i < j) 
            {
                com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair pair = apair[i];
                IsoTypeWriter.writeUInt16(bytebuffer, pair.clear());
                IsoTypeWriter.writeUInt32(bytebuffer, pair.encrypted());
                i++;
            }
        } while (true);
    }

    protected long getContentSize()
    {
        Iterator iterator;
        long l;
        if (isOverrideTrackEncryptionBoxParameters())
        {
            l = 8L + (long)kid.length;
        } else
        {
            l = 4L;
        }
        iterator = entries.iterator();
        l += 4L;
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l = (long)((CencSampleAuxiliaryDataFormat)iterator.next()).getSize() + l;
        } while (true);
    }

    public List getEntries()
    {
        org.b.a.a a = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        return entries;
    }

    public List getEntrySizes()
    {
        Object obj = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new ArrayList(entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return ((List) (obj));
            }
            CencSampleAuxiliaryDataFormat cencsampleauxiliarydataformat = (CencSampleAuxiliaryDataFormat)iterator.next();
            short word0 = (short)cencsampleauxiliarydataformat.iv.length;
            if (isSubSampleEncryption())
            {
                short word1 = (short)(word0 + 2);
                word0 = (short)(cencsampleauxiliarydataformat.pairs.length * 6 + word1);
            }
            ((List) (obj)).add(Short.valueOf(word0));
        } while (true);
    }

    public int getOffsetToFirstIV()
    {
        org.b.a.a a = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        byte byte0;
        int i;
        if (getSize() > 0x100000000L)
        {
            byte0 = 16;
        } else
        {
            byte0 = 8;
        }
        if (isOverrideTrackEncryptionBoxParameters())
        {
            i = kid.length + 4;
        } else
        {
            i = 0;
        }
        return byte0 + i + 4;
    }

    public int hashCode()
    {
        int j = 0;
        org.b.a.a a = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a);
        int k = algorithmId;
        int l = ivSize;
        int i;
        if (kid != null)
        {
            i = Arrays.hashCode(kid);
        } else
        {
            i = 0;
        }
        if (entries != null)
        {
            j = entries.hashCode();
        }
        return (i + (k * 31 + l) * 31) * 31 + j;
    }

    protected boolean isOverrideTrackEncryptionBoxParameters()
    {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption()
    {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List list)
    {
        org.b.a.a a = b.a(ajc$tjp_2, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a);
        entries = list;
    }

    public void setSubSampleEncryption(boolean flag)
    {
        if (flag)
        {
            setFlags(getFlags() | 2);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffd);
            return;
        }
    }

    static 
    {
        ajc$preClinit();
    }
}
