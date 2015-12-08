// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

public final class ojh
    implements ojw
{

    private ExpandingScrollView a;

    public ojh(ExpandingScrollView expandingscrollview)
    {
        a = expandingscrollview;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        return ExpandingScrollView.a(a, motionevent);
    }
}
