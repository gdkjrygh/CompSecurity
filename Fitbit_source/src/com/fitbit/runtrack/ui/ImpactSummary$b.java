// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.ui.a.c;
import com.fitbit.util.fonts.FitbitFont;
import java.text.NumberFormat;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

private static class add extends c
{
    private static class a
    {

        public final ImageView a;
        public final TextView b;
        public final TextView c;

        public a(View view)
        {
            a = (ImageView)view.findViewById(0x7f1100c4);
            b = (TextView)view.findViewById(0x7f110429);
            c = (TextView)view.findViewById(0x7f11042a);
            ImpactSummary.a a1 = new ImpactSummary.a(100);
            view = view.getContext();
            a1.a(view.getResources().getColor(0x7f0f008d), 5F);
            int ai[] = new int[4];
            int[] _tmp = ai;
            ai[0] = 0x30000;
            ai[1] = 0x40000;
            ai[2] = 0x20000;
            ai[3] = 0x70000;
            int ai1[] = new int[7];
            ai1[0] = view.getResources().getColor(0x7f0f008c);
            for (int i = 1; i < ai1.length; i++)
            {
                ai1[i] = ai1[i - 1] + ai[(i - 1) % ai.length];
            }

            a1.a(ai1);
            a.setBackgroundDrawable(a1);
        }
    }


    private final SparseArray a;
    private final SparseArray b;
    private final NumberFormat c = NumberFormat.getIntegerInstance();

    private com.fitbit.data.domain..TimeSeriesResourceType a(pactable pactable)
    {
        switch (b[pactable.ordinal()])
        {
        default:
            return com.fitbit.data.domain..TimeSeriesResourceType.FLOORS;

        case 1: // '\001'
            return com.fitbit.data.domain..TimeSeriesResourceType.STEPS;

        case 2: // '\002'
            return com.fitbit.data.domain..TimeSeriesResourceType.MINUTES_VERY_ACTIVE;

        case 3: // '\003'
            return com.fitbit.data.domain..TimeSeriesResourceType.CALORIES;
        }
    }

    public void a(pactable pactable, Number number)
    {
        a.put(pactable.type.ordinal(), Double.valueOf(number.doubleValue()));
        com.fitbit.e.a.a(com.fitbit.runtrack.ui.ImpactSummary.a(), String.format("%s being update to %s", new Object[] {
            pactable, number
        }), new Object[0]);
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        Object obj;
        Object obj1;
        view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04017c, viewgroup, false);
            view1.setTag(new a(view1));
        }
        viewgroup = (a)view1.getTag();
        obj = (pactable)getItem(i);
        ((a) (viewgroup)).a.setImageResource(((pactable) (obj)).symbol);
        obj1 = a(((pactable) (obj)));
        view = (Double)a.get(((com.fitbit.data.domain..TimeSeriesResourceType) (obj1)).ordinal());
        if (view == null || view.doubleValue() < 1.0D)
        {
            view = (Double)b.get(((com.fitbit.data.domain..TimeSeriesResourceType) (obj1)).ordinal());
        }
        double d = ((Double)b.get(((com.fitbit.data.domain..TimeSeriesResourceType) (obj1)).ordinal())).doubleValue();
        obj1 = Double.valueOf(Math.max(view.doubleValue(), d));
        ((a) (viewgroup)).a.getBackground().setLevel((int)((d / ((Double) (obj1)).doubleValue()) * 100D));
        ((a) (viewgroup)).b.setText(String.format("+%s", new Object[] {
            c.format(Math.round(d))
        }));
        b[((pactable) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 248
    //                   1 402
    //                   2 416
    //                   3 409
    //                   4 423;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i = 0;
_L7:
        view = ((a) (viewgroup)).c.getContext();
        obj = SpannableString.valueOf(Html.fromHtml(view.getResources().getQuantityString(i, ((Double) (obj1)).intValue(), new Object[] {
            c.format(((Double) (obj1)).intValue())
        })));
        StyleSpan astylespan[] = (StyleSpan[])((SpannableString) (obj)).getSpans(0, ((SpannableString) (obj)).length(), android/text/style/StyleSpan);
        int j = astylespan.length;
        for (i = 0; i < j; i++)
        {
            StyleSpan stylespan = astylespan[i];
            int k = ((SpannableString) (obj)).getSpanEnd(stylespan);
            int l = ((SpannableString) (obj)).getSpanStart(stylespan);
            int i1 = ((SpannableString) (obj)).getSpanFlags(stylespan);
            ((SpannableString) (obj)).setSpan(new pactListAdapter._cls1("bold", FitbitFont.g.a(view, Typeface.DEFAULT)), l, k, i1);
        }

        break; /* Loop/switch isn't completed */
_L2:
        i = 0x7f0b0013;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0b0011;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f0b0010;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0b0012;
        if (true) goto _L7; else goto _L6
_L6:
        ((a) (viewgroup)).c.setText(((CharSequence) (obj)));
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    public rceType(Profile profile, SparseArray sparsearray, SparseArray sparsearray1)
    {
        b = sparsearray;
        a = sparsearray1;
        profile = pactable.values();
        int j = profile.length;
        for (int i = 0; i < j; i++)
        {
            sparsearray = profile[i];
            com.fitbit.data.domain..TimeSeriesResourceType timeseriesresourcetype = a(sparsearray);
            if (((Double)sparsearray1.get(timeseriesresourcetype.ordinal(), Double.valueOf(0.0D))).doubleValue() > 0.0D && ((Double)b.get(timeseriesresourcetype.ordinal(), Double.valueOf(0.0D))).doubleValue() > 0.0D)
            {
                add(sparsearray);
            }
        }

    }

    // Unreferenced inner class com/fitbit/runtrack/ui/ImpactSummary$ImpactListAdapter$1

/* anonymous class */
    class ImpactSummary.ImpactListAdapter._cls1 extends TypefaceSpan
    {

        final Typeface a;
        final ImpactSummary.b b;

        private void a(TextPaint textpaint)
        {
            boolean flag;
            if ((a.getStyle() & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            textpaint.setFakeBoldText(flag);
            textpaint.setTypeface(a);
        }

        public void updateDrawState(TextPaint textpaint)
        {
            a(textpaint);
        }

        public void updateMeasureState(TextPaint textpaint)
        {
            a(textpaint);
        }

            
            {
                b = ImpactSummary.b.this;
                a = typeface;
                super(s);
            }
    }

}
