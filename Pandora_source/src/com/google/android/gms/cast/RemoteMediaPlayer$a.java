// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class c
    implements zzn
{
    private final class a
        implements ResultCallback
    {

        final RemoteMediaPlayer.a a;
        private final long b;

        public void a(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.zze(a.a).zzb(b, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            a((Status)result);
        }

        a(long l)
        {
            a = RemoteMediaPlayer.a.this;
            super();
            b = l;
        }
    }


    final RemoteMediaPlayer a;
    private GoogleApiClient b;
    private long c;

    public void a(GoogleApiClient googleapiclient)
    {
        b = googleapiclient;
    }

    public void zza(String s, String s1, long l, String s2)
        throws IOException
    {
        if (b == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(b, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public long zzjU()
    {
        long l = c + 1L;
        c = l;
        return l;
    }

    public a.b(RemoteMediaPlayer remotemediaplayer)
    {
        a = remotemediaplayer;
        super();
        c = 0L;
    }
}
