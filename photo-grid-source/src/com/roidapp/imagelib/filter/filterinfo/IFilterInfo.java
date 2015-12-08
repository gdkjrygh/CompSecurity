// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.filterinfo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

public interface IFilterInfo
    extends Parcelable
{

    public abstract int a();

    public abstract Drawable a(Context context);

    public abstract String b();

    public abstract int c();
}
