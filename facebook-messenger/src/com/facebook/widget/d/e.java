// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.d;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.widget.d:
//            b, c, a

class e
    implements android.widget.AdapterView.OnItemClickListener
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (b)view.getTag();
        a.b();
        if (c.b(a) != null)
        {
            c.a(a, adapterview.b());
            c.b(a).a(adapterview);
        }
    }
}
