// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;

public interface Cluster
{

    public abstract Collection getItems();

    public abstract LatLng getPosition();

    public abstract int getSize();
}
