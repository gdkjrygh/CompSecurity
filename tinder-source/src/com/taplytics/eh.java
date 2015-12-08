// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.os.AsyncTask;
import com.android.volley.Request;
import com.android.volley.a.h;

// Referenced classes of package com.taplytics:
//            el, ei, ej, dp

public final class eh extends AsyncTask
{

    final dp a;

    public eh(dp dp1)
    {
        a = dp1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (el)aobj[0];
        aobj = new h("https://api.github.com/repos/taplytics/taplytics-android-sdk/releases", new ei(this, ((el) (aobj))), new ej(this, ((el) (aobj))));
        aobj.l = "github_release";
        a.f.a(((Request) (aobj)));
        return null;
    }
}
