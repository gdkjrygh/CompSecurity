// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


// Referenced classes of package com.squareup.a:
//            bi

final class i
    implements Runnable
{

    final bi a;

    i(bi bi1)
    {
        a = bi1;
        super();
    }

    public void run()
    {
        throw new IllegalStateException((new StringBuilder()).append("Transformation ").append(a.a()).append(" returned input Bitmap but recycled it.").toString());
    }
}
