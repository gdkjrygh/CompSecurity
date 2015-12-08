// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            MediaPlayerBridge

protected static class mCanSeekBackward
{

    private final boolean mCanPause;
    private final boolean mCanSeekBackward;
    private final boolean mCanSeekForward;

    private boolean canPause()
    {
        return mCanPause;
    }

    private boolean canSeekBackward()
    {
        return mCanSeekBackward;
    }

    private boolean canSeekForward()
    {
        return mCanSeekForward;
    }

    public (boolean flag, boolean flag1, boolean flag2)
    {
        mCanPause = flag;
        mCanSeekForward = flag1;
        mCanSeekBackward = flag2;
    }
}
