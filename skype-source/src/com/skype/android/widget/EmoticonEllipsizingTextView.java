// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;

// Referenced classes of package com.skype.android.widget:
//            EllipsizingTextView

public class EmoticonEllipsizingTextView extends EllipsizingTextView
{
    private final class a
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final EmoticonEllipsizingTextView a;

        public final boolean onPreDraw()
        {
            a.getViewTreeObserver().removeOnPreDrawListener(this);
            EmoticonEllipsizingTextView.a(a, a.getLayout());
            return true;
        }

        private a()
        {
            a = EmoticonEllipsizingTextView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private a a;

    public EmoticonEllipsizingTextView(Context context)
    {
        super(context);
        a = new a((byte)0);
    }

    public EmoticonEllipsizingTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new a((byte)0);
    }

    public EmoticonEllipsizingTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new a((byte)0);
    }

    private void a(Layout layout)
    {
        if (layout != null && (getText() instanceof Spannable))
        {
            CharSequence charsequence = getText();
            int i = layout.getLineCount();
            if (layout.getEllipsisCount(i - 1) > 0)
            {
                i = layout.getLineStart(i - 1) + layout.getEllipsisStart(i - 1);
                layout = charsequence;
                if (i <= charsequence.length())
                {
                    layout = TextUtils.concat(new CharSequence[] {
                        charsequence.subSequence(0, i), "\u2026"
                    });
                }
                setText(layout);
            }
        }
    }

    static void a(EmoticonEllipsizingTextView emoticonellipsizingtextview, Layout layout)
    {
        emoticonellipsizingtextview.a(layout);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Layout layout;
label0:
        {
            super.onLayout(flag, i, j, k, l);
            layout = getLayout();
            if (getText() instanceof Spannable)
            {
                if (layout != null)
                {
                    break label0;
                }
                getViewTreeObserver().addOnPreDrawListener(a);
            }
            return;
        }
        a(layout);
    }
}
