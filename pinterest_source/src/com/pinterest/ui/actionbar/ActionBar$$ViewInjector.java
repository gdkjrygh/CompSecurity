// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.support.v7.widget.Toolbar;

// Referenced classes of package com.pinterest.ui.actionbar:
//            ActionBar

public class 
{

    public static void inject(butterknife. , ActionBar actionbar, Object obj)
    {
        actionbar._actionBar = (Toolbar)._actionBar(obj, 0x7f0f0451, "field '_actionBar'");
        actionbar._shadow = ._shadow(obj, 0x7f0f0452, "field '_shadow'");
    }

    public static void reset(ActionBar actionbar)
    {
        actionbar._actionBar = null;
        actionbar._shadow = null;
    }

    public ()
    {
    }
}
