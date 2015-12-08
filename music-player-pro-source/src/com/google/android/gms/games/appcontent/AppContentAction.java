// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentAction
    extends Parcelable, Freezable
{

    public abstract Bundle getExtras();

    public abstract String getLabel();

    public abstract String getType();

    public abstract List kH();

    public abstract String kI();

    public abstract String kJ();
}
