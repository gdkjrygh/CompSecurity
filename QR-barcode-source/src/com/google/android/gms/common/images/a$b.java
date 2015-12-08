// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.iy;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class KO extends com.google.android.gms.common.images.a
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
        if (!(obj instanceof a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (a)obj;
        obj = (ImageView)KO.get();
        obj1 = (ImageView)((KO) (obj1)).KO.get();
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

    public (ImageView imageview, int i)
    {
        super(null, i);
        com.google.android.gms.common.internal.a.f(imageview);
        KO = new WeakReference(imageview);
    }

    public KO(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        com.google.android.gms.common.internal.a.f(imageview);
        KO = new WeakReference(imageview);
    }
}
