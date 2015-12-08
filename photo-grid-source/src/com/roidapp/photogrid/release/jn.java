// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;


// Referenced classes of package com.roidapp.photogrid.release:
//            jm, ImageSelector

final class jn
    implements Runnable
{

    final jm a;

    jn(jm jm1)
    {
        a = jm1;
        super();
    }

    public final void run()
    {
        ImageSelector.t(a.a);
    }
}
