// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, h, o

public interface l
{
    public static interface a
    {

        public abstract void onCloseMenu(f f, boolean flag);

        public abstract boolean onOpenSubMenu(f f);
    }


    public abstract void a(Context context, f f);

    public abstract void a(Parcelable parcelable);

    public abstract void a(f f, boolean flag);

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract boolean a(h h);

    public abstract boolean a(o o);

    public abstract int b();

    public abstract boolean b(h h);

    public abstract Parcelable d();
}
