// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;


// Referenced classes of package com.vungle.publisher:
//            FullScreenAdActivity, a

final class a
    implements android.view.tyChangeListener
{

    final a a;
    final FullScreenAdActivity b;

    public final void onSystemUiVisibilityChange(int i)
    {
        if ((i & 4) == 0)
        {
            b.a(a);
        }
    }

    Listener(FullScreenAdActivity fullscreenadactivity, a a1)
    {
        b = fullscreenadactivity;
        a = a1;
        super();
    }
}
