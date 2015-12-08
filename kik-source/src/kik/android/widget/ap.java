// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.Toast;

// Referenced classes of package kik.android.widget:
//            GalleryWidget

final class ap
    implements Runnable
{

    final GalleryWidget a;

    ap(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final void run()
    {
        Toast.makeText(GalleryWidget.e(a), GalleryWidget.b(0x7f0900a0), 0).show();
    }
}
