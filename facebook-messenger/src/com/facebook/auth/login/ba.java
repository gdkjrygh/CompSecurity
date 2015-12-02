// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.ContentResolver;
import com.facebook.auth.annotations.IsFirstPartySsoEnabled;
import com.facebook.config.a.b;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.auth.login:
//            bm, ap, aq

class ba extends d
{

    final ap a;

    private ba(ap ap)
    {
        a = ap;
        super();
    }

    ba(ap ap, aq aq)
    {
        this(ap);
    }

    public bm a()
    {
        return new bm(b(java/lang/Boolean, com/facebook/auth/annotations/IsFirstPartySsoEnabled), b(com/facebook/config/a/b), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (ContentResolver)e().a(android/content/ContentResolver));
    }

    public Object b()
    {
        return a();
    }
}
