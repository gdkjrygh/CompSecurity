// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;

// Referenced classes of package com.facebook.orca.nux:
//            e

public class NuxSmsIntroView extends e
{

    private Button d;
    private Button e;
    private TextView f;

    public NuxSmsIntroView(Context context)
    {
        super(context);
    }

    public NuxSmsIntroView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NuxSmsIntroView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
    }

    protected void a()
    {
        setContentView(k.orca_nux_sms_intro);
        d = (Button)getView(i.nux_sms_intro_try_button);
        e = (Button)getView(i.nux_sms_intro_skip_button);
        f = (TextView)getView(i.nux_sms_intro_blurb);
    }

    public void b()
    {
        e.setVisibility(8);
        d.setText(o.sms_nux_ok_button);
    }

    public void j()
    {
        d();
        f.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setBlurb(int l)
    {
        d();
        f.setText(l);
    }

    public void setBlurb(CharSequence charsequence)
    {
        d();
        f.setText(charsequence);
    }

    public void setOnSkipClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        e.setOnClickListener(onclicklistener);
    }

    public void setOnTryClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d();
        d.setOnClickListener(onclicklistener);
    }
}
