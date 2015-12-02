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

public class ThreadTitleNuxView extends e
{

    private Button d;
    private Button e;

    public ThreadTitleNuxView(Context context)
    {
        super(context);
    }

    public ThreadTitleNuxView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ThreadTitleNuxView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    protected void a()
    {
        setContentView(k.orca_nux_thread_title);
        d = (Button)getView(i.sms_nux_thread_more_button);
        e = (Button)getView(i.sms_nux_thread_okay_button);
    }

    public void setOnMoreClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d.setOnClickListener(onclicklistener);
    }

    public void setOnOkayClickListener(android.view.View.OnClickListener onclicklistener)
    {
        e.setOnClickListener(onclicklistener);
    }
}
