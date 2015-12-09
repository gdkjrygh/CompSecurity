// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.search.WebApiSearch;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.HashMap;
import java.util.Locale;

final class ang.Object
    implements Runnable
{

    private String a;
    private Bundle b;
    private efv c;

    public final void run()
    {
        Object obj = a;
        Object obj2 = efv.a(c);
        String s = a;
        if (b == null)
        {
            obj = new Bundle();
        } else
        {
            obj = b;
        }
        if (TextUtils.isEmpty(s))
        {
            ((MediaService) (obj2)).d();
            return;
        }
        Object obj1 = (SessionState)((MediaService) (obj2)).b().d();
        WebApiSearch webapisearch;
        HashMap hashmap;
        String s1;
        String s2;
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
        obj2 = new com.spotify.mobile.android.service.media.ervice._cls3(((MediaService) (obj2)), s);
        hashmap = new HashMap();
        s1 = ((Bundle) (obj)).getString("android.intent.extra.artist");
        s2 = ((Bundle) (obj)).getString("android.intent.extra.album");
        obj = ((Bundle) (obj)).getString("android.intent.extra.focus");
        if ("vnd.android.cursor.item/artist".equals(obj) && !TextUtils.isEmpty(s1))
        {
            obj = String.format(Locale.US, "artist:\"%s\"", new Object[] {
                s1
            });
        } else
        if ("vnd.android.cursor.item/album".equals(obj) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            obj = String.format(Locale.US, "artist:\"%s\" album:\"%s\"", new Object[] {
                s1, s2
            });
        } else
        {
            obj = s;
        }
        hashmap.put("q", obj);
        hashmap.put("type", "track");
        hashmap.put("market", obj1);
        hashmap.put("limit", "50");
        webapisearch.b.a("/v1/search", hashmap, new com.spotify.mobile.android.service.media.search.Search._cls1(webapisearch, ((ecc) (obj2))));
    }

    (efv efv1, String s, Bundle bundle)
    {
        c = efv1;
        a = s;
        b = bundle;
        super();
    }
}
