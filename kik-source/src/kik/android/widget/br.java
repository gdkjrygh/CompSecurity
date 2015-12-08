// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.kik.g.r;
import kik.android.gifs.view.a;

// Referenced classes of package kik.android.widget:
//            bq, bo, GifWidget

final class br extends r
{

    final bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        a.b.a._gifUseButton.setClickable(true);
        if (((a) (obj)).getNumberOfFrames() > 0)
        {
            kik.android.widget.bo.a(a.b, ((BitmapDrawable)((a) (obj)).getFrame(0)).getBitmap());
        }
    }

    public final void a(Throwable throwable)
    {
        kik.android.widget.GifWidget.a(a.b.a, true);
    }
}
