// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.spotlets.video.VideoPlayerEvent;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class flj
    implements Closeable
{

    public final Context a;
    public ServiceConnection b;
    private List c;
    private final Object d = new Object();
    private eag e;

    public flj(Context context)
    {
        c = new ArrayList();
        b = new ServiceConnection() {

            private flj a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                componentname = (dvt)ibinder;
                if (componentname != null)
                {
                    flj.a(a, SpotifyService.g(((dvt) (componentname)).a));
                }
                componentname = ((ComponentName) (flj.a(a)));
                componentname;
                JVM INSTR monitorenter ;
                flk flk1;
                for (ibinder = flj.b(a).iterator(); ibinder.hasNext(); flj.a(a, flk1.a, flk1.b))
                {
                    flk1 = (flk)ibinder.next();
                }

                break MISSING_BLOCK_LABEL_89;
                ibinder;
                componentname;
                JVM INSTR monitorexit ;
                throw ibinder;
                flj.b(a).clear();
                componentname;
                JVM INSTR monitorexit ;
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                flj.a(a, null);
            }

            
            {
                a = flj.this;
                super();
            }
        };
        a = context;
    }

    static eag a(flj flj1, eag eag1)
    {
        flj1.e = eag1;
        return eag1;
    }

    static Object a(flj flj1)
    {
        return flj1.d;
    }

    static void a(flj flj1, VideoPlayerEvent videoplayerevent, VideoPlayerMetadata videoplayermetadata)
    {
        flj1.b(videoplayerevent, videoplayermetadata);
    }

    static List b(flj flj1)
    {
        return flj1.c;
    }

    private void b(VideoPlayerEvent videoplayerevent, VideoPlayerMetadata videoplayermetadata)
    {
        Object obj;
        obj = e;
        obj.d = videoplayermetadata;
        if (videoplayerevent != VideoPlayerEvent.a) goto _L2; else goto _L1
_L1:
        ((eag) (obj)).e.I_();
_L4:
        videoplayerevent = ((VideoPlayerEvent) (((eag) (obj)).b));
        videoplayerevent;
        JVM INSTR monitorenter ;
        for (obj = ((eag) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((eah)((Iterator) (obj)).next()).a(videoplayermetadata)) { }
        break; /* Loop/switch isn't completed */
        videoplayermetadata;
        videoplayerevent;
        JVM INSTR monitorexit ;
        throw videoplayermetadata;
_L2:
        if (videoplayerevent == VideoPlayerEvent.c)
        {
            ((eag) (obj)).e.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
        videoplayerevent;
        JVM INSTR monitorexit ;
    }

    public final void a(VideoPlayerEvent videoplayerevent, VideoPlayerMetadata videoplayermetadata)
    {
        if (e != null)
        {
            b(videoplayerevent, videoplayermetadata);
            return;
        }
        synchronized (d)
        {
            c.add(new flk(videoplayerevent, videoplayermetadata, (byte)0));
        }
        return;
        videoplayerevent;
        obj;
        JVM INSTR monitorexit ;
        throw videoplayerevent;
    }

    public void close()
    {
        dvk.a(a, b, flj.getSimpleName());
    }
}
