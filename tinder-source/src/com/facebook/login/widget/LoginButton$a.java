// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import com.facebook.internal.LoginAuthorizationType;
import com.facebook.internal.m;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

static final class d
{

    DefaultAudience a;
    List b;
    LoginAuthorizationType c;
    LoginBehavior d;

    public final void a(List list)
    {
        if (LoginAuthorizationType.b.equals(c))
        {
            throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
        } else
        {
            b = list;
            c = LoginAuthorizationType.a;
            return;
        }
    }

    public final void b(List list)
    {
        if (LoginAuthorizationType.a.equals(c))
        {
            throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
        }
        if (m.a(list))
        {
            throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
        } else
        {
            b = list;
            c = LoginAuthorizationType.b;
            return;
        }
    }

    Type()
    {
        a = DefaultAudience.c;
        b = Collections.emptyList();
        c = null;
        d = LoginBehavior.a;
    }
}
