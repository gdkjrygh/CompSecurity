// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Map;
import java.util.Set;

final class ecn
    implements Runnable
{

    ForceInCollection a;
    Player b;
    private ecm c;

    private ecn(ecm ecm1)
    {
        c = ecm1;
        super();
        a = ForceInCollection.b;
    }

    ecn(ecm ecm1, byte byte0)
    {
        this(ecm1);
    }

    public final void run()
    {
        Object obj1 = c;
        Object obj2 = b.getLastPlayerState();
        ForceInCollection forceincollection = a;
        Object obj;
        if (obj2 == null || ((PlayerState) (obj2)).track() == null)
        {
            obj = fnv.a;
        } else
        {
            String s = (String)((PlayerState) (obj2)).track().metadata().get("title");
            if (TextUtils.isEmpty(s))
            {
                obj = fnv.a;
            } else
            {
                boolean flag3 = ((PlayerState) (obj2)).isPaused();
                boolean flag4 = ((PlayerState) (obj2)).restrictions().disallowSkippingPrevReasons().isEmpty();
                String s1;
                String s2;
                boolean flag;
                boolean flag1;
                boolean flag2;
                boolean flag5;
                boolean flag6;
                if (((PlayerState) (obj2)).restrictions().disallowSkippingNextReasons().isEmpty() && !ecm.a(((PlayerState) (obj2))))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag5 = gpl.f(((PlayerState) (obj2)).entityUri());
                if ((new SpotifyLink(((PlayerState) (obj2)).track().uri())).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag6 = ecm.a(((PlayerState) (obj2)));
                s1 = ((PlayerState) (obj2)).track().uri();
                if (flag1)
                {
                    obj = null;
                } else
                {
                    obj = (String)((PlayerState) (obj2)).track().metadata().get("album_title");
                }
                s2 = (String)((PlayerState) (obj2)).track().metadata().get("artist_name");
                obj2 = dto.a((String)((PlayerState) (obj2)).track().metadata().get("image_url"));
                obj1 = ((ecm) (obj1)).a;
                if (forceincollection == ForceInCollection.a)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                obj = fnu.a(new ecp(s1, s, ((String) (obj)), s2, ((android.net.Uri) (obj2)), flag3, flag5, flag1, flag4, flag, ((com.spotify.music.spotlets.radio.model.ThumbState) (obj1)), flag6, flag2, false));
            }
        }
        c.e.obtainMessage(10, obj).sendToTarget();
    }
}
