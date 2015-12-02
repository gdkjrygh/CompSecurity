// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.share;

import android.view.View;

// Referenced classes of package com.facebook.orca.share:
//            ShareView, c

class b
    implements android.view.View.OnClickListener
{

    final ShareView a;

    b(ShareView shareview)
    {
        a = shareview;
        super();
    }

    public void onClick(View view)
    {
        if (ShareView.a(a) != null)
        {
            ShareView.a(a).a(ShareView.b(a));
        }
    }
}
