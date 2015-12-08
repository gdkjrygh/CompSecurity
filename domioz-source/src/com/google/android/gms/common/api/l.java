// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            j, h, y, n, 
//            o

public interface l
{

    public abstract Context a();

    public abstract h a(j j);

    public abstract y a(y y);

    public abstract void a(n n);

    public abstract void a(o o);

    public abstract void a(String s, PrintWriter printwriter);

    public abstract Looper b();

    public abstract y b(y y);

    public abstract void b(n n);

    public abstract void b(o o);

    public abstract void c();

    public abstract ConnectionResult d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();
}
