// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface AppContentAnnotation
    extends Parcelable, Freezable
{

    public abstract String getDescription();

    public abstract String getId();

    public abstract String getImageDefaultId();

    public abstract int getImageHeight();

    public abstract Uri getImageUri();

    public abstract int getImageWidth();

    public abstract String getLayoutSlot();

    public abstract Bundle getModifiers();

    public abstract String getTitle();
}
