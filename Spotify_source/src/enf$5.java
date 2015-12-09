// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumTracksAdapter;
import java.util.List;

final class ang.Object
    implements an
{

    private enf a;

    public final da a(Bundle bundle)
    {
        bundle = dti.d(enf.f(a));
        return new cu(a.k(), bundle, dnz.a, null, "album_name");
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (duc.a(((Cursor) (obj))))
        {
            AlbumTracksAdapter albumtracksadapter = enf.B(a);
            albumtracksadapter.a.clear();
            albumtracksadapter.b = ((Cursor) (obj));
            if (obj == null || !((Cursor) (obj)).moveToFirst())
            {
                albumtracksadapter.notifyDataSetInvalidated();
            } else
            {
                do
                {
                    dnz dnz1 = new dnz();
                    dnz1.a(((Cursor) (obj)), albumtracksadapter.c);
                    albumtracksadapter.a.add(dnz1);
                } while (((Cursor) (obj)).moveToNext());
                albumtracksadapter.notifyDataSetChanged();
            }
            if (enf.c(a) != null)
            {
                enf.b(a, ((Cursor) (obj)));
            }
            enf.u(a);
            enf.C(a).d(0);
            ((fpe)a.k()).P_();
            if (enf.D(a) != null && ((Cursor) (obj)).getCount() > 0)
            {
                a.z_().onRestoreInstanceState(enf.D(a));
                enf.E(a);
            }
            enf.p(a).a(Integer.valueOf(1), ((Cursor) (obj)));
        }
    }

    (enf enf1)
    {
        a = enf1;
        super();
    }
}
