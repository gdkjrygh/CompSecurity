// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PermissionsRequestActivity

final class a
    implements android.content.ener
{

    private String a[];
    private PermissionsRequestActivity b;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (PermissionsRequestActivity.a(b))
        {
            PermissionsRequestActivity.a(b, a);
        }
    }

    I(PermissionsRequestActivity permissionsrequestactivity, String as[])
    {
        b = permissionsrequestactivity;
        a = as;
        super();
    }
}
