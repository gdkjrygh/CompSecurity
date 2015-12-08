// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class jqh
    implements jsk
{

    final int a;
    final jrk b;
    final jso c;
    final jqg d;

    jqh(jqg jqg1, int i, jrk jrk, jso jso)
    {
        d = jqg1;
        a = i;
        b = jrk;
        c = jso;
        super();
    }

    public final void a()
    {
        jqg.a(d).post(new jqi(this));
    }
}
