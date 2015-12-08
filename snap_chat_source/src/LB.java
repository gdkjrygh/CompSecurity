// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.debug.ReleaseManager;

public final class LB
{

    private final Lu mCrashSampler;
    private final ReleaseManager mReleaseManager;

    public LB()
    {
        this(ReleaseManager.a(), Lu.a());
    }

    private LB(ReleaseManager releasemanager, Lu lu)
    {
        mReleaseManager = releasemanager;
        mCrashSampler = lu;
    }

    protected static void c(Throwable throwable)
    {
        afK.a(throwable, new LK());
        d(throwable);
    }

    private static void d(Throwable throwable)
    {
        for (Throwable throwable1 = throwable.getCause(); throwable1 != null; throwable1 = throwable1.getCause())
        {
            cB.a(throwable1.toString());
        }

        cB.a(throwable);
    }

    public final void a(Throwable throwable)
    {
        if (mCrashSampler.b())
        {
            d(throwable);
        }
    }

    public final void b(Throwable throwable)
    {
        if (mReleaseManager.b())
        {
            throw new RuntimeException(throwable);
        }
        if (mCrashSampler.b())
        {
            c(throwable);
        }
    }
}
