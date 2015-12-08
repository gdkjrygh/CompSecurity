// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import android.view.View;

// Referenced classes of package com.snapchat.android.stories.ui:
//            MyStoryView

final class a
    implements android.view.stener
{

    private MyStoryView a;

    public final void onClick(View view)
    {
        MyStoryView.d(a).b();
    }

    (MyStoryView mystoryview)
    {
        a = mystoryview;
        super();
    }
}
