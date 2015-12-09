// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class yT
    implements et
{
    private final class a
        implements ResultCallback
    {

        private final long yU;
        final RemoteMediaPlayer.a yV;

        public void i(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(yV.yI).a(yU, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            i((Status)result);
        }

        a(long l)
        {
            yV = RemoteMediaPlayer.a.this;
            super();
            yU = l;
        }
    }


    final RemoteMediaPlayer yI;
    private GoogleApiClient yS;
    private long yT;

    public void a(String s, String s1, long l, String s2)
        throws IOException
    {
        if (yS == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(yS, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public void b(GoogleApiClient googleapiclient)
    {
        yS = googleapiclient;
    }

    public long dD()
    {
        long l = yT + 1L;
        yT = l;
        return l;
    }

    public a.yU(RemoteMediaPlayer remotemediaplayer)
    {
        yI = remotemediaplayer;
        super();
        yT = 0L;
    }
}
