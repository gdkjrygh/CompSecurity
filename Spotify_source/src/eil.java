// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.util.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class eil extends fsx
{

    private final ejn a;
    private final Map b = Maps.b();
    private final SimpleDateFormat e = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    public eil(Context context, List list, ejn ejn1)
    {
        super(context, list);
        a = ejn1;
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        context = a.b(viewgroup);
        context.e(true);
        return context.v();
    }

    public final void a(View view, Context context, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert)getItem(i);
        obj1 = dhu.b(view);
        obj2 = (dib)((dhu) (obj1)).u();
        ((dib) (obj2)).a(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert) (obj)).title);
        ((dib) (obj2)).b(TextUtils.join(" \u2022 ", new String[] {
            ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert) (obj)).venue, ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert) (obj)).city
        }));
        context = (ejq)b.get(Integer.valueOf(i));
        view = context;
        if (context == null)
        {
            view = new ejq(i, i);
            b.put(Integer.valueOf(i), view);
        }
        view.a(i);
        ((dhu) (obj1)).b(view);
        view = new ImageView(c);
        view.setImageResource(0x7f020218);
        ((dhu) (obj1)).a(view);
        view = ((dib) (obj2)).d();
        obj1 = ((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert) (obj)).localtime;
        obj2 = e;
        obj = dsu.a(view);
        view = null;
        context = ((SimpleDateFormat) (obj2)).parse(((String) (obj1)));
        view = context;
_L2:
        ((dsu) (obj)).a(view, Locale.getDefault());
        return;
        context;
        Logger.a(context, "Failed to parse date [%s] with formatter [%s]", new Object[] {
            obj1, obj2
        });
        if (true) goto _L2; else goto _L1
_L1:
    }
}
