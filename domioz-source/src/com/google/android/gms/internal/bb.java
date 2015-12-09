// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, fl, fj, co

final class bb
    implements bg
{

    bb()
    {
    }

    public final void a(fl fl1, Map map)
    {
        fl1 = fl1.e();
        if (fl1 == null)
        {
            fj.e("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            fl1.a();
            return;
        }
    }
}
