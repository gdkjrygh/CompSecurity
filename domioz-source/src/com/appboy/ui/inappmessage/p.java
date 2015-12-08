// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.d.a;
import com.appboy.d.i;

// Referenced classes of package com.appboy.ui.inappmessage:
//            t

public interface p
{

    public abstract int beforeInAppMessageDisplayed$1b17e3c1(a a);

    public abstract boolean onInAppMessageButtonClicked(i i, t t);

    public abstract boolean onInAppMessageClicked(a a, t t);

    public abstract void onInAppMessageDismissed(a a);

    public abstract boolean onInAppMessageReceived(a a);
}
