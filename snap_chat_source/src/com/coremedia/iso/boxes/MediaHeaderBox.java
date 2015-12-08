// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import fG;
import ft;
import fx;
import java.nio.ByteBuffer;
import java.util.Date;

public class MediaHeaderBox extends ft
{

    public static final String TYPE = "mdhd";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private static final akp.a ajc$tjp_10;
    private static final akp.a ajc$tjp_2;
    private static final akp.a ajc$tjp_3;
    private static final akp.a ajc$tjp_4;
    private static final akp.a ajc$tjp_5;
    private static final akp.a ajc$tjp_6;
    private static final akp.a ajc$tjp_7;
    private static final akp.a ajc$tjp_8;
    private static final akp.a ajc$tjp_9;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    public MediaHeaderBox()
    {
        super("mdhd");
        creationTime = new Date();
        modificationTime = new Date();
        language = "eng";
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("MediaHeaderBox.java", com/coremedia/iso/boxes/MediaHeaderBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        ajc$tjp_10 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        ajc$tjp_2 = akn.a("method-execution", akn.a("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_3 = akn.a("method-execution", akn.a("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        ajc$tjp_4 = akn.a("method-execution", akn.a("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = akn.a("method-execution", akn.a("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        ajc$tjp_6 = akn.a("method-execution", akn.a("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        ajc$tjp_7 = akn.a("method-execution", akn.a("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        ajc$tjp_8 = akn.a("method-execution", akn.a("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        ajc$tjp_9 = akn.a("method-execution", akn.a("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
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
        language = cv.j(bytebuffer);
        cv.c(bytebuffer);
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
        cx.a(bytebuffer, language);
        cx.b(bytebuffer, 0);
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
        return l + 2L + 2L;
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

    public String getLanguage()
    {
        akp akp = akN.a(ajc$tjp_4, this);
        fx.a();
        fx.a(akp);
        return language;
    }

    public Date getModificationTime()
    {
        akp akp = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(akp);
        return modificationTime;
    }

    public long getTimescale()
    {
        akp akp = akN.a(ajc$tjp_2, this);
        fx.a();
        fx.a(akp);
        return timescale;
    }

    public void setCreationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_5, this, date);
        fx.a();
        fx.a(akp);
        creationTime = date;
    }

    public void setDuration(long l)
    {
        akp akp = akN.a(ajc$tjp_8, this, akL.a(l));
        fx.a();
        fx.a(akp);
        duration = l;
    }

    public void setLanguage(String s)
    {
        akp akp = akN.a(ajc$tjp_9, this, s);
        fx.a();
        fx.a(akp);
        language = s;
    }

    public void setModificationTime(Date date)
    {
        akp akp = akN.a(ajc$tjp_6, this, date);
        fx.a();
        fx.a(akp);
        modificationTime = date;
    }

    public void setTimescale(long l)
    {
        akp akp = akN.a(ajc$tjp_7, this, akL.a(l));
        fx.a();
        fx.a(akp);
        timescale = l;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_10, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("MediaHeaderBox[");
        ((StringBuilder) (obj)).append("creationTime=").append(getCreationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("modificationTime=").append(getModificationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("timescale=").append(getTimescale());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("duration=").append(getDuration());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("language=").append(getLanguage());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
