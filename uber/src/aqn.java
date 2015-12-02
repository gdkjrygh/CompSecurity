// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

public final class aqn
{

    public aqn()
    {
    }

    protected final aql a(Context context, VersionInfoParcel versioninfoparcel, ajs ajs1)
    {
        context = new aar(context, versioninfoparcel);
        context.a(new _cls2(ajs1, context));
        return context;
    }

    public final Future a(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        ajs ajs1 = new ajs();
        ajc.a.post(new _cls1(context, versioninfoparcel, ajs1, s));
        return ajs1;
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
