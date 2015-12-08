// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;

final class kal
    implements jys
{

    public final int a;
    public final jyn b;
    public final jys c;
    private kak d;

    public kal(kak kak1, int i, jyn jyn1, jys jys1)
    {
        d = kak1;
        super();
        a = i;
        b = jyn1;
        c = jys1;
        jyn1.a(this);
    }

    public final void a(ConnectionResult connectionresult)
    {
        kak.d(d).post(new kam(d, a, connectionresult));
    }
}
