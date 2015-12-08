// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.location.Location;

public interface ILocationHelper
{

    public abstract Location getBestAccurateCachedLocation();

    public abstract Location getBestCachedLocation();
}
