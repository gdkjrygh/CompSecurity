// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.support.v7.a.c;

public final class a
{

    public Context a;

    private a(Context context)
    {
        a = context;
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public final boolean a()
    {
        if (a.getApplicationInfo().targetSdkVersion >= 16)
        {
            return a.getResources().getBoolean(c.abc_action_bar_embed_tabs);
        } else
        {
            return a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
        }
    }
}
