// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.content.Context;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            x, w

final class r extends x
{

    final Context a;

    r(w w, Context context)
    {
        a = context;
        super(w);
    }

    public final volatile void a(Object obj)
    {
        obj = (p)obj;
        q.a(a).a(((p) (obj)));
        super.a(obj);
    }
}
