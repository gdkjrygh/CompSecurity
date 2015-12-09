// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fpb extends Fragment
{

    public fpb()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030095, viewgroup, false);
        viewgroup = (ImageView)layoutinflater.findViewById(0x7f1103a9);
        bundle = (TextView)layoutinflater.findViewById(0x7f1103aa);
        TextView textview = (TextView)layoutinflater.findViewById(0x7f1103ab);
        ImageView imageview = (ImageView)layoutinflater.findViewById(0x7f1103ac);
        Bundle bundle1 = g();
        Object obj = bundle1.getString("showcase-spoticon");
        boolean flag;
        if (obj != null)
        {
            obj = SpotifyIcon.valueOf(((String) (obj)));
            viewgroup.setImageDrawable(new dfz(k(), ((SpotifyIcon) (obj))));
        } else
        if (bundle1.getInt("showcase-icon") > 0 && bundle1.getInt("showcase-icon") != 0x7f020277)
        {
            viewgroup.setImageResource(bundle1.getInt("showcase-icon"));
        } else
        {
            viewgroup.setVisibility(8);
        }
        bundle.setText(bundle1.getInt("showcase-title"));
        textview.setText(bundle1.getInt("showcase-descr"));
        if (((gcz)dmz.a(gcz)).c() >= l().getDimensionPixelSize(0x7f0c0144))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            imageview.setImageResource(bundle1.getInt("showcase-image"));
            imageview.setVisibility(0);
            return layoutinflater;
        } else
        {
            imageview.setVisibility(4);
            return layoutinflater;
        }
    }
}
