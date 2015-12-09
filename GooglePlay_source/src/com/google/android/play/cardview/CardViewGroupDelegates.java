// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.google.android.play.cardview:
//            CardViewGroupDelegate, RoundRectDrawableWithShadow, CardViewBackgroundDrawable, RoundRectDrawable

public final class CardViewGroupDelegates
{
    private static class CardViewGroupEclairMr1
        implements CardViewGroupDelegate
    {

        protected static TypedArray getStyledAttrs(Context context, AttributeSet attributeset, int i)
        {
            return context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.PlayCardViewGroup, i, 0);
        }

        public void initialize(View view, Context context, AttributeSet attributeset, int i)
        {
            attributeset = getStyledAttrs(context, attributeset, i);
            view.setBackgroundDrawable(new RoundRectDrawableWithShadow(context.getResources(), attributeset.getColorStateList(0), attributeset.getDimension(1, 0.0F), attributeset.getDimension(2, 0.0F), attributeset.getDimensionPixelSize(3, 0)));
            attributeset.recycle();
        }

        public final void setBackgroundColor(View view, int i)
        {
            view = view.getBackground();
            if (view instanceof CardViewBackgroundDrawable)
            {
                ((CardViewBackgroundDrawable)view).setBackgroundColor(i);
                return;
            } else
            {
                Log.w("CardViewGroupDelegates", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
                return;
            }
        }

        public final void setBackgroundResource(View view, int i)
        {
            if (i == 0)
            {
                return;
            }
            Object obj = view.getResources();
            view = view.getBackground();
            if (view instanceof CardViewBackgroundDrawable)
            {
                try
                {
                    obj = ((Resources) (obj)).getColorStateList(i);
                    ((CardViewBackgroundDrawable)view).setBackgroundColorStateList(((android.content.res.ColorStateList) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Log.w("CardViewGroupDelegates", "Unable to set background - ColorStateList not found.", view);
                }
                return;
            } else
            {
                Log.w("CardViewGroupDelegates", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
                return;
            }
        }

        private CardViewGroupEclairMr1()
        {
        }

        CardViewGroupEclairMr1(byte byte0)
        {
            this();
        }
    }

    private static final class CardViewGroupL extends CardViewGroupEclairMr1
    {

        public final void initialize(View view, Context context, AttributeSet attributeset, int i)
        {
            context = getStyledAttrs(context, attributeset, i);
            attributeset = new RoundRectDrawable(context.getColorStateList(0), context.getDimension(1, 0.0F), context.getDimensionPixelSize(3, 0));
            view.setClipToOutline(true);
            view.setElevation(context.getDimension(2, 0.0F));
            view.setBackground(attributeset);
            view.setClipToOutline(context.getBoolean(4, true));
            context.recycle();
        }

        private CardViewGroupL()
        {
            super((byte)0);
        }

        CardViewGroupL(byte byte0)
        {
            this();
        }
    }


    public static final CardViewGroupDelegate IMPL;
    public static final CardViewGroupDelegate NO_CARD_BG_IMPL = new CardViewGroupDelegate() {

        public final void initialize(View view, Context context, AttributeSet attributeset, int i)
        {
        }

        public final void setBackgroundColor(View view, int i)
        {
        }

        public final void setBackgroundResource(View view, int i)
        {
        }

    };

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new CardViewGroupL((byte)0);
        } else
        {
            IMPL = new CardViewGroupEclairMr1((byte)0);
        }
    }
}
