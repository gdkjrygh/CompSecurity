// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.model;


public interface Covers
{

    public abstract String getImageUri(Size size);

    public abstract String getLargeUri();

    public abstract String getSmallUri();

    public abstract String getUri();

    public abstract String getXlargeUri();
}
