// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.internal.U;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.share.a;
import com.facebook.share.internal.D;
import com.facebook.share.internal.E;
import com.facebook.share.internal.G;
import com.facebook.share.internal.N;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.z;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.widget:
//            j

public final class i extends p
    implements com.facebook.share.a
{
    private final class a extends com.facebook.internal.p.a
    {

        final i b;

        public final Object a()
        {
            return b.d;
        }

        public final volatile boolean a(Object obj)
        {
            obj = (ShareContent)obj;
            return (obj instanceof ShareLinkContent) || (obj instanceof ShareFeedContent);
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (ShareContent)obj;
            com.facebook.share.widget.i.a(b, i.c(b), ((ShareContent) (obj)), b.d);
            com.facebook.internal.a a1 = b.c();
            if (obj instanceof ShareLinkContent)
            {
                ShareLinkContent sharelinkcontent = (ShareLinkContent)obj;
                D.a(sharelinkcontent);
                obj = new Bundle();
                U.a(((Bundle) (obj)), "name", sharelinkcontent.b);
                U.a(((Bundle) (obj)), "description", sharelinkcontent.a);
                U.a(((Bundle) (obj)), "link", U.a(((ShareContent) (sharelinkcontent)).h));
                U.a(((Bundle) (obj)), "picture", U.a(sharelinkcontent.c));
            } else
            {
                ShareFeedContent sharefeedcontent = (ShareFeedContent)obj;
                obj = new Bundle();
                U.a(((Bundle) (obj)), "to", sharefeedcontent.a);
                U.a(((Bundle) (obj)), "link", sharefeedcontent.b);
                U.a(((Bundle) (obj)), "picture", sharefeedcontent.f);
                U.a(((Bundle) (obj)), "source", sharefeedcontent.g);
                U.a(((Bundle) (obj)), "name", sharefeedcontent.c);
                U.a(((Bundle) (obj)), "caption", sharefeedcontent.d);
                U.a(((Bundle) (obj)), "description", sharefeedcontent.e);
            }
            o.a(a1, "feed", ((Bundle) (obj)));
            return a1;
        }

        private a()
        {
            b = i.this;
            super(i.this);
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/facebook/share/widget/i$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("AUTOMATIC", 0);
            b = new b("NATIVE", 1);
            c = new b("WEB", 2);
            d = new b("FEED", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int j)
        {
            super(s, j);
        }
    }

    private final class c extends com.facebook.internal.p.a
    {

        final i b;

        public final Object a()
        {
            return b.b;
        }

        public final boolean a(Object obj)
        {
            obj = (ShareContent)obj;
            return obj != null && com.facebook.share.widget.i.a(obj.getClass());
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (ShareContent)obj;
            com.facebook.share.widget.i.a(b, com.facebook.share.widget.i.a(b), ((ShareContent) (obj)), b.b);
            D.a(((ShareContent) (obj)), D.a());
            com.facebook.internal.a a1 = b.c();
            o.a(a1, new j(this, a1, ((ShareContent) (obj)), b.c), i.b(obj.getClass()));
            return a1;
        }

        private c()
        {
            b = i.this;
            super(i.this);
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d extends com.facebook.internal.p.a
    {

        final i b;

        public final Object a()
        {
            return b.c;
        }

        public final boolean a(Object obj)
        {
            obj = (ShareContent)obj;
            return obj != null && i.c(obj.getClass());
        }

        public final com.facebook.internal.a b(Object obj)
        {
            obj = (ShareContent)obj;
            com.facebook.share.widget.i.a(b, i.b(b), ((ShareContent) (obj)), b.c);
            com.facebook.internal.a a1 = b.c();
            D.a(((ShareContent) (obj)));
            Bundle bundle;
            if (obj instanceof ShareLinkContent)
            {
                ShareLinkContent sharelinkcontent = (ShareLinkContent)obj;
                bundle = new Bundle();
                U.a(bundle, "href", ((ShareContent) (sharelinkcontent)).h);
            } else
            {
                bundle = N.a((ShareOpenGraphContent)obj);
            }
            if (obj instanceof ShareLinkContent)
            {
                obj = "share";
            } else
            if (obj instanceof ShareOpenGraphContent)
            {
                obj = "share_open_graph";
            } else
            {
                obj = null;
            }
            o.a(a1, ((String) (obj)), bundle);
            return a1;
        }

        private d()
        {
            b = i.this;
            super(i.this);
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final int d;
    boolean c;
    private boolean e;

    i(Activity activity, int j)
    {
        super(activity, j);
        c = false;
        e = true;
        G.a(j);
    }

    i(Fragment fragment, int j)
    {
        super(fragment, j);
        c = false;
        e = true;
        G.a(j);
    }

    static Activity a(i j)
    {
        return j.a();
    }

    static void a(i j, Context context, ShareContent sharecontent, b b1)
    {
        if (j.e)
        {
            b1 = com.facebook.share.widget.b.a;
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[com.facebook.share.widget.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.facebook.share.widget._cls1.a[b1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 101
    //                   2 107
    //                   3 113;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_113;
_L1:
        b1 = "unknown";
_L5:
        j = d(sharecontent.getClass());
        if (j == E.a)
        {
            j = "status";
        } else
        if (j == E.b)
        {
            j = "photo";
        } else
        if (j == E.c)
        {
            j = "video";
        } else
        if (j == z.a)
        {
            j = "open_graph";
        } else
        {
            j = "unknown";
        }
        context = com.facebook.a.a.a(context);
        sharecontent = new Bundle();
        sharecontent.putString("fb_share_dialog_show", b1);
        sharecontent.putString("fb_share_dialog_content_type", j);
        context.a("fb_share_dialog_show", sharecontent, true);
        return;
_L2:
        b1 = "automatic";
          goto _L5
_L3:
        b1 = "web";
          goto _L5
        b1 = "native";
          goto _L5
    }

    static boolean a(Class class1)
    {
        class1 = d(class1);
        return class1 != null && o.a(class1);
    }

    static Activity b(i j)
    {
        return j.a();
    }

    static n b(Class class1)
    {
        return d(class1);
    }

    static Activity c(i j)
    {
        return j.a();
    }

    static boolean c(Class class1)
    {
        return com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1) || com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1);
    }

    private static n d(Class class1)
    {
        if (com/facebook/share/model/ShareLinkContent.isAssignableFrom(class1))
        {
            return E.a;
        }
        if (com/facebook/share/model/SharePhotoContent.isAssignableFrom(class1))
        {
            return E.b;
        }
        if (com/facebook/share/model/ShareVideoContent.isAssignableFrom(class1))
        {
            return E.c;
        }
        if (com/facebook/share/model/ShareOpenGraphContent.isAssignableFrom(class1))
        {
            return z.a;
        } else
        {
            return null;
        }
    }

    protected final List b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new c((byte)0));
        arraylist.add(new a((byte)0));
        arraylist.add(new d((byte)0));
        return arraylist;
    }

    protected final com.facebook.internal.a c()
    {
        return new com.facebook.internal.a(super.b);
    }

    static 
    {
        d = com.facebook.internal.m.b.b.a();
    }
}
