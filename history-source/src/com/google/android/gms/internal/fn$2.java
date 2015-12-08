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
//            fn, lh

class us
    implements us
{

    final fn ur;
    final boolean us;

    public Drawable a(InputStream inputstream)
    {
        try
        {
            inputstream = lh.d(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            ur.a(2, us);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            ur.a(2, us);
            return null;
        } else
        {
            return new BitmapDrawable(Resources.getSystem(), inputstream);
        }
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public Drawable cP()
    {
        ur.a(2, us);
        return null;
    }

    public Object cQ()
    {
        return cP();
    }

    ble(fn fn1, boolean flag)
    {
        ur = fn1;
        us = flag;
        super();
    }
}
