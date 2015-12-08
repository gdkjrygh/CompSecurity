// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.view.View;
import com.pandora.android.provider.b;
import p.bz.h;

// Referenced classes of package com.pandora.android.view:
//            HeaderLayout

class a
    implements android.view.tener
{

    final HeaderLayout a;

    public void onClick(View view)
    {
        b.a.e().a(new h(HeaderLayout.a(a), com.pandora.android.view.b));
    }

    (HeaderLayout headerlayout)
    {
        a = headerlayout;
        super();
    }
}
