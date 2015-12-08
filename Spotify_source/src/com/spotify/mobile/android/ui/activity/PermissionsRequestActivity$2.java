// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            PermissionsRequestActivity

final class a
    implements android.content.er
{

    private String a[];
    private PermissionsRequestActivity b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PermissionsRequestActivity.a(b, a);
        PermissionsRequestActivity.b(b);
        dialoginterface.dismiss();
    }

    I(PermissionsRequestActivity permissionsrequestactivity, String as[])
    {
        b = permissionsrequestactivity;
        a = as;
        super();
    }
}
