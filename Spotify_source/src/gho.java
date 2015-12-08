// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Locale;

public final class gho
{

    private static final String a[] = {
        "country_code", "product_type"
    };

    public static void a(Context context, SpotifyLink spotifylink)
    {
        ctz.a(spotifylink.f(), "Only use with tracked links");
        (new gfi(context, new gfk(context, spotifylink) {

            private Context a;
            private SpotifyLink b;

            public final void a(gfi gfi1, Cursor cursor)
            {
                if (!cursor.moveToFirst())
                {
                    return;
                } else
                {
                    String s = cursor.getString(0);
                    cursor = cursor.getString(1);
                    gho.a(a, b, s, cursor);
                    gfi1.b();
                    return;
                }
            }

            
            {
                a = context;
                b = spotifylink;
                super();
            }
        })).a(dtw.a, a);
    }

    static void a(Context context, SpotifyLink spotifylink, String s, String s1)
    {
        ghm ghm1 = (ghm)dmz.a(ghm);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Y, com.spotify.mobile.android.util.ClientEvent.SubEvent.aJ);
        clientevent.a("link-type", spotifylink.c.toString().toLowerCase(Locale.US));
        clientevent.a("market", s);
        clientevent.a("product-type", s1);
        ghm1.a(context, spotifylink, clientevent);
        if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aT || spotifylink.g())
        {
            ghm1.a(context, spotifylink, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Y, com.spotify.mobile.android.util.ClientEvent.SubEvent.aK));
        }
    }

}
