// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import ET;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.stories.ui:
//            MyStoryView

final class c
    implements android.view.stener
{

    private ET a;
    private ImageView b;
    private TextView c;
    private MyStoryView d;

    public final void onClick(View view)
    {
        MyStoryView.d(d).a();
        if (MyStoryView.h(d))
        {
            MyStoryView.a(d, false);
            MyStoryView.a(d, a, b, c);
        }
    }

    (MyStoryView mystoryview, ET et, ImageView imageview, TextView textview)
    {
        d = mystoryview;
        a = et;
        b = imageview;
        c = textview;
        super();
    }
}
