// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android.tumblr;

import com.flurry.sdk.dz;
import com.flurry.sdk.jo;
import com.flurry.sdk.jw;
import com.flurry.sdk.jx;

// Referenced classes of package com.flurry.android.tumblr:
//            Post

class a
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
                    final Post._cls1 c;

                    public void a()
                    {
                        String s1;
                        switch (Post._cls2.a[a.b.ordinal()])
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
                c = Post._cls1.this;
                a = dz1;
                b = postlistener;
                super();
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

    _cls1(Post post)
    {
        a = post;
        super();
    }
}
