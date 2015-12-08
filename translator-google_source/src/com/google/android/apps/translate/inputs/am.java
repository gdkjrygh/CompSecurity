// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.translate.b.b;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            al, Camera2InputPopup

final class am
    implements Runnable
{

    final int a;
    final al b;

    am(al al1, int i)
    {
        b = al1;
        a = i;
        super();
    }

    public final void run()
    {
        Camera2InputPopup.l(b.a).setLevel(a);
        Camera2InputPopup.l(b.a).invalidateSelf();
    }
}
