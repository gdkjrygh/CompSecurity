// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.List;

public interface kuv
    extends IInterface
{

    public abstract kok a();

    public abstract void a(AdRequestParcel adrequestparcel, String s);

    public abstract void a(kok kok, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy);

    public abstract void a(kok kok, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy, NativeAdOptionsParcel nativeadoptionsparcel, List list);

    public abstract void a(kok kok, AdRequestParcel adrequestparcel, String s, jpt jpt, String s1);

    public abstract void a(kok kok, AdRequestParcel adrequestparcel, String s, kuy kuy);

    public abstract void a(kok kok, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, kuy kuy);

    public abstract void a(kok kok, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, kuy kuy);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract kvb h();

    public abstract kve i();
}
