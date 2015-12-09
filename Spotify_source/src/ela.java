// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ela extends ekz
{

    public List a;
    private final fyx f;

    public ela(int i, dma dma, fyx fyx1, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        super(i, dma, featureidentifier, featureidentifier1);
        a = new ArrayList();
        f = fyx1;
    }

    public final int a()
    {
        return a.size();
    }

    public final Playlist a(int i)
    {
        return (Playlist)a.get(i);
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
        if (!(view instanceof emb))
        {
            view = new emb(viewgroup.getContext(), c, super.d, super.e);
        } else
        {
            view = (emb)view;
        }
        if (getCount() > 0)
        {
            viewgroup = a(i, a);
            dma dma = b;
            com.spotify.mobile.android.ui.fragments.logic.Flags flags = f.a();
            i = 0;
            while (i < ((emb) (view)).a) 
            {
                View view1 = view.getChildAt(i);
                if (i < viewgroup.size())
                {
                    CardView cardview = (CardView)view1;
                    Playlist playlist = (Playlist)viewgroup.get(i);
                    int j = playlist.f;
                    String s = playlist.b;
                    String s1 = ((Playable) (playlist)).c;
                    String s2 = playlist.a;
                    cardview.a(true);
                    cardview.a(s);
                    Object obj;
                    android.widget.ImageView imageview;
                    String s3;
                    if (j == -1)
                    {
                        cardview.c(" ");
                    } else
                    {
                        cardview.c(view.getResources().getQuantityString(0x7f090003, j, new Object[] {
                            Integer.valueOf(j)
                        }).toUpperCase(Locale.getDefault()));
                    }
                    obj = ((emb) (view)).b;
                    imageview = cardview.b();
                    s3 = playlist.a();
                    ((gji) (obj)).b.a(s3).a(0x7f02006e).b(0x7f02006e).a(imageview, null);
                    cardview.b(((Playable) (playlist)).d);
                    obj = (ImageButton)cardview.d();
                    if (obj != null)
                    {
                        dlz dlz1 = new dlz(view.getContext(), new SpotifyLink(s1), ViewUri.r, ((emb) (view)).d, ((emb) (view)).e, dma, flags);
                        Object obj1 = playlist.a;
                        com.spotify.mobile.android.util.ClientEvent clientevent = ((emb) (view)).c.a(-1, s, s1, ((String) (obj1)), "play");
                        obj1 = ((emb) (view)).c.a(-1, s, s1, ((String) (obj1)), "pause");
                        com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i;
                        ctz.a(subview);
                        dlz1.b = true;
                        dlz1.d = true;
                        dlz1.e = subview;
                        dlz1.a = clientevent;
                        dlz1.c = ((com.spotify.mobile.android.util.ClientEvent) (obj1));
                        ((ImageButton) (obj)).setOnClickListener(new emb._cls1(playlist, dlz1));
                    }
                    cardview.setOnClickListener(new emb._cls2(view, i, s2, s, s1));
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
