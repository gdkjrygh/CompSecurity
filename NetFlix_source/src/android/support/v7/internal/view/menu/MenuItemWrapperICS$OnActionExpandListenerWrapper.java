// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            BaseWrapper, MenuItemWrapperICS

private class this._cls0 extends BaseWrapper
    implements android.view.ionExpandListenerWrapper
{

    final MenuItemWrapperICS this$0;

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return ((android.support.v4.view.stenerWrapper)mWrappedObject).ctionCollapse(getMenuItemWrapper(menuitem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return ((android.support.v4.view.stenerWrapper)mWrappedObject).ctionExpand(getMenuItemWrapper(menuitem));
    }

    (android.support.v4.view.stenerWrapper stenerwrapper)
    {
        this$0 = MenuItemWrapperICS.this;
        super(stenerwrapper);
    }
}
