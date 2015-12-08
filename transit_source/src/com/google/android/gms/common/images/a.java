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
import android.widget.TextView;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ek;
import java.lang.ref.WeakReference;

public final class com.google.android.gms.common.images.a
{
    public static final class a
    {

        public final Uri uri;

        public boolean equals(Object obj)
        {
            boolean flag1 = true;
            boolean flag;
            if (!(obj instanceof a))
            {
                flag = false;
            } else
            {
                flag = flag1;
                if (this != obj)
                {
                    flag = flag1;
                    if (((a)obj).hashCode() != hashCode())
                    {
                        return false;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return dl.hashCode(new Object[] {
                uri
            });
        }

        public a(Uri uri1)
        {
            uri = uri1;
        }
    }


    final a jS;
    private int jT;
    private int jU;
    int jV;
    private int jW;
    private WeakReference jX;
    private WeakReference jY;
    private WeakReference jZ;
    private int ka;
    private boolean kb;
    private boolean kc;

    public com.google.android.gms.common.images.a(int i)
    {
        jT = 0;
        jU = 0;
        ka = -1;
        kb = true;
        kc = false;
        jS = new a(null);
        jU = i;
    }

    public com.google.android.gms.common.images.a(Uri uri)
    {
        jT = 0;
        jU = 0;
        ka = -1;
        kb = true;
        kc = false;
        jS = new a(uri);
        jU = 0;
    }

    private cz a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof cz)
            {
                drawable2 = ((cz)drawable).aS();
            }
        } else
        {
            drawable2 = null;
        }
        return new cz(drawable2, drawable1);
    }

    private void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        jV;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 70
    //                   3 99;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        ImageManager.OnImageLoadedListener onimageloadedlistener;
        if (!flag1 && (onimageloadedlistener = (ImageManager.OnImageLoadedListener)jX.get()) != null)
        {
            onimageloadedlistener.onImageLoaded(jS.uri, drawable);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ImageView imageview = (ImageView)jY.get();
        if (imageview != null)
        {
            a(imageview, drawable, flag, flag1, flag2);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        TextView textview = (TextView)jZ.get();
        if (textview != null)
        {
            a(textview, ka, drawable, flag, flag1);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

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
        if (!flag3 || !(imageview instanceof da)) goto _L2; else goto _L1
_L1:
        j = ((da)imageview).aU();
        if (jU == 0 || j != jU) goto _L2; else goto _L3
_L3:
        return;
_L2:
        flag = a(flag, flag1);
        if (flag)
        {
            drawable = a(imageview.getDrawable(), drawable);
        }
        imageview.setImageDrawable(drawable);
        if (imageview instanceof da)
        {
            da da1 = (da)imageview;
            int i;
            if (flag2)
            {
                imageview = jS.uri;
            } else
            {
                imageview = null;
            }
            da1.d(imageview);
            if (flag3)
            {
                i = jU;
            } else
            {
                i = 0;
            }
            da1.w(i);
        }
        if (flag)
        {
            ((cz)drawable).startTransition(250);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void a(TextView textview, int i, Drawable drawable, boolean flag, boolean flag1)
    {
        flag = a(flag, flag1);
        Object obj;
        Drawable drawable1;
        Drawable drawable2;
        Drawable drawable3;
        if (ek.bO())
        {
            obj = textview.getCompoundDrawablesRelative();
        } else
        {
            obj = textview.getCompoundDrawables();
        }
        drawable1 = obj[i];
        if (flag)
        {
            drawable = a(drawable1, drawable);
        }
        if (i == 0)
        {
            drawable1 = drawable;
        } else
        {
            drawable1 = obj[0];
        }
        if (i == 1)
        {
            drawable2 = drawable;
        } else
        {
            drawable2 = obj[1];
        }
        if (i == 2)
        {
            drawable3 = drawable;
        } else
        {
            drawable3 = obj[2];
        }
        if (i == 3)
        {
            obj = drawable;
        } else
        {
            obj = obj[3];
        }
        if (ek.bO())
        {
            textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
        }
        if (flag)
        {
            ((cz)drawable).startTransition(250);
        }
    }

    private boolean a(boolean flag, boolean flag1)
    {
        return kb && !flag1 && (!flag || kc);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        db.c(bitmap);
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap))), flag, false, true);
    }

    public void a(ImageView imageview)
    {
        db.c(imageview);
        jX = null;
        jY = new WeakReference(imageview);
        jZ = null;
        ka = -1;
        jV = 2;
        jW = imageview.hashCode();
    }

    public void a(ImageManager.OnImageLoadedListener onimageloadedlistener)
    {
        db.c(onimageloadedlistener);
        jX = new WeakReference(onimageloadedlistener);
        jY = null;
        jZ = null;
        ka = -1;
        jV = 1;
        jW = dl.hashCode(new Object[] {
            onimageloadedlistener, jS
        });
    }

    void b(Context context, boolean flag)
    {
        Drawable drawable = null;
        if (jU != 0)
        {
            drawable = context.getResources().getDrawable(jU);
        }
        a(drawable, flag, false, false);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        boolean flag;
        if (!(obj instanceof com.google.android.gms.common.images.a))
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (this != obj)
            {
                flag = flag1;
                if (((com.google.android.gms.common.images.a)obj).hashCode() != hashCode())
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return jW;
    }

    void r(Context context)
    {
        Drawable drawable = null;
        if (jT != 0)
        {
            drawable = context.getResources().getDrawable(jT);
        }
        a(drawable, false, true, false);
    }

    public void v(int i)
    {
        jU = i;
    }
}
