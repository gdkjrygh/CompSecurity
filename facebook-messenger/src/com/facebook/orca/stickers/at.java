// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.http.protocol.i;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.b;
import com.facebook.orca.protocol.methods.m;

// Referenced classes of package com.facebook.orca.stickers:
//            w, c, e, ak, 
//            am, an

class at extends d
{

    final am a;

    private at(am am)
    {
        a = am;
        super();
    }

    at(am am, an an)
    {
        this(am);
    }

    public w a()
    {
        return new w((i)a(com/facebook/http/protocol/i), (m)a(com/facebook/orca/protocol/methods/m), (b)a(com/facebook/orca/protocol/methods/b), (c)a(com/facebook/orca/stickers/c), (e)a(com/facebook/orca/stickers/e), (ak)a(com/facebook/orca/stickers/ak));
    }

    public Object b()
    {
        return a();
    }
}
