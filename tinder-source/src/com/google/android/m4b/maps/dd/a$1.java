// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.dd;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.v.i;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.m4b.maps.dd:
//            a, d

final class 
    implements com.google.android.m4b.maps.h.
{

    public final com.google.android.m4b.maps.h. a(Context context, Looper looper, g g, Object obj, com.google.android.m4b.maps.h. , com.google.android.m4b.maps.h. 1)
    {
        obj = (d)obj;
        if (obj == null)
        {
            obj = d.a;
        }
        return new i(context, looper, true, g, ((d) (obj)), , 1, Executors.newSingleThreadExecutor());
    }

    ()
    {
    }
}
