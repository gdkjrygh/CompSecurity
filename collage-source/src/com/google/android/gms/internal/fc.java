// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            ey, gw, hs

public class fc extends ey
{

    fc(Context context, gl.a a1, hs hs, fb.a a2)
    {
        super(context, a1, hs, a2);
    }

    protected void a()
    {
    }

    protected void b(long l)
        throws fa.a
    {
        gw.a.post(new zzgb._cls1(this));
        a(l);
    }
}
