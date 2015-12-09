// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.app.FragmentActivity;
import com.fitbit.home.ui.g;
import com.fitbit.savedstate.LoadSavedState;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

private class a extends g
{

    final ProfilePhotoUploader a;

    public void a()
    {
        ProfilePhotoUploader.a(a, false);
        super.a();
        if (LoadSavedState.b(com.fitbit.savedstate..e))
        {
            ProfilePhotoUploader.a(a).a();
            return;
        } else
        {
            ProfilePhotoUploader.a(a).c();
            return;
        }
    }

    public void a(Exception exception)
    {
        if (ProfilePhotoUploader.b(a))
        {
            ProfilePhotoUploader.a(a, false);
            super.a(exception);
        }
    }

    public (ProfilePhotoUploader profilephotouploader, FragmentActivity fragmentactivity)
    {
        a = profilephotouploader;
        super(fragmentactivity, 85);
    }
}
