// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.arist.activity:
//            MainActivity

final class ae
    implements android.widget.AdapterView.OnItemClickListener
{

    final MainActivity a;

    ae(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.c = i;
        MainActivity.d(a);
    }
}
