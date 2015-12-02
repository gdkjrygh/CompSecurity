// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcelable;

public interface gi
{
    public static interface a
    {

        public abstract void onCloseMenu(gc gc, boolean flag);

        public abstract boolean onOpenSubMenu(gc gc);
    }


    public abstract boolean collapseItemActionView(gc gc, ge ge);

    public abstract boolean expandItemActionView(gc gc, ge ge);

    public abstract boolean flagActionItems();

    public abstract int getId();

    public abstract void initForMenu(Context context, gc gc);

    public abstract void onCloseMenu(gc gc, boolean flag);

    public abstract void onRestoreInstanceState(Parcelable parcelable);

    public abstract Parcelable onSaveInstanceState();

    public abstract boolean onSubMenuSelected(gm gm);

    public abstract void updateMenuView(boolean flag);
}
