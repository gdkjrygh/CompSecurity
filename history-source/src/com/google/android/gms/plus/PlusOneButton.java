// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ka;
import com.google.android.gms.plus.internal.g;

public final class PlusOneButton extends FrameLayout
{
    protected class DefaultOnPlusOneClickListener
        implements android.view.View.OnClickListener, OnPlusOneClickListener
    {

        private final OnPlusOneClickListener anC;
        final PlusOneButton anD;

        public void onClick(View view)
        {
            view = (Intent)PlusOneButton.a(anD).getTag();
            if (anC != null)
            {
                anC.onPlusOneClick(view);
                return;
            } else
            {
                onPlusOneClick(view);
                return;
            }
        }

        public void onPlusOneClick(Intent intent)
        {
            Context context = anD.getContext();
            if ((context instanceof Activity) && intent != null)
            {
                ((Activity)context).startActivityForResult(intent, PlusOneButton.b(anD));
            }
        }

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
        {
            anD = PlusOneButton.this;
            super();
            anC = onplusoneclicklistener;
        }
    }

    public static interface OnPlusOneClickListener
    {

        public abstract void onPlusOneClick(Intent intent);
    }


    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private int anA;
    private OnPlusOneClickListener anB;
    private View any;
    private int anz;
    private int mSize;
    private String vf;

    public PlusOneButton(Context context)
    {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSize = getSize(context, attributeset);
        anz = getAnnotation(context, attributeset);
        anA = -1;
        G(getContext());
        if (!isInEditMode());
    }

    private void G(Context context)
    {
        if (any != null)
        {
            removeView(any);
        }
        any = g.a(context, mSize, anz, vf, anA);
        setOnPlusOneClickListener(anB);
        addView(any);
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.any;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.anA;
    }

    protected static int getAnnotation(Context context, AttributeSet attributeset)
    {
        byte byte0 = 0;
        context = ka.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(context))
        {
            byte0 = 2;
        } else
        if (!"NONE".equalsIgnoreCase(context))
        {
            return 1;
        }
        return byte0;
    }

    protected static int getSize(Context context, AttributeSet attributeset)
    {
        context = ka.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(context))
        {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(context))
        {
            return 1;
        }
        return !"TALL".equalsIgnoreCase(context) ? 3 : 2;
    }

    public void initialize(String s, int i)
    {
        jx.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        vf = s;
        anA = i;
        G(getContext());
    }

    public void initialize(String s, OnPlusOneClickListener onplusoneclicklistener)
    {
        vf = s;
        anA = 0;
        G(getContext());
        setOnPlusOneClickListener(onplusoneclicklistener);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        any.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = any;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        anz = i;
        G(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onplusoneclicklistener)
    {
        anB = onplusoneclicklistener;
        any.setOnClickListener(new DefaultOnPlusOneClickListener(onplusoneclicklistener));
    }

    public void setSize(int i)
    {
        mSize = i;
        G(getContext());
    }
}
