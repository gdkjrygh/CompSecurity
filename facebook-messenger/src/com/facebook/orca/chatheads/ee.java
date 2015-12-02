// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.WindowManager;

// Referenced classes of package com.facebook.orca.chatheads:
//            dv

class ee extends dv
{

    public ee(WindowManager windowmanager)
    {
        super(windowmanager, c());
    }

    private static android.view.WindowManager.LayoutParams c()
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams(0, -1, a, 0x10100, -1);
        layoutparams.gravity = 53;
        return layoutparams;
    }
}
