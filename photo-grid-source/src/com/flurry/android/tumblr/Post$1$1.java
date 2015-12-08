// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android.tumblr;

import android.text.TextUtils;
import com.flurry.sdk.dz;
import com.flurry.sdk.jy;
import com.flurry.sdk.kc;
import com.flurry.sdk.lr;
import com.flurry.sdk.lx;

// Referenced classes of package com.flurry.android.tumblr:
//            Post, PostListener

class b extends lr
{

    final dz a;
    final PostListener b;
    final ner c;

    public void a()
    {
        String s1;
        switch (b[a.b.nal()])
        {
        default:
            return;

        case 1: // '\001'
            kc.a(3, Post.h(), (new StringBuilder("Post success for ")).append(a.c).toString());
            b.onPostSuccess(a.f);
            jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.c(c.c));
            lx.a().a(Post.a(c.c));
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
        jy.a().b("com.flurry.android.impl.analytics.tumblr.TumblrEvents", Post.c(c.c));
        lx.a().a(Post.a(c.c));
    }

    ner(ner ner, dz dz1, PostListener postlistener)
    {
        c = ner;
        a = dz1;
        b = postlistener;
        super();
    }
}
