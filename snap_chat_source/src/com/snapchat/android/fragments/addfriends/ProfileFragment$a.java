// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Po;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.ProfilePictureView;
import java.util.List;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            ProfileFragment

public final class a
    implements Po
{

    private ProfileFragment a;

    public final void a(List list)
    {
        if (list == null)
        {
            Timber.e("ProfileFragment", "profile images - onProfileImagesLoaded but bitmapList is null", new Object[0]);
            return;
        }
        if (list.size() != 5)
        {
            Timber.e("ProfileFragment", "profile images - loaded profile images from cache but the number of images is wrong!", new Object[0]);
            return;
        }
        if (a.e == null || !a.e.g)
        {
            a.a = list;
            a.a(list);
            Timber.c("ProfileFragment", "profile images - pictures were loaded from cache", new Object[0]);
            return;
        }
        list = new StringBuilder("profile images - pictures were loaded but user is capturing pictures now with mProfileImagesList size: ");
        int i;
        if (a.a == null)
        {
            i = 0;
        } else
        {
            i = a.a.size();
        }
        Timber.c("ProfileFragment", list.append(i).toString(), new Object[0]);
    }

    protected A(ProfileFragment profilefragment)
    {
        a = profilefragment;
        super();
    }
}
