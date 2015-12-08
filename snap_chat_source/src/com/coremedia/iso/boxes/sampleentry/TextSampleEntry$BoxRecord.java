// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import cv;
import cx;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso.boxes.sampleentry:
//            TextSampleEntry

public static class right
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
            obj = (right)obj;
            if (bottom != ((bottom) (obj)).bottom)
            {
                return false;
            }
            if (left != ((left) (obj)).left)
            {
                return false;
            }
            if (right != ((right) (obj)).right)
            {
                return false;
            }
            if (top != ((top) (obj)).top)
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

    public ()
    {
    }

    public (int i, int j, int k, int l)
    {
        top = i;
        left = j;
        bottom = k;
        right = l;
    }
}
