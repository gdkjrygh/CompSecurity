// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;

public final class eks
    implements com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate
{

    private final elz a;
    private final com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate b;

    public eks(Context context)
    {
        a = new elz(context);
        b = PorcelainDefaultImageDelegate.a(context).a(com.spotify.mobile.android.porcelain.delegates.PorcelainDefaultImageDelegate.LoadPolicy.a);
    }

    public final void a(ImageView imageview)
    {
        a.a(imageview, null);
        b.a(imageview);
    }

    public final void a(ImageView imageview, PorcelainIcon porcelainicon)
    {
        b.a(imageview, porcelainicon);
    }

    public final void a(ImageView imageview, PorcelainImage porcelainimage, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize iconsize)
    {
        a(imageview, porcelainimage, dqh.a, imagesize, iconsize);
    }

    public final void a(ImageView imageview, PorcelainImage porcelainimage, dqh dqh1, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize imagesize, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize iconsize)
    {
        String s = porcelainimage.getUrl();
        if (!TextUtils.isEmpty(s) && s.startsWith("genreimage:"))
        {
            a.a(imageview, s.substring(11));
            return;
        } else
        {
            a.a(imageview, null);
            b.a(imageview, porcelainimage, dqh1, imagesize, iconsize);
            return;
        }
    }
}
