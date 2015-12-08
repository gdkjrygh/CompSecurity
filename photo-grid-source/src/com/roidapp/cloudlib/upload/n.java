// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            m

final class n
    implements Runnable
{

    final Bitmap a;
    final m b;

    n(m m1, Bitmap bitmap)
    {
        b = m1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        if (m.a(b).get() != null && a != null)
        {
            ImageView imageview = (ImageView)m.a(b).get();
            if (imageview != null)
            {
                imageview.setImageBitmap(a);
            }
        }
    }
}
