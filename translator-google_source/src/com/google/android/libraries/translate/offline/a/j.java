// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            c, i

final class j extends c
{

    final i a;

    j(i k, Context context, o o, int l)
    {
        a = k;
        super(context, o, l);
    }

    protected final void a(Void void1)
    {
        if (i.a(a) != null)
        {
            i.a(a).run();
        }
        super.a(void1);
    }

    protected final void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
