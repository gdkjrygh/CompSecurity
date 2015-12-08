// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import afM;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginView extends LinearLayout
{

    private LinearLayout a;

    public LoginView(Context context)
    {
        this(context, (byte)0);
    }

    private LoginView(Context context, byte byte0)
    {
        super(context);
        Object obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a = new LinearLayout(context);
        a.setId(12289);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        byte0 = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        obj.gravity = 49;
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a.setPadding(byte0, byte0, byte0, byte0);
        a.setOrientation(1);
        addView(a);
        obj = new TextView(context);
        ((TextView) (obj)).setId(12290);
        Object obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((TextView) (obj)).setText(afM.a(1280));
        ((TextView) (obj)).setTextColor(0xff888888);
        ((TextView) (obj)).setTextSize(2, 18F);
        ((TextView) (obj)).setTypeface(null, 0);
        a.addView(((android.view.View) (obj)));
        obj = new EditText(context);
        ((EditText) (obj)).setId(12291);
        obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        ((EditText) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((EditText) (obj)).setHint(afM.a(1282));
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(33);
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        a.addView(((android.view.View) (obj)));
        obj = new EditText(context);
        ((EditText) (obj)).setId(12292);
        obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        ((EditText) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((EditText) (obj)).setHint(afM.a(1283));
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(128);
        ((EditText) (obj)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        a.addView(((android.view.View) (obj)));
        context = new Button(context);
        context.setId(12293);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics()));
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new StateListDrawable();
        obj1 = new ColorDrawable(0xff000000);
        ((StateListDrawable) (obj)).addState(new int[] {
            0xfefeff59
        }, ((Drawable) (obj1)));
        obj1 = new ColorDrawable(0xff444444);
        ((StateListDrawable) (obj)).addState(new int[] {
            0xfefeff59, 0x101009c
        }, ((Drawable) (obj1)));
        obj1 = new ColorDrawable(0xff888888);
        ((StateListDrawable) (obj)).addState(new int[] {
            0x10100a7
        }, ((Drawable) (obj1)));
        context.setBackgroundDrawable(((Drawable) (obj)));
        context.setText(afM.a(1284));
        context.setTextColor(-1);
        context.setTextSize(2, 15F);
        a.addView(context);
    }

    private static void a(Context context, EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            int i = (int)(context.getResources().getDisplayMetrics().density * 10F);
            ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
            Paint paint = shapedrawable.getPaint();
            paint.setColor(-1);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(1.0F);
            shapedrawable.setPadding(i, i, i, i);
            i = (int)((double)context.getResources().getDisplayMetrics().density * 1.5D);
            context = new ShapeDrawable(new RectShape());
            paint = context.getPaint();
            paint.setColor(0xff444444);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(1.0F);
            context.setPadding(0, 0, 0, i);
            edittext.setBackgroundDrawable(new LayerDrawable(new Drawable[] {
                context, shapedrawable
            }));
        }
    }
}
