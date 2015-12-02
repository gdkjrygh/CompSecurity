// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.common.e.h;
import com.facebook.inject.d;
import com.facebook.user.ac;

// Referenced classes of package com.facebook.auth.d:
//            r

class t extends d
{

    private t()
    {
    }

    t(r r)
    {
        this();
    }

    public com.facebook.auth.b.d a()
    {
        return new com.facebook.auth.b.d((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.auth.viewercontext.d)a(com/facebook/auth/viewercontext/d), (ac)a(com/facebook/user/ac), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
