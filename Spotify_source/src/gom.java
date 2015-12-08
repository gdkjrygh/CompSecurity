// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Map;

public final class gom extends ArrayAdapter
{

    String a;
    private final Verified b;
    private final Flags c;
    private fuj d;

    public gom(Context context, Verified verified, Flags flags)
    {
        super(context, 0);
        a = "";
        d = new fuj() {

            private gom a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (PlayerTrack)obj;
                Object obj1 = fve.a(a.getContext()).a(((PlayerTrack) (obj)).uri(), (String)((PlayerTrack) (obj)).metadata().get("title")).a(gom.b(a));
                boolean flag;
                if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("album_uri")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = ((fww) (obj1)).a(flag);
                if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("artist_uri")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((fwx) (obj1)).a(flag).a(true).a(false, null).a(gom.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = gom.this;
                super();
            }
        };
        b = verified;
        c = flags;
    }

    static Flags a(gom gom1)
    {
        return gom1.c;
    }

    static Verified b(gom gom1)
    {
        return gom1.b;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        String s;
        String s1;
        String s2;
        dia dia1;
        boolean flag;
        if (!gex.a(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (view == null)
        {
            view = dhv.a(getContext(), viewgroup, flag);
        }
        if (!flag)
        {
            view.e(true);
        }
        viewgroup = (PlayerTrack)getItem(i);
        s = (String)viewgroup.metadata().get("title");
        s1 = (String)viewgroup.metadata().get("artist_name");
        s2 = (String)viewgroup.metadata().get("album_title");
        dia1 = (dia)view.u();
        dia1.a(s);
        dia1.b((new StringBuilder()).append(s2).append(" \u2022 ").append(s1).toString());
        view.a(gae.a(getContext(), d, viewgroup));
        view.c(new fxh(d, viewgroup));
        if (!a.equals("") && (a.equals(viewgroup.uid()) || a.equals(viewgroup.uri())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.c(flag);
        return view.v();
    }
}
