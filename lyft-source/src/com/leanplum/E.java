// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.Context;
import android.os.AsyncTask;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            Leanplum

final class E extends AsyncTask
{

    private final Context a;
    private final String b;
    private final Map c;
    private final boolean d;

    E(Context context, String s, Map map, boolean flag)
    {
        a = context;
        b = s;
        c = map;
        d = flag;
        super();
    }

    protected final transient Object doInBackground(Object aobj[])
    {
        Leanplum.a(a, b, c, d);
        return null;
    }
}
