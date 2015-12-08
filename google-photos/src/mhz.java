// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.TimeUnit;

public final class mhz extends mht
{

    private static final mau b = new mia();
    private static final mau c = new mib();
    private static final mau d = new mic();
    private static final mau e = new mid();

    public mhz(Context context, String s, mhf mhf)
    {
        super(context, s, mhf);
    }

    public final lzv a(String s)
    {
        return new lzv(lnq.c.b(a, s), b);
    }

    public final lzv a(String s, mhp mhp1, boolean flag)
    {
        mhp1.a(flag);
        return new lzv(lnq.c.a(a, s, ((mih)mhp1).a), c);
    }

    public final lzv a(String s, String as[])
    {
        return new lzv(lnq.c.a(a, s, as), e);
    }

    public final volatile lzv a(mhj mhj)
    {
        return super.a(mhj);
    }

    public final volatile void a()
    {
        super.a();
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final volatile void a(long l, TimeUnit timeunit)
    {
        super.a(l, timeunit);
    }

    public final volatile void a(Bundle bundle)
    {
        super.a(bundle);
    }

    public final volatile void a(ConnectionResult connectionresult)
    {
        super.a(connectionresult);
    }

    public final volatile void a(mhg mhg)
    {
        super.a(mhg);
    }

    public final lzv b(String s)
    {
        return new lzv(lnq.c.a(a, s), d);
    }

    public final volatile void b()
    {
        super.b();
    }

    public final volatile lzv c(String s)
    {
        return super.c(s);
    }

    public final volatile boolean c()
    {
        return super.c();
    }

    public final volatile lzv d()
    {
        return super.d();
    }

}
