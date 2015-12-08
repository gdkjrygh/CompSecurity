// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.view.ViewGroup;

// Referenced classes of package com.aviary.android.feather.sdk:
//            AviaryMainController

class a
    implements Runnable
{

    final AviaryMainController a;

    public void run()
    {
        AviaryMainController.b(a).d().removeAllViews();
        AviaryMainController.b(a).f();
    }

    (AviaryMainController aviarymaincontroller)
    {
        a = aviarymaincontroller;
        super();
    }
}
