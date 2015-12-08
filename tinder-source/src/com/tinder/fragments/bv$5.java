// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.support.v4.b.a;
import android.widget.ImageView;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            bv

final class b
    implements Runnable
{

    final ImageView a;
    final Context b;
    final bv c;

    public final void run()
    {
        ad.a(a, android.support.v4.b.a.a(b, 0x7f0201c1));
    }

    (bv bv1, ImageView imageview, Context context)
    {
        c = bv1;
        a = imageview;
        b = context;
        super();
    }
}
