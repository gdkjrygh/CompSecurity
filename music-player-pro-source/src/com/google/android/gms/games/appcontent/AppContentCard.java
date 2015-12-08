// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentCard
    extends Parcelable, Freezable
{

    public abstract List getActions();

    public abstract String getDescription();

    public abstract Uri getIconImageUri();

    public abstract String getTitle();

    public abstract String getType();

    public abstract List kH();

    public abstract String kI();

    public abstract Uri kL();

    public abstract List kN();

    public abstract int kO();

    public abstract Bundle kP();

    public abstract String kQ();

    public abstract int kR();
}
