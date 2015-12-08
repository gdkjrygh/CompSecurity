// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.appboy.ui.inappmessage.r;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            b

public abstract class AppboyInAppMessageHtmlBaseView extends RelativeLayout
    implements r
{

    public AppboyInAppMessageHtmlBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public abstract WebView a();

    public final View c()
    {
        return this;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            b.a();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }
}
