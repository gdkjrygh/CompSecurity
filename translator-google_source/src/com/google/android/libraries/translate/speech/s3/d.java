// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;

import android.media.AudioRecord;
import com.google.android.apps.gsa.speech.audio.f;

final class d extends f
{

    private final int i;
    private final int j;

    public d(int k, int l, boolean flag)
    {
        super(k, l, 16, flag, null, false, 0, true);
        i = k;
        j = l;
    }

    protected final AudioRecord d()
    {
        int k = Math.max(AudioRecord.getMinBufferSize(i, 16, 2), j);
        AudioRecord audiorecord1 = new AudioRecord(0, i, 16, 2, k);
        AudioRecord audiorecord = audiorecord1;
        if (audiorecord1.getState() != 1)
        {
            audiorecord1.release();
            audiorecord = null;
        }
        return audiorecord;
    }
}
