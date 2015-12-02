// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;

// Referenced classes of package com.facebook.widget:
//            f, a, b, c

public class ConfirmationView extends f
{

    private final TextView a;
    private final TextView b;
    private final TextView c;
    private c d;

    public ConfirmationView(Context context)
    {
        this(context, null);
    }

    public ConfirmationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ConfirmationView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.confirmation_view);
        a = (TextView)getView(i.confirmation_message_text);
        b = (TextView)getView(i.confirmation_negative_text);
        c = (TextView)getView(i.confirmation_positive_text);
        context = context.getTheme().obtainStyledAttributes(attributeset, q.ConfirmationView, 0, 0);
        setMessage(context.getString(q.ConfirmationView_message));
        setNegativeButtonTitle(context.getString(q.ConfirmationView_negativeButtonTitle));
        setPositiveButtonTitle(context.getString(q.ConfirmationView_positiveButtonTitle));
        context.recycle();
        b.setOnClickListener(new a(this));
        c.setOnClickListener(new b(this));
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    static c a(ConfirmationView confirmationview)
    {
        return confirmationview.d;
    }

    public void a()
    {
        if (a.getVisibility() == 0)
        {
            a.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(0);
            return;
        }
    }

    public void b()
    {
        a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void c()
    {
        a.setVisibility(8);
    }

    public void setBlurb(CharSequence charsequence)
    {
        a.setText(charsequence);
    }

    public void setListener(c c1)
    {
        d = c1;
    }

    public void setMessage(String s)
    {
        a.setText(s);
    }

    public void setNegativeButtonTitle(String s)
    {
        b.setText(s);
    }

    public void setPositiveButtonTitle(String s)
    {
        c.setText(s);
    }
}
