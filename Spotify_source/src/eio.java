// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public final class eio extends fsx
{

    private final Map a = Maps.b();
    private final ejn b;
    private gji e;

    public eio(Context context, List list, ejn ejn1)
    {
        super(context, list);
        b = ejn1;
        dmz.a(gjj);
        e = gjj.a(context);
    }

    public final View a(Context context, int i, ViewGroup viewgroup)
    {
        context = b.b(viewgroup);
        context.e(true);
        return context.v();
    }

    public final void a(View view, Context context, int i)
    {
        com.spotify.mobile.android.spotlets.artist.model.ArtistModel.MerchandiseItem merchandiseitem = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.MerchandiseItem)getItem(i);
        dhu dhu1 = dhu.b(view);
        dib dib1 = (dib)dhu1.u();
        dib1.a(merchandiseitem.name);
        dib1.b(merchandiseitem.description);
        context = (ejt)a.get(merchandiseitem.uuid);
        view = context;
        if (context == null)
        {
            view = merchandiseitem.uuid;
            view = new ejt(i, merchandiseitem.link);
            a.put(merchandiseitem.uuid, view);
        }
        view.a(i);
        dhu1.b(view);
        e.f(dib1.d(), merchandiseitem.imageUri);
    }
}
