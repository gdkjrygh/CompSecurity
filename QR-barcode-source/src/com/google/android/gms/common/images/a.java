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
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.iz;
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
                return n.equal(((a)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return n.hashCode(new Object[] {
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

        private WeakReference KO;

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
            if (!flag3 || !(imageview instanceof iy)) goto _L2; else goto _L1
_L1:
            j = ((iy)imageview).gM();
            if (KJ == 0 || j != KJ) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = b(flag, flag1);
            if (flag)
            {
                drawable = a(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(drawable);
            if (imageview instanceof iy)
            {
                iy iy1 = (iy)imageview;
                int i;
                if (flag2)
                {
                    imageview = KH.uri;
                } else
                {
                    imageview = null;
                }
                iy1.g(imageview);
                if (flag3)
                {
                    i = KJ;
                } else
                {
                    i = 0;
                }
                iy1.ay(i);
            }
            if (flag)
            {
                ((iw)drawable).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)KO.get();
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
            obj = (ImageView)KO.get();
            obj1 = (ImageView)((b) (obj1)).KO.get();
            boolean flag;
            if (obj1 != null && obj != null && n.equal(obj1, obj))
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
            com.google.android.gms.common.internal.a.f(imageview);
            KO = new WeakReference(imageview);
        }

        public b(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.a.f(imageview);
            KO = new WeakReference(imageview);
        }
    }

    public static final class c extends com.google.android.gms.common.images.a
    {

        private WeakReference KP;

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)KP.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(KH.uri, drawable, flag2);
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
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)KP.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((c) (obj)).KP.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && n.equal(onimageloadedlistener1, onimageloadedlistener) && n.equal(((c) (obj)).KH, KH))
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
            return n.hashCode(new Object[] {
                KH
            });
        }

        public c(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.a.f(onimageloadedlistener);
            KP = new WeakReference(onimageloadedlistener);
        }
    }


    final a KH;
    protected int KI;
    protected int KJ;
    protected ImageManager.OnImageLoadedListener KK;
    private boolean KL;
    private boolean KM;
    protected int KN;

    public com.google.android.gms.common.images.a(Uri uri, int i)
    {
        KI = 0;
        KJ = 0;
        KL = true;
        KM = false;
        KH = new a(uri);
        KJ = i;
    }

    private Drawable a(Context context, iz iz1, int i)
    {
        Resources resources = context.getResources();
        if (KN > 0)
        {
            com.google.android.gms.internal.iz.a a1 = new com.google.android.gms.internal.iz.a(i, KN);
            Drawable drawable = (Drawable)iz1.get(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((KN & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                iz1.put(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return ix.a(resources, drawable);
    }

    protected iw a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof iw)
            {
                drawable2 = ((iw)drawable).gK();
            }
        } else
        {
            drawable2 = null;
        }
        return new iw(drawable2, drawable1);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.a.f(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((KN & 1) != 0)
        {
            bitmap1 = ix.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (KK != null)
        {
            KK.onImageLoaded(KH.uri, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, iz iz1)
    {
        Drawable drawable = null;
        if (KI != 0)
        {
            drawable = a(context, iz1, KI);
        }
        a(drawable, false, true, false);
    }

    void a(Context context, iz iz1, boolean flag)
    {
        Drawable drawable = null;
        if (KJ != 0)
        {
            drawable = a(context, iz1, KJ);
        }
        if (KK != null)
        {
            KK.onImageLoaded(KH.uri, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    public void aw(int i)
    {
        KJ = i;
    }

    protected boolean b(boolean flag, boolean flag1)
    {
        return KL && !flag1 && (!flag || KM);
    }
}
