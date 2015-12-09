// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.data.d;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import java.net.URI;
import java.net.URISyntaxException;
import p.df.a;

public class b
    implements k.c
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a g[];
        public final p e;
        public final String f;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cr/b$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("artist", 0, p.D, "artist_detail");
            b = new a("track", 1, p.C, "track_detail");
            c = new a("album", 2, p.E, "album_detail");
            d = new a("profile", 3, p.l, "profile");
            g = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i, p p1, String s2)
        {
            super(s1, i);
            e = p1;
            f = s2;
        }
    }


    public b()
    {
    }

    public static Intent a(a a1, Uri uri)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_page");
        pandoraintent.putExtra("intent_page_name", a1.e).putExtra("intent_detail_url", uri.toString());
        if (a1 == p.cr.a.d)
        {
            a1 = uri.getQueryParameter("webname");
            if (a1 != null)
            {
                pandoraintent.putExtra("intent_webname", a1);
            }
        }
        return pandoraintent;
    }

    public p.cp.c a(Uri uri)
    {
        p.df.a.c("BackstagePageHandler", (new StringBuilder()).append("pandorascheme.BackstagePageHandler() uri:").append(uri).toString());
        a a1 = a.valueOf(uri.getLastPathSegment());
        uri = String.format("%scontent/mobile/%s.vm?%s", new Object[] {
            d.g, a1.f, uri.getQuery()
        });
        p.df.a.a("BackstagePageHandler", (new StringBuilder()).append("smart url mapped to:").append(uri).toString());
        try
        {
            new URI(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            p.df.a.c("BackstagePageHandler", (new StringBuilder()).append("BackstagePageHandler exception").append(uri.getMessage()).toString(), uri);
            return null;
        }
        if (s.u())
        {
            uri = a(a1, Uri.parse(uri));
        } else
        {
            uri = com.pandora.android.activity.a.a(uri, null, null, null, a1.name(), null);
        }
        return new p.cp.c(uri);
    }
}
