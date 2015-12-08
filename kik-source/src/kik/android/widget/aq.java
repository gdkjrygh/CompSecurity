// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.GridView;

// Referenced classes of package kik.android.widget:
//            GalleryWidget

final class aq
    implements Runnable
{

    final GalleryWidget a;

    aq(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final void run()
    {
        a._grid.setSelection(0);
    }
}
