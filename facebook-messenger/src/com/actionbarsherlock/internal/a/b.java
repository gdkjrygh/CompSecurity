// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, c

class b
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != -1)
        {
            adapterview = com.actionbarsherlock.internal.a.a.a(a);
            if (adapterview != null)
            {
                c.a(adapterview, false);
            }
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
