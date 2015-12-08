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
//            zzek, zzhy

class a
    implements a
{

    final boolean a;
    final zzek b;

    public Drawable a()
    {
        b.zza(2, a);
        return null;
    }

    public Drawable a(InputStream inputstream)
    {
        try
        {
            inputstream = zzhy.zzd(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            b.zza(2, a);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            b.zza(2, a);
            return null;
        } else
        {
            return new BitmapDrawable(Resources.getSystem(), inputstream);
        }
    }

    public Object zzb(InputStream inputstream)
    {
        return a(inputstream);
    }

    public Object zzem()
    {
        return a();
    }

    e(zzek zzek1, boolean flag)
    {
        b = zzek1;
        a = flag;
        super();
    }
}
