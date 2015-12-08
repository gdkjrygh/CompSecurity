// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            PushAdActivity, r, b

final class p
    implements android.view.View.OnClickListener
{

    final r a;
    final PushAdActivity b;

    p(PushAdActivity pushadactivity, r r1)
    {
        b = pushadactivity;
        a = r1;
        super();
    }

    public final void onClick(View view)
    {
        if (!b.isFinishing())
        {
            view = b;
            r r1 = a;
            com.roidapp.cloudlib.ads.b.a(view, r.d(r1), r.b(r1), r.e(r1), false);
            PushAdActivity.a(b);
        }
    }
}
