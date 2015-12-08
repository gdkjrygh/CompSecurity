// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.ir;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class FY
    implements ir
{
    private final class a
        implements ResultCallback
    {

        private final long FZ;
        final RemoteMediaPlayer.a Ga;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Ga.FK).b(FZ, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a(long l)
        {
            Ga = RemoteMediaPlayer.a.this;
            super();
            FZ = l;
        }
    }


    final RemoteMediaPlayer FK;
    private GoogleApiClient FX;
    private long FY;

    public void a(String s, String s1, long l, String s2)
        throws IOException
    {
        if (FX == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(FX, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public void b(GoogleApiClient googleapiclient)
    {
        FX = googleapiclient;
    }

    public long fx()
    {
        long l = FY + 1L;
        FY = l;
        return l;
    }

    public a.FZ(RemoteMediaPlayer remotemediaplayer)
    {
        FK = remotemediaplayer;
        super();
        FY = 0L;
    }
}
