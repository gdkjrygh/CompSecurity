// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.jcp.e.ab;

final class bd
    implements android.widget.AdapterView.OnItemClickListener
{

    final PopupWindow a;
    final ab b;

    bd(PopupWindow popupwindow, ab ab1)
    {
        a = popupwindow;
        b = ab1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.dismiss();
        b.a(i + 1);
    }
}
