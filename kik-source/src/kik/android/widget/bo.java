// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kik.g.p;
import com.kik.g.s;
import kik.android.gifs.a;
import kik.android.gifs.a.e;
import kik.android.gifs.a.f;
import kik.android.gifs.view.AspectRatioGifView;

// Referenced classes of package kik.android.widget:
//            GifWidget, bq, bp

final class bo
    implements GifWidget.b
{

    final GifWidget a;
    private f b;
    private Bitmap c;
    private String d;
    private int e;

    bo(GifWidget gifwidget)
    {
        a = gifwidget;
        super();
    }

    static Bitmap a(bo bo1, Bitmap bitmap)
    {
        bo1.c = bitmap;
        return bitmap;
    }

    static String a(bo bo1)
    {
        return bo1.d;
    }

    static int b(bo bo1)
    {
        return bo1.e;
    }

    static f c(bo bo1)
    {
        return bo1.b;
    }

    public final void a(f f1, int i, String s1)
    {
        e = i;
        d = s1;
        b = f1;
        kik.android.widget.GifWidget.a(a, false);
        a._previewImage.setVisibility(4);
        a._previewView.setVisibility(0);
        a._gifUseButton.setClickable(false);
        a._gifUseButton.setOnClickListener(this);
        a._rechooseButton.setOnClickListener(this);
        s1 = f1.c().b();
        a._previewImage.c(((Point) (s1)).x, ((Point) (s1)).y);
        s.a(a._previewImage.a(f1.c().a(), a.c), 2500L).a(new bq(this, f1));
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624233: 
            view = b.c();
            kik.android.f.a.f.a().a(view.c(), b, a.c, c).a(new bp(this));
            return;

        case 2131624232: 
            a._previewView.setVisibility(4);
            c = null;
            return;
        }
    }
}
