// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.menu;

import android.content.Context;
import android.view.MenuItem;

// Referenced classes of package com.soundcloud.android.view.menu:
//            PopupMenuWrapper

public static interface 
{

    public abstract void onDismiss();

    public abstract boolean onMenuItemClick(MenuItem menuitem, Context context);
}
