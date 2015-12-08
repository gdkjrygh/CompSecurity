// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class a
    implements Callable
{

    final String a;
    final i b;

    public CBCollagesResponse a()
        throws Exception
    {
        i.b(b).set(true);
        if (TextUtils.isEmpty(a))
        {
            return b.e().a();
        } else
        {
            return b.e().a(a);
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    esResponse(i j, String s)
    {
        b = j;
        a = s;
        super();
    }
}
