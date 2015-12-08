// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.content.Context;

// Referenced classes of package com.actionbarsherlock.view:
//            MenuItem

public abstract class Window extends android.view.Window
{
    public static interface Callback
    {

        public abstract boolean onMenuItemSelected(int i, MenuItem menuitem);
    }


    public static final long FEATURE_ACTION_BAR = 8L;
    public static final long FEATURE_ACTION_BAR_OVERLAY = 9L;
    public static final long FEATURE_ACTION_MODE_OVERLAY = 10L;
    public static final long FEATURE_INDETERMINATE_PROGRESS = 5L;
    public static final long FEATURE_NO_TITLE = 1L;
    public static final long FEATURE_PROGRESS = 2L;

    private Window(Context context)
    {
        super(context);
    }
}
