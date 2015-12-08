// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.b.a;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            iv, jb, je

public interface is
    extends IInterface
{

    public abstract a a();

    public abstract void a(AdRequestParcel adrequestparcel, String s);

    public abstract void a(a a1, AdRequestParcel adrequestparcel, String s, zza zza, String s1);

    public abstract void a(a a1, AdRequestParcel adrequestparcel, String s, iv iv);

    public abstract void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv);

    public abstract void a(a a1, AdRequestParcel adrequestparcel, String s, String s1, iv iv, NativeAdOptionsParcel nativeadoptionsparcel, List list);

    public abstract void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, iv iv);

    public abstract void a(a a1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, iv iv);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract jb h();

    public abstract je i();

    public abstract Bundle j();

    public abstract Bundle k();

    public abstract Bundle l();
}
