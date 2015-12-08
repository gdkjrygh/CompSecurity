// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.google.maps.android.ui:
//            BubbleDrawable, RotationLayout

public class IconGenerator
{

    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU;
    private float mAnchorV;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    public IconGenerator(Context context)
    {
        mAnchorU = 0.5F;
        mAnchorV = 1.0F;
        mContext = context;
        mBackground = new BubbleDrawable(mContext.getResources());
        mContainer = (ViewGroup)LayoutInflater.from(mContext).inflate(com.google.maps.android.R.layout.text_bubble, null);
        mRotationLayout = (RotationLayout)mContainer.getChildAt(0);
        context = (TextView)mRotationLayout.findViewById(com.google.maps.android.R.id.text);
        mTextView = context;
        mContentView = context;
        setStyle(1);
    }

    private static int getStyleColor(int i)
    {
        switch (i)
        {
        default:
            return -1;

        case 3: // '\003'
            return 0xffcc0000;

        case 4: // '\004'
            return 0xff0099cc;

        case 5: // '\005'
            return 0xff669900;

        case 6: // '\006'
            return 0xff9933cc;

        case 7: // '\007'
            return -30720;
        }
    }

    private static int getTextStyle(int i)
    {
        switch (i)
        {
        default:
            return com.google.maps.android.R.style.Bubble_TextAppearance_Dark;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return com.google.maps.android.R.style.Bubble_TextAppearance_Light;
        }
    }

    private float rotateAnchor(float f, float f1)
    {
        float f2 = f;
        switch (mRotation)
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            f2 = 1.0F - f1;
            // fall through

        case 0: // '\0'
            return f2;

        case 2: // '\002'
            return 1.0F - f;

        case 3: // '\003'
            return f1;
        }
    }

    public float getAnchorU()
    {
        return rotateAnchor(mAnchorU, mAnchorV);
    }

    public float getAnchorV()
    {
        return rotateAnchor(mAnchorV, mAnchorU);
    }

    public Bitmap makeIcon()
    {
        int i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mContainer.measure(i, i);
        int j = mContainer.getMeasuredWidth();
        i = mContainer.getMeasuredHeight();
        mContainer.layout(0, 0, j, i);
        if (mRotation == 1 || mRotation == 3)
        {
            i = mContainer.getMeasuredWidth();
            j = mContainer.getMeasuredHeight();
        }
        Bitmap bitmap = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        if (mRotation != 0)
        {
            if (mRotation == 1)
            {
                canvas.translate(j, 0.0F);
                canvas.rotate(90F);
            } else
            if (mRotation == 2)
            {
                canvas.rotate(180F, j / 2, i / 2);
            } else
            {
                canvas.translate(0.0F, i);
                canvas.rotate(270F);
            }
        }
        mContainer.draw(canvas);
        return bitmap;
    }

    public Bitmap makeIcon(String s)
    {
        if (mTextView != null)
        {
            mTextView.setText(s);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable)
    {
        mContainer.setBackgroundDrawable(drawable);
        if (drawable != null)
        {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        } else
        {
            mContainer.setPadding(0, 0, 0, 0);
            return;
        }
    }

    public void setColor(int i)
    {
        mBackground.setColor(i);
        setBackground(mBackground);
    }

    public void setContentPadding(int i, int j, int k, int l)
    {
        mContentView.setPadding(i, j, k, l);
    }

    public void setContentRotation(int i)
    {
        mRotationLayout.setViewRotation(i);
    }

    public void setContentView(View view)
    {
        mRotationLayout.removeAllViews();
        mRotationLayout.addView(view);
        mContentView = view;
        view = mRotationLayout.findViewById(com.google.maps.android.R.id.text);
        if (view instanceof TextView)
        {
            view = (TextView)view;
        } else
        {
            view = null;
        }
        mTextView = view;
    }

    public void setRotation(int i)
    {
        mRotation = ((i + 360) % 360) / 90;
    }

    public void setStyle(int i)
    {
        setColor(getStyleColor(i));
        setTextAppearance(mContext, getTextStyle(i));
    }

    public void setTextAppearance(int i)
    {
        setTextAppearance(mContext, i);
    }

    public void setTextAppearance(Context context, int i)
    {
        if (mTextView != null)
        {
            mTextView.setTextAppearance(context, i);
        }
    }
}
