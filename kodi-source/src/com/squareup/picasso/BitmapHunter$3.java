// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            BitmapHunter, Transformation

static final class val.e
    implements Runnable
{

    final RuntimeException val$e;
    final Transformation val$transformation;

    public void run()
    {
        throw new RuntimeException((new StringBuilder()).append("Transformation ").append(val$transformation.key()).append(" crashed with exception.").toString(), val$e);
    }

    (Transformation transformation1, RuntimeException runtimeexception)
    {
        val$transformation = transformation1;
        val$e = runtimeexception;
        super();
    }
}
