// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class eky extends ekz
{

    public List a;

    public eky(int i, dma dma, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        super(i, dma, featureidentifier, featureidentifier1);
        a = new ArrayList();
    }

    public final int a()
    {
        return a.size();
    }

    public final NewRelease a(int i)
    {
        return (NewRelease)a.get(i);
    }

    public final void a(String s, String s1)
    {
        a(s, s1, a);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a(a);
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!(view instanceof ema))
        {
            view = new ema(viewgroup.getContext(), c);
        } else
        {
            view = (ema)view;
        }
        if (getCount() > 0)
        {
            viewgroup = a(i, a);
            i = 0;
            while (i < ((ema) (view)).a) 
            {
                View view1 = view.getChildAt(i);
                if (i < viewgroup.size())
                {
                    CardView cardview = (CardView)view1;
                    NewRelease newrelease = (NewRelease)viewgroup.get(i);
                    String s = newrelease.a;
                    String s1 = ((Playable) (newrelease)).c;
                    String s2 = newrelease.b;
                    cardview.a(true);
                    cardview.a(s);
                    cardview.b(s2);
                    ((ema) (view)).b.f(cardview.b(), newrelease.a());
                    cardview.b(((Playable) (newrelease)).d);
                    cardview.setOnClickListener(new ema._cls1(view, i, s, s1));
                    view1.setVisibility(0);
                } else
                {
                    view1.setVisibility(4);
                }
                i++;
            }
        }
        return view;
    }
}
