// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.widget.FrameLayout;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

public class 
{

    public static void inject(butterknife.nFragment nfragment, PinFragment pinfragment, Object obj)
    {
        com.pinterest.fragment.wInjector.inject(nfragment, pinfragment, obj);
        pinfragment._rootVw = (FrameLayout)nfragment._rootVw(obj, 0x7f0f02a1, "field '_rootVw'");
    }

    public static void reset(PinFragment pinfragment)
    {
        com.pinterest.fragment.wInjector.reset(pinfragment);
        pinfragment._rootVw = null;
    }

    public ()
    {
    }
}
