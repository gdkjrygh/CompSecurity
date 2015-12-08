// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.microsoft.advertising.android:
//            ar

static final class b extends Handler
{

    private final WeakReference a;
    private final WeakReference b;

    public final void handleMessage(Message message)
    {
        ar ar1;
label0:
        {
            message = (Bitmap)message.obj;
            ImageView imageview = (ImageView)a.get();
            ar1 = (ar)b.get();
            if (imageview != null && ar1 != null)
            {
                if (message == null)
                {
                    break label0;
                }
                imageview.setImageBitmap(message);
                ar1.r();
            }
            return;
        }
        ar1.a(null, 2);
    }

    (ImageView imageview, ar ar1)
    {
        super(Looper.getMainLooper());
        a = new WeakReference(imageview);
        b = new WeakReference(ar1);
    }
}
