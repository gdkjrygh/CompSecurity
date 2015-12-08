// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.decoder;

import agt;
import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import aka;
import akb;
import akd;
import ake;
import akj;
import akm;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.util.HashSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class MediaDecoderSource extends ahn
    implements agt, aka
{

    private static final aif INPUT_ROTATION_TYPE;
    private static final aif INPUT_START_TYPE;
    private static final aif INPUT_URI_TYPE = aif.a(android/net/Uri);
    private static final aif OUTPUT_AUDIO_TYPE = aif.a(akd);
    private static final aif OUTPUT_DURATION_TYPE;
    private static final aif OUTPUT_INFO_TYPE = aif.a(akm);
    private static final aif OUTPUT_VIDEO_TYPE = aif.a(301, 16);
    private static final int STATUS_AUDIO_FRAME = 1;
    private static final int STATUS_NO_FRAME = 0;
    private static final int STATUS_VIDEO_FRAME = 2;
    private boolean mDurationAvailable;
    private boolean mHasVideoRotation;
    private final Object mLock = new Object();
    private akj mMediaDecoder;
    private Exception mMediaDecoderException;
    private int mNewAudioFramesAvailable;
    private boolean mNewVideoFrameAvailable;
    private long mStartMicros;
    private int mVideoRotation;

    public MediaDecoderSource(ajr ajr1, String s)
    {
        super(ajr1, s);
        mVideoRotation = 0;
        mStartMicros = 0L;
    }

    private int x()
    {
        int j = 0;
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (mNewAudioFramesAvailable <= 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        j = 1;
        mNewAudioFramesAvailable = mNewAudioFramesAvailable - 1;
        int k = j;
        if (!mNewVideoFrameAvailable)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        k = j;
        if (mNewAudioFramesAvailable != 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        k = j | 2;
        mNewVideoFrameAvailable = false;
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        p();
        obj;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        synchronized (mLock)
        {
            mNewAudioFramesAvailable = mNewAudioFramesAvailable + 1;
        }
        q();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(akb akb, long l1)
    {
        synchronized (mLock)
        {
            mNewVideoFrameAvailable = true;
        }
        q();
        return;
        exception;
        akb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Exception exception)
    {
        synchronized (mLock)
        {
            mMediaDecoderException = exception;
        }
        q();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ajw b()
    {
        return (new ajw()).a("uri", 2, INPUT_URI_TYPE).a("rotation", 1, INPUT_ROTATION_TYPE).a("start", 1, INPUT_START_TYPE).b("video", 1, OUTPUT_VIDEO_TYPE).b("videoInfo", 1, OUTPUT_INFO_TYPE).b("audio", 1, OUTPUT_AUDIO_TYPE).b("duration", 1, OUTPUT_DURATION_TYPE).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("rotation"))
        {
            ajo1.a("mVideoRotation");
            ajo1.g = true;
            mHasVideoRotation = true;
        } else
        if (ajo1.b.equals("start"))
        {
            ajo1.a("mStartMicros");
            ajo1.g = true;
            return;
        }
    }

    protected final void c()
    {
        super.c();
        Uri uri = (Uri)a("uri").a().d().m();
        mMediaDecoder = new akj(super.mContext.a, uri, mStartMicros);
        akj akj1 = mMediaDecoder;
        synchronized (akj1.a)
        {
            akj1.a.add(this);
        }
        mMediaDecoder.a(this);
        obj = mMediaDecoder;
        boolean flag = r();
        if (((akj) (obj)).b.isEmpty())
        {
            obj.i = flag;
            obj = mMediaDecoder;
            ((akj) (obj)).b.offer(Integer.valueOf(0));
            ((akj) (obj)).c.start();
            return;
        } else
        {
            throw new IllegalStateException("Must call setOpenGLEnabled() before calling start()!");
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void e()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (mMediaDecoderException != null)
        {
            throw new RuntimeException(mMediaDecoderException);
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        Object obj4;
        boolean flag;
        synchronized (mLock)
        {
            flag = mDurationAvailable;
            mDurationAvailable = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj1 = b("duration");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj3 = ahs.a(OUTPUT_DURATION_TYPE, new int[] {
            1
        }).d();
        obj4 = mMediaDecoder;
        if (!((akj) (obj4)).h)
        {
            throw new IllegalStateException("MediaDecoder has not been started");
        }
        break MISSING_BLOCK_LABEL_114;
        obj3;
        obj1;
        JVM INSTR monitorexit ;
        throw obj3;
        int j;
        Object obj5 = ((akj) (obj4)).d;
        if (((akj) (obj4)).e != -1)
        {
            j = ((akj) (obj4)).e;
        } else
        {
            j = ((akj) (obj4)).f;
        }
        ((aig) (obj3)).a(Long.valueOf(((MediaExtractor) (obj5)).getTrackFormat(j).getLong("durationUs") * 1000L));
        ((aju) (obj1)).a(((ahs) (obj3)));
        ((aig) (obj3)).i();
        obj1.f = false;
        j = x();
        if ((j & 2) != 0)
        {
            obj4 = b("video");
            obj5 = b("videoInfo");
            Object obj2;
            aig aig1;
            if (obj4 != null)
            {
                obj2 = ahs.a(OUTPUT_VIDEO_TYPE, new int[] {
                    1, 1
                }).h();
            } else
            {
                obj2 = null;
            }
            if (obj5 != null)
            {
                aig1 = ahs.a(OUTPUT_INFO_TYPE, null).d();
            } else
            {
                aig1 = null;
            }
            if (mHasVideoRotation)
            {
                mMediaDecoder.a(((ahv) (obj2)), aig1, mVideoRotation);
            } else
            {
                mMediaDecoder.a(((ahv) (obj2)), aig1, 0x7fffffff);
            }
            if (obj2 != null)
            {
                ((aju) (obj4)).a(((ahs) (obj2)));
                ((ahv) (obj2)).i();
            }
            if (aig1 != null)
            {
                ((aju) (obj5)).a(aig1);
                aig1.i();
            }
        }
        if ((j & 1) != 0)
        {
            obj2 = b("audio");
            if (obj2 != null && ((aju) (obj2)).g.a.mIsActive)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                aig1 = ahs.a(OUTPUT_AUDIO_TYPE, new int[] {
                    1
                }).d();
                mMediaDecoder.a(aig1);
                ((aju) (obj2)).a(aig1);
                aig1.i();
            } else
            {
                obj2 = mMediaDecoder;
                if (((akj) (obj2)).g != null)
                {
                    ((akj) (obj2)).g.a.clear();
                    return;
                }
            }
        }
        return;
    }

    protected final void g()
    {
        if (mMediaDecoder != null)
        {
            mMediaDecoder.a_(true);
            mMediaDecoder = null;
        }
        super.g();
    }

    public final void i()
    {
        o();
        q();
    }

    public final int l()
    {
        return 25;
    }

    public final void o_()
    {
        synchronized (mLock)
        {
            mDurationAvailable = true;
        }
        q();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        INPUT_ROTATION_TYPE = aif.a(Integer.TYPE);
        INPUT_START_TYPE = aif.a(Long.TYPE);
        OUTPUT_DURATION_TYPE = aif.a(Long.TYPE);
    }
}
