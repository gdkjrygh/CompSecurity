// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;


// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemImpl, MenuBuilder

class this._cls0
    implements android.support.v4.view.VisibilityListener
{

    final MenuItemImpl this$0;

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        MenuItemImpl.access$000(MenuItemImpl.this).onItemVisibleChanged(MenuItemImpl.this);
    }

    ener()
    {
        this$0 = MenuItemImpl.this;
        super();
    }
}
