// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.video;

import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import aka;
import akb;
import java.util.concurrent.atomic.AtomicBoolean;

public class VideoProviderSource extends ahn
    implements aka
{

    private static final long NS_IN_S = 0x3b9aca00L;
    private static final int STATE_END_OF_STREAM = 2;
    private static final int STATE_RUNNING = 0;
    private static final int STATE_STOPPING = 1;
    private boolean mCloseOnStop;
    private long mFrameDuration;
    private float mFrameRate;
    private AtomicBoolean mHasNewFrame;
    private int mMaxDim;
    private long mNextExpectedTimestampNs;
    private final aif mOutputType = aif.a(301, 16);
    private boolean mPushEOSFrame;
    private volatile int mState;
    private akb mVideoFrameProvider;

    public VideoProviderSource(ajr ajr, String s)
    {
        super(ajr, s);
        mHasNewFrame = new AtomicBoolean(false);
        mCloseOnStop = true;
        mPushEOSFrame = false;
        mMaxDim = 0x7fffffff;
        mFrameRate = 3.402823E+38F;
        mState = 0;
        mFrameDuration = 0L;
        mNextExpectedTimestampNs = 0L;
    }

    public final void a(akb akb1, long l)
    {
        boolean flag;
        if (mFrameDuration == 0L)
        {
            flag = true;
        } else
        if (l >= mNextExpectedTimestampNs)
        {
            long l1;
            for (; mNextExpectedTimestampNs < l; mNextExpectedTimestampNs = l1 * ((l - 1L) / l1 + 1L))
            {
                l1 = mFrameDuration;
            }

            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            akb1.a();
            return;
        } else
        {
            mHasNewFrame.set(true);
            q();
            return;
        }
    }

    public final void a(Exception exception)
    {
        throw new RuntimeException("VideoProvider encountered error!", exception);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(akb);
        aif aif2 = aif.a(Boolean.TYPE);
        aif aif3 = aif.a(Integer.TYPE);
        aif aif4 = aif.a(Float.TYPE);
        return (new ajw()).a("provider", 2, aif1).a("closeOnStop", 1, aif2).a("pushEOSFrame", 1, aif2).a("maxDimension", 1, aif3).a("frameRate", 1, aif4).b("video", 2, mOutputType).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("provider"))
        {
            ajo1.a("mVideoFrameProvider");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("closeOnStop"))
            {
                ajo1.a("mCloseOnStop");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("pushEOSFrame"))
            {
                ajo1.a("mPushEOSFrame");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("maxDimension"))
            {
                ajo1.a("mMaxDim");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("frameRate"))
            {
                ajo1.a("mFrameRate");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void d()
    {
        mHasNewFrame.set(false);
        mVideoFrameProvider.a(this);
        long l;
        if (mFrameRate == 3.402823E+38F)
        {
            l = 0L;
        } else
        {
            l = (long)(1E+09F / mFrameRate);
        }
        mFrameDuration = l;
    }

    protected final void e()
    {
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = 1;
        ai[1] = 1;
        aju aju1 = b("video");
        switch (mState)
        {
        default:
            int j = mState;
            throw new IllegalStateException((new StringBuilder(26)).append("Illegal state: ").append(j).toString());

        case 0: // '\0'
            boolean flag = mHasNewFrame.compareAndSet(true, false);
            if (!flag)
            {
                p();
            }
            if (flag)
            {
                ai = aju1.a(ai).h();
                if (mVideoFrameProvider.a(ai, null, mMaxDim))
                {
                    aju1.a(ai);
                }
            }
            return;

        case 2: // '\002'
            ahv ahv1 = aju1.a(ai).h();
            ahv1.a(-2L);
            aju1.a(ahv1);
            mState = 1;
            return;

        case 1: // '\001'
            o();
            return;
        }
    }

    protected final void f()
    {
        mVideoFrameProvider.b(this);
    }

    public final void i()
    {
        if (mCloseOnStop)
        {
            int j;
            if (mPushEOSFrame)
            {
                j = 2;
            } else
            {
                j = 1;
            }
            mState = j;
            q();
        }
    }

    public final void o_()
    {
    }
}
