// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ck, fl, a, es, 
//            aj, ek, cf, cg

public final class ce extends ck
{

    private final Map a;
    private final Context b;

    public ce(fl fl1, Map map)
    {
        super(fl1, "storePicture");
        a = map;
        b = fl1.c();
    }

    static Context a(ce ce1)
    {
        return ce1.b;
    }

    public final void a()
    {
        if (b == null)
        {
            a("Activity context is not available");
            return;
        }
        com.google.android.gms.internal.a.c();
        if (!es.c(b).c())
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
        com.google.android.gms.internal.a.c();
        boolean flag;
        if (TextUtils.isEmpty(s1))
        {
            flag = false;
        } else
        {
            flag = s1.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
        if (!flag)
        {
            a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            com.google.android.gms.internal.a.c();
            android.app.AlertDialog.Builder builder = com.google.android.gms.internal.es.b(b);
            builder.setTitle(com.google.android.gms.internal.a.f().a(b.B, "Save image"));
            builder.setMessage(com.google.android.gms.internal.a.f().a(b.A, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(com.google.android.gms.internal.a.f().a(b.a, "Accept"), new cf(this, s, s1));
            builder.setNegativeButton(com.google.android.gms.internal.a.f().a(b.z, "Decline"), new cg(this));
            builder.create().show();
            return;
        }
    }
}
