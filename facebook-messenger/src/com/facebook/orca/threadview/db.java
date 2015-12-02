// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.orca.threadview:
//            ac, ThreadViewMessageFragment

class db
    implements android.widget.AdapterView.OnItemClickListener
{

    final ThreadViewMessageFragment a;

    db(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
        if (adapterview instanceof ac)
        {
            ThreadViewMessageFragment.a(a, (ac)adapterview);
        }
    }
}
