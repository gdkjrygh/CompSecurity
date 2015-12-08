// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view:
//            d

class a
    implements android.view..OnClickListener
{

    final d a;
    final d b;

    public void onClick(View view)
    {
        if (a.getVideoURI() != null)
        {
            b.a();
        }
    }

    (d d1, d d2)
    {
        b = d1;
        a = d2;
        super();
    }
}
