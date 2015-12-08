// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public interface Place
    extends Freezable
{

    public abstract String b();

    public abstract List c();

    public abstract CharSequence d();

    public abstract CharSequence e();

    public abstract LatLng f();

    public abstract CharSequence g();
}
