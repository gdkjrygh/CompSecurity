// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.spotlets.artist.view.CardRow;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class eiu extends eit
{

    private static final ctw g = ctw.a(" \u2022 ");
    private final int h;

    public eiu(Context context, String s, List list, ejn ejn1, Flags flags)
    {
        super(context, s, list, ejn1, flags);
        h = context.getResources().getInteger(0x7f0e0004);
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (view == null)
        {
            view = d;
            int j = h;
            view = new CardRow(((ejn) (view)).a, j, ((ejn) (view)).b);
        } else
        {
            view = (CardRow)view;
        }
        if (i == getCount() - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = e;
        if (flag && flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.b = flag1;
        if (!((CardRow) (view)).b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.setWillNotDraw(flag1);
        if (flag && !flag2)
        {
            view.setPadding(((CardRow) (view)).c, 0, ((CardRow) (view)).c, 0);
        } else
        {
            view.setPadding(((CardRow) (view)).c, 0, ((CardRow) (view)).c, ((CardRow) (view)).c);
        }
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        viewgroup = cuw.a(((CardRow) (view)).a.iterator());
        i = h * i;
        while (viewgroup.hasNext()) 
        {
            Object obj = (dcw)viewgroup.next();
            View view1 = ((dcw) (obj)).a();
            ((dcw) (obj)).b();
            view1.setVisibility(0);
            if (i < b.size())
            {
                com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release release = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)b.get(i);
                if (release.cover != null)
                {
                    f.f(((dcw) (obj)).c(), dto.a(release.cover.uri));
                }
                ((dcw) (obj)).a(release.name);
                ((dcw) (obj)).b(g.a(a.getResources().getQuantityString(0x7f09000e, release.trackCount, new Object[] {
                    Integer.valueOf(release.trackCount)
                }), Integer.valueOf(release.year), new Object[0]));
                if (!c.containsKey(release.uri))
                {
                    c.put(release.uri, new ejw(i, release.uri));
                }
                obj = (ejw)c.get(release.uri);
                ((ejw) (obj)).a(i);
                view1.setTag(obj);
                a(view1, i);
                ((fpe)a).R_().b().a(view1);
            } else
            {
                view1.setVisibility(4);
            }
            i++;
        }
        return view;
    }

    public final com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release a(int i)
    {
        return (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)b.get(i);
    }

    public final int getCount()
    {
        return CardRow.a(b.size(), h);
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }

}
