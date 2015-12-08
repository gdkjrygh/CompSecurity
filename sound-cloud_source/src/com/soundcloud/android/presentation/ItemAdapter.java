// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import java.util.List;
import rx.P;

public interface ItemAdapter
    extends P
{

    public abstract void addItem(Object obj);

    public abstract void clear();

    public abstract Object getItem(int i);

    public abstract int getItemCount();

    public abstract List getItems();

    public abstract boolean isEmpty();

    public abstract void notifyDataSetChanged();

    public abstract void prependItem(Object obj);

    public abstract void removeItem(int i);
}
