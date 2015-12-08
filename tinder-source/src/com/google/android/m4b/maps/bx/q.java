// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class q
{
    public static interface a
    {
    }

    public static interface b
    {
    }


    g a;
    int b;
    final g c = new g();
    public a d;
    public b e;
    private final u f;

    public q(u u1)
    {
        a = new g(0, 0);
        b = -1;
        d = null;
        e = null;
        f = u1;
    }

    final void a(g g1, g g2, int i, ar ar1)
    {
        a = g1;
        b = i;
        int j = g1.a();
        int k = g1.c();
        int l = (int)((double)ar1.d() * Math.cos((double)j * 9.9999999999999995E-07D * 0.017453292519943295D) * 0.33527612686157227D);
        int i1 = (int)((double)ar1.a.f() * 0.33527612686157227D);
        boolean flag;
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1 = new ByteArrayOutputStream();
        ar1 = new DataOutputStream(g1);
        ar1.writeInt(j);
        ar1.writeInt(k);
        ar1.writeInt(g2.a());
        ar1.writeInt(g2.c());
        ar1.writeShort(i);
        ar1.writeInt(l);
        ar1.writeInt(i1);
        ar1.writeBoolean(flag);
        ar1.writeBoolean(true);
        f.a(7, g1.toByteArray(), false, false, true);
_L1:
        return;
        g1;
        if (ab.a("ViewPointRecoder", 6))
        {
            Log.e("ViewPointRecoder", "Error writing on the stream", g1);
            return;
        }
          goto _L1
    }
}
