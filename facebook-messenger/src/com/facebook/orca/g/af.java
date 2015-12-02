// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.inject.d;
import com.facebook.user.ac;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.g:
//            j, aa, ab, ac

class af extends d
{

    final ab a;

    private af(ab ab)
    {
        a = ab;
        super();
    }

    af(ab ab, com.facebook.orca.g.ac ac1)
    {
        this(ab);
    }

    public j a()
    {
        return new j((aa)a(com/facebook/orca/g/aa), (ac)a(com/facebook/user/ac), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
