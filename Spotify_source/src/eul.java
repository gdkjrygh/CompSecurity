// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentCurrentlyPlayingContext;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentsStart;
import java.util.List;

public final class eul
{

    public static final gip a = gip.b("moments_start_moment_context_positions");
    public static final gip b = gip.b("moments_start_currently_playing_moment_context");
    public static final gip c = gip.b("moments_start_current_moment_position");
    static gip d = gip.b("moments_start_moments_start");
    public final String e;
    final gin f;
    public eum g;
    public final JsonCallbackReceiver h = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/momentsstart/model/MomentsStart) {

        private eul a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            if (eul.a(a) != null)
            {
                eul.a(a).a(throwable, errorcause);
            }
        }

        protected final void onResolved(Response response, Object obj)
        {
            MomentsStart momentsstart;
            eul eul1;
            obj = (MomentsStart)obj;
            eul1 = a;
            momentsstart = (MomentsStart)euh.a(eul1.f, eul.d, com/spotify/mobile/android/spotlets/momentsstart/model/MomentsStart, null);
            if (momentsstart != null && momentsstart.equals(obj)) goto _L2; else goto _L1
_L1:
            eul1.f.b().a(eul.c).a(eul.a).a(eul.b).b();
            response = new int[((MomentsStart) (obj)).moments.size()];
            euh.a(eul1.f, eul.d, obj);
_L4:
            if (eul1.g != null)
            {
                eul1.g.a(((MomentsStart) (obj)), response);
            }
            return;
_L2:
            int ai[] = (int[])euh.a(eul1.f, eul.a, [I, new int[momentsstart.moments.size()]);
            MomentContext momentcontext = (MomentContext)euh.a(eul1.f, eul.b, com/spotify/mobile/android/spotlets/momentsstart/model/MomentCurrentlyPlayingContext, null);
            obj = momentsstart;
            response = ai;
            if (momentcontext != null)
            {
                ((Moment)momentsstart.moments.get(momentsstart.suggestedMomentItem)).contexts.add(0, momentcontext);
                obj = momentsstart;
                response = ai;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                a = eul.this;
                super(handler, class1);
            }
    };

    public eul(String s, gin gin1)
    {
        e = (String)ctz.a(s);
        f = (gin)ctz.a(gin1);
    }

    static eum a(eul eul1)
    {
        return eul1.g;
    }

}
