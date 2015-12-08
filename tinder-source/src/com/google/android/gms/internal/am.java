// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aq, an, cw

public final class am
    implements aq
{

    private final an a;

    public am(an an)
    {
        a = an;
    }

    public final void a(cw cw, Map map)
    {
        if ((String)map.get("name") == null)
        {
            b.e("App event with no name parameter.");
            return;
        } else
        {
            map.get("info");
            return;
        }
    }
}
