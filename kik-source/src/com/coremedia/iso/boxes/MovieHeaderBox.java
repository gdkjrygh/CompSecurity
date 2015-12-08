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

public class MovieHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "mvhd";
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
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    private static final org.b.a.a.a ajc$tjp_8;
    private static final org.b.a.a.a ajc$tjp_9;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private Matrix matrix;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    public MovieHeaderBox()
    {
        super("mvhd");
        rate = 1.0D;
        volume = 1.0F;
        matrix = Matrix.ROTATE_0;
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("MovieHeaderBox.java", com/coremedia/iso/boxes/MovieHeaderBox);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = b1.a("method-execution", b1.a("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_11 = b1.a("method-execution", b1.a("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        ajc$tjp_12 = b1.a("method-execution", b1.a("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_13 = b1.a("method-execution", b1.a("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        ajc$tjp_14 = b1.a("method-execution", b1.a("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        ajc$tjp_15 = b1.a("method-execution", b1.a("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_16 = b1.a("method-execution", b1.a("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        ajc$tjp_17 = b1.a("method-execution", b1.a("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        ajc$tjp_18 = b1.a("method-execution", b1.a("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        ajc$tjp_19 = b1.a("method-execution", b1.a("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        ajc$tjp_20 = b1.a("method-execution", b1.a("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        ajc$tjp_21 = b1.a("method-execution", b1.a("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        ajc$tjp_22 = b1.a("method-execution", b1.a("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        ajc$tjp_23 = b1.a("method-execution", b1.a("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        ajc$tjp_24 = b1.a("method-execution", b1.a("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        ajc$tjp_25 = b1.a("method-execution", b1.a("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        ajc$tjp_26 = b1.a("method-execution", b1.a("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        ajc$tjp_27 = b1.a("method-execution", b1.a("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        ajc$tjp_28 = b1.a("method-execution", b1.a("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        ajc$tjp_8 = b1.a("method-execution", b1.a("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_9 = b1.a("method-execution", b1.a("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            timescale = IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt64(bytebuffer);
        } else
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            timescale = IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt32(bytebuffer);
        }
        rate = IsoTypeReader.readFixedPoint1616(bytebuffer);
        volume = IsoTypeReader.readFixedPoint88(bytebuffer);
        IsoTypeReader.readUInt16(bytebuffer);
        IsoTypeReader.readUInt32(bytebuffer);
        IsoTypeReader.readUInt32(bytebuffer);
        matrix = Matrix.fromByteBuffer(bytebuffer);
        previewTime = bytebuffer.getInt();
        previewDuration = bytebuffer.getInt();
        posterTime = bytebuffer.getInt();
        selectionTime = bytebuffer.getInt();
        selectionDuration = bytebuffer.getInt();
        currentTime = bytebuffer.getInt();
        nextTrackId = IsoTypeReader.readUInt32(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, timescale);
            IsoTypeWriter.writeUInt64(bytebuffer, duration);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, timescale);
            IsoTypeWriter.writeUInt32(bytebuffer, duration);
        }
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, rate);
        IsoTypeWriter.writeFixedPoint88(bytebuffer, volume);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        matrix.getContent(bytebuffer);
        bytebuffer.putInt(previewTime);
        bytebuffer.putInt(previewDuration);
        bytebuffer.putInt(posterTime);
        bytebuffer.putInt(selectionTime);
        bytebuffer.putInt(selectionDuration);
        bytebuffer.putInt(currentTime);
        IsoTypeWriter.writeUInt32(bytebuffer, nextTrackId);
    }

    protected long getContentSize()
    {
        long l;
        if (getVersion() == 1)
        {
            l = 32L;
        } else
        {
            l = 20L;
        }
        return l + 80L;
    }

    public Date getCreationTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return creationTime;
    }

    public int getCurrentTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_27, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return currentTime;
    }

    public long getDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return duration;
    }

    public Matrix getMatrix()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return matrix;
    }

    public Date getModificationTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return modificationTime;
    }

    public long getNextTrackId()
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return nextTrackId;
    }

    public int getPosterTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_21, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return posterTime;
    }

    public int getPreviewDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return previewDuration;
    }

    public int getPreviewTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_17, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return previewTime;
    }

    public double getRate()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return rate;
    }

    public int getSelectionDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_25, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return selectionDuration;
    }

    public int getSelectionTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_23, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return selectionTime;
    }

    public long getTimescale()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return timescale;
    }

    public float getVolume()
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return volume;
    }

    public void setCreationTime(Date date)
    {
        org.b.a.a a1 = b.a(ajc$tjp_9, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(a1);
        creationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_28, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        currentTime = i;
    }

    public void setDuration(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_12, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        duration = l;
        if (l >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setMatrix(Matrix matrix1)
    {
        org.b.a.a a1 = b.a(ajc$tjp_15, this, this, matrix1);
        RequiresParseDetailAspect.aspectOf().before(a1);
        matrix = matrix1;
    }

    public void setModificationTime(Date date)
    {
        org.b.a.a a1 = b.a(ajc$tjp_10, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(a1);
        modificationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setNextTrackId(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_16, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        nextTrackId = l;
    }

    public void setPosterTime(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_22, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        posterTime = i;
    }

    public void setPreviewDuration(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_20, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        previewDuration = i;
    }

    public void setPreviewTime(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_18, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        previewTime = i;
    }

    public void setRate(double d)
    {
        org.b.a.a a1 = b.a(ajc$tjp_13, this, this, a.a(d));
        RequiresParseDetailAspect.aspectOf().before(a1);
        rate = d;
    }

    public void setSelectionDuration(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_26, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        selectionDuration = i;
    }

    public void setSelectionTime(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_24, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        selectionTime = i;
    }

    public void setTimescale(long l)
    {
        org.b.a.a a1 = b.a(ajc$tjp_11, this, this, a.a(l));
        RequiresParseDetailAspect.aspectOf().before(a1);
        timescale = l;
    }

    public void setVolume(float f)
    {
        org.b.a.a a1 = b.a(ajc$tjp_14, this, this, a.a(f));
        RequiresParseDetailAspect.aspectOf().before(a1);
        volume = f;
    }

    public String toString()
    {
        Object obj = b.a(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.b.a.a) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("MovieHeaderBox[");
        ((StringBuilder) (obj)).append("creationTime=").append(getCreationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("modificationTime=").append(getModificationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("timescale=").append(getTimescale());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("duration=").append(getDuration());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("rate=").append(getRate());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("volume=").append(getVolume());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("matrix=").append(matrix);
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("nextTrackId=").append(getNextTrackId());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
