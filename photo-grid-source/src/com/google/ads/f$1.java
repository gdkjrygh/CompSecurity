// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

// Referenced classes of package com.google.ads:
//            f, h

class nit>
    implements nit>
{

    final boolean a;
    final f b;

    public Drawable a()
    {
        b.a(2, a);
        return null;
    }

    public Drawable a(InputStream inputstream)
    {
        inputstream = h.a(inputstream);
        if (inputstream == null)
        {
            b.a(2, a);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            b.a(2, a);
            return null;
        } else
        {
            return new BitmapDrawable(Resources.getSystem(), inputstream);
        }
    }

    public Object b()
    {
        return a();
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    (f f1, boolean flag)
    {
        b = f1;
        a = flag;
        super();
    }
}
