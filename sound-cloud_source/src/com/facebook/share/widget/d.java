// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.share.a;
import com.facebook.share.internal.B;
import com.facebook.share.internal.D;
import com.facebook.share.internal.G;
import com.facebook.share.internal.x;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.widget:
//            e

public final class d extends p
    implements com.facebook.share.a
{
    private final class a extends com.facebook.internal.p.a
    {

        final d b;

        public final boolean a(Object obj)
        {
            obj = (ShareContent)obj;
            return obj != null && com.facebook.share.widget.d.a(obj.getClass());
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (ShareContent)obj;
            D.a(((ShareContent) (obj)), D.a());
            com.facebook.internal.a a1 = b.c();
            boolean flag = b.c;
            com.facebook.share.widget.d.a(b);
            o.a(a1, new e(this, a1, ((ShareContent) (obj)), flag), d.b(obj.getClass()));
            return a1;
        }

        private a()
        {
            b = d.this;
            super(d.this);
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final int d;
    boolean c;

    d(Activity activity, int i)
    {
        super(activity, i);
        c = false;
        G.a(i);
    }

    d(Fragment fragment, int i)
    {
        super(fragment, i);
        c = false;
        G.a(i);
    }

    static Activity a(d d1)
    {
        return d1.a();
    }

    public static boolean a(Class class1)
    {
        class1 = c(class1);
        return class1 != null && o.a(class1);
    }

    static n b(Class class1)
    {
        return c(class1);
    }

    private static n c(Class class1)
    {
        if (com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1))
        {
            return x.a;
        }
        if (com/facebook/share/model/SharePhotoContent.isAssignableFrom(class1))
        {
            return x.b;
        }
        if (com/facebook/share/model/ShareVideoContent.isAssignableFrom(class1))
        {
            return x.c;
        }
        if (com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1))
        {
            return B.a;
        } else
        {
            return null;
        }
    }

    protected final List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new a((byte)0));
        return arraylist;
    }

    protected final com.facebook.internal.a c()
    {
        return new com.facebook.internal.a(super.b);
    }

    static 
    {
        d = com.facebook.internal.m.b.c.a();
    }
}
