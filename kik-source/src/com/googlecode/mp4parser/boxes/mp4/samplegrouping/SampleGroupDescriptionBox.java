// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.mp4parser.iso14496.part15.StepwiseTemporalLayerEntry;
import com.mp4parser.iso14496.part15.SyncSampleEntry;
import com.mp4parser.iso14496.part15.TemporalLayerSampleGroup;
import com.mp4parser.iso14496.part15.TemporalSubLayerSampleGroup;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.b.b.a.a;
import org.b.b.b.b;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            RollRecoveryEntry, GroupEntry, RateShareEntry, CencSampleEncryptionInformationGroupEntry, 
//            VisualRandomAccessEntry, TemporalLevelEntry, UnknownEntry

public class SampleGroupDescriptionBox extends AbstractFullBox
{

    public static final String TYPE = "sgpd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private int defaultLength;
    private List groupEntries;

    public SampleGroupDescriptionBox()
    {
        super("sgpd");
        groupEntries = new LinkedList();
        setVersion(1);
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("SampleGroupDescriptionBox.java", com/googlecode/mp4parser/boxes/mp4/samplegrouping/SampleGroupDescriptionBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 145);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 149);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 153);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 157);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 162);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 183);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 191);
    }

    private GroupEntry parseGroupEntry(ByteBuffer bytebuffer, String s)
    {
        if ("roll".equals(s))
        {
            s = new RollRecoveryEntry();
        } else
        if ("rash".equals(s))
        {
            s = new RateShareEntry();
        } else
        if ("seig".equals(s))
        {
            s = new CencSampleEncryptionInformationGroupEntry();
        } else
        if ("rap ".equals(s))
        {
            s = new VisualRandomAccessEntry();
        } else
        if ("tele".equals(s))
        {
            s = new TemporalLevelEntry();
        } else
        if ("sync".equals(s))
        {
            s = new SyncSampleEntry();
        } else
        if ("tscl".equals(s))
        {
            s = new TemporalLayerSampleGroup();
        } else
        if ("tsas".equals(s))
        {
            s = new TemporalSubLayerSampleGroup();
        } else
        if ("stsa".equals(s))
        {
            s = new StepwiseTemporalLayerEntry();
        } else
        {
            s = new UnknownEntry(s);
        }
        s.parse(bytebuffer);
        return s;
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() != 1)
        {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        String s = IsoTypeReader.read4cc(bytebuffer);
        if (getVersion() == 1)
        {
            defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        }
        long l = IsoTypeReader.readUInt32(bytebuffer);
        do
        {
            if (l <= 0L)
            {
                return;
            }
            int i = defaultLength;
            if (getVersion() == 1)
            {
                if (defaultLength == 0)
                {
                    i = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
                }
                int j = bytebuffer.position();
                ByteBuffer bytebuffer1 = bytebuffer.slice();
                bytebuffer1.limit(i);
                groupEntries.add(parseGroupEntry(bytebuffer1, s));
                bytebuffer.position(j + i);
                l--;
            } else
            {
                throw new RuntimeException("This should be implemented");
            }
        } while (true);
    }

    public boolean equals(Object obj)
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SampleGroupDescriptionBox)obj;
            if (defaultLength != ((SampleGroupDescriptionBox) (obj)).defaultLength)
            {
                return false;
            }
            if (groupEntries == null ? ((SampleGroupDescriptionBox) (obj)).groupEntries != null : !groupEntries.equals(((SampleGroupDescriptionBox) (obj)).groupEntries))
            {
                return false;
            }
        }
        return true;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(IsoFile.fourCCtoBytes(((GroupEntry)groupEntries.get(0)).getType()));
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, defaultLength);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, groupEntries.size());
        Iterator iterator = groupEntries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            GroupEntry groupentry = (GroupEntry)iterator.next();
            if (getVersion() == 1 && defaultLength == 0)
            {
                IsoTypeWriter.writeUInt32(bytebuffer, groupentry.get().limit());
            }
            bytebuffer.put(groupentry.get());
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 8L;
        if (getVersion() == 1)
        {
            l = 12L;
        }
        Iterator iterator = groupEntries.iterator();
        l += 4L;
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            GroupEntry groupentry = (GroupEntry)iterator.next();
            long l1 = l;
            if (getVersion() == 1)
            {
                l1 = l;
                if (defaultLength == 0)
                {
                    l1 = l + 4L;
                }
            }
            l = (long)groupentry.size() + l1;
        } while (true);
    }

    public int getDefaultLength()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultLength;
    }

    public List getGroupEntries()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return groupEntries;
    }

    public int hashCode()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        int j = defaultLength;
        int i;
        if (groupEntries != null)
        {
            i = groupEntries.hashCode();
        } else
        {
            i = 0;
        }
        return i + (j + 0) * 31;
    }

    public void setDefaultLength(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultLength = i;
    }

    public void setGroupEntries(List list)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(a1);
        groupEntries = list;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        StringBuilder stringbuilder = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        if (groupEntries.size() > 0)
        {
            obj = ((GroupEntry)groupEntries.get(0)).getType();
        } else
        {
            obj = "????";
        }
        return stringbuilder.append(((String) (obj))).append('\'').append(", defaultLength=").append(defaultLength).append(", groupEntries=").append(groupEntries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
