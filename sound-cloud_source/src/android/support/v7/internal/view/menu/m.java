// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, h, q

public interface m
{
    public static interface a
    {

        public abstract void onCloseMenu(f f, boolean flag);

        public abstract boolean onOpenSubMenu(f f);
    }


    public abstract boolean collapseItemActionView(f f, h h);

    public abstract boolean expandItemActionView(f f, h h);

    public abstract boolean flagActionItems();

    public abstract int getId();

    public abstract void initForMenu(Context context, f f);

    public abstract void onCloseMenu(f f, boolean flag);

    public abstract void onRestoreInstanceState(Parcelable parcelable);

    public abstract Parcelable onSaveInstanceState();

    public abstract boolean onSubMenuSelected(q q);

    public abstract void updateMenuView(boolean flag);
}
