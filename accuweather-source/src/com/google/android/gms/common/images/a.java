// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.gu;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hl;
import java.lang.ref.WeakReference;

public abstract class com.google.android.gms.common.images.a
{
    static final class a
    {

        public final Uri uri;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                return hl.equal(((a)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return hl.hashCode(new Object[] {
                uri
            });
        }

        public a(Uri uri1)
        {
            uri = uri1;
        }
    }

    public static final class b extends com.google.android.gms.common.images.a
    {

        private WeakReference Fp;

        private void a(ImageView imageview, Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            boolean flag3;
            int j;
            if (!flag1 && !flag2)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (!flag3 || !(imageview instanceof gw)) goto _L2; else goto _L1
_L1:
            j = ((gw)imageview).fd();
            if (Fl == 0 || j != Fl) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = b(flag, flag1);
            if (flag)
            {
                drawable = a(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(drawable);
            if (imageview instanceof gw)
            {
                gw gw1 = (gw)imageview;
                int i;
                if (flag2)
                {
                    imageview = Fj.uri;
                } else
                {
                    imageview = null;
                }
                gw1.f(imageview);
                if (flag3)
                {
                    i = Fl;
                } else
                {
                    i = 0;
                }
                gw1.al(i);
            }
            if (flag)
            {
                ((gu)drawable).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)Fp.get();
            if (imageview != null)
            {
                a(imageview, drawable, flag, flag1, flag2);
            }
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            Object obj1 = (b)obj;
            obj = (ImageView)Fp.get();
            obj1 = (ImageView)((b) (obj1)).Fp.get();
            boolean flag;
            if (obj1 != null && obj != null && hl.equal(obj1, obj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public int hashCode()
        {
            return 0;
        }

        public b(ImageView imageview, int i)
        {
            super(null, i);
            gy.c(imageview);
            Fp = new WeakReference(imageview);
        }

        public b(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            gy.c(imageview);
            Fp = new WeakReference(imageview);
        }
    }

    public static final class c extends com.google.android.gms.common.images.a
    {

        private WeakReference Fq;

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)Fq.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(Fj.uri, drawable, flag2);
                }
            }
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (c)obj;
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)Fq.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((c) (obj)).Fq.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && hl.equal(onimageloadedlistener1, onimageloadedlistener) && hl.equal(((c) (obj)).Fj, Fj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public int hashCode()
        {
            return hl.hashCode(new Object[] {
                Fj
            });
        }

        public c(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            gy.c(onimageloadedlistener);
            Fq = new WeakReference(onimageloadedlistener);
        }
    }


    final a Fj;
    protected int Fk;
    protected int Fl;
    private boolean Fm;
    private boolean Fn;
    protected int Fo;

    public com.google.android.gms.common.images.a(Uri uri, int i)
    {
        Fk = 0;
        Fl = 0;
        Fm = true;
        Fn = false;
        Fj = new a(uri);
        Fl = i;
    }

    private Drawable a(Context context, gx gx1, int i)
    {
        Resources resources = context.getResources();
        if (Fo > 0)
        {
            com.google.android.gms.internal.gx.a a1 = new com.google.android.gms.internal.gx.a(i, Fo);
            Drawable drawable = (Drawable)gx1.get(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((Fo & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                gx1.put(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return gv.a(resources, drawable);
    }

    protected gu a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof gu)
            {
                drawable2 = ((gu)drawable).fb();
            }
        } else
        {
            drawable2 = null;
        }
        return new gu(drawable2, drawable1);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        gy.c(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((Fo & 1) != 0)
        {
            bitmap1 = gv.a(bitmap);
        }
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap1))), flag, false, true);
    }

    void a(Context context, gx gx1)
    {
        Drawable drawable = null;
        if (Fk != 0)
        {
            drawable = a(context, gx1, Fk);
        }
        a(drawable, false, true, false);
    }

    void a(Context context, gx gx1, boolean flag)
    {
        Drawable drawable = null;
        if (Fl != 0)
        {
            drawable = a(context, gx1, Fl);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    public void aj(int i)
    {
        Fl = i;
    }

    protected boolean b(boolean flag, boolean flag1)
    {
        return Fm && !flag1 && (!flag || Fn);
    }
}
