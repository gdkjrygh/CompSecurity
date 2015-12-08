// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import com.kik.android.a;
import com.kik.cards.web.bf;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.widget:
//            WebTrayWidget

final class ep
    implements android.widget.AdapterView.OnItemClickListener
{

    final WebTrayWidget.a a;

    ep(WebTrayWidget.a a1)
    {
        a = a1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (a.getItem(i)));
        if (adapterview instanceof kik.android.b.ac.a)
        {
            adapterview = (kik.android.b.ac.a)adapterview;
            if ("https://stickers.kik.com/".equals(adapterview.b()))
            {
                a.a.b.b("Sticker Store Opened").a("Source", "From Media Tray").b();
            }
            com.kik.android.a.f f = a.a.b.b("Media Tray Item Clicked").a("App Type", "Card").a("Card URL", adapterview.b()).a("Index", i).a("Is Maximized", kik.android.widget.WebTrayWidget.a(a.a));
            boolean flag;
            if (view.getContext().getResources().getConfiguration().orientation == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f.a("Is Landscape", flag).b();
            a.a.b.b("Browser Screen Opened").a("Reason", "Media Tray").a("URL", adapterview.b()).a("Domain", bf.i(adapterview.b())).a("Depth", k.e()).b();
            kik.android.widget.WebTrayWidget.a(a.a, adapterview.b(), i);
        }
    }
}
