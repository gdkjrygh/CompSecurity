// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.auth.annotations.AuthTokenString;
import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.auth.annotations.IsMeUserFb4aDeveloper;
import com.facebook.auth.annotations.IsMeUserTrustedTester;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.common.w.q;
import com.facebook.inject.a.a;
import com.facebook.inject.a.c;
import com.facebook.inject.at;
import com.facebook.inject.b;

public class u extends b
{

    public u()
    {
    }

    protected void a()
    {
        b(java/lang/Integer).a(com/facebook/auth/annotations/LoggedInUserId).a(at.a(java/lang/Integer, com/facebook/auth/annotations/LoggedInUserId));
        b(java/lang/String).a(com/facebook/auth/annotations/AuthTokenString).a(at.a(java/lang/String, com/facebook/auth/annotations/AuthTokenString));
        b(com/facebook/common/w/q).a(com/facebook/auth/annotations/IsMeUserAnEmployee).a(q.UNSET);
        b(com/facebook/common/w/q).a(com/facebook/auth/annotations/IsMeUserFb4aDeveloper).a(q.UNSET);
        b(com/facebook/common/w/q).a(com/facebook/auth/annotations/IsMeUserTrustedTester).a(q.UNSET);
    }
}
