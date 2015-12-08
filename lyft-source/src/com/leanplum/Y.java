// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.AsyncTask;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            g, T

final class Y extends AsyncTask
{

    private T a;
    private final String b;
    private final Map c;

    Y(T t, String s, Map map)
    {
        a = t;
        b = s;
        c = map;
        super();
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        T.a(a, g.a, g.q, b, c);
        return null;
    }
}
