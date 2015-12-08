// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class a extends zzb
{

    zzo h;

    public diaChannelResult a(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final Status a;
            final RemoteMediaPlayer.b b;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return a;
            }

            
            {
                b = RemoteMediaPlayer.b.this;
                a = status;
                super();
            }
        };
    }

    public Result createFailedResult(Status status)
    {
        return a(status);
    }

    t(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        h = new zzo() {

            final RemoteMediaPlayer.b a;

            public void zza(long l, int i, Object obj)
            {
                if (obj instanceof JSONObject)
                {
                    obj = (JSONObject)obj;
                } else
                {
                    obj = null;
                }
                a.setResult(new RemoteMediaPlayer.c(new Status(i), ((JSONObject) (obj))));
            }

            public void zzw(long l)
            {
                a.setResult(a.a(new Status(2103)));
            }

            
            {
                a = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
