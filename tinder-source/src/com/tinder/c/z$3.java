// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;

// Referenced classes of package com.tinder.c:
//            z

final class <init>
    implements android.support.v4.view.Pager.g
{

    final z a;

    public final void transformPage(View view, float f)
    {
        view.findViewById(0x7f0e037b).setTranslationX((float)(view.getWidth() / 4) * f);
        view.findViewById(0x7f0e037c).setTranslationX((float)(view.getWidth() / 2) * f);
    }

    (z z1)
    {
        a = z1;
        super();
    }
}
