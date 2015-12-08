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
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.ey;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fo;
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
                return fo.equal(((a)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return fo.hashCode(new Object[] {
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

        private WeakReference Cs;

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
            if (!flag3 || !(imageview instanceof ez)) goto _L2; else goto _L1
_L1:
            j = ((ez)imageview).eB();
            if (Co == 0 || j != Co) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = b(flag, flag1);
            if (flag)
            {
                drawable = a(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(drawable);
            if (imageview instanceof ez)
            {
                ez ez1 = (ez)imageview;
                int i;
                if (flag2)
                {
                    imageview = Cm.uri;
                } else
                {
                    imageview = null;
                }
                ez1.e(imageview);
                if (flag3)
                {
                    i = Co;
                } else
                {
                    i = 0;
                }
                ez1.L(i);
            }
            if (flag)
            {
                ((ex)drawable).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)Cs.get();
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
            obj = (ImageView)Cs.get();
            obj1 = (ImageView)((b) (obj1)).Cs.get();
            boolean flag;
            if (obj1 != null && obj != null && fo.equal(obj1, obj))
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
            fb.d(imageview);
            Cs = new WeakReference(imageview);
        }

        public b(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            fb.d(imageview);
            Cs = new WeakReference(imageview);
        }
    }

    public static final class c extends com.google.android.gms.common.images.a
    {

        private WeakReference Ct;

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)Ct.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(Cm.uri, drawable, flag2);
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
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)Ct.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((c) (obj)).Ct.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && fo.equal(onimageloadedlistener1, onimageloadedlistener) && fo.equal(((c) (obj)).Cm, Cm))
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
            return fo.hashCode(new Object[] {
                Cm
            });
        }

        public c(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            fb.d(onimageloadedlistener);
            Ct = new WeakReference(onimageloadedlistener);
        }
    }


    final a Cm;
    protected int Cn;
    protected int Co;
    private boolean Cp;
    private boolean Cq;
    protected int Cr;

    public com.google.android.gms.common.images.a(Uri uri, int i)
    {
        Cn = 0;
        Co = 0;
        Cp = true;
        Cq = false;
        Cm = new a(uri);
        Co = i;
    }

    private Drawable a(Context context, fa fa1, int i)
    {
        Resources resources = context.getResources();
        if (Cr > 0)
        {
            com.google.android.gms.internal.fa.a a1 = new com.google.android.gms.internal.fa.a(i, Cr);
            Drawable drawable = (Drawable)fa1.get(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((Cr & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                fa1.put(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    public void J(int i)
    {
        Co = i;
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return ey.a(resources, drawable);
    }

    protected ex a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof ex)
            {
                drawable2 = ((ex)drawable).ez();
            }
        } else
        {
            drawable2 = null;
        }
        return new ex(drawable2, drawable1);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        fb.d(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((Cr & 1) != 0)
        {
            bitmap1 = ey.a(bitmap);
        }
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap1))), flag, false, true);
    }

    void a(Context context, fa fa1)
    {
        Drawable drawable = null;
        if (Cn != 0)
        {
            drawable = a(context, fa1, Cn);
        }
        a(drawable, false, true, false);
    }

    void a(Context context, fa fa1, boolean flag)
    {
        Drawable drawable = null;
        if (Co != 0)
        {
            drawable = a(context, fa1, Co);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    protected boolean b(boolean flag, boolean flag1)
    {
        return Cp && !flag1 && (!flag || Cq);
    }
}
