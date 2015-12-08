// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.search.WebApiSearch;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class efv extends android.media.session.MediaSession.Callback
{

    private final MediaService a;
    private final efx b;
    private boolean c;
    private final List d = new LinkedList();

    public efv(MediaService mediaservice, efx efx1)
    {
        a = mediaservice;
        b = efx1;
    }

    static MediaService a(efv efv1)
    {
        return efv1.a;
    }

    private void a(Runnable runnable)
    {
        if (c)
        {
            runnable.run();
            return;
        } else
        {
            d.add(runnable);
            return;
        }
    }

    public final void a()
    {
        if (b.a())
        {
            a.o();
        }
    }

    public final void a(boolean flag)
    {
        c = flag;
        if (flag)
        {
            for (Iterator iterator = d.iterator(); iterator.hasNext(); iterator.remove())
            {
                ((Runnable)iterator.next()).run();
            }

        }
    }

    public final void onCustomAction(String s, Bundle bundle)
    {
        a.a(s);
    }

    public final void onPause()
    {
        a.g();
    }

    public final void onPlay()
    {
        a(new Runnable() {

            private efv a;

            public final void run()
            {
                a.a();
                efv.a(a).f();
            }

            
            {
                a = efv.this;
                super();
            }
        });
    }

    public final void onPlayFromMediaId(String s, Bundle bundle)
    {
        a();
        a.a(Uri.parse(s));
    }

    public final void onPlayFromSearch(String s, Bundle bundle)
    {
        a(new Runnable(s, bundle) {

            private String a;
            private Bundle b;
            private efv c;

            public final void run()
            {
                Object obj = a;
                Object obj2 = efv.a(c);
                String s1 = a;
                if (b == null)
                {
                    obj = new Bundle();
                } else
                {
                    obj = b;
                }
                if (TextUtils.isEmpty(s1))
                {
                    ((MediaService) (obj2)).d();
                    return;
                }
                Object obj1 = (SessionState)((MediaService) (obj2)).b().d();
                WebApiSearch webapisearch;
                HashMap hashmap;
                String s2;
                String s3;
                if (obj1 != null)
                {
                    obj1 = ((SessionState) (obj1)).i;
                } else
                {
                    obj1 = "";
                }
                ((MediaService) (obj2)).f.pause();
                if (((MediaService) (obj2)).i != null)
                {
                    ((MediaService) (obj2)).i.a();
                }
                if (((MediaService) (obj2)).h == null)
                {
                    obj2.h = new WebApiSearch(((android.content.Context) (obj2)));
                }
                webapisearch = ((MediaService) (obj2)).h;
                obj2 = new com.spotify.mobile.android.service.media.MediaService._cls3(((MediaService) (obj2)), s1);
                hashmap = new HashMap();
                s2 = ((Bundle) (obj)).getString("android.intent.extra.artist");
                s3 = ((Bundle) (obj)).getString("android.intent.extra.album");
                obj = ((Bundle) (obj)).getString("android.intent.extra.focus");
                if ("vnd.android.cursor.item/artist".equals(obj) && !TextUtils.isEmpty(s2))
                {
                    obj = String.format(Locale.US, "artist:\"%s\"", new Object[] {
                        s2
                    });
                } else
                if ("vnd.android.cursor.item/album".equals(obj) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
                {
                    obj = String.format(Locale.US, "artist:\"%s\" album:\"%s\"", new Object[] {
                        s2, s3
                    });
                } else
                {
                    obj = s1;
                }
                hashmap.put("q", obj);
                hashmap.put("type", "track");
                hashmap.put("market", obj1);
                hashmap.put("limit", "50");
                webapisearch.b.a("/v1/search", hashmap, new com.spotify.mobile.android.service.media.search.WebApiSearch._cls1(webapisearch, ((ecc) (obj2))));
            }

            
            {
                c = efv.this;
                a = s;
                b = bundle;
                super();
            }
        });
    }

    public final void onSkipToNext()
    {
        a.i();
    }

    public final void onSkipToPrevious()
    {
        a.h();
    }

    public final void onSkipToQueueItem(long l)
    {
        fos.a(a, (int)l);
    }
}
