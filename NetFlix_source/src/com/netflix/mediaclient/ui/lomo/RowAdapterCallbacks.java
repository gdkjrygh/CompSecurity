// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.android.activity.NetflixActivity;

public interface RowAdapterCallbacks
{

    public abstract NetflixActivity getActivity();

    public abstract void notifyParentOfDataSetChange();

    public abstract void notifyParentOfError();
}
