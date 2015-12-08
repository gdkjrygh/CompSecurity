// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;
import java.util.List;

public class p.cr.a
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
        Intent g;

        static Intent a()
        {
            return (new PandoraIntent("show_page")).putExtra("intent_page_name", p.r).putExtra("intent_show_force_screen", true);
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/cr/a$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("info", 0, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.u));
            b = new a("privacy", 1, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.t).putExtra("intent_show_force_screen", true));
            c = new a("notices", 2, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.v));
            d = new a("billing", 3, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.s));
            e = new a("device", 4, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.w));
            f = new a("artistMessages", 5, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.A));
            h = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i, Intent intent)
        {
            super(s, i);
            g = intent.putExtra("intent_show_force_screen", true);
        }
    }


    public p.cr.a()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        if (uri.getPathSegments().size() < 2)
        {
            uri = a.a();
        } else
        {
            uri = a.valueOf((String)uri.getPathSegments().get(1)).g;
        }
        return new p.cp.b.c(uri);
    }
}
