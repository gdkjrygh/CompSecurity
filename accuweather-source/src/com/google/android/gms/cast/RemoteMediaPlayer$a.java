// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.gq;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class Bk
    implements gq
{
    private final class a
        implements ResultCallback
    {

        private final long Bl;
        final RemoteMediaPlayer.a Bm;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Bm.AX).a(Bl, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a(long l)
        {
            Bm = RemoteMediaPlayer.a.this;
            super();
            Bl = l;
        }
    }


    final RemoteMediaPlayer AX;
    private GoogleApiClient Bj;
    private long Bk;

    public void a(String s, String s1, long l, String s2)
        throws IOException
    {
        if (Bj == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(Bj, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public void b(GoogleApiClient googleapiclient)
    {
        Bj = googleapiclient;
    }

    public long dW()
    {
        long l = Bk + 1L;
        Bk = l;
        return l;
    }

    public a.Bl(RemoteMediaPlayer remotemediaplayer)
    {
        AX = remotemediaplayer;
        super();
        Bk = 0L;
    }
}
