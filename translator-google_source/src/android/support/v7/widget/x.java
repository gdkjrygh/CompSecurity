// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

final class x
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final ListPopupWindow a;

    x(ListPopupWindow listpopupwindow)
    {
        a = listpopupwindow;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != -1)
        {
            adapterview = ListPopupWindow.a(a);
            if (adapterview != null)
            {
                ListPopupWindow.DropDownListView.a(adapterview, false);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
