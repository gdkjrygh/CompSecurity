// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import java.nio.ByteBuffer;

final class akg
{

    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    final int h;
    final ByteBuffer i;

    public akg(MediaFormat mediaformat)
    {
        boolean flag = false;
        super();
        a = mediaformat.getInteger("color-format");
        b = mediaformat.getInteger("width");
        c = mediaformat.getInteger("height");
        int j;
        if (mediaformat.containsKey("crop-left"))
        {
            j = mediaformat.getInteger("crop-left");
        } else
        {
            j = 0;
        }
        d = j;
        if (mediaformat.containsKey("crop-right"))
        {
            j = mediaformat.getInteger("crop-right");
        } else
        {
            j = b - 1;
        }
        e = j;
        if (mediaformat.containsKey("crop-top"))
        {
            j = mediaformat.getInteger("crop-top");
        } else
        {
            j = 0;
        }
        f = j;
        if (mediaformat.containsKey("crop-bottom"))
        {
            j = mediaformat.getInteger("crop-bottom");
        } else
        {
            j = c - 1;
        }
        g = j;
        j = ((flag) ? 1 : 0);
        if (mediaformat.containsKey("stride"))
        {
            j = mediaformat.getInteger("stride");
        }
        h = j;
        i = ByteBuffer.allocateDirect(b * c << 2);
    }
}
