// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import com.snapchat.android.util.fragment.SnapchatFragment;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class a
    implements Runnable
{

    private SnapchatFragment a;

    public final void run()
    {
        a.j(true);
    }

    ragment(SnapchatFragment snapchatfragment)
    {
        a = snapchatfragment;
        super();
    }
}
