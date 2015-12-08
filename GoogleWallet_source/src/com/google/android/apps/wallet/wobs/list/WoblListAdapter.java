// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;

import android.widget.ListAdapter;
import java.util.List;

public interface WoblListAdapter
    extends ListAdapter
{

    public abstract void addInstances(List list);

    public abstract void clear();

    public abstract void deleteWobById(String s);

    public abstract void setInstances(List list);

    public abstract void upsertInstance(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance);
}
