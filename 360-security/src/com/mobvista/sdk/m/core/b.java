// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mobvista.sdk.m.a.d.a.h;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class b
    implements h
{

    final ImageView a;
    final AdMobvistaAct b;

    b(AdMobvistaAct admobvistaact, ImageView imageview)
    {
        b = admobvistaact;
        a = imageview;
        super();
    }

    public final void a(Bitmap bitmap, String s)
    {
        a.setImageBitmap(bitmap);
    }
}
