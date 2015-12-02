// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.facebook.i;
import com.facebook.k;

// Referenced classes of package com.facebook.orca.nux:
//            e

public class NuxIntroView extends e
{

    private Button d;

    public NuxIntroView(Context context)
    {
        super(context);
    }

    public NuxIntroView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NuxIntroView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    protected void a()
    {
        setContentView(k.orca_nux_intro);
        d = (Button)getView(i.nux_intro_next_button);
    }

    public void setOnNextClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        d.setOnClickListener(onclicklistener);
    }
}
