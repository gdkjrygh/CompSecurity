// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.d.a;
import com.appboy.d.i;

// Referenced classes of package com.appboy.ui.inappmessage:
//            p, u, a, t

final class d
    implements p
{

    final com.appboy.ui.inappmessage.a a;

    d(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final int beforeInAppMessageDisplayed$1b17e3c1(a a1)
    {
        return com.appboy.ui.inappmessage.u.a;
    }

    public final boolean onInAppMessageButtonClicked(i i, t t)
    {
        return false;
    }

    public final boolean onInAppMessageClicked(a a1, t t)
    {
        return false;
    }

    public final void onInAppMessageDismissed(a a1)
    {
    }

    public final boolean onInAppMessageReceived(a a1)
    {
        return false;
    }
}
