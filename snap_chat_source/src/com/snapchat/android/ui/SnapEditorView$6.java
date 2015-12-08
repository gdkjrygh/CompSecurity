// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.snapchat.android.ui.caption.SnapCaptionView;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView

final class d
    implements android.view.OnPreDrawListener
{

    private Bundle a;
    private boolean b;
    private ViewTreeObserver c;
    private View d;
    private SnapEditorView e;

    public final boolean onPreDraw()
    {
        SnapEditorView.e(e).a(a, b);
        if (c.isAlive())
        {
            c.removeOnPreDrawListener(this);
        }
        SnapEditorView.f(e).removeView(d);
        return false;
    }

    onView(SnapEditorView snapeditorview, Bundle bundle, boolean flag, ViewTreeObserver viewtreeobserver, View view)
    {
        e = snapeditorview;
        a = bundle;
        b = flag;
        c = viewtreeobserver;
        d = view;
        super();
    }
}
