// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Intent;
import android.os.Parcelable;
import com.facebook.c.s;
import com.facebook.zero.ui.k;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMessageFragment

class cx
    implements k
{

    final ThreadViewMessageFragment a;

    cx(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void a(Parcelable parcelable)
    {
        ThreadViewMessageFragment.a(a).b((Intent)parcelable, a.n());
    }

    public void b(Parcelable parcelable)
    {
    }
}
