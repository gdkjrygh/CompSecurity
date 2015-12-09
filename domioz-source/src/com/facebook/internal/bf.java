// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.view.View;

// Referenced classes of package com.facebook.internal:
//            bd

final class bf
    implements android.view.View.OnClickListener
{

    final bd a;

    bf(bd bd1)
    {
        a = bd1;
        super();
    }

    public final void onClick(View view)
    {
        a.cancel();
    }
}
