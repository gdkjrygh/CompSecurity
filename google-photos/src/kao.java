// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class kao extends ei
    implements jyq, jys
{

    public final jyn a;
    boolean b;
    private ConnectionResult l;

    public kao(Context context, jyn jyn1)
    {
        super(context);
        a = jyn1;
    }

    private void b(ConnectionResult connectionresult)
    {
        l = connectionresult;
        if (super.g && !super.h)
        {
            a(connectionresult);
        }
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        b = false;
        b(ConnectionResult.a);
    }

    public final void a(ConnectionResult connectionresult)
    {
        b = true;
        b(connectionresult);
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        a.a(s, filedescriptor, printwriter, as);
    }

    protected final void f()
    {
        super.f();
        a.a(this);
        a.a(this);
        if (l != null)
        {
            a(l);
        }
        if (!a.e() && !a.f() && !b)
        {
            a.b();
        }
    }

    protected final void j()
    {
        a.d();
    }

    protected final void n()
    {
        l = null;
        b = false;
        a.c(this);
        a.c(this);
        a.d();
    }
}
