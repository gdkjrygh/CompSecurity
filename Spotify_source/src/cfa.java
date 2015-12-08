// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.List;

public interface cfa
    extends IInterface
{

    public abstract byb a();

    public abstract void a(byb byb, AdRequestParcel adrequestparcel, String s, bju bju, String s1);

    public abstract void a(byb byb, AdRequestParcel adrequestparcel, String s, cfd cfd);

    public abstract void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd);

    public abstract void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd, NativeAdOptionsParcel nativeadoptionsparcel, List list);

    public abstract void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, cfd cfd);

    public abstract void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd);

    public abstract void a(AdRequestParcel adrequestparcel, String s);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public abstract cfj h();

    public abstract cfm i();

    public abstract Bundle j();

    public abstract Bundle k();

    public abstract Bundle l();
}
