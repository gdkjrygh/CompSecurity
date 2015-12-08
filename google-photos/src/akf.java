// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.SparseIntArray;
import androidx.media.filterfw.ColorSpace;
import androidx.media.filterfw.PixelUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public final class akf extends akn
{

    private final int d;
    private final int e;
    private long f;
    private boolean g;
    private ByteBuffer h;
    private akg i;
    private ByteBuffer j;

    protected akf(int k, MediaFormat mediaformat, akl akl)
    {
        super(k, mediaformat, akl);
        d = mediaformat.getInteger("width");
        e = mediaformat.getInteger("height");
    }

    private static MediaCodec a(MediaFormat mediaformat, int ai[])
    {
        TreeMap treemap = new TreeMap();
        ai = a(ai);
        for (int k = 0; k < MediaCodecList.getCodecCount(); k++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(k);
            if (mediacodecinfo.isEncoder())
            {
                continue;
            }
            String s = mediaformat.getString("mime");
            if (!(new HashSet(Arrays.asList(mediacodecinfo.getSupportedTypes()))).contains(s))
            {
                continue;
            }
            int ai1[] = mediacodecinfo.getCapabilitiesForType(s).colorFormats;
            int i1 = ai1.length;
            for (int l = 0; l < i1; l++)
            {
                int j1 = ai1[l];
                if (ai.indexOfKey(j1) >= 0)
                {
                    treemap.put(Integer.valueOf(ai.get(j1)), mediacodecinfo.getName());
                }
            }

        }

        if (treemap.isEmpty())
        {
            return null;
        }
        mediaformat = (String)treemap.firstEntry().getValue();
        try
        {
            mediaformat = MediaCodec.createByCodecName(mediaformat);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            return null;
        }
        return mediaformat;
    }

    private static SparseIntArray a(int ai[])
    {
        SparseIntArray sparseintarray = new SparseIntArray();
        for (int k = 0; k < ai.length; k++)
        {
            sparseintarray.append(ai[k], k);
        }

        return sparseintarray;
    }

    public final long a()
    {
        return f * 1000L;
    }

    protected final MediaCodec a(MediaFormat mediaformat)
    {
        MediaCodec mediacodec = a(mediaformat, new int[] {
            16, 19
        });
        if (mediacodec == null)
        {
            mediaformat = String.valueOf(mediaformat);
            throw new RuntimeException((new StringBuilder(String.valueOf(mediaformat).length() + 47)).append("Could not find a suitable decoder for format: ").append(mediaformat).append("!").toString());
        } else
        {
            mediacodec.configure(mediaformat, null, null, 0);
            return mediacodec;
        }
    }

    protected final void a(ahv ahv1, aig aig1, int k, int l)
    {
        ByteBuffer bytebuffer;
        int k1 = d;
        int i1 = e;
        if (a(l))
        {
            k1 = e;
            i1 = d;
        }
        int ai[] = b.a(k1, i1, k);
        Object obj;
        boolean flag;
        if (ai[0] != k1 || ai[1] != i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = aif.a(301, 8);
        if (flag)
        {
            obj = ahs.a(((aif) (obj)), new int[] {
                k1, i1
            }).h();
        } else
        {
            obj = ahv1;
        }
        ahv1.a(ai);
        bytebuffer = ((ahv) (obj)).a(2);
        j.rewind();
        if (l != 0) goto _L2; else goto _L1
_L1:
        bytebuffer.put(j);
_L9:
        ((ahv) (obj)).k();
        if (flag)
        {
            ahv1.a(Bitmap.createScaledBitmap(((ahv) (obj)).q(), ai[0], ai[1], false));
            ((ahv) (obj)).i();
        }
        ahv1.a(a());
        if (aig1 != null)
        {
            aig1.a(new akm(g));
            aig1.a(a());
        }
        return;
_L2:
        ByteBuffer bytebuffer1 = j;
        l;
        JVM INSTR lookupswitch 4: default 272
    //                   0: 308
    //                   90: 367
    //                   180: 386
    //                   270: 342;
           goto _L3 _L4 _L5 _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_386;
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        throw new IllegalArgumentException((new StringBuilder(33)).append("Unsupported rotation ").append(l).append("!").toString());
_L4:
        int j1;
        k = 0;
        l = 1;
        j1 = d;
_L10:
        PixelUtils.a(bytebuffer1, bytebuffer, d, e, k, l, j1);
        if (true) goto _L9; else goto _L8
_L8:
        k = (d - 1) * e;
        l = -e;
        j1 = 1;
          goto _L10
_L5:
        k = e - 1;
        l = e;
        j1 = -1;
          goto _L10
        k = d * e - 1;
        l = -1;
        j1 = -d;
          goto _L10
    }

    protected final boolean a(MediaCodec mediacodec, ByteBuffer abytebuffer[], int k, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag)
    {
        ByteBuffer bytebuffer;
        f = bufferinfo.presentationTimeUs;
        g = flag;
        h = abytebuffer[k];
        if (j == null)
        {
            j = ByteBuffer.allocateDirect(d * e << 2);
        }
        if (i == null)
        {
            i = new akg(super.b.getOutputFormat());
        }
        j.rewind();
        abytebuffer = i;
        bufferinfo = h;
        bytebuffer = j;
        ((akg) (abytebuffer)).a;
        JVM INSTR tableswitch 16 19: default 132
    //                   16 172
    //                   17 132
    //                   18 132
    //                   19 269;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        k = ((akg) (abytebuffer)).a;
        throw new RuntimeException((new StringBuilder(38)).append("Unsupported color format: ").append(k).append("!").toString());
_L2:
        int l;
        if (((akg) (abytebuffer)).h != 0)
        {
            l = ((akg) (abytebuffer)).h;
        } else
        {
            l = ((akg) (abytebuffer)).b << 2;
        }
        ColorSpace.b(bufferinfo, ((akg) (abytebuffer)).i, ((akg) (abytebuffer)).b, ((akg) (abytebuffer)).c, l);
_L5:
        ColorSpace.a(((akg) (abytebuffer)).i, bytebuffer, ((akg) (abytebuffer)).b, ((akg) (abytebuffer)).c, ((akg) (abytebuffer)).d, ((akg) (abytebuffer)).f, ((akg) (abytebuffer)).e, ((akg) (abytebuffer)).g);
        i();
        f();
        h();
        mediacodec.releaseOutputBuffer(k, false);
        return false;
_L3:
        int i1;
        if (((akg) (abytebuffer)).h != 0)
        {
            i1 = ((akg) (abytebuffer)).h;
        } else
        {
            i1 = ((akg) (abytebuffer)).b;
        }
        ColorSpace.a(bufferinfo, ((akg) (abytebuffer)).i, ((akg) (abytebuffer)).b, ((akg) (abytebuffer)).c, i1);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
