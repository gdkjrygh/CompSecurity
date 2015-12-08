// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.jg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class com.google.android.gms.common.api.a
{
    public static interface a
    {
    }

    public static final class a.b
        implements a.c
    {

        private a.b()
        {
        }
    }

    public static interface a.c
        extends a
    {
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract boolean c();
    }

    public static interface c
    {

        public abstract int a();

        public abstract b a(Context context, Looper looper, jg jg, Object obj, h.b b1, h.c c1);
    }

    public static final class d
    {

        public d()
        {
        }
    }


    private final c a;
    private final d b;
    private final ArrayList c;

    public transient com.google.android.gms.common.api.a(c c1, d d1, Scope ascope[])
    {
        a = c1;
        b = d1;
        c = new ArrayList(Arrays.asList(ascope));
    }

    public c a()
    {
        return a;
    }

    public List b()
    {
        return c;
    }

    public d c()
    {
        return b;
    }

    // Unreferenced inner class com/google/android/gms/common/api/a$a$a
    /* block-local class not found */
    class a.a {}


    // Unreferenced inner class com/google/android/gms/common/api/a$a$d
    /* block-local class not found */
    class a.d {}

}
