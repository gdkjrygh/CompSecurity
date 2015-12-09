// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.activities.MainActivity;

// Referenced classes of package com.jcp.adapters:
//            cn

class co
    implements android.view.View.OnClickListener
{

    final int a;
    final cn b;

    co(cn cn1, int i)
    {
        b = cn1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (cn.a(b) != null && a < b.getCount())
        {
            cn.a(b).a((String)b.getItem(a));
        }
    }
}
