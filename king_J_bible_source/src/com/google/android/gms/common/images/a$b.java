// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.ez;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fo;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class Cs extends a
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
        if (!(obj instanceof a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (a)obj;
        obj = (ImageView)Cs.get();
        obj1 = (ImageView)((Cs) (obj1)).Cs.get();
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

    public (ImageView imageview, int i)
    {
        super(null, i);
        fb.d(imageview);
        Cs = new WeakReference(imageview);
    }

    public Cs(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        fb.d(imageview);
        Cs = new WeakReference(imageview);
    }
}
