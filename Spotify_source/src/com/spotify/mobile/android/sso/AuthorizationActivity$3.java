// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.content.DialogInterface;

// Referenced classes of package com.spotify.mobile.android.sso:
//            AuthorizationActivity

final class a
    implements android.content.Listener
{

    private AuthorizationActivity a;

    public final void onCancel(DialogInterface dialoginterface)
    {
        AuthorizationActivity.b(a);
    }

    (AuthorizationActivity authorizationactivity)
    {
        a = authorizationactivity;
        super();
    }
}
