// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;
import java.util.List;

public class m
    implements k.c
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a h[];
        private p g;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cr/m$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        public p a()
        {
            return g;
        }

        static 
        {
            a = new a("bookmarks", 0, p.n);
            b = new a("likes", 1, p.o);
            c = new a("following", 2, p.p);
            d = new a("followers", 3, p.q);
            e = new a("edit", 4, p.m);
            f = new a("profile", 5, p.l);
            h = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i, p p1)
        {
            super(s, i);
            g = p1;
        }
    }


    public m()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        Intent intent;
        if (uri.getPathSegments().size() > 1)
        {
            uri = (String)uri.getPathSegments().get(1);
        } else
        {
            uri = a.f.name();
        }
        intent = (new PandoraIntent("show_page")).putExtra("intent_show_force_screen", true);
        try
        {
            intent.putExtra("intent_page_name", a.valueOf(uri).a());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            intent.putExtra("intent_page_name", a.f.a()).putExtra("intent_webname", uri);
        }
        return new p.cp.b.c(intent);
    }
}
