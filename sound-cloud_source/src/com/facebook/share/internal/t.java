// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.internal.a;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.internal:
//            LikeContent, v, u

public final class t extends p
{
    private final class a extends com.facebook.internal.p.a
    {

        final t b;

        public final boolean a(Object obj)
        {
            return (LikeContent)obj != null && t.d();
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (LikeContent)obj;
            com.facebook.internal.a a1 = b.c();
            o.a(a1, new u(this, ((LikeContent) (obj))), t.f());
            return a1;
        }

        private a()
        {
            b = t.this;
            super(t.this);
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends com.facebook.internal.p.a
    {

        final t b;

        public final boolean a(Object obj)
        {
            return (LikeContent)obj != null && t.e();
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (LikeContent)obj;
            com.facebook.internal.a a1 = b.c();
            o.a(a1, com.facebook.share.internal.t.a(((LikeContent) (obj))), t.f());
            return a1;
        }

        private b()
        {
            b = t.this;
            super(t.this);
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final int c;

    public t(Activity activity)
    {
        super(activity, c);
    }

    public t(Fragment fragment)
    {
        super(fragment, c);
    }

    static Bundle a(LikeContent likecontent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", likecontent.a);
        bundle.putString("object_type", likecontent.b);
        return bundle;
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && o.a(com.facebook.share.internal.v.a);
    }

    public static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && o.b(com.facebook.share.internal.v.a);
    }

    static n f()
    {
        return com.facebook.share.internal.v.a;
    }

    protected final List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new a((byte)0));
        arraylist.add(new b((byte)0));
        return arraylist;
    }

    protected final com.facebook.internal.a c()
    {
        return new com.facebook.internal.a(super.b);
    }

    static 
    {
        c = com.facebook.internal.m.b.d.a();
    }
}
