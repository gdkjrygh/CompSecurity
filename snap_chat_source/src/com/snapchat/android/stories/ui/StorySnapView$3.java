// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import EP;
import android.view.View;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapView, StorySnapViewGroup

final class a
    implements android.view.ener
{

    private StorySnapView a;

    public final void onClick(View view)
    {
        view = a.a;
        view.a(((StorySnapViewGroup) (view)).c.f + 1);
    }

    up(StorySnapView storysnapview)
    {
        a = storysnapview;
        super();
    }
}
