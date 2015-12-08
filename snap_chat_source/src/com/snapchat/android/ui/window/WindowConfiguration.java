// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.window;

import HY;
import Jb;
import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;

public final class WindowConfiguration
{
    public static final class DecorVisibility extends Enum
    {

        private static final DecorVisibility $VALUES[];
        public static final DecorVisibility HIDE_ALL_OS_DECOR;
        public static final DecorVisibility HIDE_STATUS_BAR;
        public static final DecorVisibility SHOW_ALL_OS_DECOR;

        public static DecorVisibility valueOf(String s)
        {
            return (DecorVisibility)Enum.valueOf(com/snapchat/android/ui/window/WindowConfiguration$DecorVisibility, s);
        }

        public static DecorVisibility[] values()
        {
            return (DecorVisibility[])$VALUES.clone();
        }

        static 
        {
            HIDE_ALL_OS_DECOR = new DecorVisibility("HIDE_ALL_OS_DECOR", 0);
            HIDE_STATUS_BAR = new DecorVisibility("HIDE_STATUS_BAR", 1);
            SHOW_ALL_OS_DECOR = new DecorVisibility("SHOW_ALL_OS_DECOR", 2);
            $VALUES = (new DecorVisibility[] {
                HIDE_ALL_OS_DECOR, HIDE_STATUS_BAR, SHOW_ALL_OS_DECOR
            });
        }

        private DecorVisibility(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class StatusBarDrawMode extends Enum
    {

        private static final StatusBarDrawMode $VALUES[];
        public static final StatusBarDrawMode DRAW_BACKGROUND_BEHIND;
        public static final StatusBarDrawMode DRAW_BEHIND;
        public static final StatusBarDrawMode DRAW_BELOW_FOR_ADJUSTABLE_UI;

        public static StatusBarDrawMode valueOf(String s)
        {
            return (StatusBarDrawMode)Enum.valueOf(com/snapchat/android/ui/window/WindowConfiguration$StatusBarDrawMode, s);
        }

        public static StatusBarDrawMode[] values()
        {
            return (StatusBarDrawMode[])$VALUES.clone();
        }

        static 
        {
            DRAW_BEHIND = new StatusBarDrawMode("DRAW_BEHIND", 0);
            DRAW_BACKGROUND_BEHIND = new StatusBarDrawMode("DRAW_BACKGROUND_BEHIND", 1);
            DRAW_BELOW_FOR_ADJUSTABLE_UI = new StatusBarDrawMode("DRAW_BELOW_FOR_ADJUSTABLE_UI", 2);
            $VALUES = (new StatusBarDrawMode[] {
                DRAW_BEHIND, DRAW_BACKGROUND_BEHIND, DRAW_BELOW_FOR_ADJUSTABLE_UI
            });
        }

        private StatusBarDrawMode(String s, int i)
        {
            super(s, i);
        }
    }


    public Window a;
    public View b;
    private final Resources c;
    private final Jb d;
    private int e;

    public WindowConfiguration()
    {
        Resources resources = SnapchatApplication.get().getResources();
        new HY();
        this(resources, Jb.a());
    }

    private WindowConfiguration(Resources resources, Jb jb)
    {
        c = resources;
        d = jb;
    }

    public final void a(StatusBarDrawMode statusbardrawmode)
    {
        boolean flag = true;
        if (!a())
        {
            Timber.e("WindowConfiguration", "Attempt to set window configuration on uninitialized window", new Object[0]);
            return;
        }
        int i;
        int j;
        int k;
        int l;
        if (statusbardrawmode == StatusBarDrawMode.DRAW_BEHIND || statusbardrawmode == StatusBarDrawMode.DRAW_BACKGROUND_BEHIND)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = a.getAttributes().flags;
        l = android.os.Build.VERSION.SDK_INT;
        j = 512;
        if (l >= 19)
        {
            j = 0x4000200;
        }
        if ((k & j) == 0)
        {
            flag = false;
        }
        if (!flag && i != 0)
        {
            a.addFlags(j);
        } else
        if (flag && i == 0)
        {
            a.clearFlags(j);
        }
        if (statusbardrawmode == StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI)
        {
            d.b();
        } else
        {
            d.c();
        }
        i = b.getPaddingTop();
        j = e;
        if (statusbardrawmode == StatusBarDrawMode.DRAW_BACKGROUND_BEHIND)
        {
            e = (int)c.getDimension(0x7f0a0143);
        } else
        {
            e = 0;
        }
        b.setPadding(b.getPaddingLeft(), (i - j) + e, b.getPaddingRight(), b.getPaddingBottom());
    }

    public final boolean a()
    {
        return a != null && b != null;
    }
}
