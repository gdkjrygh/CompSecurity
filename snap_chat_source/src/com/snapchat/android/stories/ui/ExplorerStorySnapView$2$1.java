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

final class a extends FY
{

    private int a;
    private a b;

    protected final void a(String s)
    {
        Timber.c("ExplorerStorySnapView", "report snap: %s", new Object[] {
            s
        });
        ExplorerStorySnapView.a(b.b, a);
    }

    ( , Context context, android.content.stener stener, int i)
    {
        b = ;
        a = i;
        super(context, stener);
    }

    // Unreferenced inner class com/snapchat/android/stories/ui/ExplorerStorySnapView$2

/* anonymous class */
    final class ExplorerStorySnapView._cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final ExplorerStorySnapView a;
        private int b;
        private android.content.DialogInterface.OnCancelListener c;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            if (i == b - 1)
            {
                (new ExplorerStorySnapView._cls2._cls1(this, a.getContext(), c, i)).show();
                return;
            } else
            {
                ExplorerStorySnapView.a(a, i);
                return;
            }
        }

            
            {
                a = explorerstorysnapview;
                b = i;
                c = oncancellistener;
                super();
            }
    }

}
