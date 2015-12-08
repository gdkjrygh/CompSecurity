// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            hb, hm

public static final class Gl extends Gl
{

    private hb Gl;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        hm.b("onPostInitComplete can be called only once per call to getServiceFromBroker", Gl);
        Gl.a(i, ibinder, bundle);
        Gl = null;
    }

    public (hb hb1)
    {
        Gl = hb1;
    }
}
