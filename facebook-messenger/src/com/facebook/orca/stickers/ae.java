// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.images.UrlImage;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPack, StickerStoreFragment, af

class ae extends ArrayAdapter
{

    final StickerStoreFragment a;
    private final LayoutInflater b;

    public ae(StickerStoreFragment stickerstorefragment, Context context, List list)
    {
        a = stickerstorefragment;
        super(context, 0);
        for (stickerstorefragment = list.iterator(); stickerstorefragment.hasNext(); add((StickerPack)stickerstorefragment.next())) { }
        b = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        view = (RelativeLayout)b.inflate(k.orca_sticker_store_list_item, viewgroup, false);
        viewgroup = (UrlImage)view.findViewById(i.thumbnail);
        TextView textview = (TextView)view.findViewById(i.name);
        TextView textview1 = (TextView)view.findViewById(i.price);
        ImageView imageview = (ImageView)view.findViewById(i.status_icon);
        StickerPack stickerpack = (StickerPack)getItem(j);
        viewgroup.setImageParams(stickerpack.d());
        textview.setText(stickerpack.b());
        textview1.setText(o.sticker_store_price_free);
        boolean flag = StickerStoreFragment.d(a).contains(stickerpack.a());
        if (flag)
        {
            j = h.orca_stickers_store_pack_downloaded;
        } else
        {
            j = h.orca_stickers_store_pack_download;
        }
        imageview.setImageResource(j);
        view.setOnClickListener(new af(this, stickerpack, flag));
        return view;
    }
}
