// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import FY;
import android.content.Context;
import android.content.DialogInterface;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.stories.ui:
//            ExplorerStorySnapView

final class c
    implements android.content.istener
{

    final ExplorerStorySnapView a;
    private int b;
    private android.content.Listener c;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == b - 1)
        {
            (new FY(a.getContext(), c, i) {

                private int a;
                private ExplorerStorySnapView._cls2 b;

                protected final void a(String s)
                {
                    Timber.c("ExplorerStorySnapView", "report snap: %s", new Object[] {
                        s
                    });
                    ExplorerStorySnapView.a(b.a, a);
                }

            
            {
                b = ExplorerStorySnapView._cls2.this;
                a = i;
                super(context, oncancellistener);
            }
            }).show();
            return;
        } else
        {
            ExplorerStorySnapView.a(a, i);
            return;
        }
    }

    _cls1.a(ExplorerStorySnapView explorerstorysnapview, int i, android.content.Listener listener)
    {
        a = explorerstorysnapview;
        b = i;
        c = listener;
        super();
    }
}
