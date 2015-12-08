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
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jv;
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
                return jv.equal(((a)obj).uri, uri);
            }
        }

        public int hashCode()
        {
            return jv.hashCode(new Object[] {
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

        private WeakReference LS;

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
            if (!flag3 || !(imageview instanceof jb)) goto _L2; else goto _L1
_L1:
            j = ((jb)imageview).hj();
            if (LL == 0 || j != LL) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = b(flag, flag1);
            if (LM && drawable != null)
            {
                drawable = drawable.getConstantState().newDrawable();
            }
            Object obj = drawable;
            if (flag)
            {
                obj = a(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(((Drawable) (obj)));
            if (imageview instanceof jb)
            {
                drawable = (jb)imageview;
                int i;
                if (flag2)
                {
                    imageview = LJ.uri;
                } else
                {
                    imageview = null;
                }
                drawable.g(imageview);
                if (flag3)
                {
                    i = LL;
                } else
                {
                    i = 0;
                }
                drawable.aB(i);
            }
            if (flag)
            {
                ((iz)obj).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)LS.get();
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
            obj = (ImageView)LS.get();
            obj1 = (ImageView)((b) (obj1)).LS.get();
            boolean flag;
            if (obj1 != null && obj != null && jv.equal(obj1, obj))
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
            je.f(imageview);
            LS = new WeakReference(imageview);
        }

        public b(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            je.f(imageview);
            LS = new WeakReference(imageview);
        }
    }

    public static final class c extends com.google.android.gms.common.images.a
    {

        private WeakReference LT;

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)LT.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(LJ.uri, drawable, flag2);
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
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)LT.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((c) (obj)).LT.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && jv.equal(onimageloadedlistener1, onimageloadedlistener) && jv.equal(((c) (obj)).LJ, LJ))
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
            return jv.hashCode(new Object[] {
                LJ
            });
        }

        public c(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            je.f(onimageloadedlistener);
            LT = new WeakReference(onimageloadedlistener);
        }
    }


    final a LJ;
    protected int LK;
    protected int LL;
    protected boolean LM;
    protected ImageManager.OnImageLoadedListener LN;
    private boolean LO;
    private boolean LP;
    private boolean LQ;
    protected int LR;

    public com.google.android.gms.common.images.a(Uri uri, int i)
    {
        LK = 0;
        LL = 0;
        LM = false;
        LO = true;
        LP = false;
        LQ = true;
        LJ = new a(uri);
        LL = i;
    }

    private Drawable a(Context context, jc jc1, int i)
    {
        Resources resources = context.getResources();
        if (LR > 0)
        {
            com.google.android.gms.internal.jc.a a1 = new com.google.android.gms.internal.jc.a(i, LR);
            Drawable drawable = (Drawable)jc1.get(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((LR & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                jc1.put(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return ja.a(resources, drawable);
    }

    protected iz a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof iz)
            {
                drawable2 = ((iz)drawable).hh();
            }
        } else
        {
            drawable2 = null;
        }
        return new iz(drawable2, drawable1);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        je.f(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((LR & 1) != 0)
        {
            bitmap1 = ja.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (LN != null)
        {
            LN.onImageLoaded(LJ.uri, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, jc jc1)
    {
        if (LQ)
        {
            Drawable drawable = null;
            if (LK != 0)
            {
                drawable = a(context, jc1, LK);
            }
            a(drawable, false, true, false);
        }
    }

    void a(Context context, jc jc1, boolean flag)
    {
        Drawable drawable = null;
        if (LL != 0)
        {
            drawable = a(context, jc1, LL);
        }
        if (LN != null)
        {
            LN.onImageLoaded(LJ.uri, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    public void az(int i)
    {
        LL = i;
    }

    protected boolean b(boolean flag, boolean flag1)
    {
        return LO && !flag1 && (!flag || LP);
    }
}
