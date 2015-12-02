// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.t;

public abstract class a
{

    public a()
    {
    }

    public abstract com.facebook.ads.internal.util.b.a a();

    protected void a(Context context, Uri uri)
    {
        uri = uri.getQueryParameter("native_click_report_url");
        if (t.a(uri))
        {
            return;
        } else
        {
            (new p()).execute(new String[] {
                uri
            });
            h.a(context, "Click logged");
            return;
        }
    }

    public abstract void b();
}
