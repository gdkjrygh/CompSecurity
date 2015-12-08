// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface CoverPhoto
    extends Freezable
{

    public abstract CoverInfo getCoverInfo();

    public abstract CoverPhoto getCoverPhoto();

    public abstract int getLayout();

    public abstract boolean hasCoverInfo();

    public abstract boolean hasCoverPhoto();

    public abstract boolean hasLayout();
}
