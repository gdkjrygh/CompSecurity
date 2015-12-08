// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import cv;
import cx;
import fF;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes:
//            EditListBox

public static class editListBox
{

    EditListBox editListBox;
    private double mediaRate;
    private long mediaTime;
    private long segmentDuration;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (editListBox)obj;
            if (mediaTime != ((mediaTime) (obj)).mediaTime)
            {
                return false;
            }
            if (segmentDuration != ((segmentDuration) (obj)).segmentDuration)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        if (editListBox.getVersion() == 1)
        {
            cx.a(bytebuffer, segmentDuration);
            bytebuffer.putLong(mediaTime);
        } else
        {
            cx.b(bytebuffer, fF.a(segmentDuration));
            bytebuffer.putInt(fF.a(mediaTime));
        }
        cx.a(bytebuffer, mediaRate);
    }

    public double getMediaRate()
    {
        return mediaRate;
    }

    public long getMediaTime()
    {
        return mediaTime;
    }

    public long getSegmentDuration()
    {
        return segmentDuration;
    }

    public int hashCode()
    {
        return (int)(segmentDuration ^ segmentDuration >>> 32) * 31 + (int)(mediaTime ^ mediaTime >>> 32);
    }

    public void setMediaRate(double d)
    {
        mediaRate = d;
    }

    public void setMediaTime(long l)
    {
        mediaTime = l;
    }

    public void setSegmentDuration(long l)
    {
        segmentDuration = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{segmentDuration=")).append(segmentDuration).append(", mediaTime=").append(mediaTime).append(", mediaRate=").append(mediaRate).append('}').toString();
    }

    public (EditListBox editlistbox, long l, long l1, double d)
    {
        segmentDuration = l;
        mediaTime = l1;
        mediaRate = d;
        editListBox = editlistbox;
    }

    public editListBox(EditListBox editlistbox, ByteBuffer bytebuffer)
    {
        if (editlistbox.getVersion() == 1)
        {
            segmentDuration = cv.f(bytebuffer);
            mediaTime = bytebuffer.getLong();
            mediaRate = cv.g(bytebuffer);
        } else
        {
            segmentDuration = cv.a(bytebuffer);
            mediaTime = bytebuffer.getInt();
            mediaRate = cv.g(bytebuffer);
        }
        editListBox = editlistbox;
    }
}
