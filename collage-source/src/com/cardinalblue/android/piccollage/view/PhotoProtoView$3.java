// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import com.cardinalblue.android.piccollage.controller.k;
import com.cardinalblue.android.piccollage.view.b.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            PhotoProtoView, k

class a extends b
{

    final int a;
    final PhotoProtoView b;

    public void a()
    {
        super.a();
        if (f == PhotoProtoView.a(b).d())
        {
            PhotoProtoView.a(b).e();
        }
        f.e(false);
        com.cardinalblue.android.piccollage.view.PhotoProtoView.b(b).a(f, a);
        b.postInvalidate();
        super.a();
    }

    (PhotoProtoView photoprotoview, com.cardinalblue.android.piccollage.view.k k1, PhotoProtoView photoprotoview1, int i)
    {
        b = photoprotoview;
        a = i;
        super(k1, photoprotoview1);
    }
}
