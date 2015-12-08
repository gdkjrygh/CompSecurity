// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;


public interface InboxCountAdapter
{
    public static interface InboxCountAdapterProvider
    {

        public abstract InboxCountAdapter getInboxCountAdapter();
    }

    public static interface OnInboxCountUpdatedListener
    {

        public abstract void onInboxCountUpdated();
    }


    public abstract int getPageInboxCount(int i);
}
