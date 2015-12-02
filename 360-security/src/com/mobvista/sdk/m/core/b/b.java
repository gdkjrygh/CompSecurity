// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mobvista.sdk.m.a.d.a.h;

// Referenced classes of package com.mobvista.sdk.m.core.b:
//            a

final class b
    implements h
{

    final ImageView a;
    final a b;

    b(a a1, ImageView imageview)
    {
        b = a1;
        a = imageview;
        super();
    }

    public final void a(Bitmap bitmap, String s)
    {
        if (((String)a.getTag()).equals(s))
        {
            a.setImageBitmap(bitmap);
        }
    }
}
