// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.g;

// Referenced classes of package com.google.android.gms.maps.internal:
//            a, m, y, j, 
//            v

public interface ak
    extends IInterface
{

    public abstract a a();

    public abstract m a(j j, GoogleMapOptions googlemapoptions);

    public abstract y a(j j, StreetViewPanoramaOptions streetviewpanoramaoptions);

    public abstract void a(j j);

    public abstract void a(j j, int i);

    public abstract com.google.android.gms.maps.internal.j b(j j);

    public abstract g b();

    public abstract v c(j j);
}
