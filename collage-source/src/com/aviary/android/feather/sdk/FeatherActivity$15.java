// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import com.aviary.android.feather.library.a.a;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity, AviaryMainController

class a
    implements Runnable
{

    final Object a;
    final FeatherActivity b;

    public void run()
    {
        b.c.a((a)a);
    }

    r(FeatherActivity featheractivity, Object obj)
    {
        b = featheractivity;
        a = obj;
        super();
    }
}
