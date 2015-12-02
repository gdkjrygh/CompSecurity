// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.http.protocol.i;
import com.facebook.inject.d;
import com.facebook.orca.annotations.MessengerImageResizer;
import com.facebook.orca.j.c;
import com.facebook.orca.protocol.methods.ab;
import com.facebook.ui.media.b.a;

// Referenced classes of package com.facebook.orca.photos.b:
//            x, h, a, aa, 
//            o, p

class t extends d
{

    final o a;

    private t(o o)
    {
        a = o;
        super();
    }

    t(o o, p p)
    {
        this(o);
    }

    public x a()
    {
        return new x((i)a(com/facebook/http/protocol/i), (ab)a(com/facebook/orca/protocol/methods/ab), (c)a(com/facebook/orca/j/c), (a)a(com/facebook/ui/media/b/a), (com.facebook.common.time.a)a(com/facebook/common/time/a), (h)a(com/facebook/orca/photos/b/h), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), b(com/facebook/j/a/a/a, com/facebook/orca/annotations/MessengerImageResizer), (com.facebook.orca.photos.b.a)a(com/facebook/orca/photos/b/a), (aa)a(com/facebook/orca/photos/b/aa));
    }

    public Object b()
    {
        return a();
    }
}
