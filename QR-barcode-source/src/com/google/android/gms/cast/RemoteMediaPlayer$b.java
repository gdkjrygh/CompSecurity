// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.is;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class l extends l
{

    is Gb;

    public Result c(Status status)
    {
        return l(status);
    }

    public diaChannelResult l(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final Status CW;
            final RemoteMediaPlayer.b Gc;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return CW;
            }

            
            {
                Gc = RemoteMediaPlayer.b.this;
                CW = status;
                super();
            }
        };
    }

    _cls2.CW()
    {
        Gb = new is() {

            final RemoteMediaPlayer.b Gc;

            public void a(long l1, int i, JSONObject jsonobject)
            {
                Gc.b(new RemoteMediaPlayer.c(new Status(i), jsonobject));
            }

            public void n(long l1)
            {
                Gc.b(Gc.l(new Status(2103)));
            }

            
            {
                Gc = RemoteMediaPlayer.b.this;
                super();
            }
        };
    }
}
