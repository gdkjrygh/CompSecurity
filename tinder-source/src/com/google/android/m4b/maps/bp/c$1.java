// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bp;

import android.widget.TextView;

// Referenced classes of package com.google.android.m4b.maps.bp:
//            c

public final class a
    implements Runnable
{

    private String a;
    private c b;

    public final void run()
    {
        b.b.setText(a);
    }

    public (c c1, String s)
    {
        b = c1;
        a = s;
        super();
    }
}
