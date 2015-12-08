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
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentListView

public class FeedbackView extends LinearLayout
{

    private LinearLayout a;
    private ScrollView b;
    private LinearLayout c;
    private LinearLayout d;
    private LinearLayout e;
    private ViewGroup f;
    private ListView g;

    public FeedbackView(Context context)
    {
        super(context);
        Object obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a = new LinearLayout(context);
        a.setId(0x20012);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        obj.gravity = 49;
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a.setPadding(0, 0, 0, 0);
        a.setOrientation(1);
        addView(a);
        b = new ScrollView(context);
        b.setId(0x20017);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        obj.gravity = 17;
        b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        b.setPadding(i, 0, i, 0);
        a.addView(b);
        c = new LinearLayout(context);
        c.setId(0x20013);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        obj.gravity = 3;
        c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        c.setPadding(i, i, i, i);
        c.setGravity(48);
        c.setOrientation(1);
        b.addView(c);
        d = new LinearLayout(context);
        d.setId(0x20015);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        obj.gravity = 17;
        d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        d.setPadding(i, i, i, 0);
        d.setGravity(48);
        d.setOrientation(1);
        a.addView(d);
        obj = new EditText(context);
        ((EditText) (obj)).setId(8194);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, i / 2, 0, i);
        ((EditText) (obj)).setLayoutParams(layoutparams);
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(16385);
        ((EditText) (obj)).setSingleLine(true);
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setHint(afM.a(1026));
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        c.addView(((android.view.View) (obj)));
        obj = new EditText(context);
        ((EditText) (obj)).setId(8196);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        ((EditText) (obj)).setLayoutParams(layoutparams);
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(33);
        ((EditText) (obj)).setSingleLine(true);
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setHint(afM.a(1027));
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        c.addView(((android.view.View) (obj)));
        obj = new EditText(context);
        ((EditText) (obj)).setId(8198);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        ((EditText) (obj)).setLayoutParams(layoutparams);
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(16433);
        ((EditText) (obj)).setSingleLine(true);
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setHint(afM.a(1028));
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        c.addView(((android.view.View) (obj)));
        obj = new EditText(context);
        ((EditText) (obj)).setId(8200);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 100F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, 0, 0, i);
        ((EditText) (obj)).setLayoutParams(layoutparams);
        ((EditText) (obj)).setImeOptions(5);
        ((EditText) (obj)).setInputType(16385);
        ((EditText) (obj)).setSingleLine(false);
        ((EditText) (obj)).setTextColor(0xff888888);
        ((EditText) (obj)).setTextSize(2, 15F);
        ((EditText) (obj)).setTypeface(null, 0);
        ((EditText) (obj)).setMinimumHeight(j);
        ((EditText) (obj)).setHint(afM.a(1029));
        ((EditText) (obj)).setHintTextColor(0xffcccccc);
        a(context, ((EditText) (obj)));
        c.addView(((android.view.View) (obj)));
        f = new AttachmentListView(context);
        f.setId(8209);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        obj.gravity = 3;
        f.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        f.setPadding(0, 0, 0, i);
        c.addView(f);
        obj = new Button(context);
        ((Button) (obj)).setId(8208);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        j = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
        int k = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, k);
        layoutparams.gravity = 1;
        ((Button) (obj)).setLayoutParams(layoutparams);
        ((Button) (obj)).setBackgroundDrawable(a());
        ((Button) (obj)).setPadding(j, i, j, i);
        ((Button) (obj)).setText(afM.a(1031));
        ((Button) (obj)).setTextColor(-1);
        ((Button) (obj)).setTextSize(2, 15F);
        c.addView(((android.view.View) (obj)));
        obj = new Button(context);
        ((Button) (obj)).setId(8201);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        j = (int)TypedValue.applyDimension(1, 30F, getResources().getDisplayMetrics());
        k = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, k);
        layoutparams.gravity = 1;
        ((Button) (obj)).setLayoutParams(layoutparams);
        ((Button) (obj)).setBackgroundDrawable(a());
        ((Button) (obj)).setPadding(j, i, j, i);
        ((Button) (obj)).setText(afM.a(1032));
        ((Button) (obj)).setTextColor(-1);
        ((Button) (obj)).setTextSize(2, 15F);
        c.addView(((android.view.View) (obj)));
        obj = new TextView(context);
        ((TextView) (obj)).setId(8192);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        layoutparams.setMargins(0, 0, 0, 0);
        ((TextView) (obj)).setLayoutParams(layoutparams);
        ((TextView) (obj)).setPadding(0, i, 0, i);
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj)).setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        ((TextView) (obj)).setSingleLine(true);
        ((TextView) (obj)).setText(afM.a(1030));
        ((TextView) (obj)).setTextColor(0xff888888);
        ((TextView) (obj)).setTextSize(2, 15F);
        ((TextView) (obj)).setTypeface(null, 0);
        d.addView(((android.view.View) (obj)));
        e = new LinearLayout(context);
        e.setId(0x20014);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        obj.gravity = 3;
        e.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        e.setPadding(0, i, 0, i);
        e.setGravity(48);
        e.setOrientation(0);
        d.addView(e);
        obj = new Button(context);
        ((Button) (obj)).setId(0x20010);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        j = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        k = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, k, j);
        layoutparams.gravity = 1;
        layoutparams.weight = 1.0F;
        ((Button) (obj)).setLayoutParams(layoutparams);
        ((Button) (obj)).setBackgroundDrawable(a());
        ((Button) (obj)).setPadding(0, i, 0, i);
        ((Button) (obj)).setGravity(17);
        ((Button) (obj)).setText(afM.a(1033));
        ((Button) (obj)).setTextColor(-1);
        ((Button) (obj)).setTextSize(2, 15F);
        e.addView(((android.view.View) (obj)));
        obj = new Button(context);
        ((Button) (obj)).setId(0x20011);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        j = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        k = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(k, 0, 0, j);
        layoutparams.gravity = 1;
        ((Button) (obj)).setLayoutParams(layoutparams);
        ((Button) (obj)).setBackgroundDrawable(a());
        ((Button) (obj)).setPadding(0, i, 0, i);
        ((Button) (obj)).setGravity(17);
        ((Button) (obj)).setText(afM.a(1034));
        ((Button) (obj)).setTextColor(-1);
        ((Button) (obj)).setTextSize(2, 15F);
        layoutparams.weight = 1.0F;
        e.addView(((android.view.View) (obj)));
        g = new ListView(context);
        g.setId(0x20016);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        i = (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics());
        g.setLayoutParams(context);
        g.setPadding(0, i, 0, i);
        d.addView(g);
    }

    private static Drawable a()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(0xff000000);
        statelistdrawable.addState(new int[] {
            0xfefeff59
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff444444);
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0x101009c
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff888888);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, colordrawable);
        return statelistdrawable;
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
