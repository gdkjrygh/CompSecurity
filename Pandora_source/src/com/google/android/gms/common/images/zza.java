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
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzhd;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhg;
import java.lang.ref.WeakReference;

public abstract class zza
{
    static final class a
    {

        public final Uri a;

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
                return zzu.equal(((a)obj).a, a);
            }
        }

        public int hashCode()
        {
            return zzu.hashCode(new Object[] {
                a
            });
        }

        public a(Uri uri)
        {
            a = uri;
        }
    }

    public static final class zzb extends zza
    {

        private WeakReference zzSp;

        private void zza(ImageView imageview, Drawable drawable, boolean flag, boolean flag1, boolean flag2)
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
            if (!flag3 || !(imageview instanceof zzhf)) goto _L2; else goto _L1
_L1:
            j = ((zzhf)imageview).zzlC();
            if (zzSi == 0 || j != zzSi) goto _L2; else goto _L3
_L3:
            return;
_L2:
            flag = zzb(flag, flag1);
            if (zzSj && drawable != null)
            {
                drawable = drawable.getConstantState().newDrawable();
            }
            Object obj = drawable;
            if (flag)
            {
                obj = zza(imageview.getDrawable(), drawable);
            }
            imageview.setImageDrawable(((Drawable) (obj)));
            if (imageview instanceof zzhf)
            {
                drawable = (zzhf)imageview;
                int i;
                if (flag2)
                {
                    imageview = zzSg.a;
                } else
                {
                    imageview = null;
                }
                drawable.zzi(imageview);
                if (flag3)
                {
                    i = zzSi;
                } else
                {
                    i = 0;
                }
                drawable.zzaK(i);
            }
            if (flag)
            {
                ((zzhd)obj).startTransition(250);
                return;
            }
            if (true) goto _L3; else goto _L4
_L4:
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zzb))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            Object obj1 = (zzb)obj;
            obj = (ImageView)zzSp.get();
            obj1 = (ImageView)((zzb) (obj1)).zzSp.get();
            boolean flag;
            if (obj1 != null && obj != null && zzu.equal(obj1, obj))
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

        protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            ImageView imageview = (ImageView)zzSp.get();
            if (imageview != null)
            {
                zza(imageview, drawable, flag, flag1, flag2);
            }
        }

        public zzb(ImageView imageview, int i)
        {
            super(null, i);
            com.google.android.gms.common.internal.zzb.zzn(imageview);
            zzSp = new WeakReference(imageview);
        }

        public zzb(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzn(imageview);
            zzSp = new WeakReference(imageview);
        }
    }

    public static final class zzc extends zza
    {

        private WeakReference zzSq;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zzc))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (zzc)obj;
            ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzSq.get();
            ImageManager.OnImageLoadedListener onimageloadedlistener1 = (ImageManager.OnImageLoadedListener)((zzc) (obj)).zzSq.get();
            boolean flag;
            if (onimageloadedlistener1 != null && onimageloadedlistener != null && zzu.equal(onimageloadedlistener1, onimageloadedlistener) && zzu.equal(((zzc) (obj)).zzSg, zzSg))
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
            return zzu.hashCode(new Object[] {
                zzSg
            });
        }

        protected void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.OnImageLoadedListener onimageloadedlistener = (ImageManager.OnImageLoadedListener)zzSq.get();
                if (onimageloadedlistener != null)
                {
                    onimageloadedlistener.onImageLoaded(zzSg.a, drawable, flag2);
                }
            }
        }

        public zzc(ImageManager.OnImageLoadedListener onimageloadedlistener, Uri uri)
        {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzn(onimageloadedlistener);
            zzSq = new WeakReference(onimageloadedlistener);
        }
    }


    final a zzSg;
    protected int zzSh;
    protected int zzSi;
    protected boolean zzSj;
    protected ImageManager.OnImageLoadedListener zzSk;
    private boolean zzSl;
    private boolean zzSm;
    private boolean zzSn;
    protected int zzSo;

    public zza(Uri uri, int i)
    {
        zzSh = 0;
        zzSi = 0;
        zzSj = false;
        zzSl = true;
        zzSm = false;
        zzSn = true;
        zzSg = new a(uri);
        zzSi = i;
    }

    private Drawable zza(Context context, zzhg zzhg1, int i)
    {
        Resources resources = context.getResources();
        if (zzSo > 0)
        {
            com.google.android.gms.internal.zzhg.zza zza1 = new com.google.android.gms.internal.zzhg.zza(i, zzSo);
            Drawable drawable = (Drawable)zzhg1.get(zza1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((zzSo & 1) != 0)
                {
                    context = zza(resources, drawable1);
                }
                zzhg1.put(zza1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable zza(Resources resources, Drawable drawable)
    {
        return zzhe.zza(resources, drawable);
    }

    protected zzhd zza(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof zzhd)
            {
                drawable2 = ((zzhd)drawable).zzlA();
            }
        } else
        {
            drawable2 = null;
        }
        return new zzhd(drawable2, drawable1);
    }

    void zza(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.zzb.zzn(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((zzSo & 1) != 0)
        {
            bitmap1 = zzhe.zza(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (zzSk != null)
        {
            zzSk.onImageLoaded(zzSg.a, context, true);
        }
        zza(((Drawable) (context)), flag, false, true);
    }

    void zza(Context context, zzhg zzhg1)
    {
        if (zzSn)
        {
            Drawable drawable = null;
            if (zzSh != 0)
            {
                drawable = zza(context, zzhg1, zzSh);
            }
            zza(drawable, false, true, false);
        }
    }

    void zza(Context context, zzhg zzhg1, boolean flag)
    {
        Drawable drawable = null;
        if (zzSi != 0)
        {
            drawable = zza(context, zzhg1, zzSi);
        }
        if (zzSk != null)
        {
            zzSk.onImageLoaded(zzSg.a, drawable, false);
        }
        zza(drawable, flag, false, false);
    }

    protected abstract void zza(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    public void zzaI(int i)
    {
        zzSi = i;
    }

    protected boolean zzb(boolean flag, boolean flag1)
    {
        return zzSl && !flag1 && (!flag || zzSm);
    }
}
