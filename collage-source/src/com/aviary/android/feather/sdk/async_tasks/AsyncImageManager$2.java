// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import com.aviary.android.feather.sdk.utils.c;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;

// Referenced classes of package com.aviary.android.feather.sdk.async_tasks:
//            AsyncImageManager

class Runnable extends Runnable
{

    final String a;
    final int b;
    final Callable c;
    final AsyncImageManager d;

    public void run()
    {
        Runnable runnable;
        if (!AsyncImageManager.a(d).booleanValue())
        {
            if (equals(runnable = AsyncImageManager.a((ImageView)e.get())))
            {
                Message message = Message.obtain();
                Object obj;
                if (AsyncImageManager.b(d) != null)
                {
                    obj = AsyncImageManager.b(d).a(a);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    message.what = 1;
                    message.obj = new <init>(((Bitmap) (obj)), (ImageView)e.get(), b);
                } else
                {
                    ImageView imageview;
                    try
                    {
                        obj = (Bitmap)c.call();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((Exception) (obj)).printStackTrace();
                        return;
                    }
                    if (obj != null && AsyncImageManager.b(d) != null)
                    {
                        AsyncImageManager.b(d).a(a, ((Bitmap) (obj)));
                    }
                    imageview = (ImageView)e.get();
                    if (imageview != null)
                    {
                        if (equals(runnable))
                        {
                            imageview.setTag(com.aviary.android.feather.sdk.ncimagemanager_tag, null);
                            message.what = 1;
                            message.obj = new <init>(((Bitmap) (obj)), imageview, b);
                        } else
                        {
                            AsyncImageManager.a().a("image tag is different than current task!");
                        }
                    } else
                    {
                        AsyncImageManager.a().a("imageView null");
                    }
                }
                if (message.what == 1 && com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.c(d) != null)
                {
                    com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.c(d).sendMessage(message);
                    return;
                }
            }
        }
    }

    Runnable(AsyncImageManager asyncimagemanager, ImageView imageview, String s, int i, Callable callable)
    {
        d = asyncimagemanager;
        a = s;
        b = i;
        c = callable;
        super(imageview);
    }
}
