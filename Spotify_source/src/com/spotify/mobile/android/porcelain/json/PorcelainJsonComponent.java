// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json;

import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import dol;
import dsi;

public interface PorcelainJsonComponent
    extends Parcelable, JacksonModel, dol
{

    public static final String KEY_ID = "id";

    public abstract int describeContents();

    public abstract String getId();

    public abstract dsi getInfo();

    public abstract Iterable getPlayables();

    public abstract int getType();
}
