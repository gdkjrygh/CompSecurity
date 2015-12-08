// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzae

class a
    implements Runnable
{

    final View a;
    final zzae b;

    public void run()
    {
        b.zzg(a);
    }

    (zzae zzae1, View view)
    {
        b = zzae1;
        a = view;
        super();
    }
}
