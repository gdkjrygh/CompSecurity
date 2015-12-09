// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.android.widget.popupmenu:
//            ListPopupWindow

class a
    implements android.widget.SelectedListener
{

    final ListPopupWindow a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != -1)
        {
            adapterview = ListPopupWindow.a(a);
            if (adapterview != null)
            {
                a(adapterview, false);
            }
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    er(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }
}
