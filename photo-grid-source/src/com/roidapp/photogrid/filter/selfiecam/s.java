// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            v, o

final class s
    implements android.widget.AdapterView.OnItemClickListener
{

    final v a;
    final PopupWindow b;
    final o c;

    s(o o, v v1, PopupWindow popupwindow)
    {
        c = o;
        a = v1;
        b = popupwindow;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.b(i);
        b.dismiss();
    }
}
