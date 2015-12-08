// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.model;

import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IOnPageAsset;

public interface IAdViewSource
{

    public abstract Object getAdParameters();

    public abstract IAsset getAsset();

    public abstract IOnPageAsset[] getCompanions();
}
