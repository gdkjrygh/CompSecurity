// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

// Referenced classes of package me.grantland.widget:
//            AutofitHelper

public class AutofitLayout extends FrameLayout
{

    private boolean a;
    private float b;
    private float c;
    private WeakHashMap d;

    public AutofitLayout(Context context)
    {
        super(context);
        d = new WeakHashMap();
        a(context, null, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new WeakHashMap();
        a(context, attributeset, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new WeakHashMap();
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = true;
        int j = -1;
        float f = -1F;
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, R.styleable.AutofitTextView, i, 0);
            flag = context.getBoolean(R.styleable.AutofitTextView_sizeToFit, true);
            j = context.getDimensionPixelSize(R.styleable.AutofitTextView_minTextSize, -1);
            f = context.getFloat(R.styleable.AutofitTextView_precision, -1F);
            context.recycle();
        }
        a = flag;
        b = j;
        c = f;
    }

    public final AutofitHelper a(TextView textview)
    {
        return (AutofitHelper)d.get(textview);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        view = (TextView)view;
        layoutparams = AutofitHelper.a(view).a(a);
        if (c > 0.0F)
        {
            layoutparams.a(c);
        }
        if (b > 0.0F)
        {
            layoutparams.b(b);
        }
        d.put(view, layoutparams);
    }
}
