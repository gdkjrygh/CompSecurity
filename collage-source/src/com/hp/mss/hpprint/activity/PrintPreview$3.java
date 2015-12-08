// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.activity;

import android.view.View;
import android.widget.AdapterView;
import com.hp.mss.hpprint.model.PrintItem;
import com.hp.mss.hpprint.model.PrintJobData;
import com.hp.mss.hpprint.util.f;
import com.hp.mss.hpprint.view.PagePreviewView;
import java.util.HashMap;

// Referenced classes of package com.hp.mss.hpprint.activity:
//            PrintPreview

class a
    implements android.widget.temSelectedListener
{

    final PrintPreview a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.c = (String)adapterview.getItemAtPosition(i);
        adapterview = a.b.a((android.print..MediaSize)a.a.get(a.c));
        boolean flag;
        if (adapterview != null && adapterview.a() != null)
        {
            if (a.c == "4 x 5")
            {
                PrintPreview.a(a, 4F);
                PrintPreview.b(a, 5F);
            } else
            {
                PrintPreview.a(a, (float)adapterview.a().getWidthMils() / 1000F);
                PrintPreview.b(a, (float)adapterview.a().getHeightMils() / 1000F);
            }
        } else
        {
            adapterview = a.b.b();
            view = (android.print..MediaSize)a.a.get(a.c);
            if (a.c == "4 x 5")
            {
                PrintPreview.a(a, 4F);
                PrintPreview.b(a, 5F);
            } else
            {
                PrintPreview.a(a, (float)view.getWidthMils() / 1000F);
                PrintPreview.b(a, (float)view.getHeightMils() / 1000F);
            }
        }
        PrintPreview.c(a).a(PrintPreview.a(a), PrintPreview.b(a));
        (new com.hp.mss.hpprint.view..a(a)).execute(new com.hp.mss.hpprint.view..b[] {
            new com.hp.mss.hpprint.view..b(adapterview, PrintPreview.c(a))
        });
        if (PrintPreview.b(a) == 5F && PrintPreview.a(a) == 4F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f.b = flag;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    stener(PrintPreview printpreview)
    {
        a = printpreview;
        super();
    }
}
