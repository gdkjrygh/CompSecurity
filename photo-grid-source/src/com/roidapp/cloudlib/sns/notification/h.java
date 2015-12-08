// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import com.roidapp.cloudlib.sns.b.m;
import com.roidapp.cloudlib.sns.basepost.PostCommentsTextView;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f

final class h
    implements m
{

    final String a;
    final String b;
    final String c;
    final com.roidapp.cloudlib.sns.b.h d;
    final int e;
    final f f;

    h(f f1, String s, String s1, String s2, com.roidapp.cloudlib.sns.b.h h1, int i)
    {
        f = f1;
        a = s;
        b = s1;
        c = s2;
        d = h1;
        e = i;
        super();
    }

    public final void a(PostCommentsTextView postcommentstextview, String s)
    {
        com.roidapp.cloudlib.sns.notification.f.a(f, a, b, c, d, e, postcommentstextview);
    }
}
