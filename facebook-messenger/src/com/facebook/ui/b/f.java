// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.b;


// Referenced classes of package com.facebook.ui.b:
//            e

class f
    implements android.view.Choreographer.FrameCallback
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void doFrame(long l)
    {
        a.a(l);
    }
}
