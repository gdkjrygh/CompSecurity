// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import OS;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a
    implements android.view.r
{

    private StoriesFragment a;

    public final void onClick(View view)
    {
        if (a.h)
        {
            StoriesFragment.f(a);
        }
        StoriesFragment.g(a).a(4, true);
    }

    (StoriesFragment storiesfragment)
    {
        a = storiesfragment;
        super();
    }
}
