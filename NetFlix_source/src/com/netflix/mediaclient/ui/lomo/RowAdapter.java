// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import com.netflix.mediaclient.servicemgr.BasicLoMo;

interface RowAdapter
{

    public abstract int getCount();

    public abstract int getRowHeightInPx();

    public abstract View getView(int i);

    public abstract boolean hasMoreData();

    public abstract void invalidateRequestId();

    public abstract void refreshData(BasicLoMo basiclomo, int i);

    public abstract void restoreFromMemento(Object obj);

    public abstract Object saveToMemento();

    public abstract void trackPresentation(int i);
}
