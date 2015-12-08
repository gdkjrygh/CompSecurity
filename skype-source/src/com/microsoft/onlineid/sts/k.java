// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import com.microsoft.onlineid.internal.e.f;
import java.util.Comparator;

// Referenced classes of package com.microsoft.onlineid.sts:
//            a, b

public final class k
{

    private static int a = -1;
    private static final Comparator e = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (b)obj;
            obj1 = (b)obj1;
            return ((b) (obj)).b().compareTo(((b) (obj1)).b());
        }

    };
    private final Context b;
    private a c;
    private final f d;

    protected k()
    {
        b = null;
        d = null;
    }

    public k(Context context)
    {
        b = context;
        c = new a(b);
        d = new f(b);
    }

}
