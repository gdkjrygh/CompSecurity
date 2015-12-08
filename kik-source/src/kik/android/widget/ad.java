// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.MotionEvent;
import android.view.View;
import com.kik.android.a;

// Referenced classes of package kik.android.widget:
//            GalleryWidget, aa

final class ad
    implements android.view.View.OnTouchListener
{

    final GalleryWidget a;

    ad(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            a.c.b("Album Switcher Opened").a("Album List Size", kik.android.widget.GalleryWidget.a(a).getCount()).b();
        }
        return false;
    }
}
