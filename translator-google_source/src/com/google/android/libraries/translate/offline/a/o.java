// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import com.google.android.libraries.translate.offline.d;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            b, n

final class o extends b
{

    final n a;

    o(n n1, Context context, com.google.android.libraries.translate.offline.o o1, d d)
    {
        a = n1;
        super(context, o1, d, false);
    }

    protected final void a(Void void1)
    {
        super.a(void1);
        n.a(a).run();
    }

    protected final void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
