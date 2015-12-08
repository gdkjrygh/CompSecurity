// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jv;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class LS extends a
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
        if (!(obj instanceof a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (a)obj;
        obj = (ImageView)LS.get();
        obj1 = (ImageView)((LS) (obj1)).LS.get();
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

    public ntState(ImageView imageview, int i)
    {
        super(null, i);
        je.f(imageview);
        LS = new WeakReference(imageview);
    }

    public LS(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        je.f(imageview);
        LS = new WeakReference(imageview);
    }
}
