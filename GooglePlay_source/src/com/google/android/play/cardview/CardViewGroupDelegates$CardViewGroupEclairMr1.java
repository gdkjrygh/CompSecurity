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
//            CardViewGroupDelegate, CardViewGroupDelegates, RoundRectDrawableWithShadow, CardViewBackgroundDrawable

private static class <init>
    implements CardViewGroupDelegate
{

    protected static TypedArray getStyledAttrs(Context context, AttributeSet attributeset, int i)
    {
        return context.obtainStyledAttributes(attributeset, com.google.android.play.clairMr1, i, 0);
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

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
