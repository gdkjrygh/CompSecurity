// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.view.ViewConfiguration;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            ActionMenuPresenter

private static class 
{

    public static boolean get(Context context)
    {
        return ViewConfiguration.get(context).hasPermanentMenuKey();
    }

    private ()
    {
    }
}
