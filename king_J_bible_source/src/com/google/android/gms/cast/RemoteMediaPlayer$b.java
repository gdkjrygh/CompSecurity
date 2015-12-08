// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.eu;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class j extends j
{

    eu yW;

    public Result d(Status status)
    {
        return j(status);
    }

    public diaChannelResult j(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final Status wz;
            final RemoteMediaPlayer.b yX;

            public Status getStatus()
            {
                return wz;
            }

            
            {
                yX = RemoteMediaPlayer.b.this;
                wz = status;
                super();
            }
        };
    }

    _cls2.wz()
    {
        yW = new eu() {

            final RemoteMediaPlayer.b yX;

            public void a(long l1, int i, JSONObject jsonobject)
            {
                yX.a(new RemoteMediaPlayer.c(new Status(i), jsonobject));
            }

            public void l(long l1)
            {
                yX.a(yX.j(new Status(4)));
            }

            
            {
                yX = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
