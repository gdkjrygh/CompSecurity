// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hk;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class Fs extends a
{

    private WeakReference Fs;

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
        if (!flag3 || !(imageview instanceof gv)) goto _L2; else goto _L1
_L1:
        j = ((gv)imageview).fi();
        if (Fo == 0 || j != Fo) goto _L2; else goto _L3
_L3:
        return;
_L2:
        flag = b(flag, flag1);
        if (flag)
        {
            drawable = a(imageview.getDrawable(), drawable);
        }
        imageview.setImageDrawable(drawable);
        if (imageview instanceof gv)
        {
            gv gv1 = (gv)imageview;
            int i;
            if (flag2)
            {
                imageview = Fm.uri;
            } else
            {
                imageview = null;
            }
            gv1.g(imageview);
            if (flag3)
            {
                i = Fo;
            } else
            {
                i = 0;
            }
            gv1.al(i);
        }
        if (flag)
        {
            ((gt)drawable).startTransition(250);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        ImageView imageview = (ImageView)Fs.get();
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
        obj = (ImageView)Fs.get();
        obj1 = (ImageView)((Fs) (obj1)).Fs.get();
        boolean flag;
        if (obj1 != null && obj != null && hk.equal(obj1, obj))
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
        gx.c(imageview);
        Fs = new WeakReference(imageview);
    }

    public Fs(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        gx.c(imageview);
        Fs = new WeakReference(imageview);
    }
}
