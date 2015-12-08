// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import Jo;
import android.graphics.Rect;
import android.view.View;
import com.snapchat.android.database.SharedPreferenceKey;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapView

final class a
    implements android.view..OnGlobalLayoutListener
{

    private StorySnapView a;

    public final void onGlobalLayout()
    {
        int i = Jo.b(a.d);
        View view = a.getRootView();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int j = i - (rect.bottom - rect.top);
        if (j > 100)
        {
            i -= j;
            if (StorySnapView.c(a) != i)
            {
                StorySnapView.a(a, i);
                SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.putInt(i);
            }
            StorySnapView.d(a);
        } else
        if (StorySnapView.e(a))
        {
            a.f();
            return;
        }
    }

    y(StorySnapView storysnapview)
    {
        a = storysnapview;
        super();
    }
}
