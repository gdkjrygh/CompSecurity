// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.DialogInterface;

// Referenced classes of package com.snapchat.android.ui:
//            ProfilePictureView

final class a
    implements android.content.ckListener
{

    private ProfilePictureView a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ProfilePictureView.d(a).t();
    }

    er(ProfilePictureView profilepictureview)
    {
        a = profilepictureview;
        super();
    }
}
