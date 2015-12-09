// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.DialogInterface;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

class a
    implements android.content.istener
{

    final ProfilePhotoUploader a;

    public void onCancel(DialogInterface dialoginterface)
    {
        ProfilePhotoUploader.a(a, false);
    }

    r(ProfilePhotoUploader profilephotouploader)
    {
        a = profilephotouploader;
        super();
    }
}
