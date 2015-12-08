// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class BitmapDescriptor
{

    final IObjectWrapper mRemoteObject;

    public BitmapDescriptor(IObjectWrapper iobjectwrapper)
    {
        mRemoteObject = (IObjectWrapper)Preconditions.checkNotNull(iobjectwrapper);
    }
}
