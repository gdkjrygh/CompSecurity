// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Intent;
import android.os.Parcelable;
import com.facebook.zero.ui.k;

// Referenced classes of package com.facebook.orca.messageview:
//            MessageViewFragment

class e
    implements k
{

    final MessageViewFragment a;

    e(MessageViewFragment messageviewfragment)
    {
        a = messageviewfragment;
        super();
    }

    public void a(Parcelable parcelable)
    {
        MessageViewFragment.a(a, (Intent)parcelable);
    }

    public void b(Parcelable parcelable)
    {
    }
}
