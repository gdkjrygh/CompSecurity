// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.lang.ref.WeakReference;

public final class bjb extends bji
{

    private final WeakReference a;

    public bjb(biu biu1)
    {
        a = new WeakReference(biu1);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        biu biu1 = (biu)a.get();
        if (biu1 != null)
        {
            biu1.a(adresponseparcel);
        }
    }
}
