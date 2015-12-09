// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.spotlets.browse.model.Genre;

public final class ely
    implements ctv
{

    public static final gdz a = new gdz() {

        protected final Object a()
        {
            return new ely((byte)0);
        }

    };

    private ely()
    {
    }

    ely(byte byte0)
    {
        this();
    }

    public final Object a(Object obj)
    {
        Genre genre = (Genre)obj;
        obj = (dpf)(new dpf()).a();
        Object obj1 = dpa.a(genre.a);
        obj1.a = com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.a;
        obj1.b = genre.a();
        obj = (dpf)((dpf) (obj)).a(((dpk) (obj1)));
        obj1 = new dpj();
        obj1.a = "genres_moods";
        obj1 = (dpf)((dpf) (obj)).a(((dpj) (obj1)));
        dpi dpi1 = dpa.a(PorcelainIcon.e);
        obj = genre.c;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (new StringBuilder("genreimage:")).append(((String) (obj))).toString();
        }
        dpi1.a = ((String) (obj));
        return ((dpf)((dpf)((dpf) (obj1)).a(dpi1)).a(genre.a())).b();
    }

}
