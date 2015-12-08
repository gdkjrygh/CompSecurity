// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public final class ebc
{

    public ebc()
    {
    }

    public static NowPlayingData a(Context context, Optional optional, Optional optional1, Optional optional2)
    {
        String s;
        Object obj;
        Object obj1;
        String s1;
        Object obj2;
        String s2;
        String s3;
        Object obj3;
        boolean flag;
        boolean flag1;
        boolean flag2;
label0:
        {
            flag2 = false;
            obj3 = new PlayerTrack[0];
            if (!optional.b())
            {
                break label0;
            }
            optional = (SessionState)optional.c();
            int j;
            boolean flag3;
            if (((SessionState) (optional)).f)
            {
                optional = context.getString(0x7f08032f);
                s = "";
                flag = true;
                flag1 = true;
            } else
            {
                if (!((SessionState) (optional)).e)
                {
                    break label0;
                }
                if (!((SessionState) (optional)).j && !a(optional1))
                {
                    if (((SessionState) (optional)).k)
                    {
                        optional = context.getString(0x7f080339);
                    } else
                    {
                        optional = context.getString(0x7f08033a);
                    }
                    s = "";
                    flag = false;
                    flag1 = true;
                } else
                {
                    flag = false;
                    optional = "";
                    flag1 = false;
                    s = "";
                }
            }
        }
_L1:
        if (a(optional1))
        {
            obj2 = ((PlayerState)optional1.c()).track().metadata();
            s1 = (String)((Map) (obj2)).get("title");
            flag3 = Boolean.parseBoolean((String)((Map) (obj2)).get("is_advertisement"));
            if (flag3)
            {
                obj = (String)((Map) (obj2)).get("advertiser");
            } else
            {
                obj = (String)((Map) (obj2)).get("artist_name");
            }
            if (flag3)
            {
                obj1 = "";
            } else
            {
                obj1 = (String)((Map) (obj2)).get("album_title");
            }
            s3 = String.valueOf(dto.a((String)((Map) (obj2)).get("image_large_url")));
            s2 = ((String) (obj1));
            obj2 = obj;
        } else
        {
            s1 = "";
            obj2 = "";
            s2 = "";
            s3 = String.valueOf(Uri.EMPTY);
        }
        if (optional1.b())
        {
            PlayerState playerstate = (PlayerState)optional1.c();
            long l = playerstate.currentPlaybackPosition();
            obj = playerstate.track();
            obj1 = playerstate.future();
            j = obj1.length;
            int i;
            long l1;
            boolean flag4;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            obj3 = new ArrayList(i + j);
            if (obj != null)
            {
                ((ArrayList) (obj3)).add(obj);
            }
            ((ArrayList) (obj3)).addAll(Arrays.asList(((Object []) (obj1))));
            j = obj1.length;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            obj3 = (PlayerTrack[])((ArrayList) (obj3)).toArray(new PlayerTrack[i + j]);
            if (playerstate.isPaused())
            {
                obj = com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.b;
            } else
            if (playerstate.isPlaying())
            {
                obj = com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.a;
            } else
            {
                obj = com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c;
            }
            flag2 = flag;
            obj1 = optional;
            flag4 = flag1;
            if (optional2.b())
            {
                flag2 = flag;
                obj1 = optional;
                flag4 = flag1;
                if (((gpg)optional2.c()).c())
                {
                    obj1 = context.getString(0x7f0803f6);
                    flag4 = true;
                    flag2 = true;
                }
            }
            l1 = ((PlayerState)optional1.c()).duration();
            if (!playerstate.restrictions().disallowPeekingNextReasons().isEmpty())
            {
                flag = false;
            } else
            {
                flag = true;
            }
            optional = ((Optional) (obj3));
            optional1 = optional;
            flag1 = flag;
            flag = flag2;
            optional = ((Optional) (obj));
        } else
        {
            optional1 = com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c;
            l = 0L;
            l1 = 0L;
            obj1 = optional;
            flag4 = flag1;
            optional = optional1;
            flag1 = flag2;
            optional1 = ((Optional) (obj3));
        }
        return new NowPlayingData(((String) (obj1)), s, flag4, s1, ((String) (obj2)), s2, s3, l1, l, optional, flag, flag1, optional1, context.getString(0x7f080402));
        optional = context.getString(0x7f08009d);
        s = context.getString(0x7f08009e);
        flag = false;
        flag1 = true;
          goto _L1
    }

    private static boolean a(Optional optional)
    {
        return optional.b() && ((PlayerState)optional.c()).track() != null;
    }
}
