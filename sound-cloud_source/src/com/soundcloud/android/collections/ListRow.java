// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.database.Cursor;
import android.os.Parcelable;

public interface ListRow
{

    public abstract void display(int i, Parcelable parcelable);

    public abstract void display(Cursor cursor);
}
