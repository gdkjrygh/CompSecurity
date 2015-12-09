// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.games.util:
//            VideoUtils

public final class VideoHandler extends Handler
{

    public final String mName;

    public VideoHandler(Looper looper, android.os.Handler.Callback callback, String s)
    {
        super(looper, callback);
        mName = s;
    }

    public VideoHandler(Looper looper, String s)
    {
        super(looper);
        mName = s;
    }

    public final boolean post(String s, String s1, Runnable runnable)
    {
        VideoUtils.logChatty(s, String.format("Posting runnable to %s with description '%s'", new Object[] {
            mName, s1
        }));
        return post(runnable);
    }

    public final boolean postDelayed(String s, String s1, Runnable runnable, long l)
    {
        VideoUtils.logChatty(s, String.format("Posting runnable delayed by %d ms to %s with description '%s'", new Object[] {
            Long.valueOf(l), mName, s1
        }));
        return postDelayed(runnable, l);
    }
}
