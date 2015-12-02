// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.widget.ImageView:
//            FlashRemoteImageView

class a extends b
{

    final FlashRemoteImageView a;

    public void a(a a1)
    {
        super.a(a1);
        a.b = true;
        com.qihoo.security.widget.ImageView.FlashRemoteImageView.a(a, 0);
        a.invalidate();
    }

    public void b(a a1)
    {
        super.b(a1);
        a.b = false;
        a.invalidate();
    }

    (FlashRemoteImageView flashremoteimageview)
    {
        a = flashremoteimageview;
        super();
    }
}
