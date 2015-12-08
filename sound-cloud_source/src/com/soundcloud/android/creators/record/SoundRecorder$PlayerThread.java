// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.creators.record.filter.FadeFilter;
import com.soundcloud.android.playback.IAudioManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, AudioConfig, ScAudioTrack, PlaybackStream, 
//            TrimPreview

private class previewQueue extends Thread
{

    private final Queue previewQueue;
    final SoundRecorder this$0;

    private void onWriteError(int i)
    {
        String s = SoundRecorder.TAG;
        StringBuilder stringbuilder = new StringBuilder("AudioTrack#write() returned ");
        if (i == -3)
        {
            s = "ERROR_INVALID_OPERATION";
        } else
        if (i == -2)
        {
            s = "ERROR_BAD_VALUE";
        } else
        {
            s = (new StringBuilder("error ")).append(i).toString();
        }
        stringbuilder.append(s);
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
    }

    private void playLoop(PlaybackStream playbackstream)
        throws IOException
    {
        SoundRecorder.access$800(SoundRecorder.this).setPlaybackRate(SoundRecorder.access$1200(SoundRecorder.this).sampleRate);
        playbackstream.initializePlayback();
        SoundRecorder.access$002(SoundRecorder.this, );
        SoundRecorder.access$700(SoundRecorder.this, "com.soundcloud.android.playbackstarted");
        for (; !isInterrupted() && SoundRecorder.access$000(SoundRecorder.this) == ; SoundRecorder.access$1300(SoundRecorder.this).clear())
        {
            int i = playbackstream.readForPlayback(SoundRecorder.access$1300(SoundRecorder.this), SoundRecorder.access$1400(SoundRecorder.this));
            if (i < 0)
            {
                break;
            }
            i = SoundRecorder.access$800(SoundRecorder.this).write(SoundRecorder.access$1300(SoundRecorder.this), i);
            if (i < 0)
            {
                onWriteError(i);
            }
        }

    }

    private void playTrimPreviews(PlaybackStream playbackstream)
        throws IOException
    {
        do
        {
            TrimPreview trimpreview = (TrimPreview)previewQueue.poll();
            if (trimpreview != null)
            {
                FadeFilter fadefilter = trimpreview.getFadeFilter();
                int l = (int)trimpreview.getByteRange(SoundRecorder.access$1200(SoundRecorder.this));
                playbackstream.initializePlayback(trimpreview.lowPos(SoundRecorder.access$1200(SoundRecorder.this)));
                byte abyte0[] = new byte[l];
                int i = 0;
                do
                {
                    if (i >= l)
                    {
                        break;
                    }
                    int i1 = playbackstream.read(SoundRecorder.access$1300(SoundRecorder.this), Math.min(SoundRecorder.access$1400(SoundRecorder.this), l - i));
                    if (i1 <= 0)
                    {
                        break;
                    }
                    int k1 = Math.min(i1, l - i);
                    fadefilter.apply(SoundRecorder.access$1300(SoundRecorder.this), i, l);
                    SoundRecorder.access$1300(SoundRecorder.this).get(abyte0, i, k1);
                    SoundRecorder.access$1300(SoundRecorder.this).clear();
                    i += i1;
                } while (true);
                SoundRecorder.access$800(SoundRecorder.this).setPlaybackRate(trimpreview.playbackRate);
                if (trimpreview.isReverse())
                {
                    for (int j = l / SoundRecorder.access$1200(SoundRecorder.this).sampleSize - 1; j >= 0; j--)
                    {
                        l = SoundRecorder.access$800(SoundRecorder.this).write(abyte0, SoundRecorder.access$1200(SoundRecorder.this).sampleSize * j, SoundRecorder.access$1200(SoundRecorder.this).sampleSize);
                        if (l < 0)
                        {
                            onWriteError(l);
                        }
                    }

                } else
                {
                    for (int k = 0; k < l / SoundRecorder.access$1200(SoundRecorder.this).sampleSize; k++)
                    {
                        int j1 = SoundRecorder.access$800(SoundRecorder.this).write(abyte0, SoundRecorder.access$1200(SoundRecorder.this).sampleSize * k, SoundRecorder.access$1200(SoundRecorder.this).sampleSize);
                        if (j1 < 0)
                        {
                            onWriteError(j1);
                        }
                    }

                }
                SoundRecorder.access$1300(SoundRecorder.this).clear();
            } else
            {
                return;
            }
        } while (true);
    }

    public void addPreview(TrimPreview trimpreview)
    {
        previewQueue.add(trimpreview);
        trimpreview = previewQueue.iterator();
        long l = 0L;
        long l1;
        do
        {
            l1 = l;
            if (!trimpreview.hasNext())
            {
                break;
            }
            l = ((TrimPreview)trimpreview.next()).duration + l;
        } while (true);
        for (; l1 > TrimPreview.MAX_PREVIEW_DURATION && previewQueue.size() > 1; l1 -= ((TrimPreview)previewQueue.poll()).duration) { }
    }

    public void run()
    {
label0:
        {
            synchronized (SoundRecorder.access$500(SoundRecorder.this))
            {
                if (SoundRecorder.access$600(SoundRecorder.this).requestMusicFocus(SoundRecorder.this, 1))
                {
                    break label0;
                }
                String s = SoundRecorder.TAG;
                SoundRecorder.access$700(SoundRecorder.this, "com.soundcloud.android.playbackerror");
            }
            return;
        }
        SoundRecorder.access$800(SoundRecorder.this).play();
_L5:
        com.soundcloud.android.creators.record.SoundRecorder.State[SoundRecorder.access$000(SoundRecorder.this).()];
        JVM INSTR tableswitch 1 2: default 476
    //                   1 318
    //                   2 375;
           goto _L1 _L2 _L3
_L1:
        if (SoundRecorder.access$900(SoundRecorder.this) != null)
        {
            playLoop(SoundRecorder.access$900(SoundRecorder.this));
        }
_L12:
        if (!isInterrupted() && SoundRecorder.access$000(SoundRecorder.this) ==  || SoundRecorder.access$000(SoundRecorder.this) == G && !previewQueue.isEmpty()) goto _L5; else goto _L4
_L4:
        if (SoundRecorder.access$000(SoundRecorder.this) == G)
        {
            SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        }
        SoundRecorder.access$800(SoundRecorder.this).stop();
        SoundRecorder.access$600(SoundRecorder.this).abandonMusicFocus(false);
_L13:
        if (this != SoundRecorder.access$1100(SoundRecorder.this) || SoundRecorder.access$900(SoundRecorder.this) == null) goto _L7; else goto _L6
_L6:
        if (SoundRecorder.access$000(SoundRecorder.this) == this._fld0) goto _L9; else goto _L8
_L8:
        if (SoundRecorder.access$000(SoundRecorder.this) !=  || !SoundRecorder.access$900(SoundRecorder.this).isFinished()) goto _L11; else goto _L10
_L10:
        SoundRecorder.access$900(SoundRecorder.this).resetPlayback();
        SoundRecorder.access$700(SoundRecorder.this, "com.soundcloud.android.playbackcomplete");
_L15:
        if (SoundRecorder.access$000(SoundRecorder.this) != NG)
        {
            SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        }
_L9:
        audiorecord;
        JVM INSTR monitorexit ;
        return;
        exception;
        audiorecord;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        playTrimPreviews(SoundRecorder.access$900(SoundRecorder.this));
          goto _L12
        Object obj;
        obj;
        String s1 = SoundRecorder.TAG;
        SoundRecorder.access$002(SoundRecorder.this, this._fld0);
        SoundRecorder.access$800(SoundRecorder.this).stop();
        SoundRecorder.access$600(SoundRecorder.this).abandonMusicFocus(false);
          goto _L13
_L3:
        if (SoundRecorder.access$900(SoundRecorder.this) == null) goto _L12; else goto _L14
_L14:
        SoundRecorder.access$900(SoundRecorder.this).setCurrentPosition(SoundRecorder.access$1000(SoundRecorder.this));
        SoundRecorder.access$1002(SoundRecorder.this, -1L);
          goto _L1
        s1;
        SoundRecorder.access$800(SoundRecorder.this).stop();
        SoundRecorder.access$600(SoundRecorder.this).abandonMusicFocus(false);
        throw s1;
_L11:
        if (SoundRecorder.access$000(SoundRecorder.this) == G)
        {
            SoundRecorder.access$700(SoundRecorder.this, "com.soundcloud.android.playbackstopped");
        }
          goto _L15
_L7:
        String s2 = SoundRecorder.TAG;
          goto _L9
    }

    ()
    {
        this$0 = SoundRecorder.this;
        super("PlayerThread");
        previewQueue = new ConcurrentLinkedQueue();
        setPriority(10);
    }

    setPriority(TrimPreview trimpreview)
    {
        this();
        previewQueue.add(trimpreview);
    }
}
