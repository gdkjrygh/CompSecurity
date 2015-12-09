// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.support.v4.a.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.views:
//            TypefaceEditText

public class TypefaceEditTextWithClear extends TypefaceEditText
{

    private WeakReference a;

    public TypefaceEditTextWithClear(Context context)
    {
        super(context);
        a = new WeakReference(null);
        a(context);
    }

    public TypefaceEditTextWithClear(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new WeakReference(null);
        a(context);
    }

    public TypefaceEditTextWithClear(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new WeakReference(null);
        a(context);
    }

    private void a(Context context)
    {
        a = new WeakReference(context);
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (!TextUtils.isEmpty(charsequence) && a != null && a.get() != null)
        {
            charsequence = android.support.v4.a.a.a((Context)a.get(), 0x7f020156);
        } else
        {
            charsequence = null;
        }
        setCompoundDrawablesWithIntrinsicBounds(null, null, charsequence, null);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a(this, motionevent))
        {
            setText("");
        }
        return super.onTouchEvent(motionevent);
    }
}
