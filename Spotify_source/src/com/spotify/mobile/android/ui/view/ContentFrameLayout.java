// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.EmptyView;
import dgo;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            LoadingView

public class ContentFrameLayout extends FrameLayout
{

    public EmptyView a;
    public LoadingView b;
    public View c;

    public ContentFrameLayout(Context context)
    {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBackgroundColor(dgo.b(context, 0x1010054));
        b = LoadingView.a(LayoutInflater.from(context));
        a = new EmptyView(context);
        addView(a);
        addView(b);
    }

    public final void a(View view)
    {
        if (c != null)
        {
            removeView(c);
            c = null;
        }
        if (view != null)
        {
            c = view;
            addView(c, 0);
        }
    }
}
