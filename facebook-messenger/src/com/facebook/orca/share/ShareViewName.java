// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import com.facebook.orca.common.ui.widgets.text.MultilineEllipsizeTextView;

// Referenced classes of package com.facebook.orca.share:
//            ShareView

public class ShareViewName extends MultilineEllipsizeTextView
{

    public ShareViewName(Context context)
    {
        super(context);
        setMaxLines(1);
    }

    public ShareViewName(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setMaxLines(1);
    }

    public ShareViewName(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setMaxLines(1);
    }

    protected void drawableStateChanged()
    {
        for (ViewParent viewparent = getParent(); viewparent != null; viewparent = viewparent.getParent())
        {
            if (viewparent instanceof ShareView)
            {
                ((ShareView)viewparent).a();
            }
        }

    }
}
