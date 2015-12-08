// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.iv;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class k extends k
{

    iv GR;

    public Result c(Status status)
    {
        return k(status);
    }

    public diaChannelResult k(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final Status DS;
            final RemoteMediaPlayer.b GS;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return DS;
            }

            
            {
                GS = RemoteMediaPlayer.b.this;
                DS = status;
                super();
            }
        };
    }

    t(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        GR = new iv() {

            final RemoteMediaPlayer.b GS;

            public void a(long l, int i, JSONObject jsonobject)
            {
                GS.b(new RemoteMediaPlayer.c(new Status(i), jsonobject));
            }

            public void n(long l)
            {
                GS.b(GS.k(new Status(2103)));
            }

            
            {
                GS = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
