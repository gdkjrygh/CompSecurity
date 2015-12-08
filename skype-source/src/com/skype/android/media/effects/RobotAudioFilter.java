// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import com.skype.android.media.AudioFilter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class RobotAudioFilter
    implements AudioFilter
{

    short a[];

    public RobotAudioFilter()
    {
        a = new short[48000];
    }

    public final ByteBuffer a(ByteBuffer bytebuffer, int i, int j)
    {
        ShortBuffer shortbuffer = bytebuffer.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        int l = i / 2;
        int i1 = j / 121;
        int j1 = i1 * 12;
        System.arraycopy(a, l, a, 0, j1);
        shortbuffer.get(a, j1, l);
        shortbuffer.flip();
        for (j = 0; j < l; j++)
        {
            int k = 0;
            for (i = 0; i < 12; i++)
            {
                k += a[(j + j1) - i * i1] * (new int[] {
                    127, 255, 1023, 1535, 2047, 2047, 2047, 2047, 1535, 1023, 
                    255, 127
                })[i];
            }

            k /= 6132;
            i = k;
            if (k > 32767)
            {
                i = 32767;
            }
            k = i;
            if (i < -32767)
            {
                k = -32767;
            }
            shortbuffer.put((short)k);
        }

        return bytebuffer;
    }
}
