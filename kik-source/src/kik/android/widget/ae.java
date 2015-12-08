// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import android.widget.AdapterView;
import com.kik.android.a;

// Referenced classes of package kik.android.widget:
//            GalleryWidget, aa

final class ae
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final GalleryWidget a;

    ae(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (GalleryWidget.b(a))
        {
            GalleryWidget.c(a);
            return;
        } else
        {
            adapterview = (String)kik.android.widget.GalleryWidget.a(a).getItem(i);
            kik.android.widget.GalleryWidget.a(a, adapterview);
            a.c.b("Album Switched").a("Album List Size", kik.android.widget.GalleryWidget.a(a).getCount()).a("Is Recent", adapterview.equals(GalleryWidget.d())).a("Album Name", adapterview).b();
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        kik.android.widget.GalleryWidget.a(a, GalleryWidget.d());
    }
}
