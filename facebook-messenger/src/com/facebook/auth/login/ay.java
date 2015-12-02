// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            am, ap, aq

class ay extends d
{

    final ap a;

    private ay(ap ap)
    {
        a = ap;
        super();
    }

    ay(ap ap, aq aq)
    {
        this(ap);
    }

    public am a()
    {
        return new am((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
