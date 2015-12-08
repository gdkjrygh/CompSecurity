// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import cs;
import cv;
import cx;
import fv;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            AbstractSampleEntry

public class TextSampleEntry extends AbstractSampleEntry
{
    public static class BoxRecord
    {

        int bottom;
        int left;
        int right;
        int top;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (BoxRecord)obj;
                if (bottom != ((BoxRecord) (obj)).bottom)
                {
                    return false;
                }
                if (left != ((BoxRecord) (obj)).left)
                {
                    return false;
                }
                if (right != ((BoxRecord) (obj)).right)
                {
                    return false;
                }
                if (top != ((BoxRecord) (obj)).top)
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            cx.b(bytebuffer, top);
            cx.b(bytebuffer, left);
            cx.b(bytebuffer, bottom);
            cx.b(bytebuffer, right);
        }

        public int getSize()
        {
            return 8;
        }

        public int hashCode()
        {
            return ((top * 31 + left) * 31 + bottom) * 31 + right;
        }

        public void parse(ByteBuffer bytebuffer)
        {
            top = cv.c(bytebuffer);
            left = cv.c(bytebuffer);
            bottom = cv.c(bytebuffer);
            right = cv.c(bytebuffer);
        }

        public BoxRecord()
        {
        }

        public BoxRecord(int i, int j, int k, int l)
        {
            top = i;
            left = j;
            bottom = k;
            right = l;
        }
    }

    public static class StyleRecord
    {

        int endChar;
        int faceStyleFlags;
        int fontId;
        int fontSize;
        int startChar;
        int textColor[] = {
            255, 255, 255, 255
        };

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (StyleRecord)obj;
                if (endChar != ((StyleRecord) (obj)).endChar)
                {
                    return false;
                }
                if (faceStyleFlags != ((StyleRecord) (obj)).faceStyleFlags)
                {
                    return false;
                }
                if (fontId != ((StyleRecord) (obj)).fontId)
                {
                    return false;
                }
                if (fontSize != ((StyleRecord) (obj)).fontSize)
                {
                    return false;
                }
                if (startChar != ((StyleRecord) (obj)).startChar)
                {
                    return false;
                }
                if (!Arrays.equals(textColor, ((StyleRecord) (obj)).textColor))
                {
                    return false;
                }
            }
            return true;
        }

        public void getContent(ByteBuffer bytebuffer)
        {
            cx.b(bytebuffer, startChar);
            cx.b(bytebuffer, endChar);
            cx.b(bytebuffer, fontId);
            cx.c(bytebuffer, faceStyleFlags);
            cx.c(bytebuffer, fontSize);
            cx.c(bytebuffer, textColor[0]);
            cx.c(bytebuffer, textColor[1]);
            cx.c(bytebuffer, textColor[2]);
            cx.c(bytebuffer, textColor[3]);
        }

        public int getSize()
        {
            return 12;
        }

        public int hashCode()
        {
            int j = startChar;
            int k = endChar;
            int l = fontId;
            int i1 = faceStyleFlags;
            int j1 = fontSize;
            int i;
            if (textColor != null)
            {
                i = Arrays.hashCode(textColor);
            } else
            {
                i = 0;
            }
            return i + ((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
        }

        public void parse(ByteBuffer bytebuffer)
        {
            startChar = cv.c(bytebuffer);
            endChar = cv.c(bytebuffer);
            fontId = cv.c(bytebuffer);
            faceStyleFlags = cv.d(bytebuffer);
            fontSize = cv.d(bytebuffer);
            textColor = new int[4];
            textColor[0] = cv.d(bytebuffer);
            textColor[1] = cv.d(bytebuffer);
            textColor[2] = cv.d(bytebuffer);
            textColor[3] = cv.d(bytebuffer);
        }

        public StyleRecord()
        {
        }

        public StyleRecord(int i, int j, int k, int l, int i1, int ai[])
        {
            startChar = i;
            endChar = j;
            fontId = k;
            faceStyleFlags = l;
            fontSize = i1;
            textColor = ai;
        }
    }


    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int backgroundColorRgba[];
    private BoxRecord boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private StyleRecord styleRecord;
    private int verticalJustification;

    public TextSampleEntry()
    {
        super("tx3g");
        backgroundColorRgba = new int[4];
        boxRecord = new BoxRecord();
        styleRecord = new StyleRecord();
    }

    public TextSampleEntry(String s)
    {
        super(s);
        backgroundColorRgba = new int[4];
        boxRecord = new BoxRecord();
        styleRecord = new StyleRecord();
    }

    public int[] getBackgroundColorRgba()
    {
        return backgroundColorRgba;
    }

    public void getBox(WritableByteChannel writablebytechannel)
    {
        writablebytechannel.write(getHeader());
        ByteBuffer bytebuffer = ByteBuffer.allocate(38);
        bytebuffer.position(6);
        cx.b(bytebuffer, dataReferenceIndex);
        cx.b(bytebuffer, displayFlags);
        cx.c(bytebuffer, horizontalJustification);
        cx.c(bytebuffer, verticalJustification);
        cx.c(bytebuffer, backgroundColorRgba[0]);
        cx.c(bytebuffer, backgroundColorRgba[1]);
        cx.c(bytebuffer, backgroundColorRgba[2]);
        cx.c(bytebuffer, backgroundColorRgba[3]);
        boxRecord.getContent(bytebuffer);
        styleRecord.getContent(bytebuffer);
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        writeContainer(writablebytechannel);
    }

    public BoxRecord getBoxRecord()
    {
        return boxRecord;
    }

    public int getHorizontalJustification()
    {
        return horizontalJustification;
    }

    public long getSize()
    {
        long l = getContainerSize();
        int i;
        if (largeBox || l + 38L >= 0x100000000L)
        {
            i = 16;
        } else
        {
            i = 8;
        }
        return (long)i + (l + 38L);
    }

    public StyleRecord getStyleRecord()
    {
        return styleRecord;
    }

    public int getVerticalJustification()
    {
        return verticalJustification;
    }

    public boolean isContinuousKaraoke()
    {
        return (displayFlags & 2048L) == 2048L;
    }

    public boolean isFillTextRegion()
    {
        return (displayFlags & 0x40000L) == 0x40000L;
    }

    public boolean isScrollDirection()
    {
        return (displayFlags & 384L) == 384L;
    }

    public boolean isScrollIn()
    {
        return (displayFlags & 32L) == 32L;
    }

    public boolean isScrollOut()
    {
        return (displayFlags & 64L) == 64L;
    }

    public boolean isWriteTextVertically()
    {
        return (displayFlags & 0x20000L) == 0x20000L;
    }

    public void parse(fv fv1, ByteBuffer bytebuffer, long l, cs cs)
    {
        bytebuffer = ByteBuffer.allocate(38);
        fv1.read(bytebuffer);
        bytebuffer.position(6);
        dataReferenceIndex = cv.c(bytebuffer);
        displayFlags = cv.a(bytebuffer);
        horizontalJustification = cv.d(bytebuffer);
        verticalJustification = cv.d(bytebuffer);
        backgroundColorRgba = new int[4];
        backgroundColorRgba[0] = cv.d(bytebuffer);
        backgroundColorRgba[1] = cv.d(bytebuffer);
        backgroundColorRgba[2] = cv.d(bytebuffer);
        backgroundColorRgba[3] = cv.d(bytebuffer);
        boxRecord = new BoxRecord();
        boxRecord.parse(bytebuffer);
        styleRecord = new StyleRecord();
        styleRecord.parse(bytebuffer);
        initContainer(fv1, l - 38L, cs);
    }

    public void setBackgroundColorRgba(int ai[])
    {
        backgroundColorRgba = ai;
    }

    public void setBoxRecord(BoxRecord boxrecord)
    {
        boxRecord = boxrecord;
    }

    public void setContinuousKaraoke(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 2048L;
            return;
        } else
        {
            displayFlags = displayFlags & -2049L;
            return;
        }
    }

    public void setFillTextRegion(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 0x40000L;
            return;
        } else
        {
            displayFlags = displayFlags & 0xfffffffffffbffffL;
            return;
        }
    }

    public void setHorizontalJustification(int i)
    {
        horizontalJustification = i;
    }

    public void setScrollDirection(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 384L;
            return;
        } else
        {
            displayFlags = displayFlags & -385L;
            return;
        }
    }

    public void setScrollIn(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 32L;
            return;
        } else
        {
            displayFlags = displayFlags & -33L;
            return;
        }
    }

    public void setScrollOut(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 64L;
            return;
        } else
        {
            displayFlags = displayFlags & -65L;
            return;
        }
    }

    public void setStyleRecord(StyleRecord stylerecord)
    {
        styleRecord = stylerecord;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setVerticalJustification(int i)
    {
        verticalJustification = i;
    }

    public void setWriteTextVertically(boolean flag)
    {
        if (flag)
        {
            displayFlags = displayFlags | 0x20000L;
            return;
        } else
        {
            displayFlags = displayFlags & 0xfffffffffffdffffL;
            return;
        }
    }

    public String toString()
    {
        return "TextSampleEntry";
    }
}
