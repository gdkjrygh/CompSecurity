// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.moviemaker.MovieMakerActivity;

final class bpw
    implements bpy
{

    private bps a;

    bpw(bps bps1)
    {
        a = bps1;
        super();
    }

    public final void a(boolean flag)
    {
        a.c();
        a.c.o(false);
        if (!flag)
        {
            ((MovieMakerActivity)olm.a(((bpx)a.a.b).G_(), com/google/android/apps/moviemaker/MovieMakerActivity)).d.q.b();
            return;
        } else
        {
            bww bww1 = a.c;
            bww1.g();
            bww1.o();
            bww1.c.l = null;
            bww1.a(new bxg[] {
                bxg.d, bxg.e
            });
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            a.e.a(true);
            a.c.a(a.c.e());
            a.c.f(a.c.b.S);
            if (a.c.c.r != null)
            {
                cnx cnx = a.c.c.r.b(a.c.c.k);
                if (cnx != null)
                {
                    a.c.a(cnx);
                }
            }
            return;
        }
        MovieMakerActivity moviemakeractivity = (MovieMakerActivity)olm.a(((bpx)a.a.b).G_(), com/google/android/apps/moviemaker/MovieMakerActivity);
        Intent intent1 = moviemakeractivity.getIntent();
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = new Intent();
        }
        moviemakeractivity.setResult(0, intent);
        moviemakeractivity.finish();
    }
}
