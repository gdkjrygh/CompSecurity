// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            qh

public class qi extends qh
{

    public qi()
    {
    }

    public boolean a(View view)
    {
        return super.a(view) || view.getWindowId() != null;
    }

    public final int c()
    {
        return 14;
    }
}
