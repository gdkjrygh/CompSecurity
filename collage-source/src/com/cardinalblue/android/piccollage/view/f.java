// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPromotionData;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            a

public class f extends a
{

    private final WebPromotionData b;

    public f(Context context, View view, WebPromotionData webpromotiondata)
    {
        super(context, view);
        b = webpromotiondata;
    }

    public void a(int i, WebPhoto webphoto)
    {
        if (itemView.getLayoutParams() instanceof android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)
        {
            webphoto = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)itemView.getLayoutParams();
            webphoto.setFullSpan(true);
            itemView.setLayoutParams(webphoto);
        }
        com.cardinalblue.android.piccollage.a.b.k(b.getPromotionId(), "explore");
        if (!TextUtils.isEmpty(b.getShowEvent()))
        {
            com.cardinalblue.android.piccollage.a.f.a(b.getShowEvent());
        }
        g.b(a).a(b.getBannerUrl()).a((ImageView)itemView);
    }
}
