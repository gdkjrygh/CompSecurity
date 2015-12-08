// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.widget.ImageView;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitTextView;

// Referenced classes of package com.pinterest.activity.notifications:
//            NoFacebookNetworkStoryFragment

public class 
{

    public static void inject(butterknife.ryFragment ryfragment, NoFacebookNetworkStoryFragment nofacebooknetworkstoryfragment, Object obj)
    {
        nofacebooknetworkstoryfragment._title = (PTextView)ryfragment._title(obj, 0x7f0f0245, "field '_title'");
        nofacebooknetworkstoryfragment._connectBtn = (PButton)ryfragment._connectBtn(obj, 0x7f0f0246, "field '_connectBtn'");
        nofacebooknetworkstoryfragment._addressBook = (AutofitTextView)ryfragment._addressBook(obj, 0x7f0f0247, "field '_addressBook'");
        nofacebooknetworkstoryfragment._feed = (ImageView)ryfragment._feed(obj, 0x7f0f0244, "field '_feed'");
    }

    public static void reset(NoFacebookNetworkStoryFragment nofacebooknetworkstoryfragment)
    {
        nofacebooknetworkstoryfragment._title = null;
        nofacebooknetworkstoryfragment._connectBtn = null;
        nofacebooknetworkstoryfragment._addressBook = null;
        nofacebooknetworkstoryfragment._feed = null;
    }

    public ()
    {
    }
}
