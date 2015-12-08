// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            me, sb, ry, zzja, 
//            qa, pb, mo

public class mq extends me
    implements sb
{

    mq(Context context, pb pb, ry ry1, mo mo)
    {
        super(context, pb, ry1, mo);
    }

    protected final void a()
    {
        if (e.errorCode != -2)
        {
            return;
        } else
        {
            c.k().zza(this);
            c();
            zzb.v("Loading HTML in WebView.");
            ry ry1 = c;
            zzp.zzbv();
            ry1.loadDataWithBaseURL(qa.a(e.zzBF), e.body, "text/html", "UTF-8", null);
            return;
        }
    }

    protected void c()
    {
    }
}
