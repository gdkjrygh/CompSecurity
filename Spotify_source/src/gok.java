// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class gok extends ArrayAdapter
{

    final Verified a;
    final com.spotify.mobile.android.util.viewuri.ViewUri.SubView b;
    final fuj c;
    private final Drawable d;
    private gft e;
    private LayoutInflater f;
    private final Flags g;
    private final android.view.View.OnClickListener h;

    public gok(u u, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, Flags flags)
    {
        this(u, verified, subview, flags, (byte)0);
    }

    private gok(u u, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, Flags flags, byte byte0)
    {
        super(u, 0x7f030124, new ArrayList());
        e = (gft)dmz.a(gft);
        dmz.a(fos);
        c = new fuj() {

            private gok a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                RadioStationModel radiostationmodel = (RadioStationModel)obj;
                obj = new fuk(a.getContext(), gok.a(a), gok.b(a), spotifycontextmenu);
                ((fuk) (obj)).a(radiostationmodel.title, gok.c(a), new String[] {
                    radiostationmodel.seeds[0]
                });
                ((fuk) (obj)).a(radiostationmodel.uri);
                obj = radiostationmodel.imageUri;
                if (obj == null)
                {
                    obj = "";
                }
                spotifycontextmenu.b((String)obj);
                spotifycontextmenu.a.a = radiostationmodel.title;
                spotifycontextmenu.a.b = radiostationmodel.subtitle;
            }

            
            {
                a = gok.this;
                super();
            }
        };
        h = new android.view.View.OnClickListener() {

            private gok a;

            public final void onClick(View view)
            {
                view = gok.b(view);
                if (gpl.a(gok.c(a)))
                {
                    view = gms.a(a.getContext(), ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
                    a.getContext().startActivity(view);
                    return;
                } else
                {
                    gok gok1 = a;
                    fos.a(gok1.getContext(), ((RadioStationModel) (view)).seeds, gok1.a, gok1.b);
                    return;
                }
            }

            
            {
                a = gok.this;
                super();
            }
        };
        new android.view.View.OnLongClickListener() {

            private gok a;

            public final boolean onLongClick(View view)
            {
                gok gok1 = a;
                view = (RadioStationModel)view.getTag();
                fud.a(gok1.getContext(), gok1.c, view);
                return true;
            }

            
            {
                a = gok.this;
                super();
            }
        };
        a = verified;
        b = subview;
        g = flags;
        d = dff.a(u, SpotifyIcon.K);
        f = LayoutInflater.from(u);
    }

    static Verified a(gok gok1)
    {
        return gok1.a;
    }

    static com.spotify.mobile.android.util.viewuri.ViewUri.SubView b(gok gok1)
    {
        return gok1.b;
    }

    protected static RadioStationModel b(View view)
    {
        return (RadioStationModel)view.getTag();
    }

    static Flags c(gok gok1)
    {
        return gok1.g;
    }

    public final void a(View view)
    {
        view.setOnClickListener(h);
    }

    public long getItemId(int i)
    {
        return (long)((RadioStationModel)getItem(i)).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        SpotifyLink spotifylink;
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams;
        if (view == null)
        {
            view = f.inflate(0x7f030124, viewgroup, false);
            a(view);
            viewgroup = (CardView)view.findViewById(0x7f1102f0);
            viewgroup.a(fzz.a(getContext()));
            viewgroup.a(dft.a(8F, getContext().getResources()));
        } else
        {
            viewgroup = (CardView)view.findViewById(0x7f1102f0);
        }
        viewgroup.a(true);
        viewgroup.a(com.spotify.android.paste.widget.CardView.CardTextType.c);
        obj = (RadioStationModel)getItem(i);
        view.setOnLongClickListener(null);
        view.setTag(obj);
        viewgroup.a(((RadioStationModel) (obj)).title);
        if (TextUtils.isEmpty(((RadioStationModel) (obj)).subtitle))
        {
            viewgroup.b(" ");
        } else
        {
            viewgroup.b(((RadioStationModel) (obj)).subtitle);
        }
        spotifylink = new SpotifyLink(((RadioStationModel) (obj)).seeds[0]);
        viewgroup.c(gpl.a(viewgroup.getContext(), spotifylink));
        marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)viewgroup.getLayoutParams();
        if (marginlayoutparams != null)
        {
            if (i == 0)
            {
                marginlayoutparams.setMargins(marginlayoutparams.rightMargin, marginlayoutparams.topMargin, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
            } else
            {
                marginlayoutparams.setMargins(0, marginlayoutparams.topMargin, marginlayoutparams.rightMargin, marginlayoutparams.bottomMargin);
            }
        }
        viewgroup.b(false);
        viewgroup = viewgroup.b();
        if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = e.a().a(dto.a(((RadioStationModel) (obj)).imageUri)).a(d).b(d);
        if (i != 0)
        {
            ((gwb) (obj)).a(gft.a(viewgroup, dfq.a()));
            return view;
        } else
        {
            ((gwb) (obj)).a(viewgroup, null);
            return view;
        }
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
