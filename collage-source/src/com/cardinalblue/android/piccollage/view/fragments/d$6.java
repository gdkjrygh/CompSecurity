// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.google.android.gms.auth.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            d

class a
    implements Callable
{

    final d a;

    public String a()
        throws Exception
    {
        return b.a(a.getActivity(), d.d(a), "oauth2:https://picasaweb.google.com/data/");
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
