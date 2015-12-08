// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            AdAdapter, q

public abstract class p
    implements AdAdapter
{

    public p()
    {
    }

    public abstract void a(int i1);

    public abstract void a(Context context, q q1, Map map);

    public abstract void a(Map map);

    public abstract boolean a();

    public abstract void b(Map map);

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract com.facebook.ads.NativeAd.Image g();

    public final AdPlacementType getPlacementType()
    {
        return AdPlacementType.NATIVE;
    }

    public abstract com.facebook.ads.NativeAd.Image h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract com.facebook.ads.NativeAd.Rating n();

    public abstract String o();

    public abstract com.facebook.ads.NativeAd.Image p();

    public abstract String q();

    public abstract String r();

    public abstract String s();

    public abstract boolean t();
}
