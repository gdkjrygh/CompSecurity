// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.common;

import android.graphics.Bitmap;
import ar.com.hjg.pngj.chunks.ac;
import ar.com.hjg.pngj.chunks.ag;
import ar.com.hjg.pngj.chunks.u;
import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.o;
import ar.com.hjg.pngj.p;
import ar.com.hjg.pngj.s;
import java.io.Closeable;
import java.io.InputStream;

public class BitmapDecoder
    implements Closeable
{

    private int palette[];
    private s reader;

    public BitmapDecoder(InputStream inputstream)
    {
        reset(inputstream);
    }

    private static void lineToARGB(p p1, int ai[], int ai1[], int i)
    {
        int l = p1.a.a;
        if (ai != null)
        {
            p1 = p1.a();
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = ai[p1[j]];
            }

        } else
        {
            for (int k = 0; k < l; k++)
            {
                ai1[i + k] = o.a(p1, k);
            }

        }
    }

    public void close()
    {
        if (reader != null)
        {
            reader.c();
        }
    }

    public void decodeFrame(int ai[], Bitmap bitmap)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        int j = 0;
        for (int i = 0; j < l; i += k)
        {
            lineToARGB((p)reader.b(), palette, ai, i);
            j++;
        }

        bitmap.setPixels(ai, 0, k, 0, 0, k, l);
    }

    public int getHeight()
    {
        return reader.a.b;
    }

    public int getWidth()
    {
        return reader.a.a;
    }

    public void reset(InputStream inputstream)
    {
        close();
        reader = new s(inputstream);
        reader.d();
        u u1 = reader.a().a();
        inputstream = reader.a().b();
        if (u1 != null && palette == null)
        {
            int i;
            int j;
            int k;
            if (inputstream == null)
            {
                inputstream = null;
                i = 0;
            } else
            {
                inputstream = inputstream.b();
                i = inputstream.length;
            }
            k = u1.b();
            palette = new int[k];
            j = 0xff000000;
            while (k > 0) 
            {
                k--;
                int l = u1.b(k);
                if (k < i)
                {
                    j = inputstream[k] << 24;
                }
                palette[k] = j | l;
            }
        }
    }
}
