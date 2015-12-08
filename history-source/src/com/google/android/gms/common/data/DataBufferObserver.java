// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;


public interface DataBufferObserver
{
    public static interface Observable
    {

        public abstract void addObserver(DataBufferObserver databufferobserver);

        public abstract void removeObserver(DataBufferObserver databufferobserver);
    }


    public abstract void onDataChanged();

    public abstract void onDataRangeChanged(int i, int j);

    public abstract void onDataRangeInserted(int i, int j);

    public abstract void onDataRangeMoved(int i, int j, int k);

    public abstract void onDataRangeRemoved(int i, int j);
}
