// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.internal.to;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            d, c, l

public abstract class h
{

    public h()
    {
    }

    public Looper a()
    {
        throw new UnsupportedOperationException();
    }

    public c a(d d)
    {
        throw new UnsupportedOperationException();
    }

    public to a(to to)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void a(l l);

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract void b();

    public abstract void b(l l);

    public abstract void c();
}
