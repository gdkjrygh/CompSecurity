// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fabmenu;

import java.util.List;

// Referenced classes of package com.skype.android.widget.fabmenu:
//            FabMenu

public static interface 
{

    public abstract void onFabMenuItemSelected(int i);

    public abstract void onFabMenuStateChange(boolean flag);

    public abstract void onMainFabClick();

    public abstract void onPrepareFabMenu(List list);
}
