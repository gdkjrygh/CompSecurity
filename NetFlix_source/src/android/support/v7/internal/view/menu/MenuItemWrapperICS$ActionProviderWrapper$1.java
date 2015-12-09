// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.ActionProvider;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class val.this._cls0
    implements android.support.v4.view.iderWrapper._cls1
{

    final is._cls0 this$1;
    final MenuItemWrapperICS val$this$0;

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        if (nner.overridesItemVisibility() && MenuItemWrapperICS.access$100(_fld0))
        {
            wrappedSetVisible(flag);
        }
    }

    ()
    {
        this$1 = final_;
        val$this$0 = MenuItemWrapperICS.this;
        super();
    }
}
