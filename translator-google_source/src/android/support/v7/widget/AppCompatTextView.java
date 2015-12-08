// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//            u

public class AppCompatTextView extends TextView
{

    private u a;

    public AppCompatTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010084);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new u(this);
        a.a(attributeset, i);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        if (a != null)
        {
            a.a(context, i);
        }
    }
}
