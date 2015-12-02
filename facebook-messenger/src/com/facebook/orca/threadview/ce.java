// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.ui.images.base.b;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewImageAttachmentView

class ce extends b
{

    final b a;
    final int b;
    final ThreadViewImageAttachmentView c;

    ce(ThreadViewImageAttachmentView threadviewimageattachmentview, b b1, int i)
    {
        c = threadviewimageattachmentview;
        a = b1;
        b = i;
        super();
    }

    public Bitmap a(Bitmap bitmap)
    {
        bitmap = a.a(bitmap);
        android.graphics.drawable.Drawable drawable = c.getResources().getDrawable(b);
        return ThreadViewImageAttachmentView.a(c, bitmap, drawable);
    }

    public String a()
    {
        return (new StringBuilder()).append("tviatv_").append(a.a()).append("_").append(b).toString();
    }
}
