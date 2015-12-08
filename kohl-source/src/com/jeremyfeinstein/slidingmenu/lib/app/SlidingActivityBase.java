// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.view.View;

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib.app:
//            SlidingMenu

public interface SlidingActivityBase
{

    public abstract SlidingMenu getSlidingMenu();

    public abstract void setBehindContentView(int i);

    public abstract void setBehindContentView(View view);

    public abstract void setBehindContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void setSlidingActionBarEnabled(boolean flag);

    public abstract void showContent();

    public abstract void showMenu();

    public abstract void showSecondaryMenu();

    public abstract void toggle();
}
