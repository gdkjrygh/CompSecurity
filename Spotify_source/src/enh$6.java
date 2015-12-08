// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumsWithTracksAdapter;
import java.util.List;

final class ang.Object
    implements an
{

    private enh a;

    public final da a(Bundle bundle)
    {
        bundle = dti.b(enh.l(a));
        return new cu(a.k(), bundle, dnz.a, null, "album_name");
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (duc.a(cursor))
        {
            AlbumsWithTracksAdapter albumswithtracksadapter = enh.D(a);
            albumswithtracksadapter.a.clear();
            albumswithtracksadapter.b.clear();
            albumswithtracksadapter.d = cursor;
            if (cursor == null || !cursor.moveToFirst())
            {
                albumswithtracksadapter.notifyDataSetInvalidated();
            } else
            {
                obj = null;
                int i = 0;
                while (i < cursor.getCount()) 
                {
                    dnz dnz1 = new dnz();
                    dnz1.a(cursor, albumswithtracksadapter.c);
                    boolean flag;
                    if (!TextUtils.equals(((CharSequence) (obj)), dnz1.f))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (i > 0 && flag)
                    {
                        albumswithtracksadapter.a.add(albumswithtracksadapter.a.get(albumswithtracksadapter.a.size() - 1));
                        albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.WithTracksAdapter.Type.c);
                    }
                    if (flag)
                    {
                        albumswithtracksadapter.a.add(new emo(dnz1));
                        albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.WithTracksAdapter.Type.b);
                    }
                    albumswithtracksadapter.a.add(dnz1);
                    albumswithtracksadapter.b.add(com.spotify.mobile.android.spotlets.collection.adapter.WithTracksAdapter.Type.a);
                    obj = dnz1.f;
                    cursor.moveToNext();
                    i++;
                }
                albumswithtracksadapter.notifyDataSetChanged();
            }
            enh.w(a);
            enh.E(a).d(0);
            ((fpe)a.k()).P_();
            if (enh.F(a) != null && cursor.getCount() > 0)
            {
                a.z_().onRestoreInstanceState(enh.F(a));
                enh.G(a);
            }
            enh.u(a).a(Integer.valueOf(1), cursor);
        }
    }

    (enh enh1)
    {
        a = enh1;
        super();
    }
}
