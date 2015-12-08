// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.share.model.AppInviteContent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.widget:
//            b

public final class com.facebook.share.widget.a extends p
{
    private final class a extends com.facebook.internal.p.a
    {

        final com.facebook.share.widget.a b;

        public final boolean a(Object obj)
        {
            return com.facebook.share.widget.a.e();
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (AppInviteContent)obj;
            com.facebook.internal.a a1 = b.c();
            o.a(a1, new com.facebook.share.widget.b(this, ((AppInviteContent) (obj))), com.facebook.share.widget.a.f());
            return a1;
        }

        private a()
        {
            b = com.facebook.share.widget.a.this;
            super(com.facebook.share.widget.a.this);
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends com.facebook.internal.p.a
    {

        final com.facebook.share.widget.a b;

        public final boolean a(Object obj)
        {
            return com.facebook.share.widget.a.g();
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (AppInviteContent)obj;
            com.facebook.internal.a a1 = b.c();
            o.a(a1, com.facebook.share.widget.a.a(((AppInviteContent) (obj))), com.facebook.share.widget.a.f());
            return a1;
        }

        private b()
        {
            b = com.facebook.share.widget.a.this;
            super(com.facebook.share.widget.a.this);
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final int c;

    private com.facebook.share.widget.a(Activity activity)
    {
        super(activity, c);
    }

    static Bundle a(AppInviteContent appinvitecontent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("app_link_url", appinvitecontent.a);
        bundle.putString("preview_image_url", appinvitecontent.b);
        return bundle;
    }

    public static void a(Activity activity, AppInviteContent appinvitecontent)
    {
        (new com.facebook.share.widget.a(activity)).a(appinvitecontent);
    }

    public static boolean d()
    {
        return h() || i();
    }

    static boolean e()
    {
        return h();
    }

    static n f()
    {
        return com.facebook.share.internal.a.a;
    }

    static boolean g()
    {
        return i();
    }

    private static boolean h()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && o.a(com.facebook.share.internal.a.a);
    }

    private static boolean i()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && o.b(com.facebook.share.internal.a.a);
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
        c = com.facebook.internal.m.b.h.a();
    }
}
