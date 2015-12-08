// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


// Referenced classes of package com.google.android.apps.translate.inputs:
//            h, Camera2InputPopup

final class i
    implements Runnable
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void run()
    {
        Camera2InputPopup.a(a.b, a.a);
    }
}
