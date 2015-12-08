// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Pair;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Map;

final class don
{

    fuj a;
    final ImmutableMap b;
    final gjn c;
    final fyx d;
    final Context e;
    final fxf f = new fxf() {

        public final volatile void a(com.spotify.mobile.android.util.ClientEvent.Event event, Object obj)
        {
        }

    };

    public don(Context context, gjn gjn1, fyx fyx1, doo doo, Map map)
    {
        a = new fuj() {

            private don a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                Object obj1 = (Pair)obj;
                obj = a;
                dom dom1 = (dom)((Pair) (obj1)).first;
                obj1 = (dpy)((Pair) (obj1)).second;
                Verified verified = (Verified)ctz.a(((don) (obj)).c.v_());
                Flags flags = (Flags)ctz.a(((don) (obj)).d.a());
                ((dpy) (obj1)).a(spotifycontextmenu, fve.a(((don) (obj)).e), dom1.a, verified, flags, fxg.a(dom1, ((don) (obj)).f));
            }

            
            {
                a = don.this;
                super();
            }
        };
        c = (gjn)ctz.a(gjn1);
        d = (fyx)ctz.a(fyx1);
        e = (Context)ctz.a(context);
        ctz.a(doo);
        b = ImmutableMap.a(map);
    }
}
