// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.View;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, ak, ag

class az
    implements android.view.View.OnClickListener
{

    final al a;

    az(al al1)
    {
        a = al1;
        super();
    }

    public void onClick(View view)
    {
        if (!al.l(a))
        {
            return;
        } else
        {
            view = al.D(a).a(0).getThreadViewSpec();
            al.a(a, view, "bubble_click");
            return;
        }
    }
}
