// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gr;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class l extends l
{

    gr Bn;

    public Result c(Status status)
    {
        return l(status);
    }

    public diaChannelResult l(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final RemoteMediaPlayer.b Bo;
            final Status yG;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return yG;
            }

            
            {
                Bo = RemoteMediaPlayer.b.this;
                yG = status;
                super();
            }
        };
    }

    _cls2.yG()
    {
        Bn = new gr() {

            final RemoteMediaPlayer.b Bo;

            public void a(long l1, int i, JSONObject jsonobject)
            {
                Bo.b(new RemoteMediaPlayer.c(new Status(i), jsonobject));
            }

            public void n(long l1)
            {
                Bo.b(Bo.l(new Status(4)));
            }

            
            {
                Bo = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
