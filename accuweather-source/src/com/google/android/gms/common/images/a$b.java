// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.gu;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class Fp extends a
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
        if (!(obj instanceof a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (a)obj;
        obj = (ImageView)Fp.get();
        obj1 = (ImageView)((Fp) (obj1)).Fp.get();
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

    public (ImageView imageview, int i)
    {
        super(null, i);
        gy.c(imageview);
        Fp = new WeakReference(imageview);
    }

    public Fp(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        gy.c(imageview);
        Fp = new WeakReference(imageview);
    }
}
