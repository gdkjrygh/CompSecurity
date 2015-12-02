// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a.a;

import android.net.Uri;
import android.os.Bundle;
import java.util.Comparator;

// Referenced classes of package com.facebook.i.a.a:
//            c, d

public abstract class b
{

    static Comparator a = new c();
    private final Uri b;
    private final int c;

    protected b(Uri uri, int i)
    {
        b = uri;
        c = i;
    }

    static int a(b b1)
    {
        return b1.c;
    }

    public abstract void a();

    public abstract void a(Uri uri, d d);

    public abstract void a(Bundle bundle);

    public abstract boolean a(Uri uri, Object obj);

    public int b()
    {
        return c;
    }

    public abstract void b(Bundle bundle);

    public Uri c()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

}
