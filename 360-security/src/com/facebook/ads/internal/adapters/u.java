// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            a, v

public abstract class u
    implements a
{

    public u()
    {
    }

    public final AdPlacementType a()
    {
        return AdPlacementType.NATIVE;
    }

    public abstract void a(int i1);

    public abstract void a(Context context, v v, Map map);

    public abstract void a(Map map);

    public abstract void b(Map map);

    public abstract boolean c();

    public abstract com.facebook.ads.NativeAd.a d();

    public abstract com.facebook.ads.NativeAd.a e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract com.facebook.ads.NativeAd.b j();

    public abstract String k();

    public abstract com.facebook.ads.NativeAd.a l();

    public abstract String m();

    public abstract boolean n();
}
