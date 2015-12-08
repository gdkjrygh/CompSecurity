// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.b.c;
import com.google.android.m4b.maps.g.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.m4b.maps.h:
//            s, d

static final class j extends c
    implements j, j
{

    public final d j;
    boolean k;
    private a l;

    private void b(a a1)
    {
        l = a1;
        if (super.e && !super.f)
        {
            a(a1);
        }
    }

    protected final void a()
    {
        super.a();
        j.a(this);
        j.a(this);
        if (l != null)
        {
            a(l);
        }
        if (!j.d() && !j.e() && !k)
        {
            j.b();
        }
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        k = false;
        b(a.a);
    }

    public final void a(a a1)
    {
        k = true;
        b(a1);
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s1, filedescriptor, printwriter, as);
        j.a(s1, printwriter);
    }

    protected final void b()
    {
        j.c();
    }

    protected final void c()
    {
        l = null;
        k = false;
        j.b(this);
        j.b(this);
        j.c();
    }

    public (Context context, d d1)
    {
        super(context);
        j = d1;
    }
}
