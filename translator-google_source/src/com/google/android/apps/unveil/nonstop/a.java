// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;


// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            DebugView

public final class a
    implements Runnable
{

    final boolean a = true;
    final DebugView b;

    public a(DebugView debugview)
    {
        b = debugview;
        super();
    }

    public final void run()
    {
        DebugView debugview = b;
        int i;
        if (a)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        debugview.setVisibility(i);
    }
}
