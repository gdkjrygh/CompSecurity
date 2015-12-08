// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Bundle;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.g.a;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bf

static final class <init>
    implements com.google.android.m4b.maps.h., com.google.android.m4b.maps.h.
{

    public final void a(int i)
    {
        if (ab.a(bf.b(), 5))
        {
            Log.w(bf.b(), "Connection to Clearcut logger service is suspended.");
        }
    }

    public final void a(Bundle bundle)
    {
        if (ab.a(bf.b(), 4))
        {
            Log.i(bf.b(), "Connected to Clearcut logger service.");
        }
    }

    public final void a(a a1)
    {
        if (ab.a(bf.b(), 5))
        {
            Log.w(bf.b(), "Connection to Clearcut logger service has failed.");
        }
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
