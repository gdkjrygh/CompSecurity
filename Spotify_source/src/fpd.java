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
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fpd extends Fragment
{

    public fpd()
    {
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030095, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1103aa);
        bundle = (TextView)layoutinflater.findViewById(0x7f1103ab);
        ImageView imageview = (ImageView)layoutinflater.findViewById(0x7f1103ac);
        int i;
        if (((Boolean)((Flags)ctz.a(fyw.a(k()))).a(fys.y)).booleanValue())
        {
            i = 0x7f0802c1;
        } else
        {
            i = 0x7f0802c2;
        }
        bundle.setText(i);
        viewgroup.setText(0x7f0802c4);
        imageview.setImageResource(0x7f020188);
        if (((gcz)dmz.a(gcz)).c() >= l().getDimensionPixelSize(0x7f0c0144))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            imageview.setVisibility(0);
            return layoutinflater;
        } else
        {
            imageview.setVisibility(4);
            return layoutinflater;
        }
    }
}
