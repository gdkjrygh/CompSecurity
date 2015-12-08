// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import cv;
import cx;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            TextSampleEntry

public static class textColor
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
            obj = (textColor)obj;
            if (endChar != ((endChar) (obj)).endChar)
            {
                return false;
            }
            if (faceStyleFlags != ((faceStyleFlags) (obj)).faceStyleFlags)
            {
                return false;
            }
            if (fontId != ((fontId) (obj)).fontId)
            {
                return false;
            }
            if (fontSize != ((fontSize) (obj)).fontSize)
            {
                return false;
            }
            if (startChar != ((startChar) (obj)).startChar)
            {
                return false;
            }
            if (!Arrays.equals(textColor, ((textColor) (obj)).textColor))
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

    public ()
    {
    }

    public (int i, int j, int k, int l, int i1, int ai[])
    {
        startChar = i;
        endChar = j;
        fontId = k;
        faceStyleFlags = l;
        fontSize = i1;
        textColor = ai;
    }
}
