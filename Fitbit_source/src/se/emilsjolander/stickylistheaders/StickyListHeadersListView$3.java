// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView

class a
    implements android.view.ListHeadersListView._cls3
{

    final android.view.ListHeadersListView._cls3.b a;
    final StickyListHeadersListView b;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.(b, motionevent);
    }

    (StickyListHeadersListView stickylistheaderslistview, android.view.ListHeadersListView listheaderslistview)
    {
        b = stickylistheaderslistview;
        a = listheaderslistview;
        super();
    }
}
