// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akL;
import akN;
import cv;
import cx;
import ft;
import fx;
import java.nio.ByteBuffer;

public class RecordingYearBox extends ft
{

    public static final String TYPE = "yrrc";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    int recordingYear;

    public RecordingYearBox()
    {
        super("yrrc");
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("RecordingYearBox.java", com/coremedia/iso/boxes/RecordingYearBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        recordingYear = cv.c(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        cx.b(bytebuffer, recordingYear);
    }

    protected long getContentSize()
    {
        return 6L;
    }

    public int getRecordingYear()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return recordingYear;
    }

    public void setRecordingYear(int i)
    {
        akp akp = akN.a(ajc$tjp_1, this, akL.a(i));
        fx.a();
        fx.a(akp);
        recordingYear = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
