// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.subitem;

import drx;

public interface PorcelainNavigationLink
    extends drx
{

    public abstract String getTargetTitle();

    public abstract Type getType();

    public abstract String getUri();
}
