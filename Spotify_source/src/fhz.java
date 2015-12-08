// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class fhz
{

    public SpotifyIcon a;
    public FrameLayout b;
    public int c;
    public boolean d;
    private Context e;
    private Drawable f;

    public fhz(Context context)
    {
        e = context;
    }

    public final FrameLayout a()
    {
        ctz.a(a);
        ImageView imageview;
        Object obj;
        boolean flag;
        if (c > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        ctz.a(f);
        ctz.a(b);
        obj = new dfz(e, a);
        ((dfz) (obj)).a(gcg.c(e, 0x7f0f015f));
        imageview = new ImageView(e);
        imageview.setId(0x7f110115);
        imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageview.setImageDrawable(((Drawable) (obj)));
        obj = new android.widget.FrameLayout.LayoutParams(c, c);
        if (d)
        {
            obj.gravity = 0x800055;
            int i = e.getResources().getDimensionPixelSize(0x7f0c0143);
            imageview.setTranslationX(i);
            imageview.setTranslationY(i);
        } else
        {
            obj.gravity = 17;
        }
        imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        b.addView(imageview);
        dgo.a(b, f);
        return b;
    }

    public final fhz a(int i)
    {
        f = gcg.a(e, i);
        return this;
    }
}
