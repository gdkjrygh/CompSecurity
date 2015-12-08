// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;


// Referenced classes of package com.roidapp.imagelib.facedetector:
//            a, e

final class c
    implements Runnable
{

    final Throwable a;
    final String b;
    final a c;

    c(a a1, Throwable throwable, String s)
    {
        c = a1;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        if (com.roidapp.imagelib.facedetector.a.b(c) != null)
        {
            com.roidapp.imagelib.facedetector.a.b(c).a(a, b);
        }
    }
}
