// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class gor extends gok
{

    private final Drawable d;

    public gor(u u, Flags flags)
    {
        super(u, ViewUri.h, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.f, flags);
        d = dff.a(u, SpotifyIcon.J);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.c(getContext(), viewgroup);
            a(view.v());
            ((dhx)view.u()).d().setImageDrawable(d);
        }
        viewgroup = (RadioStationModel)getItem(i);
        view.b(viewgroup);
        ((dhx)view.u()).a(((RadioStationModel) (viewgroup)).title);
        view.c(false);
        return view.v();
    }
}
