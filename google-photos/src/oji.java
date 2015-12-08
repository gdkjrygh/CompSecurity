// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

public final class oji
    implements ojw
{

    private ExpandingScrollView a;

    public oji(ExpandingScrollView expandingscrollview)
    {
        a = expandingscrollview;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (ExpandingScrollView.a(a) != null)
        {
            return ExpandingScrollView.a(a).dispatchTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }
}
