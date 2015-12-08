// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gq;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class l extends l
{

    gq Bq;

    public Result c(Status status)
    {
        return l(status);
    }

    public diaChannelResult l(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final RemoteMediaPlayer.b Br;
            final Status yJ;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                Br = RemoteMediaPlayer.b.this;
                yJ = status;
                super();
            }
        };
    }

    _cls2.yJ()
    {
        Bq = new gq() {

            final RemoteMediaPlayer.b Br;

            public void a(long l1, int i, JSONObject jsonobject)
            {
                Br.b(new RemoteMediaPlayer.c(new Status(i), jsonobject));
            }

            public void n(long l1)
            {
                Br.b(Br.l(new Status(4)));
            }

            
            {
                Br = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
