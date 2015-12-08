// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import kik.android.util.cb;

public class KikAutoCompleteTextView extends AutoCompleteTextView
{

    public KikAutoCompleteTextView(Context context)
    {
        super(context);
    }

    public KikAutoCompleteTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public KikAutoCompleteTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        int i;
        int j;
        j = 0;
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.p);
        i = context.getInt(0, -1);
        context.recycle();
        context = getTypeface();
        i;
        JVM INSTR tableswitch 0 4: default 64
    //                   0 80
    //                   1 87
    //                   2 94
    //                   3 101
    //                   4 108;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_108;
_L1:
        i = kik.android.util.cb.a.a;
_L7:
        if (context != null)
        {
            j = context.getStyle();
        }
        cb.a(this, i, j);
        return;
_L2:
        i = kik.android.util.cb.a.b;
          goto _L7
_L3:
        i = kik.android.util.cb.a.c;
          goto _L7
_L4:
        i = kik.android.util.cb.a.d;
          goto _L7
_L5:
        i = kik.android.util.cb.a.e;
          goto _L7
        i = kik.android.util.cb.a.f;
          goto _L7
    }

    public boolean enoughToFilter()
    {
        return true;
    }
}
