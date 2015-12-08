// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate, zzm

public interface IMapViewDelegate
    extends IInterface
{

    public abstract IGoogleMapDelegate a();

    public abstract void a(Bundle bundle);

    public abstract void a(zzm zzm);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract zzd f();
}
