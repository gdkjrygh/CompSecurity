// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.orca.threadlist:
//            m

class n
    implements android.widget.AdapterView.OnItemClickListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        m.a(a, i);
    }
}
