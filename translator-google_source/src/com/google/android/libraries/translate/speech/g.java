// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;


// Referenced classes of package com.google.android.libraries.translate.speech:
//            f

final class g
    implements Runnable
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void run()
    {
        a.onError(1001);
    }
}
