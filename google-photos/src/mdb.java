// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public class mdb
    implements jyq, jys
{

    public final jyn a;
    public final lzl b;
    public final lzm c;
    public final mas d = new mas();

    public mdb(Context context, lzl lzl1, lzm lzm1)
    {
        b = lzl1;
        c = lzm1;
        a = (new jyo(context, this, this)).a(lgu.a).a();
    }

    public Location a()
    {
        return lgu.b.a(a);
    }

    public void a(int i)
    {
        b.c();
    }

    public void a(Bundle bundle)
    {
        b.a();
    }

    public void a(ConnectionResult connectionresult)
    {
        lzm lzm1 = c;
        d.a(connectionresult);
        lzm1.d();
    }

    public void b()
    {
        a.b();
    }

    public void c()
    {
        a.d();
    }

    public boolean d()
    {
        return a.f();
    }

    public boolean e()
    {
        return a.e();
    }
}
