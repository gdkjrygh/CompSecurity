// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.cmcm.a.a.d;
import com.cmcm.adsdk.nativead.aa;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk:
//            e

public final class f
{

    public e a;
    aa b;
    private Context c;

    public f(Context context, String s)
    {
        b = null;
        if (context instanceof Activity)
        {
            c = context.getApplicationContext();
        } else
        {
            c = context;
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("posid can't be null");
        } else
        {
            b = new aa(c, s);
            return;
        }
    }

    public final void a()
    {
        if (a != null)
        {
            b.setRequestParams(a);
        }
        b.loadAd();
    }

    public final void a(d d)
    {
        if (b != null)
        {
            b.setAdListener(d);
        }
    }

    public final List b()
    {
        if (b != null)
        {
            return b.getAdList(20);
        } else
        {
            return null;
        }
    }
}
