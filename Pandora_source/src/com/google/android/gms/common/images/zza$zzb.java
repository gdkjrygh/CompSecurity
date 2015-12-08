// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzhd;
import com.google.android.gms.internal.zzhf;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

public static final class zzSp extends zza
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
                imageview = zzSg.zzSg;
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
        if (!(obj instanceof nsition))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        Object obj1 = (nsition)obj;
        obj = (ImageView)zzSp.get();
        obj1 = (ImageView)((zzSp) (obj1)).zzSp.get();
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

    public ate(ImageView imageview, int i)
    {
        super(null, i);
        com.google.android.gms.common.internal.zzb.zzn(imageview);
        zzSp = new WeakReference(imageview);
    }

    public zzSp(ImageView imageview, Uri uri)
    {
        super(uri, 0);
        com.google.android.gms.common.internal.zzb.zzn(imageview);
        zzSp = new WeakReference(imageview);
    }
}
