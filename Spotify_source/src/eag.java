// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import java.util.HashSet;
import java.util.Set;

public final class eag
{

    public final Set a = new HashSet();
    public final Object b = new Object();
    public final Context c;
    public VideoPlayerMetadata d;
    public eai e;

    public eag(Context context, eai eai)
    {
        c = context;
        e = eai;
    }

    public final void a(eah eah)
    {
        synchronized (b)
        {
            a.add(eah);
        }
        return;
        eah;
        obj;
        JVM INSTR monitorexit ;
        throw eah;
    }

    public final void a(boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = "com.spotify.music.service.video.action.player.PAUSE";
        } else
        {
            obj = "com.spotify.music.service.video.action.player.PLAY";
        }
        obj = flb.a(c, ((String) (obj)));
        c.startService(((android.content.Intent) (obj)));
    }

    public final void b(eah eah)
    {
        synchronized (b)
        {
            a.remove(eah);
        }
        return;
        eah;
        obj;
        JVM INSTR monitorexit ;
        throw eah;
    }
}
