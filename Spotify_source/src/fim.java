// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.Map;

public final class fim
{

    public final SpotifyLink a;
    public final epb b;
    private final Resolver c;

    public fim(Context context, String s, Resolver resolver, fin fin)
    {
        a = new SpotifyLink(s);
        c = resolver;
        if (a.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ)
        {
            b = new fif(context, c, new epc(fin, s) {

                private fin a;
                private String b;

                public final void a(Throwable throwable)
                {
                    a.a(throwable);
                }

                public final void a(Map map)
                {
                    a.a((Show)map.get(b), null);
                }

            
            {
                a = fin1;
                b = s;
                super();
            }
            });
        } else
        if (a.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            b = new fie(context, c, new epc(s, fin) {

                private String a;
                private fin b;

                public final void a(Throwable throwable)
                {
                    b.a(throwable);
                }

                public final void a(Map map)
                {
                    map = (fio)map.get(a);
                    b.a(map.o(), map);
                }

            
            {
                a = s;
                b = fin1;
                super();
            }
            });
        } else
        {
            Assertion.a((new StringBuilder("Unhandled link type! Link is ")).append(s).toString());
            b = null;
        }
        if (b != null)
        {
            b.b();
        }
    }
}
