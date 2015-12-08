// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.swatchpicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;

public class SwatchPicker extends LinearLayout
{
    public static interface OnSwatchSelectedListener
    {

        public abstract void onSwatchSelected(int i);
    }


    private int currentSelectionIndex;
    private OnSwatchSelectedListener onSwatchSelectedListener;
    private final ImageView swatches[];

    public SwatchPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        currentSelectionIndex = -1;
        setOrientation(1);
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.SwatchPicker);
        int l = context.getInt(com.google.android.apps.walletnfcrel.R.styleable.SwatchPicker_rowCount, 1);
        context.recycle();
        swatches = new ImageView[l * 5];
        int i1 = getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.swatch_picker_option_spacing);
        int j = 0;
        for (int i = 0; i < l; i++)
        {
            if (i > 0)
            {
                context = new Space(getContext());
                context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, i1));
                addView(context);
            }
            context = new LinearLayout(getContext());
            context.setOrientation(0);
            for (int k = 0; k < 5; k++)
            {
                if (k > 0)
                {
                    attributeset = new Space(getContext());
                    attributeset.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, 0));
                    context.addView(attributeset);
                }
                attributeset = createSwatch(j);
                attributeset.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F));
                context.addView(attributeset);
                swatches[j] = attributeset;
                j++;
            }

            addView(context);
        }

    }

    private ImageView createSwatch(final int index)
    {
        ImageView imageview = new ImageView(getContext()) {

            final SwatchPicker this$0;

            protected final void onMeasure(int i, int j)
            {
                i = android.view.View.MeasureSpec.getSize(i);
                setMeasuredDimension(i, i);
            }

            
            {
                this$0 = SwatchPicker.this;
                super(context);
            }
        };
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final SwatchPicker this$0;
            final int val$index;

            public final void onClick(View view)
            {
                setCurrentSelectionIndex(index);
            }

            
            {
                this$0 = SwatchPicker.this;
                index = i;
                super();
            }
        });
        return imageview;
    }

    public final int getNumSwatches()
    {
        return swatches.length;
    }

    public final ImageView getSwatch(int i)
    {
        return swatches[i];
    }

    public void setCurrentSelectionIndex(int i)
    {
        if (currentSelectionIndex != i)
        {
            currentSelectionIndex = i;
            int j = 0;
            while (j < swatches.length) 
            {
                ImageView imageview = swatches[j];
                boolean flag;
                if (j == i)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                imageview.setSelected(flag);
                j++;
            }
            if (onSwatchSelectedListener != null)
            {
                onSwatchSelectedListener.onSwatchSelected(i);
            }
        }
    }

    public void setOnSwatchSelectedListener(OnSwatchSelectedListener onswatchselectedlistener)
    {
        onSwatchSelectedListener = onswatchselectedlistener;
    }
}
