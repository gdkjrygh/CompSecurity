// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package me.grantland.widget:
//            AutofitHelper

public class AutofitTextView extends TextView
    implements AutofitHelper.OnTextSizeChangeListener
{

    private AutofitHelper a;

    public AutofitTextView(Context context)
    {
        super(context);
        a(null, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset, 0);
    }

    public AutofitTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(attributeset, i);
    }

    private void a(AttributeSet attributeset, int i)
    {
        a = AutofitHelper.a(this, attributeset, i).a(this);
    }

    public void onTextSizeChange(float f, float f1)
    {
    }

    public void setLines(int i)
    {
        super.setLines(i);
        if (a != null)
        {
            a.a(i);
        }
    }

    public void setMaxLines(int i)
    {
        super.setMaxLines(i);
        if (a != null)
        {
            a.a(i);
        }
    }

    public void setTextSize(int i, float f)
    {
        super.setTextSize(i, f);
        if (a != null)
        {
            a.a(i, f);
        }
    }
}
