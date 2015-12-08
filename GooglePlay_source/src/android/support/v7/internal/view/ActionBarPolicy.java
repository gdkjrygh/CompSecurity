// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;

public final class ActionBarPolicy
{

    public Context mContext;

    private ActionBarPolicy(Context context)
    {
        mContext = context;
    }

    public static ActionBarPolicy get(Context context)
    {
        return new ActionBarPolicy(context);
    }

    public final boolean hasEmbeddedTabs()
    {
        if (mContext.getApplicationInfo().targetSdkVersion >= 16)
        {
            return mContext.getResources().getBoolean(0x7f0a0000);
        } else
        {
            return mContext.getResources().getBoolean(0x7f0a0001);
        }
    }
}
