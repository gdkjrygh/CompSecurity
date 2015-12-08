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

public final class gdj extends ArrayAdapter
{

    public gdj(Context context, List list)
    {
        super(context, 0x1090003, list);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = dhu.b(view);
        if (view == null)
        {
            view = dhv.b(getContext(), viewgroup);
        }
        viewgroup = (gdk)getItem(i);
        if (((gdk) (viewgroup)).a)
        {
            Object obj = SpotifyIcon.h;
            obj = new dfz(getContext(), ((SpotifyIcon) (obj)), getContext().getResources().getDimensionPixelSize(0x7f0c00dd));
            ((dfz) (obj)).a(gcg.b(getContext(), 0x7f0f007c));
            ImageView imageview = new ImageView(getContext());
            imageview.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            view.a(imageview);
        } else
        {
            view.a(null);
        }
        ((dhw)view.u()).a(getContext().getString(((gdk) (viewgroup)).b));
        return view.v();
    }
}
