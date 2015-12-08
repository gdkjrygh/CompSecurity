// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import akN;
import cv;
import cx;
import fr;
import fx;
import java.nio.ByteBuffer;

public class TrackReferenceTypeBox extends fr
{

    public static final String TYPE1 = "hint";
    public static final String TYPE2 = "cdsc";
    private static final akp.a ajc$tjp_0;
    private static final akp.a ajc$tjp_1;
    private long trackIds[];

    public TrackReferenceTypeBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        akN akn = new akN("TrackReferenceTypeBox.java", com/coremedia/iso/boxes/TrackReferenceTypeBox);
        ajc$tjp_0 = akn.a("method-execution", akn.a("1", "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        ajc$tjp_1 = akn.a("method-execution", akn.a("1", "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int j = bytebuffer.remaining() / 4;
        trackIds = new long[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            trackIds[i] = cv.a(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        long al[] = trackIds;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            cx.b(bytebuffer, al[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(trackIds.length << 2);
    }

    public long[] getTrackIds()
    {
        akp akp = akN.a(ajc$tjp_0, this);
        fx.a();
        fx.a(akp);
        return trackIds;
    }

    public String toString()
    {
        Object obj = akN.a(ajc$tjp_1, this);
        fx.a();
        fx.a(((akp) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackReferenceTypeBox[type=").append(getType());
        int i = 0;
        do
        {
            if (i >= trackIds.length)
            {
                ((StringBuilder) (obj)).append("]");
                return ((StringBuilder) (obj)).toString();
            }
            ((StringBuilder) (obj)).append(";trackId");
            ((StringBuilder) (obj)).append(i);
            ((StringBuilder) (obj)).append("=");
            ((StringBuilder) (obj)).append(trackIds[i]);
            i++;
        } while (true);
    }

    static 
    {
        ajc$preClinit();
    }
}
