// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.music;

import android.content.ContentUris;
import b;
import c;
import cix;
import cjs;
import ckk;
import ckq;
import ckx;
import cnx;
import cqa;
import csh;
import java.nio.ByteBuffer;
import nny;
import noa;

public class DefaultLocalMusicDetailExtractor
    implements csh
{

    private cjs a;
    private ckx b;

    public DefaultLocalMusicDetailExtractor(cjs cjs1, ckx ckx1)
    {
        a = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        b = (ckx)b.a(ckx1, "audioDecoderPool", null);
    }

    private native float[] calculateBeatsInSec(ByteBuffer bytebuffer, int i, int j, int k);

    public final cnx a(cqa cqa1)
    {
        ByteBuffer bytebuffer1;
        android.net.Uri uri;
        int i1;
        int j1;
        long l2;
label0:
        {
            uri = ContentUris.withAppendedId(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cqa1.f);
            ckk ckk1 = new ckk(a, nny.a(uri, noa.c), 0);
            ckk1.c();
            ckq ckq1 = b.a(ckk1);
            if (ckq1 == null)
            {
                return null;
            }
            ByteBuffer bytebuffer = null;
            int i = 0;
            int k = 0;
            long l1 = 0L;
            cix cix1;
            do
            {
                j1 = k;
                i1 = i;
                bytebuffer1 = bytebuffer;
                l2 = l1;
                if (!ckk1.e())
                {
                    break label0;
                }
                cix1 = (cix)ckq1.c();
                j1 = k;
                i1 = i;
                bytebuffer1 = bytebuffer;
                if (cix1 != null)
                {
                    c.a(cix1.c, "sample.bytesPerSample", 2, null);
                    if (bytebuffer == null)
                    {
                        k = cix1.d;
                        i = cix1.e;
                        bytebuffer = ByteBuffer.allocateDirect(i * 90 * k << 1);
                    } else
                    {
                        c.a(cix1.d, "sample.sampleRate", k, null);
                        c.a(cix1.e, "sample.channelCount", i, null);
                    }
                    l1 = cix1.a;
                    if ((bytebuffer.position() + cix1.h) - cix1.g >= bytebuffer.limit())
                    {
                        break;
                    }
                    bytebuffer.put(cix1.f);
                    ckq1.a(cix1);
                    bytebuffer1 = bytebuffer;
                    i1 = i;
                    j1 = k;
                }
                k = j1;
                i = i1;
                bytebuffer = bytebuffer1;
            } while (true);
            ckq1.a(cix1);
            l2 = l1;
            bytebuffer1 = bytebuffer;
            i1 = i;
            j1 = k;
        }
        int l = bytebuffer1.position();
        float af[] = calculateBeatsInSec(bytebuffer1, l, j1, i1);
        long al[] = new long[af.length];
        for (int j = 0; j < af.length; j++)
        {
            al[j] = (long)(af[j] * 1000000F);
        }

        return new cnx(cqa1, al, l2, 0L, l, uri, 4);
    }

    static 
    {
        com/google/android/apps/moviemaker/music/DefaultLocalMusicDetailExtractor.getSimpleName();
        System.loadLibrary("moviemaker-jni");
    }
}
