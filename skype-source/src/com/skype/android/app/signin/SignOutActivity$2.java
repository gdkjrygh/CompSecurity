// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.PendingIntent;
import android.os.Bundle;
import com.microsoft.onlineid.a;
import com.microsoft.onlineid.b;
import com.microsoft.onlineid.j;

// Referenced classes of package com.skype.android.app.signin:
//            SignOutActivity

final class this._cls0
    implements b
{

    final SignOutActivity this$0;

    public final void onAccountAcquired(j j, Bundle bundle)
    {
        SignOutActivity.access$000(SignOutActivity.this).a(j, bundle);
    }

    public final void onAccountSignedOut(String s, boolean flag, Bundle bundle)
    {
        SignOutActivity.access$100(SignOutActivity.this);
    }

    public final void onFailure(com.microsoft.onlineid.b.a a1, Bundle bundle)
    {
        SignOutActivity.access$100(SignOutActivity.this);
    }

    public final void onUINeeded(PendingIntent pendingintent, Bundle bundle)
    {
        try
        {
            startIntentSenderForResult(pendingintent.getIntentSender(), 1, null, 0, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            pendingintent.printStackTrace();
        }
        SignOutActivity.access$100(SignOutActivity.this);
    }

    public final void onUserCancel(Bundle bundle)
    {
        SignOutActivity.access$100(SignOutActivity.this);
    }

    n()
    {
        this$0 = SignOutActivity.this;
        super();
    }
}
