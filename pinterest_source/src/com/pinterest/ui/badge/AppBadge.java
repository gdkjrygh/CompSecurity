// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.Context;

public interface AppBadge
{

    public abstract boolean isSupported(Context context);

    public abstract void updateBadge(Context context, int i);
}
