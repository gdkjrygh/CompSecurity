// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.widget.ImageView:
//            FlashRemoteImageView

class a
    implements com.nineoldandroids.a.teImageView._cls1
{

    final FlashRemoteImageView a;

    public void a(o o1)
    {
        FlashRemoteImageView.a(a, ((Integer)o1.o()).intValue());
        a.invalidate();
    }

    (FlashRemoteImageView flashremoteimageview)
    {
        a = flashremoteimageview;
        super();
    }
}
