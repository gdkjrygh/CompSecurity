// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            zzgt, zzlz

class zzxd
    implements a
{

    final zzgt zzxc;
    final boolean zzxd;

    public Drawable zza(InputStream inputstream)
    {
        try
        {
            inputstream = zzlz.zzd(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            zzxc.zza(2, zzxd);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            zzxc.zza(2, zzxd);
            return null;
        } else
        {
            return new BitmapDrawable(Resources.getSystem(), inputstream);
        }
    }

    public Object zzb(InputStream inputstream)
    {
        return zza(inputstream);
    }

    public Drawable zzdP()
    {
        zzxc.zza(2, zzxd);
        return null;
    }

    public Object zzdQ()
    {
        return zzdP();
    }

    e(zzgt zzgt1, boolean flag)
    {
        zzxc = zzgt1;
        zzxd = flag;
        super();
    }
}
