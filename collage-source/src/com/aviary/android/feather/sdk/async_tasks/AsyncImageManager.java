// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.async_tasks;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.sdk.utils.c;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

class AsyncImageManager
{
    static abstract class MyRunnable
        implements Runnable
    {

        public SoftReference e;

        public MyRunnable(ImageView imageview)
        {
            e = new SoftReference(imageview);
        }
    }

    static class a
    {

        private final WeakReference a;

        public MyRunnable a()
        {
            return (MyRunnable)a.get();
        }

        public a(MyRunnable myrunnable)
        {
            a = new WeakReference(myrunnable);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/aviary/android/feather/sdk/async_tasks/AsyncImageManager$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("HIGH", 0);
            b = new b("LOW", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    static class c
    {

        public Bitmap a;
        public ImageView b;
        public final int c;

        public c(Bitmap bitmap, ImageView imageview, int i)
        {
            b = imageview;
            a = bitmap;
            c = i;
        }
    }


    private static com.aviary.android.feather.common.a.a.c f;
    ExecutorService a;
    ExecutorService b;
    private volatile Boolean c;
    private com.aviary.android.feather.sdk.utils.c d;
    private Handler e;

    static com.aviary.android.feather.common.a.a.c a()
    {
        return f;
    }

    static MyRunnable a(ImageView imageview)
    {
        return b(imageview);
    }

    static Boolean a(AsyncImageManager asyncimagemanager)
    {
        return asyncimagemanager.c;
    }

    private static MyRunnable b(ImageView imageview)
    {
        if (imageview != null)
        {
            imageview = ((ImageView) (imageview.getTag(com.aviary.android.feather.sdk.R.integer.aviary_asyncimagemanager_tag)));
            if (imageview instanceof a)
            {
                return ((a)imageview).a();
            }
        }
        return null;
    }

    static com.aviary.android.feather.sdk.utils.c b(AsyncImageManager asyncimagemanager)
    {
        return asyncimagemanager.d;
    }

    static Handler c(AsyncImageManager asyncimagemanager)
    {
        return asyncimagemanager.e;
    }

    public void a(Callable callable, String s, ImageView imageview, int i, b b1)
    {
        if (c.booleanValue())
        {
            return;
        }
        if (d != null)
        {
            d.b();
        }
        callable = new MyRunnable(imageview, s, i, callable) {

            final String a;
            final int b;
            final Callable c;
            final AsyncImageManager d;

            public void run()
            {
                MyRunnable myrunnable;
                if (!com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.a(d).booleanValue())
                {
                    if (equals(myrunnable = com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.a((ImageView)e.get())))
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
                            message.obj = new c(((Bitmap) (obj)), (ImageView)e.get(), b);
                        } else
                        {
                            ImageView imageview1;
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
                            imageview1 = (ImageView)e.get();
                            if (imageview1 != null)
                            {
                                if (equals(myrunnable))
                                {
                                    imageview1.setTag(com.aviary.android.feather.sdk.R.integer.aviary_asyncimagemanager_tag, null);
                                    message.what = 1;
                                    message.obj = new c(((Bitmap) (obj)), imageview1, b);
                                } else
                                {
                                    com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.a().c("image tag is different than current task!");
                                }
                            } else
                            {
                                com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.a().c("imageView null");
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

            
            {
                d = AsyncImageManager.this;
                a = s;
                b = i;
                c = callable;
                super(imageview);
            }
        };
        imageview.setTag(com.aviary.android.feather.sdk.R.integer.aviary_asyncimagemanager_tag, new a(callable));
        if (b1 == com.aviary.android.feather.sdk.async_tasks.b.a)
        {
            a.execute(callable);
            return;
        } else
        {
            b.execute(callable);
            return;
        }
    }

    static 
    {
        f = com.aviary.android.feather.common.a.a.a("AsyncImageManager", com.aviary.android.feather.common.a.a.d.a);
    }

    // Unreferenced inner class com/aviary/android/feather/sdk/async_tasks/AsyncImageManager$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final Callable a;
        final String b;
        final ImageView c;
        final int d;
        final b e;
        final AsyncImageManager f;

        public void run()
        {
            if (!com.aviary.android.feather.sdk.async_tasks.AsyncImageManager.a(f).booleanValue())
            {
                f.a(a, b, c, d, e);
            }
        }
    }

}
