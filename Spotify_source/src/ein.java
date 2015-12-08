// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.squareup.picasso.Picasso;
import java.util.List;

public final class ein extends jz
{

    private final List b;
    private final Context c;
    private Drawable d;

    public ein(Context context, List list)
    {
        c = context;
        b = ImmutableList.a(list);
        d = dff.a(c);
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        ImageView imageview = new ImageView(c);
        imageview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        String s = ((Image)b.get(i)).uri;
        ((gft)dmz.a(gft)).a().a(s).a(d).a(imageview, null);
        viewgroup.addView(imageview);
        imageview.setTag(Integer.valueOf(i));
        return imageview;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (ImageView)obj;
        viewgroup.removeView(((View) (obj)));
        ((gft)dmz.a(gft)).a().a(obj);
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        return b.size();
    }
}
