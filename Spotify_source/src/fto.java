// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import java.util.List;

public final class fto extends ArrayAdapter
{

    public int a;

    public fto(Context context, List list, int i)
    {
        super(context, 0x1090003, list);
        a = -1;
        a = i;
    }

    private View a(SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(getContext(), spotifyicon, getContext().getResources().getDimension(0x7f0c00dd));
        spotifyicon.a(gcg.b(getContext(), 0x7f0f007c));
        ImageView imageview = new ImageView(getContext());
        imageview.setImageDrawable(spotifyicon);
        return imageview;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.b(getContext(), viewgroup);
        }
        viewgroup = (gfp)getItem(i);
        if (a == i)
        {
            if (!((gfp) (viewgroup)).c)
            {
                view.a(a(SpotifyIcon.h));
            } else
            if (viewgroup.b())
            {
                view.a(a(SpotifyIcon.ay));
            } else
            {
                view.a(a(SpotifyIcon.az));
            }
        } else
        {
            view.a(null);
        }
        ((dhw)view.u()).a(getContext().getString(((gfp) (viewgroup)).b));
        view.e(false);
        return view.v();
    }
}
