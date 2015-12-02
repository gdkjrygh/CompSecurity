// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class aar
    implements aql
{

    private final akk a;

    public aar(Context context, VersionInfoParcel versioninfoparcel)
    {
        ot.f();
        a = akp.a(context, new AdSizeParcel(), false, false, null, versioninfoparcel);
    }

    static akk a(aar aar1)
    {
        return aar1.a;
    }

    private static void a(Runnable runnable)
    {
        kx.a();
        if (oe.b())
        {
            runnable.run();
            return;
        } else
        {
            ajc.a.post(runnable);
            return;
        }
    }

    public final void a()
    {
        a.destroy();
    }

    public final void a(aqm aqm)
    {
        a.i().a(new _cls6(aqm));
    }

    public final void a(String s)
    {
        a(((Runnable) (new _cls3(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })))));
    }

    public final void a(String s, acu acu)
    {
        a.i().a(s, acu);
    }

    public final void a(String s, String s1)
    {
        a(((Runnable) (new _cls2(s, s1))));
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a(((Runnable) (new _cls1(s, jsonobject))));
    }

    public final void a(kp kp, mk mk, acs acs, mo mo, ada ada, adc adc, afi afi)
    {
        a.i().a(kp, mk, acs, mo, false, ada, adc, new ok((byte)0), afi);
    }

    public final void b(String s)
    {
        a(new _cls4(s));
    }

    public final void b(String s, acu acu)
    {
        a.i().b(s, acu);
    }

    public final void c(String s)
    {
        a(new _cls5(s));
    }

    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}

}
