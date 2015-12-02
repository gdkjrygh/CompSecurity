// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.maps.internal.Point;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface auo
    extends IInterface
{

    public abstract aaf a(LatLng latlng);

    public abstract LatLng a(aaf aaf);

    public abstract LatLng a(Point point);

    public abstract VisibleRegion a();

    public abstract Point b(LatLng latlng);
}
