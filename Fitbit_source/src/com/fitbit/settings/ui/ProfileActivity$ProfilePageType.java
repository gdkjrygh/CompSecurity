// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.support.v4.app.Fragment;
import com.fitbit.data.domain.User;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileActivity

private static abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    final int titleId;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/fitbit/settings/ui/ProfileActivity$ProfilePageType, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract Fragment a(User user, boolean flag);

    static 
    {
    /* block-local class not found */
    class _cls1 {}

        a = new _cls1("BADGES", 0, 0x7f0804b5);
    /* block-local class not found */
    class _cls2 {}

        b = new _cls2("FRIENDS", 1, 0x7f080235);
    /* block-local class not found */
    class _cls3 {}

        c = new _cls3("SETTINGS", 2, 0x7f0804b6);
        d = (new d[] {
            a, b, c
        });
    }

    private _cls3(String s, int i, int j)
    {
        super(s, i);
        titleId = j;
    }

    titleId(String s, int i, int j, titleId titleid)
    {
        this(s, i, j);
    }
}
