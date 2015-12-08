// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.cloudlib:
//            av, as, ar

public class IconCheckBoxPreference extends CheckBoxPreference
{

    private Drawable a;

    public IconCheckBoxPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public IconCheckBoxPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, av.g);
        i = attributeset.getResourceId(av.h, 0);
        if (i != 0)
        {
            a = context.getResources().getDrawable(i);
        }
        attributeset.recycle();
        setLayoutResource(as.H);
    }

    public final void a(Drawable drawable)
    {
        if (drawable == null && a != null || drawable != null && !drawable.equals(a))
        {
            a = drawable;
            notifyChanged();
        }
    }

    public Drawable getIcon()
    {
        return a;
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        view = (ImageView)view.findViewById(ar.bc);
        if (view != null && a != null)
        {
            view.setImageDrawable(a);
        }
    }
}
