// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.kik.g.p;
import kik.android.chat.KikApplication;
import kik.android.util.ct;

// Referenced classes of package kik.android.widget:
//            GalleryWidget, aa, al, an, 
//            ao

final class ak
    implements android.widget.AdapterView.OnItemClickListener
{

    final GalleryWidget a;

    ak(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        GalleryWidget.d(a).moveToPosition(i);
        GalleryWidget.a(a);
        view = aa.b();
        adapterview = GalleryWidget.d(a).getString(GalleryWidget.d(a).getColumnIndexOrThrow("_data"));
        if (ct.a(adapterview))
        {
            try
            {
                l = GalleryWidget.d(a).getLong(GalleryWidget.d(a).getColumnIndexOrThrow("duration"));
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                Toast.makeText(GalleryWidget.e(a), KikApplication.f(0x7f0900a0), 0).show();
                return;
            }
            if (ct.a(adapterview, l))
            {
                view = (new kik.android.chat.fragment.VideoTrimmingFragment.a()).a(adapterview).a(l);
                view = a.a(view);
                GalleryWidget.a(a, adapterview, l, i, true);
                view.a(new al(this, l, i));
                return;
            } else
            {
                GalleryWidget.a(a, new an(this, adapterview, l, i));
                GalleryWidget.a(a, adapterview, l);
                return;
            }
        } else
        {
            GalleryWidget.a(a, new ao(this, i, view));
            GalleryWidget.b(a, adapterview);
            return;
        }
    }
}
