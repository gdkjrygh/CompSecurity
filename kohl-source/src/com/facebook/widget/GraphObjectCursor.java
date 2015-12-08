// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.model.GraphObject;

interface GraphObjectCursor
{

    public abstract boolean areMoreObjectsAvailable();

    public abstract void close();

    public abstract int getCount();

    public abstract GraphObject getGraphObject();

    public abstract int getPosition();

    public abstract boolean isAfterLast();

    public abstract boolean isBeforeFirst();

    public abstract boolean isClosed();

    public abstract boolean isFirst();

    public abstract boolean isFromCache();

    public abstract boolean isLast();

    public abstract boolean move(int i);

    public abstract boolean moveToFirst();

    public abstract boolean moveToLast();

    public abstract boolean moveToNext();

    public abstract boolean moveToPosition(int i);

    public abstract boolean moveToPrevious();
}
