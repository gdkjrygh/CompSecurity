// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.CoverCardHorizontal;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;

public final class ekx extends ekz
{

    public ArrayList a;

    public ekx(dma dma, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        super(1, dma, featureidentifier, featureidentifier1);
        a = new ArrayList();
    }

    private Playlist a(int i)
    {
        return (Playlist)a.get(i);
    }

    public final void a(String s, String s1)
    {
        a(s, s1, ((java.util.List) (a)));
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!(view instanceof CoverCardHorizontal))
        {
            view = CoverCardHorizontal.a(viewgroup.getContext(), viewgroup);
        } else
        {
            view = (CoverCardHorizontal)view;
        }
        if (getCount() > 0)
        {
            view.a = a(i);
            ((CoverCardHorizontal) (view)).b.a();
            ((CoverCardHorizontal) (view)).b.a(((CoverCardHorizontal) (view)).a.b);
            viewgroup = (android.view.ViewGroup.MarginLayoutParams)((CoverCardHorizontal) (view)).b.getLayoutParams();
            if (i == 0)
            {
                viewgroup.setMargins(((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).bottomMargin);
            } else
            {
                viewgroup.setMargins(0, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (viewgroup)).bottomMargin);
            }
            ((CoverCardHorizontal) (view)).c.d(((CoverCardHorizontal) (view)).b.b(), ((CoverCardHorizontal) (view)).a.a());
        }
        return view;
    }
}
