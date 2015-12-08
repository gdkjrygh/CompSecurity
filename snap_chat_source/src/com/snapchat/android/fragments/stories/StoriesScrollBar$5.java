// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import Jr;
import android.animation.Animator;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesScrollBar

final class a extends Jr
{

    private StoriesScrollBar a;

    public final void onAnimationEnd(Animator animator)
    {
        StoriesScrollBar.g(a);
    }

    (StoriesScrollBar storiesscrollbar)
    {
        a = storiesscrollbar;
        super();
    }
}
