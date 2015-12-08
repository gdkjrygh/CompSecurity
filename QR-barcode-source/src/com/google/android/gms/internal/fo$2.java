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
//            fo, jy

class ue
    implements ue
{

    final fo ud;
    final boolean ue;

    public Drawable a(InputStream inputstream)
    {
        try
        {
            inputstream = jy.d(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            ud.a(2, ue);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            ud.a(2, ue);
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

    public Drawable cI()
    {
        ud.a(2, ue);
        return null;
    }

    public Object cJ()
    {
        return cI();
    }

    ble(fo fo1, boolean flag)
    {
        ud = fo1;
        ue = flag;
        super();
    }
}
