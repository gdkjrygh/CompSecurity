// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.model.VideoPlayerAdvanceReason;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import com.spotify.mobile.android.video.model.VideoPlayerError;
import com.spotify.mobile.android.video.model.VideoPlayerState;
import java.util.HashMap;

public final class gkn
    implements gkf
{

    private final hkg f = hkg.e();
    private RxResolver g;
    private hfg h;

    public gkn(RxResolver rxresolver)
    {
        g = rxresolver;
        rxresolver = f;
        hfw hfw = new hfw() {

            private gkn a;

            public final Object call(Object obj)
            {
                obj = (Request)obj;
                return gkn.a(a).resolve(((Request) (obj)));
            }

            
            {
                a = gkn.this;
                super();
            }
        };
        if (rxresolver.getClass() == hic)
        {
            rxresolver = ((hic)rxresolver).d(hfw);
        } else
        {
            rxresolver = hew.a(rxresolver.c(hfw));
        }
        rxresolver = rxresolver.a(new hgz(new hfw() {

            public final Object call(Object obj)
            {
                Logger.b((Throwable)obj, "Error trying to send request to ContextPlayer", new Object[0]);
                return null;
            }

        }));
        h = hew.a(new hew._cls2(), rxresolver);
    }

    static RxResolver a(gkn gkn1)
    {
        return gkn1.g;
    }

    private Boolean a(String s, JacksonModel jacksonmodel)
    {
        try
        {
            s = new Request("POST", s, new HashMap(), JacksonSerializer.toBytes(jacksonmodel));
            f.onNext(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b("Could not parse request", new Object[0]);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public final hew a()
    {
        Request request = new Request("SUB", "sp://videoplayer/v1/commands");
        return g.resolve(request).a(JacksonResponseParser.forClass(com/spotify/mobile/android/video/model/VideoPlayerCommand));
    }

    public final Boolean a(VideoPlayerAdvanceReason videoplayeradvancereason)
    {
        return a("sp://videoplayer/v1/advance", ((JacksonModel) (videoplayeradvancereason)));
    }

    public final Boolean a(VideoPlayerError videoplayererror)
    {
        return a("sp://videoplayer/v1/error", ((JacksonModel) (videoplayererror)));
    }

    public final Boolean a(VideoPlayerState videoplayerstate)
    {
        return a("sp://videoplayer/v1/state", ((JacksonModel) (videoplayerstate)));
    }

    public final void b()
    {
        h.unsubscribe();
    }
}
