// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.menu;

import android.content.Context;
import android.view.View;
import android.widget.PopupMenu;

// Referenced classes of package com.soundcloud.android.view.menu:
//            PopupMenuWrapper

public static class 
{

    public PopupMenuWrapper build(Context context, View view)
    {
        return new PopupMenuWrapper(new PopupMenu(context, view), context);
    }

    public ()
    {
    }
}
