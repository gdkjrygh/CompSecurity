// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.DisplayMetrics;

// Referenced classes of package io.card.payment.ui:
//            ViewUtil

public class Appearance
{

    public static final Drawable ACTIONBAR_BACKGROUND = new ColorDrawable(Color.parseColor("#717074"));
    public static final int BUTTON_PRIMARY_DISABLED_COLOR = Color.parseColor("#c5ddeb");
    public static final int BUTTON_PRIMARY_FOCUS_COLOR;
    public static final int BUTTON_PRIMARY_NORMAL_COLOR;
    public static final int BUTTON_PRIMARY_PRESSED_COLOR;
    public static final int BUTTON_SECONDARY_DISABLED_COLOR = Color.parseColor("#f5f5f5");
    public static final int BUTTON_SECONDARY_FOCUS_COLOR = Color.parseColor("#aa717074");
    public static final int BUTTON_SECONDARY_NORMAL_COLOR = Color.parseColor("#717074");
    public static final int BUTTON_SECONDARY_PRESSED_COLOR = Color.parseColor("#5a5a5d");
    public static final int BUTTON_STATE_DISABLED[] = {
        0xfefeff62
    };
    public static final int BUTTON_STATE_FOCUSED[] = {
        0x101009c
    };
    public static final int BUTTON_STATE_NORMAL[] = {
        0x101009e
    };
    public static final int BUTTON_STATE_PRESSED[] = {
        0x10100a7, 0x101009e
    };
    public static final int DEFAULT_BACKGROUND_COLOR = Color.parseColor("#f5f5f5");
    public static final int PAL_BLUE_COLOR;
    public static final int PAL_BLUE_COLOR_OPACITY_66;
    public static final int PAY_BLUE_COLOR;
    public static final int TEXT_COLOR_ERROR = Color.parseColor("#b32317");
    public static final int TEXT_COLOR_LABEL;
    public static final int TEXT_COLOR_LIGHT;
    public static final Typeface TYPEFACE_BUTTON = typefaceLight();

    public static Drawable buttonBackgroundPrimary(Context context)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(BUTTON_STATE_PRESSED, new ColorDrawable(BUTTON_PRIMARY_PRESSED_COLOR));
        statelistdrawable.addState(BUTTON_STATE_DISABLED, new ColorDrawable(BUTTON_PRIMARY_DISABLED_COLOR));
        statelistdrawable.addState(BUTTON_STATE_FOCUSED, buttonBackgroundPrimaryFocused(context));
        statelistdrawable.addState(BUTTON_STATE_NORMAL, buttonBackgroundPrimaryNormal(context));
        return statelistdrawable;
    }

    private static Drawable buttonBackgroundPrimaryFocused(Context context)
    {
        return buttonFocused(BUTTON_PRIMARY_NORMAL_COLOR, BUTTON_PRIMARY_FOCUS_COLOR, getFocusBorderWidthPixels(context));
    }

    private static Drawable buttonBackgroundPrimaryNormal(Context context)
    {
        return buttonNormal(BUTTON_PRIMARY_NORMAL_COLOR, getFocusBorderWidthPixels(context));
    }

    public static Drawable buttonBackgroundSecondary(Context context)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(BUTTON_STATE_PRESSED, new ColorDrawable(BUTTON_SECONDARY_PRESSED_COLOR));
        statelistdrawable.addState(BUTTON_STATE_DISABLED, new ColorDrawable(BUTTON_SECONDARY_DISABLED_COLOR));
        statelistdrawable.addState(BUTTON_STATE_FOCUSED, buttonBackgroundSecondaryFocused(context));
        statelistdrawable.addState(BUTTON_STATE_NORMAL, buttonBackgroundSecondaryNormal(context));
        return statelistdrawable;
    }

    private static Drawable buttonBackgroundSecondaryFocused(Context context)
    {
        return buttonFocused(BUTTON_SECONDARY_NORMAL_COLOR, BUTTON_SECONDARY_FOCUS_COLOR, getFocusBorderWidthPixels(context));
    }

    private static Drawable buttonBackgroundSecondaryNormal(Context context)
    {
        return buttonNormal(BUTTON_SECONDARY_NORMAL_COLOR, getFocusBorderWidthPixels(context));
    }

    private static Drawable buttonFocused(int i, int j, float f)
    {
        ColorDrawable colordrawable = new ColorDrawable(i);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setStrokeWidth(2.0F * f);
        shapedrawable.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable.getPaint().setColor(DEFAULT_BACKGROUND_COLOR);
        ShapeDrawable shapedrawable1 = new ShapeDrawable(new RectShape());
        shapedrawable1.getPaint().setStrokeWidth(f);
        shapedrawable1.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable1.getPaint().setColor(j);
        return new LayerDrawable(new Drawable[] {
            colordrawable, shapedrawable, shapedrawable1
        });
    }

    private static Drawable buttonNormal(int i, float f)
    {
        ColorDrawable colordrawable = new ColorDrawable(i);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setStrokeWidth(2.0F * f);
        shapedrawable.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        shapedrawable.getPaint().setColor(DEFAULT_BACKGROUND_COLOR);
        return new LayerDrawable(new Drawable[] {
            colordrawable, shapedrawable
        });
    }

    private static float getFocusBorderWidthPixels(Context context)
    {
        return context.getResources().getDisplayMetrics().density * (ViewUtil.typedDimensionValueToPixels("4dip", context) / 2.0F);
    }

    private static Typeface typefaceLight()
    {
        return Typeface.create("sans-serif-light", 0);
    }

    static 
    {
        PAY_BLUE_COLOR = Color.parseColor("#003087");
        PAL_BLUE_COLOR = Color.parseColor("#009CDE");
        PAL_BLUE_COLOR_OPACITY_66 = Color.parseColor("#aa009CDE");
        BUTTON_PRIMARY_NORMAL_COLOR = PAL_BLUE_COLOR;
        BUTTON_PRIMARY_FOCUS_COLOR = PAL_BLUE_COLOR_OPACITY_66;
        BUTTON_PRIMARY_PRESSED_COLOR = PAY_BLUE_COLOR;
        TEXT_COLOR_LIGHT = Color.parseColor("#515151");
        TEXT_COLOR_LABEL = TEXT_COLOR_LIGHT;
    }
}
