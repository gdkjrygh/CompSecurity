// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import EO;
import Og;
import android.content.DialogInterface;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.stories.ui:
//            ExplorerStorySnapView, StorySnapView

final class a
    implements android.content.Listener
{

    private ExplorerStorySnapView a;

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.h();
        ((StorySnapView) (a)).g.c(false);
        a.f.a(new Og(false));
    }

    (ExplorerStorySnapView explorerstorysnapview)
    {
        a = explorerstorysnapview;
        super();
    }
}
