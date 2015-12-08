// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.music.spotlets.discover.model.DiscoverStoryModel;
import com.squareup.picasso.Picasso;

public final class gnr extends ArrayAdapter
{

    private final LayoutInflater a;
    private int b;
    private String c;
    private final gft d = (gft)dmz.a(gft);
    private final android.view.View.OnClickListener e = new android.view.View.OnClickListener() {

        private gnr a;

        public final void onClick(View view)
        {
            DiscoverStoryModel discoverstorymodel = gnr.a(view);
            int j = ((Integer)view.getTag(0x7f110047)).intValue();
            view = a.getContext();
            String s1 = gnr.a(a);
            int k = gnr.b(a);
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.V);
            clientevent.a("title", discoverstorymodel.title);
            clientevent.a("target_uri", discoverstorymodel.titleUri);
            clientevent.a("context", (new StringBuilder("section-")).append(k).append('/').append(s1).append("/item-").append(j).toString());
            gnv.a(view, clientevent);
            a.getContext().startActivity(gms.a(a.getContext(), discoverstorymodel.titleUri).a);
        }

            
            {
                a = gnr.this;
                super();
            }
    };

    public gnr(u u, DiscoverStoryModel adiscoverstorymodel[], int i, String s)
    {
        super(u, 0x7f03006d, adiscoverstorymodel);
        a = LayoutInflater.from(u);
        b = i;
        c = s;
    }

    protected static DiscoverStoryModel a(View view)
    {
        return (DiscoverStoryModel)view.getTag();
    }

    static String a(gnr gnr1)
    {
        return gnr1.c;
    }

    static int b(gnr gnr1)
    {
        return gnr1.b;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.inflate(0x7f03006d, viewgroup, false);
            view1.setOnClickListener(e);
        }
        viewgroup = (CardView)view1.findViewById(0x7f1102f0);
        viewgroup.a(true);
        viewgroup.a(com.spotify.android.paste.widget.CardView.CardTextType.c);
        view = (DiscoverStoryModel)getItem(i);
        view1.setOnLongClickListener(null);
        view1.setTag(view);
        view1.setTag(0x7f110047, Integer.valueOf(i));
        viewgroup.a(((DiscoverStoryModel) (view)).title);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        int j;
        if (TextUtils.isEmpty(((DiscoverStoryModel) (view)).subtitle))
        {
            viewgroup.b(" ");
        } else
        {
            viewgroup.b(((DiscoverStoryModel) (view)).subtitle);
        }
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)viewgroup.getLayoutParams();
        j = getContext().getResources().getDimensionPixelSize(0x7f0c00d1);
        if (marginlayoutparams != null)
        {
            if (i == 0)
            {
                marginlayoutparams.setMargins(marginlayoutparams.rightMargin, j, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
            } else
            {
                marginlayoutparams.setMargins(0, j, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
            }
        }
        viewgroup = viewgroup.b();
        d.a().a(dto.a(((DiscoverStoryModel) (view)).imageUrl)).a(viewgroup, null);
        return view1;
    }
}
