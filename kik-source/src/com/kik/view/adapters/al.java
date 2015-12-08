// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.kik.g.r;
import java.io.File;
import kik.android.VideoContentProvider;
import kik.android.util.bx;
import kik.android.v;

// Referenced classes of package com.kik.view.adapters:
//            ak, am, an, ao

final class al extends r
{

    final android.media.MediaPlayer.OnErrorListener a;
    final Surface b;
    final android.media.MediaPlayer.OnPreparedListener c;
    final android.media.MediaPlayer.OnCompletionListener d;
    final ak e;

    al(ak ak1, android.media.MediaPlayer.OnErrorListener onerrorlistener, Surface surface, android.media.MediaPlayer.OnPreparedListener onpreparedlistener, android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        e = ak1;
        a = onerrorlistener;
        b = surface;
        c = onpreparedlistener;
        d = oncompletionlistener;
        super();
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        if (ak.a(e))
        {
            obj = VideoContentProvider.a(((File) (obj)));
            Object obj1 = new MediaMetadataRetriever();
            ((MediaMetadataRetriever) (obj1)).setDataSource(ak.b(e).getContext(), ((android.net.Uri) (obj)));
            String s = ((MediaMetadataRetriever) (obj1)).extractMetadata(19);
            obj1 = ((MediaMetadataRetriever) (obj1)).extractMetadata(18);
            int i = Integer.parseInt(s);
            int j = Integer.parseInt(((String) (obj1)));
            ak.a(e, j, i);
            ak.a(e, new MediaPlayer());
            ak.c(e).setDataSource(ak.b(e).getContext(), ((android.net.Uri) (obj)));
            ak.c(e).setSurface(b);
            ak.c(e).setLooping(ak.d(e));
            ak.c(e).setOnPreparedListener(new am(this));
            ak.c(e).setOnCompletionListener(new an(this));
            ak.c(e).setOnErrorListener(new ao(this));
            ak.c(e).prepare();
        }
_L1:
        return;
        obj;
        bx.a(((Throwable) (obj)));
        if (a != null)
        {
            a.onError(ak.c(e), 0, 0);
            return;
        }
          goto _L1
    }

    public final void b(Throwable throwable)
    {
        if (a == null)
        {
            return;
        }
        if (throwable instanceof v)
        {
            a.onError(null, 401, 0);
            return;
        } else
        {
            a.onError(null, 400, 0);
            return;
        }
    }
}
