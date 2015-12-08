// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ad;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kik.a.d.k;
import kik.a.e.r;

// Referenced classes of package com.kik.view.adapters:
//            j

public final class bd extends j
{

    private Map d;

    public bd(Context context, ad ad, r r, a a1)
    {
        super(context, new ArrayList(), ad, r, a1);
        d = new LinkedHashMap();
    }

    public bd(Context context, ArrayList arraylist, Map map, ad ad, r r, a a1)
    {
        super(context, arraylist, ad, r, a1);
        d = map;
    }

    protected final void a(j.a a1, k k1)
    {
        if (k1.g())
        {
            k1 = getContext().getString(0x7f090202);
        } else
        if (d.containsKey(k1.b()))
        {
            k1 = (String)d.get(k1.b());
        } else
        {
            k1 = k1.e();
        }
        a1.e.setText(k1);
    }
}
