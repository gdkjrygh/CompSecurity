// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.content.Context;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class b
    implements Callable
{

    final Context a;
    final String b;
    final PCGCMIntentService c;

    public String a()
        throws Exception
    {
        String s = f.c(a, b);
        if (TextUtils.isEmpty(s))
        {
            throw new Exception("No echo emplate");
        } else
        {
            return s;
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PCGCMIntentService pcgcmintentservice, Context context, String s)
    {
        c = pcgcmintentservice;
        a = context;
        b = s;
        super();
    }
}
