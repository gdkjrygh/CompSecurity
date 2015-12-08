// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.iu;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class GO
    implements iu
{
    private final class a
        implements ResultCallback
    {

        private final long GP;
        final RemoteMediaPlayer.a GQ;

        public void j(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.e(GQ.GA).b(GP, status.getStatusCode());
            }
        }

        public void onResult(Result result)
        {
            j((Status)result);
        }

        a(long l)
        {
            GQ = RemoteMediaPlayer.a.this;
            super();
            GP = l;
        }
    }


    final RemoteMediaPlayer GA;
    private GoogleApiClient GN;
    private long GO;

    public void a(String s, String s1, long l, String s2)
        throws IOException
    {
        if (GN == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.sage(GN, s, s1).setResultCallback(new a(l));
            return;
        }
    }

    public void b(GoogleApiClient googleapiclient)
    {
        GN = googleapiclient;
    }

    public long fS()
    {
        long l = GO + 1L;
        GO = l;
        return l;
    }

    public a.GP(RemoteMediaPlayer remotemediaplayer)
    {
        GA = remotemediaplayer;
        super();
        GO = 0L;
    }
}
