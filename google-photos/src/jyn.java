// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface jyn
{

    public abstract Looper a();

    public abstract ConnectionResult a(long l, TimeUnit timeunit);

    public abstract jyl a(jym jym);

    public abstract jzb a(jzb jzb);

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract void a(jyq jyq);

    public abstract void a(jys jys);

    public abstract jzb b(jzb jzb);

    public abstract void b();

    public abstract boolean b(jyq jyq);

    public abstract boolean b(jys jys);

    public abstract ConnectionResult c();

    public abstract void c(jyq jyq);

    public abstract void c(jys jys);

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();
}
