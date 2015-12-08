// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.d;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            i, f

public final class g extends i
    implements d
{

    private final String c = c("photo_fife_url");

    public g(DataHolder dataholder, int j)
    {
        super(dataholder, j);
    }

    public final Object a()
    {
        String s1 = c;
        int j = f("photo_max_width");
        int k = f("photo_max_height");
        String s;
        if (a("photo_attributions") && !e("photo_attributions"))
        {
            s = c("photo_attributions");
        } else
        {
            s = null;
        }
        return new f(s1, j, k, s, b);
    }
}
