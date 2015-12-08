// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.d;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            kp, ry, qa, cm, 
//            pe, kk, kl

public final class kj extends kp
{

    private final Map a;
    private final Context b;

    public kj(ry ry1, Map map)
    {
        super(ry1, "storePicture");
        a = map;
        b = ry1.e();
    }

    static Context a(kj kj1)
    {
        return kj1.b;
    }

    public final void a()
    {
        if (b == null)
        {
            a("Activity context is not available");
            return;
        }
        zzp.zzbv();
        if (!qa.e(b).c())
        {
            a("Feature is not supported by the device.");
            return;
        }
        String s = (String)a.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            a((new StringBuilder("Invalid image url: ")).append(s).toString());
            return;
        }
        String s1 = Uri.parse(s).getLastPathSegment();
        zzp.zzbv();
        if (!qa.c(s1))
        {
            a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            zzp.zzbv();
            android.app.AlertDialog.Builder builder = com.google.android.gms.internal.qa.d(b);
            builder.setTitle(zzp.zzby().a(d.I, "Save image"));
            builder.setMessage(zzp.zzby().a(d.H, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(zzp.zzby().a(d.a, "Accept"), new kk(this, s, s1));
            builder.setNegativeButton(zzp.zzby().a(d.G, "Decline"), new kl(this));
            builder.create().show();
            return;
        }
    }
}
