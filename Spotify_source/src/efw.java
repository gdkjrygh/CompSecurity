// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class efw
    implements eal, ean
{

    public final eaj a;
    private final MediaSession b;
    private ecb c;
    private boolean d;
    private String e;
    private Boolean f;

    public efw(MediaSession mediasession, MediaService mediaservice)
    {
        Assertion.a(mediasession);
        Assertion.a(mediaservice);
        b = mediasession;
        c = new ecb(mediaservice);
        a = new eaj(mediaservice, new eam(), new ebc());
        a.c = this;
    }

    private Uri a(Uri uri)
    {
        return c.a(uri);
    }

    private static void a(List list, android.media.session.PlaybackState.Builder builder)
    {
        list = list.iterator();
        long l = 0L;
        while (list.hasNext()) 
        {
            MediaAction mediaaction = (MediaAction)list.next();
            if (mediaaction == MediaAction.a)
            {
                l = 4L | l;
            } else
            if (mediaaction == MediaAction.b)
            {
                l = 2L | l;
            } else
            if (mediaaction == MediaAction.c)
            {
                l = 32L | l;
            } else
            if (mediaaction == MediaAction.d)
            {
                l = 16L | l;
            } else
            {
                builder.addCustomAction((new android.media.session.PlaybackState.CustomAction.Builder(mediaaction.name(), mediaaction.name(), mediaaction.mIconRes)).build());
            }
        }
        builder.setActions(l);
    }

    private void b(NowPlayingData nowplayingdata, List list)
    {
        byte byte0;
        boolean flag = false;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.values().length];
                try
                {
                    a[com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        Object obj1;
        String s;
        String s1;
        android.media.MediaMetadata.Builder builder;
        long l;
        if (nowplayingdata.c)
        {
            obj = (new StringBuilder()).append(nowplayingdata.a).append(" ").append(nowplayingdata.b).toString();
        } else
        {
            obj = nowplayingdata.d;
        }
        obj1 = nowplayingdata.e;
        s = nowplayingdata.f;
        s1 = String.valueOf(a(Uri.parse(nowplayingdata.g)));
        l = nowplayingdata.h;
        builder = new android.media.MediaMetadata.Builder();
        builder.putString("android.media.metadata.ALBUM", s).putString("android.media.metadata.ARTIST", ((String) (obj1))).putLong("android.media.metadata.DURATION", l).putString("android.media.metadata.TITLE", ((String) (obj))).putString("android.media.metadata.ALBUM_ART_URI", s1);
        b.setMetadata(builder.build());
        obj = new android.media.session.PlaybackState.Builder();
        obj1 = nowplayingdata.j;
        byte0 = flag;
        _cls1.a[((com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 3: default 188
    //                   1 309
    //                   2 315
    //                   3 192;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_315;
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        byte0 = flag;
_L5:
        if (nowplayingdata.k)
        {
            byte0 = 6;
        }
        if (d)
        {
            byte0 = 8;
        }
        if (!TextUtils.isEmpty(e))
        {
            byte0 = 7;
            ((android.media.session.PlaybackState.Builder) (obj)).setErrorMessage(e);
        }
        float f1;
        if (com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.a.equals(obj1))
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        ((android.media.session.PlaybackState.Builder) (obj)).setState(byte0, nowplayingdata.i, f1, SystemClock.elapsedRealtime());
        if (nowplayingdata.l)
        {
            ((android.media.session.PlaybackState.Builder) (obj)).setActiveQueueItemId(0L);
        }
        a(list, ((android.media.session.PlaybackState.Builder) (obj)));
        b.setPlaybackState(((android.media.session.PlaybackState.Builder) (obj)).build());
        return;
_L2:
        byte0 = 3;
          goto _L5
        byte0 = 2;
          goto _L5
    }

    public final void a()
    {
        d = true;
        e = null;
        b(a.d, a.e);
    }

    public final void a(NowPlayingData nowplayingdata, List list)
    {
        if (!nowplayingdata.j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c) && !nowplayingdata.j.equals(com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.b))
        {
            if (d)
            {
                d = false;
            }
            if (e != null)
            {
                e = null;
            }
        }
        if (!nowplayingdata.l)
        {
            if (!Boolean.valueOf(nowplayingdata.l).equals(f))
            {
                b.setQueue(Collections.emptyList());
            }
        } else
        {
            MediaSession mediasession = b;
            PlayerTrack aplayertrack[] = nowplayingdata.m;
            ArrayList arraylist = new ArrayList(aplayertrack.length);
            int i = 0;
            while (i < aplayertrack.length && i < 15) 
            {
                PlayerTrack playertrack = aplayertrack[i];
                long l = i;
                android.media.MediaDescription.Builder builder = new android.media.MediaDescription.Builder();
                ecb ecb1 = c;
                String s;
                if (playertrack.metadata().containsKey("image_small_url"))
                {
                    s = (String)playertrack.metadata().get("image_small_url");
                } else
                if (playertrack.metadata().containsKey("image_url"))
                {
                    s = (String)playertrack.metadata().get("image_url");
                } else
                {
                    s = "";
                }
                builder.setIconUri(ecb1.a(a(dto.a(s)))).setTitle((CharSequence)playertrack.metadata().get("title")).setSubtitle((CharSequence)playertrack.metadata().get("artist_name")).setMediaId(playertrack.uri());
                arraylist.add(new android.media.session.MediaSession.QueueItem(builder.build(), l));
                i++;
            }
            mediasession.setQueue(arraylist);
            b.setQueueTitle(nowplayingdata.n);
        }
        f = Boolean.valueOf(nowplayingdata.l);
        b(nowplayingdata, list);
    }

    public final void a(String s)
    {
        e = s;
        b(a.d, a.e);
    }
}
