// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public interface CellRenderer
{

    public abstract void bindItemView(int i, View view, List list);

    public abstract View createItemView(ViewGroup viewgroup);
}
