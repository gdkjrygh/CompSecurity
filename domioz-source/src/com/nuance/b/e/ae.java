// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.a.ab;
import com.nuance.b.a.z;
import com.nuance.b.b.aq;
import com.nuance.b.b.ar;
import java.util.List;

// Referenced classes of package com.nuance.b.e:
//            ad

final class ae
    implements Runnable
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void run()
    {
        boolean flag1 = true;
        Log.d("NinaInterpretationHandlerRunnable", "Giving ConversationManager the interpretation");
        a.d.a(a.e);
        boolean flag;
        boolean flag2;
        if (a.e.a == ar.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = ad.a(a);
        if (flag || flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.d.e().size() != 0 || a.d.f().size() != 0)
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            Log.d("NinaInterpretationHandlerRunnable", "Employing default NO_MATCH behavior");
            a.d.b(ad.b(a));
            a.d.c(ad.c(a));
            a.d.a(ab.e);
        }
    }
}
