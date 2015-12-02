// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.View;

// Referenced classes of package com.facebook.orca.chatheads:
//            ca, cd

class cb
    implements android.view.View.OnClickListener
{

    final ca a;

    cb(ca ca1)
    {
        a = ca1;
        super();
    }

    public void onClick(View view)
    {
        if (ca.a(a) != null)
        {
            ca.a(a).a("click_popupspace");
        }
    }
}
