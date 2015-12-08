// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import com.google.android.apps.wallet.base.view.ViewHolder;

public interface ListItemBinder
{

    public abstract void bind(int i, ViewHolder viewholder, Object obj);

    public abstract ViewHolder createDisplay();

    public abstract boolean isEnabled(Object obj);
}
