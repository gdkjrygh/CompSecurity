// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            a, x, v, z, 
//            b

public class ScrollableCandidateView extends HorizontalScrollView
    implements android.view.View.OnClickListener, a
{

    boolean a;
    final LinearLayout b;
    private final ArrayList c;
    private b d;
    private RecognitionResult e;
    private final int f;
    private final int g;
    private final int h;
    private String i;
    private final int j;
    private final int k;
    private final String l;
    private final Drawable m;

    public ScrollableCandidateView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScrollableCandidateView(Context context, AttributeSet attributeset, int i1)
    {
        Object obj;
        super(context, attributeset, i1);
        c = new ArrayList();
        e = RecognitionResult.i;
        View.inflate(context, x.scrollable_candidates, this);
        b = (LinearLayout)findViewById(v.scrollable_candidates);
        obj = context.obtainStyledAttributes(attributeset, z.ScrollableCandidateView);
        float f1;
        float f2;
        attributeset = ((TypedArray) (obj)).getDrawable(z.ScrollableCandidateView_hwrCandidateSeparatorDrawable);
        k = ((TypedArray) (obj)).getResourceId(z.ScrollableCandidateView_hwrCandidateBackground, 0);
        j = ((TypedArray) (obj)).getColor(z.ScrollableCandidateView_hwrCandidateTextColor, 0xffff0000);
        f1 = ((TypedArray) (obj)).getDimension(z.ScrollableCandidateView_hwrCandidateTextSize, 15F);
        f = ((TypedArray) (obj)).getDimensionPixelSize(z.ScrollableCandidateView_hwrCandidatePadding, 0);
        g = ((TypedArray) (obj)).getDimensionPixelSize(z.ScrollableCandidateView_hwrCandidateMinWidth, 0);
        f2 = ((TypedArray) (obj)).getDimension(z.ScrollableCandidateView_hwrPreSpaceStrokeWidth, 3F);
        l = ((TypedArray) (obj)).getString(z.ScrollableCandidateView_hwrSpaceContentDescription);
        h = ((TypedArray) (obj)).getDimensionPixelSize(z.ScrollableCandidateView_hwrCandidateHeight, 0);
        setFadingEdgeLength(((TypedArray) (obj)).getDimensionPixelSize(z.ScrollableCandidateView_hwrScrollFadingEdgeLength, 10));
        ((TypedArray) (obj)).recycle();
        obj = context.getResources();
        i1 = j;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(f1);
        paint.setStrokeWidth(f2);
        paint.setColor(i1);
        Object obj2 = new Rect();
        paint.getTextBounds("_", 0, 1, ((Rect) (obj2)));
        i1 = Math.max(Math.round((float)((Rect) (obj2)).width() + 0.5F), 3);
        obj2 = Bitmap.createBitmap(i1, i1 / 3, android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(((Bitmap) (obj2)))).drawLines(new float[] {
            0.0F, 0.0F, 0.0F, 0.3F * (float)i1, 0.0F, 0.3F * (float)i1, (float)i1, 0.3F * (float)i1, (float)i1, 0.3F * (float)i1, 
            (float)i1, 0.0F
        }, paint);
        obj = new BitmapDrawable(((android.content.res.Resources) (obj)), ((Bitmap) (obj2)));
        ((BitmapDrawable) (obj)).setBounds(0, 0, ((BitmapDrawable) (obj)).getIntrinsicWidth(), ((BitmapDrawable) (obj)).getIntrinsicHeight());
        m = ((Drawable) (obj));
        context = LayoutInflater.from(context);
        i1 = 0;
        while (i1 < 32) 
        {
            obj = context.inflate(x.candidate, null);
            Object obj1 = (TextView)((View) (obj)).findViewById(v.candidate_word);
            ((TextView) (obj1)).setTextColor(j);
            ((TextView) (obj1)).setBackgroundResource(k);
            ((TextView) (obj1)).setTextSize(0, f1);
            ((TextView) (obj1)).setMinWidth(g);
            ((TextView) (obj1)).setPadding(f, ((TextView) (obj1)).getPaddingTop(), f, ((TextView) (obj1)).getPaddingBottom());
            ((TextView) (obj1)).setTag(Integer.valueOf(i1));
            ((TextView) (obj1)).setOnClickListener(this);
            ((TextView) (obj1)).setHeight(h);
            obj1 = (ImageView)((View) (obj)).findViewById(v.candidate_divider);
            ((ImageView) (obj1)).setImageDrawable(attributeset);
            byte byte0;
            if (i1 == 0)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            ((ImageView) (obj1)).setVisibility(byte0);
            c.add(obj);
            i1++;
        }
        break MISSING_BLOCK_LABEL_601;
        context;
        ((TypedArray) (obj)).recycle();
        throw context;
        scrollTo(0, getScrollY());
        return;
    }

    public final boolean a()
    {
        return a;
    }

    public RecognitionResult getCurrentResult()
    {
        return e;
    }

    public View getView()
    {
        return this;
    }

    public void onClick(View view)
    {
        int i1 = ((Integer)view.getTag()).intValue();
        view = e.a(i1).a;
        d.a(i1, view, e);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public void setDefaultCandidates(String as[], String as1[])
    {
    }

    public void setListener(b b1)
    {
        d = b1;
    }

    public void setResult(RecognitionResult recognitionresult, boolean flag)
    {
        i = "";
        e = recognitionresult;
        a = flag;
        b.removeAllViews();
        int i1 = e.a();
        if (i1 > 31)
        {
            i1 = 31;
        }
        int j1 = 0;
        while (j1 < i1) 
        {
            recognitionresult = e.a(j1).a;
            if (recognitionresult == null)
            {
                continue;
            }
            View view = (View)c.get(j1);
            TextView textview = (TextView)view.findViewById(v.candidate_word);
            textview.setLongClickable(false);
            textview.setBackgroundResource(k);
            textview.setPadding(f, 0, f, 0);
            textview.setMinWidth(g);
            textview.setHeight(h);
            String s = recognitionresult.toString();
            recognitionresult = l;
            Drawable drawable = m;
            textview.setText(s);
            String s1;
            if (s.startsWith(" "))
            {
                recognitionresult = String.valueOf(recognitionresult).concat(" ");
            } else
            {
                recognitionresult = "";
            }
            recognitionresult = String.valueOf(recognitionresult);
            s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                recognitionresult = recognitionresult.concat(s1);
            } else
            {
                recognitionresult = new String(recognitionresult);
            }
            textview.setContentDescription(recognitionresult);
            recognitionresult = new SpannableString(s);
            if (s.startsWith(" "))
            {
                recognitionresult.setSpan(new ImageSpan(drawable, 1), 0, 1, 33);
            }
            textview.setText(recognitionresult);
            textview.setTextScaleX(1.0F);
            textview.setClickable(a);
            b.addView(view);
            j1++;
        }
        scrollTo(0, getScrollY());
        requestLayout();
    }

    public void setSelectedWord(String s)
    {
        i = s;
    }

    public void setTypeface(Typeface typeface)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((TextView)((View)iterator.next()).findViewById(v.candidate_word)).setTypeface(typeface)) { }
    }
}
