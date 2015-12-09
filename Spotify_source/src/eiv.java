// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public final class eiv extends eit
{

    private DateFormat g;

    public eiv(Context context, String s, List list, ejn ejn1, Flags flags)
    {
        super(context, s, list, ejn1, flags);
        g = DateFormat.getDateInstance(1);
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = d.b(viewgroup);
        }
        view.e(true);
        viewgroup = (dib)view.u();
        com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release release = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release)b.get(i);
        if (release.cover != null)
        {
            f.f(viewgroup.d(), dto.a(release.cover.uri));
        }
        viewgroup.a(release.name);
        Calendar calendar = Calendar.getInstance();
        calendar.set(release.year, release.month - 1, release.day);
        viewgroup.c(ctw.a(" \u2022 ").a(a.getResources().getQuantityString(0x7f09000e, release.trackCount, new Object[] {
            Integer.valueOf(release.trackCount)
        }), g.format(calendar.getTime()), new Object[0]));
        if (!c.containsKey(release.uri))
        {
            c.put(release.uri, new ejw(i, release.uri));
        }
        viewgroup = (ejw)c.get(release.uri);
        viewgroup.a(i);
        view.b(viewgroup);
        a(((dhu) (view)), i);
        a(view.v(), i);
        return view.v();
    }

    public final int getCount()
    {
        return b.size();
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }
}
