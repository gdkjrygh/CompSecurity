// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.gifs.a.e;
import kik.android.gifs.a.f;
import kik.android.gifs.view.AspectRatioGifView;
import kik.android.gifs.view.a;

// Referenced classes of package kik.android.widget:
//            bo, GifWidget, br

final class bq extends r
{

    final f a;
    final bo b;

    bq(bo bo1, f f1)
    {
        b = bo1;
        a = f1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        b.a._gifUseButton.setClickable(true);
        if (obj != null && ((a) (obj)).getNumberOfFrames() > 0)
        {
            kik.android.widget.bo.a(b, ((BitmapDrawable)((a) (obj)).getFrame(0)).getBitmap());
        }
    }

    public final void a(Throwable throwable)
    {
        b.a._previewImage.a(a.a(kik.android.gifs.a.f.a.d).a(), kik.android.gifs.a.c).a(new br(this));
    }
}
