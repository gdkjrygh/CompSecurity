// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video;

import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view.video:
//            a

class a
    implements android.view..OnClickListener
{

    final a a;
    final a b;

    public void onClick(View view)
    {
        if (a.getVideoURI() != null)
        {
            com.facebook.ads.internal.view.video.a.e(b);
        }
    }

    (a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }
}
