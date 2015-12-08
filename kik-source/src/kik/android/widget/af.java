// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.kik.android.a;
import com.kik.g.p;
import kik.android.chat.KikApplication;
import kik.android.util.KikSpinner;
import kik.android.util.ct;

// Referenced classes of package kik.android.widget:
//            GalleryWidget, ag, aa, ai

final class af
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final GalleryWidget a;

    af(GalleryWidget gallerywidget)
    {
        a = gallerywidget;
        super();
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag1 = false;
        GalleryWidget.d(a).moveToPosition(i);
        adapterview = GalleryWidget.d(a).getString(GalleryWidget.d(a).getColumnIndexOrThrow("_data"));
        if (ct.a(adapterview))
        {
            try
            {
                l = GalleryWidget.d(a).getLong(GalleryWidget.d(a).getColumnIndexOrThrow("duration"));
                view = (new kik.android.chat.fragment.VideoTrimmingFragment.a()).a(adapterview).a(l);
                view = a.a(view);
                kik.android.widget.GalleryWidget.a(a, adapterview, l, i, false);
                view.a(new ag(this, l, i));
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                Toast.makeText(GalleryWidget.e(a), KikApplication.f(0x7f0900a0), 0).show();
                return true;
            }
            return true;
        }
        view = new kik.android.chat.fragment.ViewPictureFragment.a();
        view.c(adapterview).b(adapterview).e();
        adapterview = a.a(view);
        view = a.c.b("Photo Preview Opened").a("Index", i);
        kik.android.widget.GalleryWidget.a(a);
        view = view.a("Is Recent", aa.b().equals(GalleryWidget.d()));
        boolean flag;
        if (a._folderDropdown.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = view.a("Is Maximized", flag);
        flag = flag1;
        if (GalleryWidget.e(a).getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        }
        view.a("Is Landscape", flag).b();
        adapterview.a(new ai(this, i));
        return true;
    }
}
