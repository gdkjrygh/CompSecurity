// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gp;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class Bn
    implements gp
{
    private final class a
        implements ResultCallback
    {

        private final long Bo;
        final RemoteMediaPlayer.a Bp;

        public void k(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(Bp.Ba).a(Bo, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            k((Status)result);
        }

        a(long l)
        {
            Bp = RemoteMediaPlayer.a.this;
            super();
            Bo = l;
        }
    }


    final RemoteMediaPlayer Ba;
    private GoogleApiClient Bm;
    private long Bn;

    public void a(String s, String s1, long l, String s2)
        throws IOException
    {
        if (Bm == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(Bm, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public void b(GoogleApiClient googleapiclient)
    {
        Bm = googleapiclient;
    }

    public long eb()
    {
        long l = Bn + 1L;
        Bn = l;
        return l;
    }

    public a.Bo(RemoteMediaPlayer remotemediaplayer)
    {
        Ba = remotemediaplayer;
        super();
        Bn = 0L;
    }
}
