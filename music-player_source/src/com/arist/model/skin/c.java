// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.model.skin:
//            b

final class c
    implements android.widget.AdapterView.OnItemClickListener
{

    final b a;
    private final int b[];
    private final AlertDialog c;

    c(b b1, int ai[], AlertDialog alertdialog)
    {
        a = b1;
        b = ai;
        c = alertdialog;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = a;
        int j = b[i];
        MyApplication.e.f(j);
        a.a(b[i]);
        c.dismiss();
    }
}
