// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Matrix;
import java.nio.ByteBuffer;
import java.util.Date;
import org.b.b.a.a;
import org.b.b.b.b;

public class TrackHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "tkhd";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_10;
    private static final org.b.a.a.a ajc$tjp_11;
    private static final org.b.a.a.a ajc$tjp_12;
    private static final org.b.a.a.a ajc$tjp_13;
    private static final org.b.a.a.a ajc$tjp_14;
    private static final org.b.a.a.a ajc$tjp_15;
    private static final org.b.a.a.a ajc$tjp_16;
    private static final org.b.a.a.a ajc$tjp_17;
    private static final org.b.a.a.a ajc$tjp_18;
    private static final org.b.a.a.a ajc$tjp_19;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_20;
    private static final org.b.a.a.a ajc$tjp_21;
    private static final org.b.a.a.a ajc$tjp_22;
    private static final org.b.a.a.a ajc$tjp_23;
    private static final org.b.a.a.a ajc$tjp_24;
    private static final org.b.a.a.a ajc$tjp_25;
    private static final org.b.a.a.a ajc$tjp_26;
    private static final org.b.a.a.a ajc$tjp_27;
    private static final org.b.a.a.a ajc$tjp_28;
    private static final org.b.a.a.a ajc$tjp_29;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    public TrackHeaderBox()
    {
        super("tkhd");
        matrix = Matrix.ROTATE_0;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TrackHeaderBox.java", com/coremedia/iso/boxes/TrackHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        ajc$tjp_22 = b1.a("method-execution", b1.a("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        ajc$tjp_23 = b1.a("method-execution", b1.a("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        ajc$tjp_24 = b1.a("method-execution", b1.a("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        ajc$tjp_25 = b1.a("method-execution", b1.a("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        ajc$tjp_26 = b1.a("method-execution", b1.a("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        ajc$tjp_27 = b1.a("method-execution", b1.a("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        ajc$tjp_28 = b1.a("method-execution", b1.a("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        ajc$tjp_29 = b1.a("method-execution", b1.a("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            trackId = IsoTypeReader.readUInt32(bytebuffer);
            IsoTypeReader.readUInt32(bytebuffer);
            duration = bytebuffer.getLong();
            if (duration < -1L)
            {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            trackId = IsoTypeReader.readUInt32(bytebuffer);
            IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt32(bytebuffer);
        }
        IsoTypeReader.readUInt32(bytebuffer);
        IsoTypeReader.readUInt32(bytebuffer);
        layer = IsoTypeReader.readUInt16(bytebuffer);
        alternateGroup = IsoTypeReader.readUInt16(bytebuffer);
        volume = IsoTypeReader.readFixedPoint88(bytebuffer);
        IsoTypeReader.readUInt16(bytebuffer);
        matrix = Matrix.fromByteBuffer(bytebuffer);
        width = IsoTypeReader.readFixedPoint1616(bytebuffer);
        height = IsoTypeReader.readFixedPoint1616(bytebuffer);
    }

    public int getAlternateGroup()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return alternateGroup;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(a1);
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, trackId);
            IsoTypeWriter.writeUInt32(bytebuffer, 0L);
            IsoTypeWriter.writeUInt64(bytebuffer, duration);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, trackId);
            IsoTypeWriter.writeUInt32(bytebuffer, 0L);
            IsoTypeWriter.writeUInt32(bytebuffer, duration);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt16(bytebuffer, layer);
        IsoTypeWriter.writeUInt16(bytebuffer, alternateGroup);
        IsoTypeWriter.writeFixedPoint88(bytebuffer, volume);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        matrix.getContent(bytebuffer);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, width);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, height);
    }

    protected long getContentSize()
    {
        long l;
        if (getVersion() == 1)
        {
            l = 36L;
        } else
        {
            l = 24L;
        }
        return l + 60L;
    }

    public Date getCreationTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return creationTime;
    }

    public long getDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return duration;
    }

    public double getHeight()
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return height;
    }

    public int getLayer()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return layer;
    }

    public Matrix getMatrix()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return matrix;
    }

    public Date getModificationTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return modificationTime;
    }

    public long getTrackId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return trackId;
    }

    public float getVolume()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return volume;
    }

    public double getWidth()
    {
        org.b.a.a a1 = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return width;
    }

    public boolean isEnabled()
    {
        org.b.a.a a1 = b.a(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie()
    {
        org.b.a.a a1 = b.a(ajc$tjp_23, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster()
    {
        org.b.a.a a1 = b.a(ajc$tjp_25, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview()
    {
        org.b.a.a a1 = b.a(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        alternateGroup = i;
    }

    public void setCreationTime(Date date)
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(a1);
        creationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        duration = l;
        if (l >= 0x100000000L)
        {
            setFlags(1);
        }
    }

    public void setEnabled(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_26, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & -2);
            return;
        }
    }

    public void setHeight(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        height = d;
    }

    public void setInMovie(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_27, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (flag)
        {
            setFlags(getFlags() | 2);
            return;
        } else
        {
            setFlags(getFlags() & -3);
            return;
        }
    }

    public void setInPoster(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_29, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (flag)
        {
            setFlags(getFlags() | 8);
            return;
        } else
        {
            setFlags(getFlags() & -9);
            return;
        }
    }

    public void setInPreview(boolean flag)
    {
        org.b.a.a a1 = b.a(ajc$tjp_28, this, this, a.a(flag));
        RequiresParseDetailAspect.aspectOf().before(a1);
        if (flag)
        {
            setFlags(getFlags() | 4);
            return;
        } else
        {
            setFlags(getFlags() & -5);
            return;
        }
    }

    public void setLayer(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        layer = i;
    }

    public void setMatrix(Matrix matrix1)
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this, matrix1);
        RequiresParseDetailAspect.aspectOf().before(a1);
        matrix = matrix1;
    }

    public void setModificationTime(Date date)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(a1);
        modificationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setTrackId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        trackId = l;
    }

    public void setVolume(float f)
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this, a.a(f));
        RequiresParseDetailAspect.aspectOf().before(a1);
        volume = f;
    }

    public void setWidth(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        width = d;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackHeaderBox[");
        ((StringBuilder) (obj)).append("creationTime=").append(getCreationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("modificationTime=").append(getModificationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("trackId=").append(getTrackId());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("duration=").append(getDuration());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("layer=").append(getLayer());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("alternateGroup=").append(getAlternateGroup());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("volume=").append(getVolume());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("matrix=").append(matrix);
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("width=").append(getWidth());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("height=").append(getHeight());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
