// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.internal.game.GameBadge;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment

private static final class mLayoutInflater extends ArrayAdapter
{

    private final LayoutInflater mLayoutInflater;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mLayoutInflater.inflate(0x7f040048, viewgroup, false);
        }
        viewgroup = (mLayoutInflater)view1.getTag();
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new init>(view1);
        }
        viewgroup = (GameBadge)getItem(i);
        ((getItem) (view)).adgeTitle.setText(viewgroup.getTitle());
        ((adgeTitle) (view)).adgeDescription.setText(viewgroup.getDescription());
        ((adgeDescription) (view)).adgeThumbnail.loadUri$3329f911(viewgroup.getIconImageUri(), 0, true);
        return view1;
    }

    public (Context context)
    {
        super(context, 0);
        mLayoutInflater = LayoutInflater.from(context);
    }
}
