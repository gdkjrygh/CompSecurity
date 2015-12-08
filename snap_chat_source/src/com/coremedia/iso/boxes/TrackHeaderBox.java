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

public class TrackHeaderBox extends ft
{

    public static final String TYPE = "tkhd";
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
    private static final akp.a ajc$tjp_29;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private fL matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    public TrackHeaderBox()
    {
        super("tkhd");
        matrix = fL.a;
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackHeaderBox.java", com/coremedia/iso/boxes/TrackHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        ajc$tjp_11 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        ajc$tjp_12 = akn.a("method-execution", akn.a("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        ajc$tjp_13 = akn.a("method-execution", akn.a("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_14 = akn.a("method-execution", akn.a("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        ajc$tjp_15 = akn.a("method-execution", akn.a("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_16 = akn.a("method-execution", akn.a("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        ajc$tjp_17 = akn.a("method-execution", akn.a("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        ajc$tjp_18 = akn.a("method-execution", akn.a("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        ajc$tjp_19 = akn.a("method-execution", akn.a("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        ajc$tjp_20 = akn.a("method-execution", akn.a("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        ajc$tjp_21 = akn.a("method-execution", akn.a("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        ajc$tjp_22 = akn.a("method-execution", akn.a("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        ajc$tjp_23 = akn.a("method-execution", akn.a("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        ajc$tjp_24 = akn.a("method-execution", akn.a("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        ajc$tjp_25 = akn.a("method-execution", akn.a("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        ajc$tjp_26 = akn.a("method-execution", akn.a("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        ajc$tjp_27 = akn.a("method-execution", akn.a("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        ajc$tjp_28 = akn.a("method-execution", akn.a("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        ajc$tjp_29 = akn.a("method-execution", akn.a("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = fG.a(cv.f(bytebuffer));
            modificationTime = fG.a(cv.f(bytebuffer));
            trackId = cv.a(bytebuffer);
            cv.a(bytebuffer);
            duration = bytebuffer.getLong();
            if (duration < -1L)
            {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else
        {
            creationTime = fG.a(cv.a(bytebuffer));
            modificationTime = fG.a(cv.a(bytebuffer));
            trackId = cv.a(bytebuffer);
            cv.a(bytebuffer);
            duration = cv.a(bytebuffer);
        }
        cv.a(bytebuffer);
        cv.a(bytebuffer);
        layer = cv.c(bytebuffer);
        alternateGroup = cv.c(bytebuffer);
        volume = cv.i(bytebuffer);
        cv.c(bytebuffer);
        matrix = fL.a(bytebuffer);
        width = cv.g(bytebuffer);
        height = cv.g(bytebuffer);
    }

    public int getAlternateGroup()
    {
        akp akp = akN.a(ajc$tjp_5, this);
        fx.a();
        fx.a(akp);
        return alternateGroup;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        akp akp = akN.a(ajc$tjp_10, this, bytebuffer);
        fx.a();
        fx.a(akp);
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            cx.a(bytebuffer, fG.a(creationTime));
            cx.a(bytebuffer, fG.a(modificationTime));
            cx.b(bytebuffer, trackId);
            cx.b(bytebuffer, 0L);
            cx.a(bytebuffer, duration);
        } else
        {
            cx.b(bytebuffer, fG.a(creationTime));
            cx.b(bytebuffer, fG.a(modificationTime));
            cx.b(bytebuffer, trackId);
            cx.b(bytebuffer, 0L);
            cx.b(bytebuffer, duration);
        }
        cx.b(bytebuffer, 0L);
        cx.b(bytebuffer, 0L);
        cx.b(bytebuffer, layer);
        cx.b(bytebuffer, alternateGroup);
        cx.c(bytebuffer, volume);
        cx.b(bytebuffer, 0);
        matrix.b(bytebuffer);
        cx.a(bytebuffer, width);
        cx.a(bytebuffer, height);
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
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return creationTime;
    }

    public long getDuration()
    {
        akp akp = akN.a(ajc$tjp_3, this);
        fx.a();
        fx.a(akp);
        return duration;
    }

    public double getHeight()
    {
        akp akp = akN.a(ajc$tjp_9, this);
        fx.a();
        fx.a(akp);
        return height;
    }

    public int getLayer()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return layer;
    }

    public fL getMatrix()
    {
        akp akp = akN.a(ajc$tjp_7, this);
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

    public long getTrackId()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return trackId;
    }

    public float getVolume()
    {
        akp akp = akN.a(ajc$tjp_6, this);
        fx.a();
        fx.a(akp);
        return volume;
    }

    public double getWidth()
    {
        akp akp = akN.a(ajc$tjp_8, this);
        fx.a();
        fx.a(akp);
        return width;
    }

    public boolean isEnabled()
    {
        akp akp = akN.a(ajc$tjp_22, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie()
    {
        akp akp = akN.a(ajc$tjp_23, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster()
    {
        akp akp = akN.a(ajc$tjp_25, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview()
    {
        akp akp = akN.a(ajc$tjp_24, this);
        fx.a();
        fx.a(akp);
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i)
    {
        akp akp = akN.a(ajc$tjp_17, this, akL.a(i));
        fx.a();
        fx.a(akp);
        alternateGroup = i;
    }

    public void setCreationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_12, this, date);
        fx.a();
        fx.a(akp);
        creationTime = date;
        if (fG.a(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_15, this, akL.a(l));
        fx.a();
        fx.a(akp);
        duration = l;
        if (l >= 0x100000000L)
        {
            setFlags(1);
        }
    }

    public void setEnabled(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_26, this, akL.a(flag));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_21, this, akL.a(d));
        fx.a();
        fx.a(akp);
        height = d;
    }

    public void setInMovie(boolean flag)
    {
        akp akp = akN.a(ajc$tjp_27, this, akL.a(flag));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_29, this, akL.a(flag));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_28, this, akL.a(flag));
        fx.a();
        fx.a(akp);
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
        akp akp = akN.a(ajc$tjp_16, this, akL.a(i));
        fx.a();
        fx.a(akp);
        layer = i;
    }

    public void setMatrix(fL fl)
    {
        akp akp = akN.a(ajc$tjp_19, this, fl);
        fx.a();
        fx.a(akp);
        matrix = fl;
    }

    public void setModificationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_13, this, date);
        fx.a();
        fx.a(akp);
        modificationTime = date;
        if (fG.a(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setTrackId(long l)
    {
        akp akp = akN.a(ajc$tjp_14, this, akL.a(l));
        fx.a();
        fx.a(akp);
        trackId = l;
    }

    public void setVolume(float f)
    {
        akp akp = akN.a(ajc$tjp_18, this, akL.a(f));
        fx.a();
        fx.a(akp);
        volume = f;
    }

    public void setWidth(double d)
    {
        akp akp = akN.a(ajc$tjp_20, this, akL.a(d));
        fx.a();
        fx.a(akp);
        width = d;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_11, this);
        fx.a();
        fx.a(((akp) (obj)));
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
