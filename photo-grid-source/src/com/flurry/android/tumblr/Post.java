// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android.tumblr;

import android.os.Bundle;
import com.flurry.sdk.jx;
import com.flurry.sdk.jy;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.flurry.android.tumblr:
//            PostListener

public abstract class Post
{

    private static final String a = com/flurry/android/tumblr/Post.getName();
    private static AtomicInteger g = new AtomicInteger(0);
    private String b;
    private String c;
    private String d;
    private PostListener e;
    private int f;
    private final jx h = new _cls1();

    Post()
    {
        f = 0;
        f = g.incrementAndGet();
        jy.a().a("com.flurry.android.impl.analytics.tumblr.TumblrEvents", h);
    }

    static int a(Post post)
    {
        return post.f;
    }

    static PostListener b(Post post)
    {
        return post.e;
    }

    static jx c(Post post)
    {
        return post.h;
    }

    static String h()
    {
        return a;
    }

    abstract Bundle c();

    String d()
    {
        return c;
    }

    String e()
    {
        return b;
    }

    String f()
    {
        return d;
    }

    int g()
    {
        return f;
    }

    public void setAndroidDeeplink(String s)
    {
        c = s;
    }

    public void setIOSDeepLink(String s)
    {
        b = s;
    }

    public void setPostListener(PostListener postlistener)
    {
        e = postlistener;
    }

    public void setWebLink(String s)
    {
        d = s;
    }


    private class _cls1
        implements jx
    {

        final Post a;

        public void a(dz dz1)
        {
            if (dz1.c == Post.a(a) && dz1.b != null)
            {
                PostListener postlistener = Post.b(a);
                if (postlistener != null)
                {
                    class _cls1 extends lr
                    {

                        final dz a;
                        final PostListener b;
                        final _cls1 c;

                        public void a()
                        {
                            String s1;
                            switch (_cls2.a[a.b.ordinal()])
                            {
                            default:
                                return;

                            case 1: // '\001'
                                kc.a(3, Post.h(), (new StringBuilder("Post success for ")).append(a.c).toString());
                                b.onPostSuccess(a.f);
                                jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.c(c.a));
                                lx.a().a(Post.a(c.a));
                                return;

                            case 2: // '\002'
                                s1 = a.e;
                                break;
                            }
                            String s = s1;
                            if (TextUtils.isEmpty(s1))
                            {
                                s = "Internal error.";
                            }
                            kc.a(3, Post.h(), (new StringBuilder("Post failed for ")).append(a.c).append(" with error code: ").append(a.d).append("  and error message: ").append(s).toString());
                            b.onPostFailure(s);
                            jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.c(c.a));
                            lx.a().a(Post.a(c.a));
                        }

                _cls1(dz dz1, PostListener postlistener)
                {
                    c = _cls1.this;
                    a = dz1;
                    b = postlistener;
                    super();
                }

                        private class _cls2
                        {

                            static final int a[];

                            static 
                            {
                                a = new int[com.flurry.sdk.dz.a.values().length];
                                try
                                {
                                    a[com.flurry.sdk.dz.a.a.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[com.flurry.sdk.dz.a.b.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                    }

                    jo.a().a(new _cls1(dz1, postlistener));
                    return;
                }
            }
        }

        public void a(jw jw)
        {
            a((dz)jw);
        }

        _cls1()
        {
            a = Post.this;
            super();
        }
    }

}
