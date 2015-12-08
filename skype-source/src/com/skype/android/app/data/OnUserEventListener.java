// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.data;


public interface OnUserEventListener
{

    public abstract void onItemChecked(android.support.v7.widget.RecyclerView.v v, Object obj, boolean flag);

    public abstract void onItemClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj);

    public abstract boolean onItemLongClick(android.support.v7.widget.RecyclerView.v v, int i, Object obj);
}
