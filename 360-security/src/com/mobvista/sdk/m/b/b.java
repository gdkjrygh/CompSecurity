// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mobvista.sdk.m.a.d.a.h;

// Referenced classes of package com.mobvista.sdk.m.b:
//            a

final class b
    implements h
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Bitmap bitmap, String s)
    {
        if (((String)com.mobvista.sdk.m.b.a.a(a).getTag()).equals(s))
        {
            com.mobvista.sdk.m.b.a.a(a).setImageBitmap(bitmap);
        }
    }
}
