// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.skype.android.mediacontent:
//            EmoticonSpan, a

public class SpannedAnimationDrawableCallback
    implements android.graphics.drawable.Drawable.Callback, TextWatcher, android.view.View.OnAttachStateChangeListener, Runnable
{

    private static final Handler a = new Handler(Looper.getMainLooper());
    private TextView b;
    private boolean c;
    private final Set d = Collections.newSetFromMap(new WeakHashMap());

    public SpannedAnimationDrawableCallback(TextView textview)
    {
        b = textview;
        textview.addTextChangedListener(this);
        textview.addOnAttachStateChangeListener(this);
        a();
    }

    private void a()
    {
        if (!c && (b.getText() instanceof Spanned))
        {
            d.add(b);
            c = true;
        }
    }

    private void a(Spanned spanned)
    {
        spanned = (EmoticonSpan[])spanned.getSpans(0, spanned.length() - 1, com/skype/android/mediacontent/EmoticonSpan);
        int j = spanned.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = spanned[i].getDrawable();
            if (!(obj instanceof a))
            {
                continue;
            }
            obj = (a)obj;
            Object obj1 = ((a) (obj)).getCallback();
            if (obj1 != this && (obj1 instanceof SpannedAnimationDrawableCallback))
            {
                obj1 = (SpannedAnimationDrawableCallback)obj1;
                d.addAll(((SpannedAnimationDrawableCallback) (obj1)).d);
            }
            ((a) (obj)).setVisible(true, true);
            ((a) (obj)).setCallback(this);
            ((a) (obj)).stop();
            ((a) (obj)).start();
        }

    }

    public void afterTextChanged(Editable editable)
    {
        a();
        a.post(this);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence instanceof Spanned)
        {
            charsequence = (Spanned)charsequence;
            charsequence = (EmoticonSpan[])charsequence.getSpans(0, charsequence.length() - 1, com/skype/android/mediacontent/EmoticonSpan);
            j = charsequence.length;
            for (i = 0; i < j; i++)
            {
                Object obj = charsequence[i].getDrawable();
                if (obj instanceof a)
                {
                    obj = (a)obj;
                    d.clear();
                    ((a) (obj)).setVisible(false, false);
                    ((a) (obj)).setCallback(null);
                    ((a) (obj)).stop();
                }
            }

            c = false;
        }
    }

    public void invalidateDrawable(Drawable drawable)
    {
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            flag = false;
            Iterator iterator = d.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                TextView textview = (TextView)iterator.next();
                if (textview.getWindowVisibility() == 0)
                {
                    if (textview instanceof EditText)
                    {
                        textview.setHint("");
                    }
                    textview.invalidate();
                    flag = true;
                }
            } while (true);
            if (!flag)
            {
                drawable = (a)drawable;
                drawable.stop();
                drawable.setCallback(null);
            }
            return;
        } else
        {
            a.post(new Runnable(drawable) {

                final Drawable a;
                final SpannedAnimationDrawableCallback b;

                public final void run()
                {
                    b.invalidateDrawable(a);
                }

            
            {
                b = SpannedAnimationDrawableCallback.this;
                a = drawable;
                super();
            }
            });
            return;
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onViewAttachedToWindow(View view)
    {
        a.post(this);
    }

    public void onViewDetachedFromWindow(View view)
    {
        a.removeCallbacks(this);
    }

    public void run()
    {
        Iterator iterator = (new ArrayList(d)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TextView textview = (TextView)iterator.next();
            if (textview != null && (textview.getText() instanceof Spanned))
            {
                a((Spanned)textview.getText());
            }
        } while (true);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        a.postAtTime(runnable, l);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        a.removeCallbacks(runnable);
    }

}
