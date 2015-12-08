// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import fG;
import fL;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.Date;

public class MovieHeaderBox extends ft
{

    public static final String TYPE = "mvhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_11;
    private static final akp.a ajc$tjp_12;
    private static final akp.a ajc$tjp_13;
    private static final akp.a ajc$tjp_14;
    private static final akp.a ajc$tjp_15;
    private static final akp.a ajc$tjp_16;
    private static final akp.a ajc$tjp_17;
    private static final akp.a ajc$tjp_18;
    private static final akp.a ajc$tjp_19;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_20;
    private static final akp.a ajc$tjp_21;
    private static final akp.a ajc$tjp_22;
    private static final akp.a ajc$tjp_23;
    private static final akp.a ajc$tjp_24;
    private static final akp.a ajc$tjp_25;
    private static final akp.a ajc$tjp_26;
    private static final akp.a ajc$tjp_27;
    private static final akp.a ajc$tjp_28;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private fL matrix;
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
        matrix = fL.a;
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("MovieHeaderBox.java", com/coremedia/iso/boxes/MovieHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_16 = akn.a("method-execution", akn.a("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        ajc$tjp_17 = akn.a("method-execution", akn.a("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        ajc$tjp_18 = akn.a("method-execution", akn.a("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        ajc$tjp_19 = akn.a("method-execution", akn.a("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        ajc$tjp_20 = akn.a("method-execution", akn.a("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        ajc$tjp_21 = akn.a("method-execution", akn.a("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        ajc$tjp_22 = akn.a("method-execution", akn.a("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        ajc$tjp_23 = akn.a("method-execution", akn.a("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        ajc$tjp_24 = akn.a("method-execution", akn.a("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        ajc$tjp_25 = akn.a("method-execution", akn.a("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        ajc$tjp_26 = akn.a("method-execution", akn.a("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        ajc$tjp_27 = akn.a("method-execution", akn.a("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        ajc$tjp_28 = akn.a("method-execution", akn.a("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = fG.a(cv.f(bytebuffer));
            modificationTime = fG.a(cv.f(bytebuffer));
            timescale = cv.a(bytebuffer);
            duration = cv.f(bytebuffer);
        } else
        {
            creationTime = fG.a(cv.a(bytebuffer));
            modificationTime = fG.a(cv.a(bytebuffer));
            timescale = cv.a(bytebuffer);
            duration = cv.a(bytebuffer);
        }
        rate = cv.g(bytebuffer);
        volume = cv.i(bytebuffer);
        cv.c(bytebuffer);
        cv.a(bytebuffer);
        cv.a(bytebuffer);
        matrix = fL.a(bytebuffer);
        previewTime = bytebuffer.getInt();
        previewDuration = bytebuffer.getInt();
        posterTime = bytebuffer.getInt();
        selectionTime = bytebuffer.getInt();
        selectionDuration = bytebuffer.getInt();
        currentTime = bytebuffer.getInt();
        nextTrackId = cv.a(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            cx.a(bytebuffer, fG.a(creationTime));
            cx.a(bytebuffer, fG.a(modificationTime));
            cx.b(bytebuffer, timescale);
            cx.a(bytebuffer, duration);
        } else
        {
            cx.b(bytebuffer, fG.a(creationTime));
            cx.b(bytebuffer, fG.a(modificationTime));
            cx.b(bytebuffer, timescale);
            cx.b(bytebuffer, duration);
        }
        cx.a(bytebuffer, rate);
        cx.c(bytebuffer, volume);
        cx.b(bytebuffer, 0);
        cx.b(bytebuffer, 0L);
        cx.b(bytebuffer, 0L);
        matrix.b(bytebuffer);
        bytebuffer.putInt(previewTime);
        bytebuffer.putInt(previewDuration);
        bytebuffer.putInt(posterTime);
        bytebuffer.putInt(selectionTime);
        bytebuffer.putInt(selectionDuration);
        bytebuffer.putInt(currentTime);
        cx.b(bytebuffer, nextTrackId);
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
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return creationTime;
    }

    public int getCurrentTime()
    {
        akp akp = akN.a(ajc$tjp_27, this);
        fx.a();
        fx.a(akp);
        return currentTime;
    }

    public long getDuration()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return duration;
    }

    public fL getMatrix()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return matrix;
    }

    public Date getModificationTime()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return modificationTime;
    }

    public long getNextTrackId()
    {
        akp akp = akN.a(ajc$tjp_7, this);
        fx.a();
        fx.a(akp);
        return nextTrackId;
    }

    public int getPosterTime()
    {
        akp akp = akN.a(ajc$tjp_21, this);
        fx.a();
        fx.a(akp);
        return posterTime;
    }

    public int getPreviewDuration()
    {
        akp akp = akN.a(ajc$tjp_19, this);
        fx.a();
        fx.a(akp);
        return previewDuration;
    }

    public int getPreviewTime()
    {
        akp akp = akN.a(ajc$tjp_17, this);
        fx.a();
        fx.a(akp);
        return previewTime;
    }

    public double getRate()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return rate;
    }

    public int getSelectionDuration()
    {
        akp akp = akN.a(ajc$tjp_25, this);
        fx.a();
        fx.a(akp);
        return selectionDuration;
    }

    public int getSelectionTime()
    {
        akp akp = akN.a(ajc$tjp_23, this);
        fx.a();
        fx.a(akp);
        return selectionTime;
    }

    public long getTimescale()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return timescale;
    }

    public float getVolume()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return volume;
    }

    public void setCreationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_9, this, date);
        fx.a();
        fx.a(akp);
        creationTime = date;
        if (fG.a(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i)
    {
        akp akp = akN.a(ajc$tjp_28, this, akL.a(i));
        fx.a();
        fx.a(akp);
        currentTime = i;
    }

    public void setDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_12, this, akL.a(l));
        fx.a();
        fx.a(akp);
        duration = l;
        if (l >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setMatrix(fL fl)
    {
        akp akp = akN.a(ajc$tjp_15, this, fl);
        fx.a();
        fx.a(akp);
        matrix = fl;
    }

    public void setModificationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_10, this, date);
        fx.a();
        fx.a(akp);
        modificationTime = date;
        if (fG.a(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setNextTrackId(long l)
    {
        akp akp = akN.a(ajc$tjp_16, this, akL.a(l));
        fx.a();
        fx.a(akp);
        nextTrackId = l;
    }

    public void setPosterTime(int i)
    {
        akp akp = akN.a(ajc$tjp_22, this, akL.a(i));
        fx.a();
        fx.a(akp);
        posterTime = i;
    }

    public void setPreviewDuration(int i)
    {
        akp akp = akN.a(ajc$tjp_20, this, akL.a(i));
        fx.a();
        fx.a(akp);
        previewDuration = i;
    }

    public void setPreviewTime(int i)
    {
        akp akp = akN.a(ajc$tjp_18, this, akL.a(i));
        fx.a();
        fx.a(akp);
        previewTime = i;
    }

    public void setRate(double d)
    {
        akp akp = akN.a(ajc$tjp_13, this, akL.a(d));
        fx.a();
        fx.a(akp);
        rate = d;
    }

    public void setSelectionDuration(int i)
    {
        akp akp = akN.a(ajc$tjp_26, this, akL.a(i));
        fx.a();
        fx.a(akp);
        selectionDuration = i;
    }

    public void setSelectionTime(int i)
    {
        akp akp = akN.a(ajc$tjp_24, this, akL.a(i));
        fx.a();
        fx.a(akp);
        selectionTime = i;
    }

    public void setTimescale(long l)
    {
        akp akp = akN.a(ajc$tjp_11, this, akL.a(l));
        fx.a();
        fx.a(akp);
        timescale = l;
    }

    public void setVolume(float f)
    {
        akp akp = akN.a(ajc$tjp_14, this, akL.a(f));
        fx.a();
        fx.a(akp);
        volume = f;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(((akp) (obj)));
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
